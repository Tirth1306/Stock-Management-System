package com.transaction;
import java.util.*;
import java.io.*;
import com.analyze.*;
import com.exceptions.*;

public class dailydata
{
    public float [][]convertArray;
    public float openAMZN,openHDFC,openMaruti,openTCS,openRELIANCE,closeAMZN,closeHDFC,closeMaruti,closeTCS,closeRELIANCE;
    public int share1=0,share2=0,share3=0,share4=0,share5=0,shareopen1=0,shareopen2=0,shareopen3=0,shareopen4=0,shareopen5=0,shareclose1=0,shareclose2=0,shareclose3=0,shareclose4=0,shareclose5=0;
    public static float profit=0,loss=0,flag,total=0;
    public static float share1T=0,share2T=0,share3T=0,share4T=0,share5T=0;
    

    public dailydata()
    {
        convertArray = new float[25][2];
    }

    public void read()
    {
        int r=0;
       

        
        String data[][]; 
        data= new String[25][2];

        try{
            File f = new File("D://JAVA PROJECT//RANDOM.csv");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = null;

            while((line=reader.readLine())!=null)
            {
                StringTokenizer z = new StringTokenizer(line,",");
                while(z.hasMoreTokens())
                {
                    for(int c=0;c<2;c++)
                    {
                        data[r][c] = z.nextToken();
                    }
                    r++;
                }
            }

            reader.close();

        }catch(Exception e){
            System.out.println(e);
        }

        for(int x=0;x<25;x++)
        {
            for(int y=0;y<2;y++)
            {
                convertArray[x][y]=Float.parseFloat(data[x][y]); 
            }
        }
    
    }

    public void random()
    {
        int rand = (int)(Math.random() * 5);

        if(rand==0)
        {
            openAMZN=convertArray[0][0];
            openHDFC=convertArray[5][0];
            openMaruti=convertArray[10][0];
            openTCS=convertArray[15][0];
            openRELIANCE=convertArray[20][0];
            closeAMZN=convertArray[0][1];
            closeHDFC=convertArray[5][1];
            closeMaruti=convertArray[10][1];
            closeTCS=convertArray[15][1];
            closeRELIANCE=convertArray[20][1];
        }

        if(rand==1)
        {
            openAMZN=convertArray[1][0];
            openHDFC=convertArray[6][0];
            openMaruti=convertArray[11][0];
            openTCS=convertArray[16][0];
            openRELIANCE=convertArray[21][0];
            closeAMZN=convertArray[1][1];
            closeHDFC=convertArray[6][1];
            closeMaruti=convertArray[11][1];
            closeTCS=convertArray[16][1];
            closeRELIANCE=convertArray[21][1];
        }

        if(rand==2)
        {
            openAMZN=convertArray[2][0];
            openHDFC=convertArray[7][0];
            openMaruti=convertArray[12][0];
            openTCS=convertArray[17][0];
            openRELIANCE=convertArray[22][0];
            closeAMZN=convertArray[2][1];
            closeHDFC=convertArray[7][1];
            closeMaruti=convertArray[12][1];
            closeTCS=convertArray[17][1];
            closeRELIANCE=convertArray[22][1];
        }

        if(rand==3)
        {
            openAMZN=convertArray[3][0];
            openHDFC=convertArray[8][0];
            openMaruti=convertArray[13][0];
            openTCS=convertArray[18][0];
            openRELIANCE=convertArray[23][0];
            closeAMZN=convertArray[3][1];
            closeHDFC=convertArray[8][1];
            closeMaruti=convertArray[13][1];
            closeTCS=convertArray[18][1];
            closeRELIANCE=convertArray[23][1];
        }

        if(rand==4)
        {
            openAMZN=convertArray[4][0];
            openHDFC=convertArray[9][0];
            openMaruti=convertArray[14][0];
            openTCS=convertArray[19][0];
            openRELIANCE=convertArray[24][0];
            closeAMZN=convertArray[4][1];
            closeHDFC=convertArray[9][1];
            closeMaruti=convertArray[14][1];
            closeTCS=convertArray[19][1];
            closeRELIANCE=convertArray[24][1];
        }
    }

