package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        /* caixas de dialogos */ 
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        /* somando e convertendo */

        double soma = Double.parseDouble(valor1) + Double.parseDouble(valor2);

        System.out.printf("A soma dos valores é %.2f", soma);

        /* tirando a media, o valor precida ser comando dentro do campos de args */
        
        System.out.printf("\nA media dos valores é %.2f", soma / 2);
    }
}
