package org.qhit.service;

import java.util.List;

import javax.annotation.Resource;

import org.qhit.Dao.DeptDao;
import org.qhit.Pojo.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Deptservice {
	
	@Resource
	private DeptDao dd;
	
	
	public List<Dept> S1() {
		List<Dept> dl = dd.selectAll();
		return dl;
		
	}

}
