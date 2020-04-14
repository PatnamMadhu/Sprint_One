package com.capgemini.pecunia.UI;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import com.capgemini.pecunia.DTO.Transaction;
import com.capgemini.pecunia.services.PassbookMaintenanceServiceImpl;



public class PassbookController
{
	public static void main(String...arg) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your account number");
		String accountNumber=sc.next();

		try 
		{
			PassbookMaintenanceServiceImpl accountObj=new PassbookMaintenanceServiceImpl();
			boolean result= accountObj.accountVerificationService(accountNumber);
			if(result) 
			{
				while(true)
					
				{
					System.out.println("1.Passbook Update\t2.Account Summary\t3.Exit");
					System.out.println("Enter your option");
				try {
					int option=sc.nextInt();
					switch(option) 
					{
						case 1:
							List<Transaction> listOfTransaction=accountObj.updatePassbook(accountNumber);
							System.out.println("AccountNumber"+"    "+"Transaction"+"  "+"DateOfTransaction"+"\n");
							for(Transaction x:listOfTransaction) 
							{
								System.out.println(x.getAccountNumber()+"        "+x.getMoney()+"       "+x.getDate()+"\n");
							}
							break;
							
						case 2:
							List<Transaction> dateOfTransaction=null;
							try 
							{
								System.out.println("Enter From Date and To Date\n");
								System.out.println("Enter  Dates as yyyy-MM-dd format (Ex: 2019-09-23)");
								String fromDate=sc.next(),toDate=sc.next();
								LocalDate fDate=LocalDate.parse(fromDate);
								LocalDate lDate=LocalDate.parse(toDate);
								try 
								{
										
									dateOfTransaction=accountObj.accountSummary(accountNumber,fDate,lDate);
									System.out.println("Account Number"+"    "+"Transaction"+"  "+"Date of Transaction"+"\n");
									int count=0;
									for(Transaction x:dateOfTransaction) 
									{
										System.out.println(x.getAccountNumber()+"       "+x.getMoney()+"        "+x.getDate()+"\n");
										count++;
									}
									if(count==0) 
									{
										System.out.println("You have not performed any transactions during Entered Dates\n");
									}
								}
								catch(Exception e)
								{
									System.out.println(e.getMessage());
								}
							}
							catch(DateTimeParseException e) 
							{
								System.out.println("You have entered incorrect format of Date\n");
							}
							break;
							
						case 3:
							System.out.println("Thank You.");
							System.exit(1);
							break;
							
						default:
							System.out.println("You have entered incorrect option\n");
					}
				}
				catch(NumberFormatException e) {
					System.out.println("Enter Valid Option");
				}
				}
				
			}
			else 
			{
				
				System.out.println("\nAccount number does not exist in ");
			}
		}
		catch(Exception e) 
		{
			System.out.println("Invalid Account Number man!!");
		}
			sc.close();
	}
}
