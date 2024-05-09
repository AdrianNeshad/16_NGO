package ngogrupp16;

import oru.inf.InfDB;
import oru.inf.InfException;

public class NGOgrupp16 
{

    private static InfDB idb;
    
    public static void main(String[] args) 
    {
        try
        {
            idb = new InfDB("ngo_2024", "3306", "root", "pr79hxwf");
            new Inloggning(idb).setVisible(true);
        } 
        catch(InfException ex)
        {
         System.out.println(ex.getMessage()) ;  
        }
    }
    
}
