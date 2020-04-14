package com.capgemini.pecunia.util;
import com.capgemini.pecunia.DTO.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
	public static List<Transaction> transaction=new ArrayList<Transaction>();
	static {
		
		Transaction obj=new Transaction();
		obj.setAccountNumber(20424444083L);
		obj.setMoney(-5000);
		obj.setDate(LocalDate.parse("2019-02-10"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444082L);
		obj.setMoney(+1500);
		obj.setDate(LocalDate.parse("2019-01-07"));
		transaction.add(obj);

		obj=new Transaction();
		obj.setAccountNumber(20424444081L);
		obj.setMoney(+1700);
		obj.setDate(LocalDate.parse("2019-01-20"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444084L);
		obj.setMoney(-1200);
		obj.setDate(LocalDate.parse("2019-01-14"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444083L);
		obj.setMoney(-1400);
		obj.setDate(LocalDate.parse("2019-02-08"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444083L);
		obj.setMoney(+1200);
		obj.setDate(LocalDate.parse("2019-02-09"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444083L);
		obj.setMoney(+1300);
		obj.setDate(LocalDate.parse("2019-03-05"));
		transaction.add(obj);

		obj=new Transaction();
		obj.setAccountNumber(20424444083L);
		obj.setMoney(-6100);
		obj.setDate(LocalDate.parse("2019-07-27"));
		transaction.add(obj);

		obj=new Transaction();
		obj.setAccountNumber(20424444082L);
		obj.setMoney(-1700);
		obj.setDate(LocalDate.parse("2019-03-13"));
		transaction.add(obj);

		obj=new Transaction();
		obj.setAccountNumber(20424444082L);
		obj.setMoney(-2100);
		obj.setDate(LocalDate.parse("2019-04-14"));
		transaction.add(obj);

		obj=new Transaction();
		obj.setAccountNumber(20424444082L);
		obj.setMoney(+1300);
		obj.setDate(LocalDate.parse("2019-09-19"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444082L);
		obj.setMoney(+1900);
		obj.setDate(LocalDate.parse("2019-11-02"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444081L);
		obj.setMoney(+13000);
		obj.setDate(LocalDate.parse("2019-04-09"));
		transaction.add(obj);

		obj=new Transaction();
		obj.setAccountNumber(20424444081L);
		obj.setMoney(-2500);
		obj.setDate(LocalDate.parse("2019-08-16"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444081L);
		obj.setMoney(-7000);
		obj.setDate(LocalDate.parse("2019-12-29"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444081L);
		obj.setMoney(-19000);
		obj.setDate(LocalDate.parse("2020-01-25"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444084L);
		obj.setMoney(+1800);
//		obj.setAvlBalance(balance4+1800);
		obj.setDate(LocalDate.parse("2019-04-11"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444084L);
		obj.setMoney(+21000);
		obj.setDate(LocalDate.parse("2019-03-07"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444084L);
		obj.setMoney(-13000);
		obj.setDate(LocalDate.parse("2019-04-21"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444084L);
		obj.setMoney(-1700);
		obj.setDate(LocalDate.parse("2019-09-22"));
		transaction.add(obj);
		
		obj=new Transaction();
		obj.setAccountNumber(20424444085L);
		obj.setMoney(1200);
		obj.setDate(LocalDate.parse("2019-05-14"));
		transaction.add(obj);
		
		
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}

 } 
