package com.analyze;
import java.util.*;
import java.text.SimpleDateFormat;
import com.transaction.*;

public class Formula
{
    public ReadFiles r;
    public float[][] dataArray;
    public Date[] dateArray;
    public float max,min,maxvol,minvol;
    public int minflag,maxflag,maxvolflag,minvolflag;
    public float openAvg,closeAvg;
    

    public Formula(ReadFiles r_prev)
    {
        r = r_prev;
        dataArray = new float[r.findRowNumber()][7];
        dateArray = new Date[r.findRowNumber()];
    }

    //making an seperate Date Array
    public void createDateArray(String[][] n)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        for(int x=0;x<n.length;x++)
        {
            for(int y=0;y<n[x].length;y++)
            {
                if(y==0)
                {
                    try{
                        Date newdate = (Date)df.parse(n[x][0]);
                        dateArray[x]=newdate;

                    }catch(Exception e){
                        System.out.println(e);
                    }

                }
            }
        }
    }

    public void createDataArray(String [][]n)
    {
        for(int x=0;x<n.length;x++)
        {
            for(int y=0;y<n[x].length;y++)
            {
                switch(y)
                {
                    case 0: dataArray[x][y]= 0;
                            break;
                    
                    case 1: dataArray[x][y]= Float.parseFloat(n[x][y]);
                            break;
                    
                    case 2: dataArray[x][y]= Float.parseFloat(n[x][y]);
                            break;

                    case 3: dataArray[x][y]= Float.parseFloat(n[x][y]);
                            break;

                    case 4: dataArray[x][y]= Float.parseFloat(n[x][y]);
                            break;

                    case 5: dataArray[x][y]= Float.parseFloat(n[x][y]);
                            break;

                    case 6: dataArray[x][y]= Float.parseFloat(n[x][y]);
                            break;

                }

            }
        }

        
        
    }

    public void findMax()
    {
        max=0;
        for(int x=0;x<dataArray.length;x++)
        {
            if(dataArray[x][2]>max)
            {
                max=dataArray[x][2];
                maxflag=x;
            }
        }
    }

    public void findMin()
    {
        min=dataArray[0][3];
        for(int x=0;x<dataArray.length;x++)
        {
            if(dataArray[x][3]<min)
            {
                min=dataArray[x][3];
                minflag=x;
            }
        }
    }

    public void findMaxVol()
    {
        maxvol=0;
        for(int x=0;x<dataArray.length;x++)
        {
            if(dataArray[x][6]>maxvol)
            {
                maxvol=dataArray[x][6];
                maxvolflag=x;

            }
        }
    }

    public void findMinVol()
    {
        minvol=dataArray[0][6];
        for(int x=0;x<dataArray.length;x++)
        {
            if(dataArray[x][6]<minvol)
            {
                minvol=dataArray[x][6];
                minvolflag=x;
            }
        }
    }

    public void openAvg()
    {
        float sum=0;
        for(int x=0;x<dataArray.length;x++)
        {
            sum+=dataArray[x][1];
            openAvg=sum/r.findRowNumber();
        }
    }

    public void closeAvg()
    {
        float sum=0;
        for(int x=0;x<dataArray.length;x++)
        {    
            sum+=dataArray[x][4];
            closeAvg=sum/r.findRowNumber();
        }
    }

    public void printArray()
    {
        System.out.println("\n\t\tDATE\t\t  OPEN            HIGHEST         LOWEST           CLOSE          ADJ. CLOSE        VOLUME\n");
        for(int x=0;x<dataArray.length;x++)
        {
            
            System.out.printf("| %s | ",dateArray[x]);
            for(int y=1;y<dataArray[x].length;y++)
            {

               System.out.printf("%.2f\t| ", dataArray[x][y]);
            }
            System.out.println();
        }

        System.out.println("\n\tHighest Value of this Stock so far was " + max + " on Date : " + dateArray[maxflag]);
        System.out.println("\tLowest Value of this Stock so far was " + min + " on Date : " + dateArray[minflag]);
        System.out.println("\tMaximum Number of share traded so far were " + maxvol + " on Date : " + dateArray[maxvolflag]);
        System.out.println("\tMinimum Number of share traded so far were " + minvol + " on Date : " + dateArray[minvolflag]);
        System.out.println("\tThe Average Opening Price  is " + openAvg + "& Average Closing Price is " + closeAvg + "!");
    }
}