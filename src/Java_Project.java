/* NAME-
		 NUMAN SHAIKH(Roll No-49)
		 SAYED SAJJAD HAIDER(Roll No-41),
   DEPARTMENT-COMPUTER ENGINEERING
   S.E(SEM 3)
   OOPM PROJECT
   TITLE-ATM MANAGEMENT SYSTEM
   PROJECT INCHARGE- ASFAQUE SIR
*/
import java.text.DecimalFormat;
import java.io.IOException;
import java.util.*;
import java.util.Random;

class Account 
	{
		Random num =new Random();
		Scanner input = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'Rs '###,##0.00");
	
		double amount;
		int amt;
		public static void sleep(int time)
			{
				try{Thread.sleep(time);}
				catch(Exception e){}
			}


		/* Get Account Balance */

			public double getSavingBalance() 
				{
					return savingBalance;
				}

	
		/* Calculate Account withdrawal */

		public double calcSavingWithdraw(double amount)
		{
			savingBalance = (savingBalance - amount);
			return savingBalance;
		}

	

		/* Calculate Account deposit */

		public double calcSavingDeposit(double amount)
		{
			savingBalance = (savingBalance + amount);
			return savingBalance;
		}

	

		/* Customer Account Withdraw input */
	
		public void getSavingWithdrawInput() 
		{	
		
	
			System.out.println("\t\t\t\t\tAccount Balance:	" + moneyFormat.format(savingBalance));
			System.out.print("\t\t\t\t\tAmount you want to withdraw from your Account:	 ");
			sleep(2000);
			
			amount = input.nextDouble();

			if ((savingBalance - amount) >= 1000)
				{
					calcSavingWithdraw(amount);
					for(int i=0;i<5;i++)
					System.out.println("");
					System.out.println("\t\t\t\t\tYour new Account balance: 	" + moneyFormat.format(savingBalance) + "\n");
					for(int i=0;i<10;i++)
					System.out.println("");
				} 
			else 
				{
					System.out.println("\t\t\tBalance cannot be less than Rs 1000!!! , Please  maintain the minimum balance ." + "\n");
				}
			
		}



		/* Customer Account Deposit input */

		public int getSavingDepositInput() 
		{
			System.out.println("\t\t\t\t\tAccount Balance: 		" + moneyFormat.format(savingBalance));
			System.out.print("\t\t\t\t\tAmount you want to deposit into your Account:	 ");
			amt = input.nextInt();

		

			if ((savingBalance + amt) >= 0)
				{
					calcSavingDeposit(amt);
					System.out.println("\t\t\t\t\tYour new Account balance: 		" + moneyFormat.format(savingBalance) + "\n");
					for(int i=0;i<10;i++)
					System.out.println("");
				} 
			else
				{
					System.out.println("\t\t\t\t\t\\tBalance cannot be negative." + "\n");
				}
		
		
			return amt;
		
		}
	
	
		public void getMinistatement()
		{
		
			System.out.println("\t\t\t\t\t\tAccount number:	 "+ac_no+" XXXX");
			System.out.println("\t\t\t\t\t\tAmount balance:	 "+moneyFormat.format(getSavingBalance()));
			System.out.println("\t\t\t\t\t\tLast amount deposited:	"+amt);
			System.out.println("\t\t\t\t\t\tLast amount withdrawn:	"+amount);
			for(int i=0;i<5;i++)
					System.out.println("");
		}
	
		public void getReport()
		{
			String s;
			System.out.println("\t\t\t\t\t\tEnter Your query");
			Scanner sc=new Scanner(System.in);
			
			s=sc.nextLine();
			System.out.println("\t\t\tThank you !!!, Your response has been recoreded & we will soon get in touch with you");
		
		}
	
	

		private int pinNumber;
		private double savingBalance = 0;
		int ac_no=16428381+num.nextInt(876);
	
	
	
	}



