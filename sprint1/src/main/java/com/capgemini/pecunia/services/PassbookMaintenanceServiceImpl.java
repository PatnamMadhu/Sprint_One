package com.capgemini.pecunia.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.capgemini.pecunia.DAO.PassbookMaintenanceDaoImpl;
import com.capgemini.pecunia.DTO.Transaction;
import com.capgemini.pecunia.exceptions.AccountNumberValidation;

public class PassbookMaintenanceServiceImpl implements PassbookMaintenanceService
{
	LocalDateTime now = LocalDateTime.now();
	PassbookMaintenanceDaoImpl accountObj=new PassbookMaintenanceDaoImpl();
	DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
	public boolean accountVerificationService(String accountNumber) throws AccountNumberValidation//AccountNumber
	{
		
		
		if(accountNumber.length()!=11) 
		{
			throw new AccountNumberValidation("Invalid account Number");
		}
		long accountId=Long.parseLong(accountNumber);
		boolean result=accountObj.accountValidation(accountId);
		return result;
	}
	
	public List<Transaction> updatePassbook(String accountNumber) 
	{
		
		return accountObj.updatePassbook(accountNumber);
		
	}

	public List<Transaction> accountSummary(String accountNumber, LocalDate fdate, LocalDate lDate) throws AccountNumberValidation
	{
		if(lDate.isAfter(LocalDate.parse(formatter.format(now), formatter))) 
		{
			throw new AccountNumberValidation("End Date Must be before the current date");
		}
		if(fdate.isAfter(lDate)) 
		{
			throw new AccountNumberValidation("Starting Date should be less than the end Date");
		}
		
		
		List<Transaction> dateList= accountObj.accountSummary(accountNumber, fdate, lDate);
		return dateList;
		
	}
}
