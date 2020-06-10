package com.transaction;
import java.util.*;
import java.io.*; 
import com.analyze.*;
import com.exceptions.*;

public class choice
{
    public File f;
    public String filename;
    public choice(){};
    public ReadFiles analyze()
    
    {
        System.out.println("\n***************************************\n");
        System.out.println("Enter 1 to analyze Amazon Data!");
        System.out.println("Enter 2 to analyze HDFC Bank Data!");
        System.out.println("Enter 3 to analyze Maruti suzuki Data!");
        System.out.println("Enter 4 to analyze TCS Data!");
        System.out.println("Enter 5 to analyze Reliance Data!");
        System.out.println("\n***************************************\n");

        Scanner sc = new Scanner(System.in);
        int ch;
        while(true){
            
            try{
                ch=sc.nextInt();
                
                break;
            }catch(InputMismatchException e){
                System.out.println("Enter Valid Input!");
                sc.next();
            }
        }
         ReadFiles r = null;

        switch(ch)
        {
            case 1 : File file1 = new File("D:\\JAVA PROJECT\\AMZN.csv");
                     r = new ReadFiles(file1);
                     //ReadFiles r = u.print();
                     r.convertToArray();
                     Formula f1 = new Formula(r);
                     f1.createDateArray(r.getArray());
                     f1.createDataArray(r.getArray());
                     f1.findMax();
                     f1.findMin();
                     f1.findMaxVol();
                     f1.findMinVol();
                     f1.openAvg();
                     f1.closeAvg();
                     f1.printArray();
                     break;

            case 2 : File file2 = new File("D:\\JAVA PROJECT\\HDFCBANK.csv");
                     r = new ReadFiles(file2);
                     r.convertToArray();
                     Formula f2 = new Formula(r);
                     f2.createDateArray(r.getArray());
                     f2.createDataArray(r.getArray());
                     f2.findMax();
                     f2.findMin();
                     f2.findMaxVol();
                     f2.findMinVol();
                     f2.openAvg();
                     f2.closeAvg();
                     f2.printArray();
                     break;

            case 3 : File file3 = new File("D:\\JAVA PROJECT\\MARUTI.csv");
                     r = new ReadFiles(file3);
                     r.convertToArray();
                     Formula f3 = new Formula(r);
                     f3.createDateArray(r.getArray());
                     f3.createDataArray(r.getArray());
                     f3.findMax();
                     f3.findMin();
                     f3.findMaxVol();
                     f3.findMinVol();
                     f3.openAvg();
                     f3.closeAvg();
                     f3.printArray();
                     break;

            case 4 : File file4 = new File("D:\\JAVA PROJECT\\TCS.csv"); 
                     r = new ReadFiles(file4);
                     r.convertToArray();
                     Formula f4 = new Formula(r);
                     f4.createDateArray(r.getArray());
                     f4.createDataArray(r.getArray());
                     f4.findMax();
                     f4.findMin();
                     f4.findMaxVol();
                     f4.findMinVol();
                     f4.openAvg();
                     f4.closeAvg();
                     f4.printArray();
                     break;

            case 5 : File file5 = new File("D:\\JAVA PROJECT\\RELIANCE.csv");
                     r = new ReadFiles(file5);
                     r.convertToArray();
                     Formula f5 = new Formula(r);
                     f5.createDateArray(r.getArray());
                     f5.createDataArray(r.getArray());
                     f5.findMax();
                     f5.findMin();
                     f5.findMaxVol();
                     f5.findMinVol();
                     f5.openAvg();
                     f5.closeAvg();
                     f5.printArray();
                     break;

            default : System.out.println("Enter Valid Choice!");
        }
        return r;
    }

    public void purchase()
    {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("\nEnter Your Username!");
        // try{

        filename=sc.next();
        // File f = new File("D://JAVA PROJECT//"+filename+".txt");
        //     boolean b;
        //     b = f.createNewFile();
        //     if(!b)
        //     {
        //         System.out.println("\nThis Username Exists!\n---------------------------------------------------\nEnter 1 to continue through this Username!\nEnter 2 to try new Username!\n---------------------------------------------------");
        //         int ch = sc.nextInt();
        //         if(ch==1)
        //         {
        //             f.delete();
        //             break;
        //         }
        //         else if (ch==2)               {
        //             continue;
        //         }
        //         else
        //         {
        //          throw new InputMismatchException("Not valid input!");
                 
        //         }
        //     }else{
        //         f.delete();
        //         break;
        //     }
        // }catch(Exception e){
        //     System.out.println(e);
        //     sc.next();
        //     continue;
        // }
        // }

        BufferedWriter writer =null;
        dailydata d = new dailydata();

    

        try
        {           
            File f = new File("D://JAVA PROJECT//"+filename+".txt");
            boolean b;
            b = f.createNewFile();
           
            if(b){
                System.out.println("\nWelcome to STOCK MARKET!\nYour Account created!\nPlease Remember your Username!");
             
            }else{
                System.out.println("\nAccount Exist!\nEnjoy Trading!");
                d.readFromFile(filename);
               
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

        
        d.read();
       // d.printinFile(filename);
        d.random();
        d.buy();
        d.sell();
        d.printinFile(filename);
        
        
        
    }

    public void sellAll()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter Your Username!");
        filename=sc.nextLine();
        dailydata d = new dailydata();

        try
        {           
            File f = new File("D:\\JAVA PROJECT\\"+filename+".txt");
            boolean b;
            b = f.createNewFile();
           
            if(b){
                System.out.println("Please first Login!");
               
            }else{
                System.out.println("\nThank You for Being our Customer!\nPlease Stay connect!");

                d.readFromFile(filename);
               
            }

           
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        d.exit(filename);
        
    }
    
} 