package org.qhit.Dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.qhit.Pojo.Dept;
import org.springframework.stereotype.Repository;
@Repository       
public class DeptDao {

	@Resource
	private SessionFactory sf;
	
	public List<Dept> selectAll() {
		
		
		
		
		Session session = sf.getCurrentSession();
		String sql="select * from dept";
		SQLQuery Query = session.createSQLQuery(sql);
		Query.addEntity(Dept.class);
		List<Dept> dl=Query.list();
		return dl;
		
	}
	
}
