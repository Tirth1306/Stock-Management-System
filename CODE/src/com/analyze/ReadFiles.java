package com.analyze;
import java.io.*; 
import java.util.StringTokenizer;
import com.transaction.*;

public class ReadFiles
{
    public  int row=0;
    public String [][] items;
    File file;
    public ReadFiles(File files)
    {
        this.file = files;
    }
    
    //check if the file is a File
    public boolean CheckIsFile()
    {
        return file.isFile(); 
    }

    //find number of rows in csv file
    public int findRowNumber()
    {
        row=0;
        if(CheckIsFile())
        {
            //do this if its a file
            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));

                while(reader.readLine()!=null)
                {
                    row++;
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("This is not a file.");
        }

        return row;
    }

    //converts the csv file to an array
    public void convertToArray()
    {
        int r=0;
        items=new String[findRowNumber()][7];

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while((line=reader.readLine())!=null)
            {
                StringTokenizer z = new StringTokenizer(line,",");
                while(z.hasMoreTokens())
                {
                    for(int c=0;c<7;c++)
                    {
                        items[r][c] = z.nextToken();
                    }
                    r++;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

        
    }    

    //prints out ITEMS array
    public void printArray()
        {
            for(int x=0;x<items.length;x++)
            {
                System.out.printf("%s - ", x);

                for(int y=0;y<items[x].length;y++)
                {
                    System.out.printf("%s ", items[x][y]);
                }
                System.out.println();
            }

        }

        //return array ITEMS
        public String [][] getArray()
        {
            return items;
        }
    
} 