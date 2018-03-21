package org.qhit.web;

import java.util.List;

import javax.annotation.Resource;

import org.qhit.Pojo.Dept;
import org.qhit.service.Deptservice;
import org.qhit.service.Empservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Deptcontroller {

	@Resource
private Deptservice ds;
	
	@RequestMapping("/select1")
	public List<Dept> select() {
		List<Dept> dl = ds.S1();
		return dl;
		
	}


}
