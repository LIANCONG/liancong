package org.qhit.Dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.qhit.Pojo.Emp;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	@Resource
	private SessionFactory sf;

	public List<Emp> selectAll(String sql) {
		Session session = sf.getCurrentSession();
		SQLQuery Query = session.createSQLQuery(sql);
		Query.addEntity(Emp.class);
		List el = Query.list();
		return el;	
	}
	public void add(Emp emp) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(emp);
	}
	public void delete(Integer eid) {
		Session session = sf.getCurrentSession();
		Emp emp=session.get(Emp.class,eid);
		session.delete(emp);	
	}

	public Emp find(Emp emp) {
		Session session = sf.getCurrentSession();
		emp=session.get(Emp.class,emp.getEid());
		return emp;	
	}
	public void update(Emp emp) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(emp);
	}
}
