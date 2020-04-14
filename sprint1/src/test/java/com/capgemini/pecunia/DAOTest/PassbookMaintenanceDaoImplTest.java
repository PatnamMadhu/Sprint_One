package com.capgemini.pecunia.DAOTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import com.capgemini.pecunia.DAO.PassbookMaintenanceDaoImpl;
import com.capgemini.pecunia.DTO.Transaction;
import com.capgemini.pecunia.exceptions.AccountNumberValidation;

public class PassbookMaintenanceDaoImplTest {
	

	@Test
	void testAccountSummary() {
		PassbookMaintenanceDaoImpl accountObj=new PassbookMaintenanceDaoImpl();
		assertThrows(AccountNumberValidation.class,()->accountObj.accountSummary("20424444085", LocalDate.parse("2020-01-14"), LocalDate.parse("2019-05-14")));
	}

	@Test
	void testDateAccountSummary() {
		PassbookMaintenanceDaoImpl accountObj=new PassbookMaintenanceDaoImpl();
		assertThrows(AccountNumberValidation.class,()->accountObj.accountSummary("20424444085", LocalDate.parse("2019-05-14"), LocalDate.parse("2020-05-14")));
	}
	@Test
	void accountSummaryTest() throws AccountNumberValidation {
		PassbookMaintenanceDaoImpl accountObj=new PassbookMaintenanceDaoImpl();
		
		Object[] result=(accountObj.accountSummary("20424444085",LocalDate.parse("2019-04-14"),LocalDate.parse("2019-07-14"))).toArray();
		Object[] expected=new Object[1];
		Transaction obj=new Transaction();
		obj.setAccountNumber(20424444085L);
		obj.setMoney(1200);
		obj.setDate(LocalDate.parse("2019-05-14"));
		expected [0]= obj;
		assertArrayEquals(expected,result);
	}

}