class OptionMenu extends Account
	{
	
		Scanner s=new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'Rs'###,##0.00");
	
		public static void sleep(int time)
			{
				try{Thread.sleep(time);}
				catch(Exception e){}
			}
	
	
	
		int Pinnumber1=1234;
		final int cardnumber1=4321;
		int Pinnumber2=1514;
		final int cardnumber2=4151;
		int Pinnumber3=0000;
		final int cardnumber3=0000;
	
	
	
		public void getLogin()
		{
			int x = 1;
		
		
		
		
		
			do
			{
					//pin=1234 || pin=1514 || pin=0000;
				try
				{
					System.out.println("");
					for(int i=0;i<10;i++)
					System.out.println("");
					System.out.println("\t\t\t\t*********************************************************");
					System.out.println("\t\t\t\t\t\tWelcome to the ATM !");			
					System.out.println("\t\t\t\t*********************************************************");

					sleep(3000);

					System.out.print("\t\t\t\t\t\tEnter Your Card\n");
					sleep(4000);
				
					System.out.print("\t\t\t\t\tPlease enter your secuity number:\n");
					
					int cardnumber=s.nextInt();
				
					System.out.println("\t\t\t\t\tEnter Your Pin Number: ");
					int Pinnumber=s.nextInt();
					sleep(2000);
					System.out.println("");
				
					if((Pinnumber==Pinnumber1 && cardnumber==cardnumber1) || (Pinnumber==Pinnumber2 && cardnumber==cardnumber2) || (Pinnumber==Pinnumber3 && cardnumber==cardnumber3))
					{
						selectoperation();					
					
					}
			
					else
					{
						System.out.println("\n" + "\t\t\t\t\tInvalid Pin, Please try Again" + "\n");
						sleep(3000);
					}
			}
				catch(Exception e)
				{
					System.out.println("\t\t\t\t\t\tInvalid Characters. Only Numbers");
					sleep(2000);
				}
			
			
			
		}
			while (x == 1);
	}

	
	public void selectoperation()
		{ 
			System.out.println("\t\t\t\t=========================================================");
			System.out.println("\t\t\t\t\tEnter The Operation You Want To perform\n");
            System.out.println("\t\t\t\t=========================================================");
            System.out.println("\t\t\t\t\t1:DEPOSIT MONEY \t 4:MINI STATEMENT \n\t\t\t\t\t2:WITHDRAW MONEY \t 5:REPORT PROBLEM \n\t\t\t\t\t3:CHECK BALANCE \t 6:EXIT\n");
			sleep(2000);
            System.out.println("\t\t\t\t\t\tEnter Your Choice");

            int choice=s.nextInt();
            System.out.println("\t\t\t\t*********************************************************");

            switch(choice)
            {
                case 1: getSavingDepositInput();
						sleep(2000);
						selectoperation();
						break;
						
				case 2: getSavingWithdrawInput();
						sleep(2000);
						selectoperation();
						break;
						
				case 3: System.out.println("\t\t\t\t\t\tYOUR ACCOUNT BALANCE IS: "+ moneyFormat.format(getSavingBalance()) + "\n");
						sleep(2000);
						for(int i=0;i<5;i++)
							System.out.println("");
						selectoperation();
						break;
						
				case 4: getMinistatement();
						sleep(2000);
						selectoperation();
						break;
						
				case 5: getReport();
						sleep(2000);
						selectoperation();
						break;
				
				case 6: System.out.println("\t\t\t\t\tTHANK YOU FOR USING OUR ATM, HAVE A GOOD DAY !!!!\n");
						System.out.println("\t\t\t\t*********************************************************");
						sleep(4000);
						for(int i=0;i<25;i++)
							System.out.println("");
						break;
						
			
						default: System.out.println("\t\t\t\t\t\tPLEASE ENTER A VALID CHOICE\n");
						 sleep(2000);
            }

		}
	
	

	
}


public class Java_Project extends OptionMenu
{
	
		
	public static void main(String args[]) throws IOException
	{
			
			OptionMenu optionMenu = new OptionMenu();
			optionMenu.getLogin();

            
	}
}




