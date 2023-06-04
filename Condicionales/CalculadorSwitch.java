package Condicionales;
import javax.swing.JOptionPane;
public class CalculadorSwitch {

    public static void main(String[] args){

        int numero1,numero2,suma,resta,multiplicacion,division;
      char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        operacion = JOptionPane.showInputDialog("Digite la operacion que  desea realizar: ").charAt(0);


                switch (operacion){

                    case 's':
                    case 'S': suma = numero1+numero2;
                             JOptionPane.showMessageDialog(null,"La suma es: "+suma);
                             break;
                    case 'r':
                    case 'R': resta = numero1-numero2;
                        JOptionPane.showMessageDialog(null,"La resta es: "+resta);
                        break;
                    case 'm':
                    case 'M': multiplicacion = numero1*numero2;
                    JOptionPane.showMessageDialog(null,"La multiplicacion es: "+multiplicacion);
                    break;
                    case 'd':
                    case 'D': division = numero1/numero2;
                        JOptionPane.showMessageDialog(null,"La division es: "+division);
                        break;
                    default: JOptionPane.showMessageDialog(null,"ERROR");
        }

    }




}
