package program;
//import java.util.*;

public class UserDetail {
	String cardno;
    String pinno;
    String accno;
    String name; 
     int bal;
     int amt;
     String servicename;
    UserDetail(){
}
    UserDetail(String cardno, String pinno,String accno,String name,int bal){
    super();
     this.cardno=cardno;
        this.pinno=pinno;
        this.accno=accno;
        this.name=name;
        this.bal=bal;
    }
    UserDetail(int amt,String servicename){
        this.amt=amt;
        this.servicename=servicename;
    }
    public String toString(){
        return (amt+"-"+servicename);
    }

}
