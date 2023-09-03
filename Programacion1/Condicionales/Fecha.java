package Programacion1.EjerciciosUCES.Condicionales;
import javax.swing.JOptionPane;
public class Fecha {


    public static void main (String [] args){
        int dia,mes,año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite un año: "));

        if ((dia>=1) && (dia<=30)) {  //>=1 (Mayor o igual a 1) , <= (Menor o igual a 30)
            if ((mes>=1) && (mes<=12)){  //>=1 (Mayor o igual a 1) , <= (Menor o igual a 12)
                if (año!= 0) { // != Diferente a 0
                    JOptionPane.showMessageDialog(null,"Fecha correcta");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, mes incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, dia incorrecto");

        }


    }

}
