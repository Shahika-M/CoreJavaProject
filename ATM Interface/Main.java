package program;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new  Scanner(System.in);
		   Process p=new Process(); 
		   p.add();
		 String pnum = p.check();
//		Process p1=new Process();
		 int count=p.c;
		   if(count==1){
		    System.out.println("Select the service");
		  char ch;
		    do{
		        System.out.println("1-Withdraw");
		        System.out.println("2-Deposit");
		        System.out.println("3-CheckBalance");
		        System.out.println("4-Fund Transfer");
		        System.out.println("5-Transaction History");
		        int opt=sc.nextInt();
		        switch(opt){
		            case 1:
		                p.withdraw(pnum);
		                break;
		             case 2:
		                 p.deposit(pnum);
		                 break;
		             case 3:
		                 p.checkbal(pnum);
		                 break;
		             case 4:
		                 p.transfer(pnum);
		                 break;
		             case 5:
		                 p.transactionhis(pnum);
		                 break;
		                 default:
		                 System.out.println("enter a number 1 to 5");
		        }
		    
		        System.out.println("Do you want make another transaction ? y/n:");
		         ch=sc.next().charAt(0);
		    }
		         while(ch== 'Y' || ch=='y');
	         System.out.println("Thank You !!!");
		}

	}

}