    public void buy()
    {
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        System.out.println("Opening Price of Amazon is " + openAMZN + "!");
        System.out.println("Opening Price of HDFC is " + openHDFC + "!");
        System.out.println("Opening Price of Maruti is " + openMaruti + "!");
        System.out.println("Opening Price of TCS is " + openTCS + "!");
        System.out.println("Opening Price of Reliance is " + openRELIANCE + "!");
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");

        Scanner s = new Scanner(System.in);
        while(true){
          System.out.println("\nHow much share you want to invest in Amazon?");
          try{
            shareopen1=s.nextInt();
            if(shareopen1>100000){
           try{
                throw new ExceededLimitException("Exceeded Limit!");
            }catch(Exception e){
                System.out.println(e);
                continue;
            }
        }
         
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
             continue;}
            share1+=shareopen1;
            break; 
        }

        while(true){
        System.out.println("\nHow much share you want to invest in HDFC!");
        
        try{
            shareopen2=s.nextInt();
        if(shareopen2>50000){
            try{
                 throw new ExceededLimitException("Exceeded Limit!");
             }catch(Exception e){
                 System.out.println(e);
                 continue;
             }
           }

        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
             continue;}
            share2+=shareopen2;
            break; 
        }

        while(true){ 
        System.out.println("\nHow much share you want to invest in Maruti!");
        try{
        shareopen3=s.nextInt();
         if(shareopen3>10000){
            try{
                 throw new ExceededLimitException("Exceeded Limit!");
             }catch(Exception e){
                 System.out.println(e);
                 continue;
             }
           }

        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
             continue;}
            share3+=shareopen3;
            break; 
        }

        while(true){
        System.out.println("\nHow much share you want to invest in TCS!");
        shareopen4=s.nextInt();
        try{
        if(shareopen4>100000){
            try{
                 throw new ExceededLimitException("Exceeded Limit!");
             }catch(Exception e){
                 System.out.println(e);
                 continue;}
             
            }
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
             continue;}
            share4+=shareopen4;
            break; 
        }

        while(true){
        System.out.println("\nHow much share you want to invest in RELIANCE!");
        shareopen5=s.nextInt();
        try{
        if(shareopen5>200000){
            try{
                 throw new ExceededLimitException("Exceeded Limit!");
             }catch(Exception e){
                 System.out.println(e);
                 continue;
             }
           }
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
             continue;}
            share5+=shareopen5;
            System.out.println(share5);
            break; 
        }


        share1T=(shareopen1*openAMZN);
        share2T=(shareopen2*openHDFC);
        share3T=(shareopen3*openMaruti);
        share4T=(shareopen4*openTCS);
        share5T=(shareopen5*openRELIANCE);

        total+=(share1T+share2T+share3T+share4T+share5T);

        
        
    }

