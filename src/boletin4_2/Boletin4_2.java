package boletin4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class Boletin4_2 {

    public static void main(String[] args) {
        float desconto=0;
        float prezoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Introduce o prezo : "));
        int unidadesVendidas = Integer.parseInt(JOptionPane.showInputDialog("Introduce as unidades : "));

        if (unidadesVendidas < 100) {
           desconto=0;

        } else if (unidadesVendidas < 200) {
            if (prezoUnitario > 4000) {
               desconto = 0.05f;
            } else {
                desconto=0.02f;
            }
        } else if (unidadesVendidas >= 200) {
            if (prezoUnitario > 4000) {
                desconto=0.1f;
            } else {
                desconto=0.08f;
            }
        }
        JOptionPane.showInputDialog(null, "Unidades : " + unidadesVendidas + " ,Prezo : " + prezoUnitario + " ,Desconto : " + (prezoUnitario * unidadesVendidas * desconto) + ".Prezo total : " + ((prezoUnitario * unidadesVendidas) - (prezoUnitario * unidadesVendidas * desconto)));
    }

}
