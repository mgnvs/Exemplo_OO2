
package Model;

import javax.swing.JOptionPane;

public class Calculadora_DAO {
    
    public static String x = "";
    public static double val1=0, val2=0;
    
    public static void Soma(){
        x = JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero");
        val1 = Double.parseDouble(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o valor do segundo numero");
        val2 = Double.parseDouble(x);
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + (val1 + val2));
    }
    
    public static void Subtracao (){
        x = JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero");
        val1 = Double.parseDouble(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o valor do segundo numero");
        val2 = Double.parseDouble(x);
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + (val1 - val2));
    }
    
    public static void Multiplicacao (){
        x = JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero");
        val1 = Double.parseDouble(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o valor do segundo numero");
        val2 = Double.parseDouble(x);
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + (val1 * val2));
    }
    
    public static void Divisao (){
        x = JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero");
        val1 = Double.parseDouble(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o valor do segundo numero");
        val2 = Double.parseDouble(x);
        
        double divisao = val1 / val2;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + divisao);
    }
}
