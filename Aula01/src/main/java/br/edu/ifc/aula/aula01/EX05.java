package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;

public class EX05 {

    public static void main(String[] args){

        
        double v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        double v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));

        double soma = v1 + v2;
        double subtracao = v1 - v2;
        double multiplicacao = v1 * v2;
        double divisao = v1 / v2;
        JOptionPane.showMessageDialog(null, "A soma é: " + soma
                                          + "\n A subtração é: " + subtracao
                                          + "\n A multiplicacao é: " + multiplicacao
                                          + "\n A divisao é: " + divisao);
    }
}
