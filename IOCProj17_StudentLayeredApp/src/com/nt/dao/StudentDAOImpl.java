package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public final class StudentDAOImpl implements StudentDAO {
	private static final String  query="INSERT INTO SPRING_CORE_STUDENT VALUES(?,?,?,?,?,?)";
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
		ps.setInt(1,bo.getStdNo());
		ps.setString(2,bo.getStdName());
		ps.setString(3,bo.getStdAddr());
		ps.setInt(4,bo.getTotal());
		ps.setFloat(5,bo.getAvg());
		ps.setString(6,bo.getResult());
		//execute the query
		result=ps.executeUpdate();
		//close jdbc Objects
		ps.close();
		con.close();
		return result;
	}

}
