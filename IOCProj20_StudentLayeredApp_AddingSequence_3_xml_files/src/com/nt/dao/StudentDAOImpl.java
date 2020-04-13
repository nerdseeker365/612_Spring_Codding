package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public final class StudentDAOImpl implements StudentDAO {
	private static final String  query="INSERT INTO SPRING_CORE_STUDENT VALUES(STUDENTSQUENCE.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
		this.ds = ds;
	}


	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		 PreparedStatement ps=null;
		int result=0;
				//get Pooled JDBC con Object
		con=ds.getConnection();
		ps=con.prepareStatement(query);
		//set Values BO class obj data to Query IN params(?)
		//ps.setInt(1,bo.getStdNo());
		ps.setString(1,bo.getStdName());
		ps.setString(2,bo.getStdAddr());
		ps.setInt(3,bo.getTotal());
		ps.setFloat(4,bo.getAvg());
		ps.setString(5,bo.getResult());
		//execute the query
		result=ps.executeUpdate();
		//close jdbc Objects
		ps.close();
		con.close();
		return result;
	}

}
