package com.rakesh.springdemo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PersonDao {

	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	

}
