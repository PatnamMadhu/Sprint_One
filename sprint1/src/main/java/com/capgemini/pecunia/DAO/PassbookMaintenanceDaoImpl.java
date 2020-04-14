package com.capgemini.pecunia.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.pecunia.DTO.Account;
import com.capgemini.pecunia.DTO.Transaction;
import com.capgemini.pecunia.exceptions.AccountNumberValidation;
import com.capgemini.pecunia.util.AccountListRepository;
import com.capgemini.pecunia.util.TransactionRepository;

public class PassbookMaintenanceDaoImpl implements PassbookMaintenanceDao 
{	
	
	AccountListRepository accountObj=new AccountListRepository();
	static TransactionRepository transactionObj=new TransactionRepository(); 
	static List<Transaction>  transaction=transactionObj.getTransaction();
	
	
	public boolean accountValidation(long accountId) 
	{
		
		Map<Long,Account> accounts=accountObj.getAccounts();

		if(accounts.containsKey(accountId)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	
	public List<Transaction> updatePassbook(String accountID) 
	{
		long accountNumber=Long.parseLong(accountID);
		List<Transaction> transactionList=new ArrayList<Transaction>();
		
		for(Transaction x: transaction) 
		{
			if(x.getAccountNumber()==accountNumber) 
			{
				transactionList.add(x);
			}
		}
		return transactionList;
		
	}

	
public List<Transaction> accountSummary(String accountID, LocalDate fDate, LocalDate lDate) throws AccountNumberValidation
	{

		long accountNumber=Long.parseLong(accountID);
		List<Transaction> transactionListDate=new ArrayList<Transaction>();
		
		for(Transaction x: transaction) 
		{
			if(x.getAccountNumber()==accountNumber && x.getDate().compareTo(fDate)>0 && x.getDate().compareTo(lDate)<0) 
			{

					transactionListDate.add(x);
					System.out.println(x.getMoney());
			}
		}

		return transactionListDate;
	}
	
}
