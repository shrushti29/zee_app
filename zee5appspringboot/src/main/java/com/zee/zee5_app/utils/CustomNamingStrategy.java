package com.zee.zee5_app.utils;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl {
	
	@Override
	public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment context) {
		// TODO Auto-generated method stub
		if (identifier==null)
			return null;
		return identifier.toIdentifier(identifier.getText());
	}
	
//	@Override
//	public Identifier toPhysicalCatalogName(Identifier identifier, JdbcEnvironment context) {
//		// TODO Auto-generated method stub
//		if (identifier==null)
//			return null;
//		return Identifier.toIdentifier(identifier.getText().toLowerCase());
//	}

}