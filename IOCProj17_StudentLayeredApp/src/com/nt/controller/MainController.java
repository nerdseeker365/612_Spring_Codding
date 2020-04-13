package com.nt.controller;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentOperationsService;
import com.nt.vo.StudentVO;
    
public final class MainController {
private StudentOperationsService service=null;

public MainController(StudentOperationsService service) {
	this.service = service;
}

@SuppressWarnings("null")
public String handler(StudentVO vo)throws Exception{
	StudentDTO dto=null;
	String result=null;
	//Convert VO class Object to DTO class Object
	dto=new StudentDTO();
	dto.setStdNo(Integer.parseInt(vo.getStdNo()));
	dto.setStdName(vo.getStdName());
	dto.setStdAddr(vo.getStdAddr());
	dto.setStdM1(Integer.parseInt(vo.getStdM1()));
	dto.setStdM2(Integer.parseInt(vo.getStdM2()));
	dto.setStdM3(Integer.parseInt(vo.getStdM3()));
	//Use Service
	result=service.register(dto);
	return result;
	
}
}
