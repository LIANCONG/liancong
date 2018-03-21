package org.qhit.web;

import java.util.List;

import javax.annotation.Resource;

import org.qhit.Pojo.Dept;
import org.qhit.Pojo.Emp;
import org.qhit.service.Deptservice;
import org.qhit.service.Empservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qq")
public class Empcontroller {
	@Resource
	private Empservice es;
	@Resource
	private Deptservice ds;
	
	@RequestMapping("/select")
	public String select(ModelMap map,Emp emp) {
		String sql="select * from emp where 1=1 ";
		
		if (emp!=null&&emp.getEname()!=null&&!emp.getEname().equals("")) {
			sql+=" and ename like'%"+emp.getEname()+"%'" ;
		}
		System.out.println(333333+emp.getEname());
		if (emp != null && emp.getDept() != null && emp.getDept().getDid() != null) {
			sql += " and did = " + emp.getDept().getDid();
		}
		List<Emp> el = es.f1(sql);
		List<Dept> dl =ds.S1();
		map.put("empBack", emp);
		map.put("el", el);
		map.put("dl", dl);
		return "select";
		
	}
	
	@RequestMapping("/insert")
	public String name(Emp emp) {
		es.insert(emp);
		return "redirect:select";
		
	}
	@RequestMapping("/delete")
	public String name(Integer eid) {
		es.delete(eid);
		return "redirect:select";
		
	}
	@RequestMapping("/update")
	public String up(ModelMap map,Emp emp) {
		emp=es.update(emp);
		List<Dept> dl = ds.S1();
		map.put("dl", dl);
		map.put("emp", emp);
		return "update";	
	}		

}
