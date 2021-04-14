
package employees;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SingleTonConnection {
    
    private static SingleTonConnection connection;

    public SingleTonConnection() {
    }
    public static SingleTonConnection getFileConnectionRef() {
        if(connection==null)
        {
            connection=new SingleTonConnection();
        }
        return connection;
    }
    public void AddDataInFile(String Data){
        
    File f=new File("CompanyData.txt");

     if(!f.exists())
     {
     try {
     f.createNewFile(); 
     }
     catch (IOException ex) {}
     }
     FileWriter filewriter;
     try {
     filewriter = new FileWriter(f.getName(),true);
     
     try (BufferedWriter BW = new BufferedWriter(filewriter))
     {
        BW.write(Data);
        BW.newLine();
        BW.close();
        filewriter.close();
     } 
     }
        catch (IOException ex) {}
     }
        
    public ArrayList<String> GetDataFromFile()
    {
    
        ArrayList<String> all_data=new ArrayList<>();
        try (Scanner s = new Scanner(new File("CompanyData.txt"))) {
            while (s.hasNext()) {
              String data=s.nextLine() ;
              all_data.add(data);
            }
            s.close(); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SingleTonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all_data;    
    }
}
