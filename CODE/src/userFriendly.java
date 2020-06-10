import java.util.*;
import com.transaction.*;
import com.analyze.*;

public class userFriendly
{
    public userFriendly(){};
    public ReadFiles print()
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        
        ReadFiles r = null;

        System.out.println("##########################################");
        System.out.println("\tWELCOME TO STOCK MARKET!\t");
        System.out.println("##########################################");
        System.out.println("\nTIP : First Analyze the Data and then do Trading !\n");
        System.out.println("Stocks available: \n1.Amazon(Stock Available 100000)\n2.HDFC Bank(Stock Available 50000)\n3.Maruti Suzuki(Stock Available 10000)\n4.TCS(Stock Available 100000)\n5.Reliance(Stock Available 200000)");
        System.out.println("##########################################");

        do{
        System.out.println("\n------------------------------------------------------------");
        System.out.println("\nEnter 1 to analyze Historical Data of particular Company!");
        System.out.println("Enter 2 to purchase/sell stock!");
        System.out.println("Enter 3 to sell all your stock!");
        System.out.println("Enter 4 to exit!\n");
        System.out.println("--------------------------------------------------------------");
        while(true){
            
        try{
            ch=sc.nextInt();
            
            break;
        }catch(InputMismatchException e){
            System.out.println("\n***** Enter Valid Input! *****");
            sc.next();
        }
    }

        choice c =  new choice();


            switch(ch)
            {
                case 1 : r = c.analyze();
                         break;
                case 2 : c.purchase();
                         break;
                case 3 : c.sellAll();
                         break;
                case 4 :  System.out.println("\n***** Thank You! *****\n");
                          break;

                default : System.out.println("\n***** Enter Valid Choice! *****");
                          break;
            }
        }while(ch!=4);
        return r;
    }
}