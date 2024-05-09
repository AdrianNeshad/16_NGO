package ngogrupp16;

import javax.swing.*;

public class Validering {
    
    //Validering för metoder med JTextField
    public static boolean textHarFelVarde(JTextField rutaAttKolla)
    {
        boolean resultat = true; 
        
        if(rutaAttKolla.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom, pröva igen");
            
            resultat = false;
        }
        
        return resultat;
    }
    
    
    //Validering för metoder utan JTextField, alltså endast JOptionPane popup fönster med ett värde
    public static boolean textHarFelVarde2(String inmatning) 
    {
    boolean resultat = true;
 
    if (inmatning.isEmpty()) 
    {
        JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom, pröva igen");
        
        resultat = false;
    }

    return resultat;
}

}
