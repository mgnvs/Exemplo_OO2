
package View;

import javax.swing.JOptionPane;


public class Tela_GUI {
    public static void Solicitaoperacao(){
        String x = JOptionPane.showInputDialog(null, "Selcione a  operação\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        int op = Integer.parseInt(x);
        switch(op){
            case 1:
                Model.Calculadora_DAO.Soma();
                break;
            case 2:
                Model.Calculadora_DAO.Subtracao();
                break;
            case 3:
                Model.Calculadora_DAO.Multiplicacao();
                break;
            case 4:
                Model.Calculadora_DAO.Divisao();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação Inválida\nTente novamente");
                break;
        }
    }
}
