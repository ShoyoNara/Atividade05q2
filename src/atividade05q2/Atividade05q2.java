
package atividade05q2;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atividade05q2 {

    /**
     * Faça um programa que leia uma série não determinada de dois valores. 
     * O primeiro valor é um código que significa: (1) débito, (2)crédito e 
     * (0) fim. O segundo valor é uma quantia numérica real. O programa deve 
     * identificar o código e se for 1, somar a quantia em um acumulador de 
     * débitos; se for 2, somar a quantia em um acumulador de créditos; se for 0,
     * encerrar o programa. Ao final, mostre o total de débitos e créditos 
     * e o saldo (saldo  créditos – débitos).
     */
    public static void main(String[] args) {
        
        int numero;
        double acumuladorD, acumuladorC, valorzinho;
        
        acumuladorD = 0;
        acumuladorC = 0;
        numero = 1;
        valorzinho = 0;
        
        
        while(numero != 0 ){
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Débito"
                + "\n Digite 2 para Crédito \n ou digite 0 para sair"));
                    
                    if(numero == 1 || numero == 2){
                        valorzinho = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor: R$"));

                    if(numero == 1){
                        acumuladorD = acumuladorD + valorzinho;
                        
                        JOptionPane.showMessageDialog(null , "Valor dabilitado inserido: R$"+acumuladorD);
                        
                    }else{
                        acumuladorC = acumuladorC + valorzinho;
                        JOptionPane.showMessageDialog(null, "Valor Craditado inserido: R$"+acumuladorC);
                    }
                    }else if(numero == 0){
                        JOptionPane.showMessageDialog(null , "Você escolheu sair do programa, até ^^");
                            
                    }else{
                        JOptionPane.showMessageDialog(null, "OPA OPA , codigo errado amiguinho, volte e coloque certo ^^");
                    }
        
                    JOptionPane.showMessageDialog(null , "Valor total \n"
                            + "Crédito: R$"+acumuladorC+"\nDébito: R$"+acumuladorD+
                            "\nsaldo final: R$"+(acumuladorC - acumuladorD));
                    
            
        }
        
        
    }
    
}
