package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public final class StudentOperationsServiceImpl implements StudentOperationsService {
	@SuppressWarnings("unused")
	private StudentDAO dao = null;

	public StudentOperationsServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String register(StudentDTO dto) throws Exception {
		int total = 0;
		float avg = 0.0f;
		String result = null;
		StudentBO bo = null;
		int count = 0;
		// write business logic
		total = dto.getStdM1() + dto.getStdM2() + dto.getStdM3();

		avg = total / 3.0f;

		if (dto.getStdM1() < 35 || dto.getStdM2() < 35 || dto.getStdM3() < 35) {
			result = "fail";
		} else {
			result = "pass";
		}
		// create BO class obj having Persistable Data
		bo = new StudentBO();
		bo.setStdNo(dto.getStdNo());
		bo.setStdName(dto.getStdName());
		bo.setStdAddr(dto.getStdAddr());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		// Use DAO
		count=dao.insert(bo);
		if (count == 0)
			return "Student Regidstration Failed-->" + result;

		else
			return "Student Regidstration Success-->" + result;

	}

}
