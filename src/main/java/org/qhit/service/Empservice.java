package org.qhit.service;

import java.util.List;

import javax.annotation.Resource;

import org.qhit.Dao.DeptDao;
import org.qhit.Dao.EmpDao;
import org.qhit.Pojo.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jdk.nashorn.internal.runtime.regexp.joni.constants.CCVALTYPE;
import sun.print.resources.serviceui;

@Service
@Transactional
public class Empservice {
	
	@Resource
	private EmpDao ed;
	@Resource
	private DeptDao dd;
	
	public List<Emp> f1(String sql) {
		List<Emp> el = ed.selectAll(sql);
		return el;
	}	
	public void insert(Emp emp) {
		ed.add(emp);
	}	
	public void delete(Integer eid) {
		ed.delete(eid);
	}
	public Emp update(Emp emp) {
		emp=ed.find(emp);
		return emp;
	}
	

}