    public void printinFile(String filename)
    {
        

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("D://JAVA PROJECT//"+filename+".txt"));
            //writer.write("\n\nTransaction : " + t); t++;
            writer.write("Total Shares Invested in Amazon : "+ share1 );
            writer.write("\nTotal Shares Invested in HDFC Bank : "+ share2 );
            writer.write("\nTotal Shares Invested in Maruti : "+ share3 );
            writer.write("\nTotal Shares Invested in TCS : "+ share4 );
            writer.write("\nTotal Shares Invested in Reliance : "+ share5 );
            writer.write("\nTotal Amount Invested : "+ total);
            writer.write("\nPROFIT : "+profit);
            writer.write("\nLOSS : "+loss);
            writer.close();
        }catch(Exception e){
            System.out.println(e);
            
        }    
    }

    public void sell()
    {
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        System.out.println("Closing Price of Amazon is " + closeAMZN + "!");
        System.out.println("Closing Price of HDFC is " + closeHDFC + "!");
        System.out.println("Closing Price of Maruti is " + closeMaruti + "!");
        System.out.println("Closing Price of TCS is " + closeTCS + "!");
        System.out.println("Closing Price of Reliance is " + closeRELIANCE + "!");
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        Scanner s = new Scanner(System.in);
        
        while(true){
        System.out.println("\nHow much share you want to sell in Amazon?");
        try{
        shareclose1=s.nextInt();
        if(share1-shareclose1<0)
        {   
            try{
            throw new NotEnoughStockException("You Dont have enough Stock of Amazon to sell!");
            }catch(Exception e){
                System.out.println(e);
                continue;
            }
        }
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
             continue; }
            share1-=shareclose1;
            break; 
        }
        while(true){
        System.out.println("\nHow much share you want to sell in HDFC!");
        try{
        shareclose2=s.nextInt();
        if(share2-shareclose2<0)
        {   
            try{
            throw new NotEnoughStockException("You Dont have enough Stock of Amazon to sell!");
            }catch(Exception e){
                System.out.println(e);
                continue;
            }
        }
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
            continue;}
            share2-=shareclose2;
            break; 
        }

        while(true){
        System.out.println("\nHow much share you want to sell in Maruti!");
        try{
        shareclose3=s.nextInt();
        if(share3-shareclose3<0)
        {   
            try{
            throw new NotEnoughStockException("You Dont have enough Stock of Maruti to sell!");
            }catch(Exception e){
                System.out.println(e);
                continue;
            }
        }
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
            continue;}
            share3-=shareclose3;
            break; 
        }

        while(true){
        System.out.println("\nHow much share you want to sell in TCS!");
        try{
        shareclose4=s.nextInt();
        if(share4-shareclose4<0)
        {   
            try{
            throw new NotEnoughStockException("You Dont have enough Stock of TCS to sell!");
            }catch(Exception e){
                System.out.println(e);
                continue;
            }
        }
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
             continue;}
            share4-=shareclose4;
            break; 
        }
    
        while(true){
        System.out.println("\nHow much share you want to sell in RELIANCE!");
        try{
        shareclose5=s.nextInt();
        
        if(share5-shareclose5<0)
        {   
            try{
            throw new NotEnoughStockException("You Dont have enough Stock of Reliance to sell!");
            }catch(Exception e){
                System.out.println(e);
                continue;
            }
        }
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Input!");
            s.next();
            continue;}
            share5-=shareclose5;
            break; 
        }


        flag=(closeAMZN-openAMZN)*shareclose1+(closeHDFC-openHDFC)*shareclose2+(closeMaruti-openMaruti)*shareclose3+(closeTCS-openTCS)*shareclose4+(closeRELIANCE-openRELIANCE)*shareclose5;
        if(flag>0)
        profit+=flag;
        else
        loss+=flag;

        if((profit+loss)>0)
            {
                profit=profit+loss;
                loss=0;
            }
            else
            {
                loss=loss+profit;
                profit=0;
            }
        
    }

    public void  readFromFile(String filename)
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA PROJECT\\"+filename+".txt"));
            String line = null;
            System.out.println("\nYour Past Trading!");
            System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
            line=reader.readLine();
            share1=Integer.parseInt(line.substring(34));
            System.out.println("Total Shares Invested in Amazon : "+ share1 );
            line=reader.readLine();
            share2=Integer.parseInt(line.substring(37));
            System.out.println("Total Shares Invested in HDFC Bank : "+ share2 );
            line=reader.readLine();
            share3=Integer.parseInt(line.substring(34));
            System.out.println("Total Shares Invested in Maruti : "+ share3 );
            line=reader.readLine();
            share4=Integer.parseInt(line.substring(31));
            System.out.println("Total Shares Invested in TCS : "+ share4 );
            line=reader.readLine();
            share5=Integer.parseInt(line.substring(36));
            System.out.println("Total Shares Invested in Reliance : "+ share5 );
            line=reader.readLine();
            total=Float.parseFloat(line.substring(24));
            System.out.println("Total Amount Invested : "+ total);
            line=reader.readLine();
            profit=Float.parseFloat(line.substring(9));
            System.out.println("PROFIT : "+profit);
            line=reader.readLine();
            loss=Float.parseFloat(line.substring(7));
            System.out.println("LOSS : "+loss);
            reader.close();
            System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

        public void exit(String file)
        {
            shareclose1=share1;
            shareclose2=share2;
            shareclose3=share3;
            shareclose4=share4;
            shareclose5=share5;

            share1=0;
            share2=0;
            share3=0;
            share4=0;
            share5=0;

            flag=(closeAMZN-openAMZN)*shareclose1+(closeHDFC-openHDFC)*shareclose2+(closeMaruti-openMaruti)*shareclose3+(closeTCS-openTCS)*shareclose4+(closeRELIANCE-openRELIANCE)*shareclose5;
            if(flag>0)
            profit+=flag;
            else
            loss+=flag;

            if((profit+loss)>0)
            {
                profit=profit+loss;
                loss=0;
            }
            else
            {
                loss=loss+profit;
                profit=0;
            }

             try{
                File f = new File("D://JAVA PROJECT//Users.txt");
                boolean b = f.createNewFile();
                BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
                writer.write("\nUsername : " + file);
                writer.write("\nTotal Investment : "+total);
                writer.write("\nPROFIT : "+profit);
                writer.write("\nLOSS : "+loss);
                writer.write("\n-------------------------------\n");
                writer.close();
            }catch(Exception e){
                e.printStackTrace();}
             
            


            File ff = new File("D:\\JAVA PROJECT\\"+file+".txt");
            try{
                
                if(ff.exists())
                {
                    ff.delete();
                }
                else{
                    System.out.println("File not found!");
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }

            

           
        }
    
}