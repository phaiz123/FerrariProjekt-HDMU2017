package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import domain.Customer;
import exceptions.CustomerDoesNotExistException;

class SetCustomerTroubleOppositeDB extends DBAccess {
	void execute(Customer customer) throws SQLException, CustomerDoesNotExistException{
		connect();
		PreparedStatement statement = prepareStatement("UPDATE CUSTOMERS SET TROUBLE = NOT TROUBLE WHERE NAME = ? AND CPR = ?");
		statement.setString(1, customer.getName());
		statement.setString(2, customer.getCprNr());
		statement.execute();
		if(statement.executeUpdate()<1)
			throw new CustomerDoesNotExistException(customer);
		disConnect();
	}
}
