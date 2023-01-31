package EstruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("infome o número: ");
        int numero = Integer.parseInt(valor);

        if (numero  % 2 == 0) {
           System.out.println("Némero par!");
        } else {
            System.out.println("Némero impar!");
        }
    }
}