

package com.capgemini.pecunia.ServicesTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import com.capgemini.pecunia.DTO.Transaction;
import com.capgemini.pecunia.exceptions.AccountNumberValidation;
import com.capgemini.pecunia.services.PassbookMaintenanceServiceImpl;

public class PassbookMaintenanceServiceImplTest {
	@Test
	public void testAccountVedrification() throws AccountNumberValidation
	{
		PassbookMaintenanceServiceImpl testObj=new PassbookMaintenanceServiceImpl();
		boolean result=testObj.accountVerificationService("20424444083");
		assertTrue(result);
	}
	
	
	@Test
	public void testUpdatePassbookService() throws AccountNumberValidation
	{
		PassbookMaintenanceServiceImpl testObj=new PassbookMaintenanceServiceImpl();
		Object[] result=testObj.updatePassbook("20424444085").toArray();
		Object[] expected=new Object[1];
		
		Transaction obj=new Transaction();
		obj.setAccountNumber(20424444085L);
		obj.setMoney(1200);
		obj.setDate(LocalDate.parse("2019-05-14"));
		expected [0]= obj;
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void testAccountSummaryService() throws AccountNumberValidation
	{
		PassbookMaintenanceServiceImpl testObj=new PassbookMaintenanceServiceImpl();
		Object [] result=testObj.accountSummary("20424444085",LocalDate.parse("2019-04-14"),LocalDate.parse("2019-07-14")).toArray();
		Object [] expected=new Object[1];		Transaction obj=new Transaction();
		obj.setAccountNumber(20424444085L);
		obj.setMoney(1200);
		obj.setDate(LocalDate.parse("2019-05-14"));
		expected [0]= obj;
		assertArrayEquals(expected,result);
	}
	
}
