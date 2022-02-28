//package program;
import java.util.*;

public class Process {
	 Scanner sc=new Scanner(System.in);
	 public static int c=0;
	 ArrayList<UserDetail> list= new ArrayList<>();
	 ArrayList<UserDetail> list1=new ArrayList<>();
	 void add(){
	 UserDetail u1=new UserDetail("73402320","1011","123456","abc",2000);
	 UserDetail u2=new UserDetail("20489234","6070","987654","xyz",3000);
	 UserDetail u3=new UserDetail("40839020","1213","101112","pqr",4000);
	  list.add(u1) ;
	  list.add(u2);
	  list.add(u3);
	 }
	      String check(){
	         int c1=0,cnt=0,cnt1=0,c2=0;
	      StringBuilder s =new StringBuilder();
	      String[] a=new String[4];
	      System.out.println("enter card number:");
	      String cnum=sc.next();
	     String pnum="";  
	         if(cnum.length()==8){
	             for(UserDetail i:list){
	                
	                 cnt++;
	                 if(i.cardno.equals(cnum))
	                 {
	                     c2++;
	                     break;
	                 }
	             }
	                 if(c2==0){
	                 System.out.println("Invalid cardno");
	                 System.out.println("Try Again...");	              
	                 c1++;
	                  System.exit(0);
	                  
	                 }
	             
	              if(c1==0){
	            	System.out.println("enter pin number");  
	              
	                for(int j=0;j<4;j++){
	                         a[j]=sc.next();
	                         s.append(a[j]);
	                     }
	                pnum=s.toString();
	              
	                    
	                  for(UserDetail i:list) {  
	                      cnt1++;
	                    if((i.pinno.equals(pnum))&&(cnt==cnt1)){
	                        c++;
	                        break;
	                       
	                    }
	                  } 
	              }if(c==0)
	                        System.out.println("Invalid pin number");
	                        System.out.println("Try Again...");
	                 }
	            
	             
	                 
	             
	         
	         else{
	          System.out.println("Inavlid card size");
	          System.out.println("Try Again...");
	         }
	          return pnum;
	          
	     }
	     void withdraw(String pnum){
	     
	         for(UserDetail i: list){
	             
	             if(i.pinno.equals(pnum))
	             {
	                 System.out.println("enter amount you want to withdraw:");
	                 int amt=sc.nextInt();
	                 if(amt<=i.bal) {
	                 if(amt%100==0) {
	                 System.out.println("Please wait...While your transaction is processing...");
	                 list1.add(new UserDetail(amt,"withdraw"));
	                 i.bal=i.bal-amt;
	                 System.out.println("Cash withdrawn Sucessfully");
	                 System.out.println("Collect your cash");
	             
	                
	                 }
	                 else
	                	 System.out.println("Only 100,200,500,2000 notes are available");
	         } 
	                 else
	                	 System.out.println("Insufficient balance ");
	     }
	     }
	     }
	     void transfer(String pnum){
	    	 int count=0;
	             System.out.println("Enter Account Number: ");
	             String anum=sc.next();
	             System.out.println("Enter Name: ");
	             String Name=sc.next();
	              if(anum.length()==6) {
	              for(UserDetail i: list){
	                  if(i.pinno.equals(pnum))
	                  {
	                	  System.out.println("enter amount:");
	                	  int amt=sc.nextInt();
	                	  if(amt<=i.bal) {
	                		  count++;
	                	  
	                      i.bal=i.bal-amt;
	                      list1.add(new UserDetail(amt,"Transfer"));
	                  
	                  System.out.println("Amount Transferred Sucessfully");
	                  break;
	                	  }
	                	  else {
	                		  System.out.println("Insufficient Balance");
	                		  break;
	                	  }
	              }
	              }
	              }
	              else
	            	  System.out.println("Invalid Account number");
	              
	     }
	             
	             
	     
	     void checkbal(String pnum){
	         for(UserDetail i:list){
	             if(i.pinno.equals(pnum)) {
	            	 System.out.println("Your Current balance is");
	             System.out.println(i.bal);
	         }
	         }
	     }
	     void deposit(String pnum){ 
	         for(UserDetail i:list){
	             if(i.pinno.equals(pnum))
	             { 
	                  System.out.println("Enter amount to Deposit: ");
	                  int amt=sc.nextInt();
	                  i.bal=i.bal+amt;
	                  list1.add(new UserDetail(amt,"Deposit"));
	                  System.out.println("Amount deposited sucessfully");
	             }
	         }
	     }
	      
	     void transactionhis(String pnum){
	         System.out.println("Mini Statement");
	    	 for(UserDetail i:list1){
	          System.out.println(i);
	         }
	    	 for(UserDetail i:list) {
	    		 if(i.pinno.equals(pnum))
	    			 System.out.println("Avail Bal:"+i.bal);
	     }
             
}
}
