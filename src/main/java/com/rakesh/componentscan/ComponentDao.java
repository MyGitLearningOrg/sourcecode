package com.rakesh.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDao {

	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getComonentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComonentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
}
