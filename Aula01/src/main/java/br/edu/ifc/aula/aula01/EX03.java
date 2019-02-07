package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;

public class EX03 {

    public static void main(String[] args){

        double Saldo = 0, Valor;
        Valor = Double.parseDouble(JOptionPane.showInputDialog("Informe a acrecentar no saldo:"));
        Saldo = Saldo + Valor;
        Valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a retitar do saldo: "));
        Saldo = Saldo - Valor;

        JOptionPane.showMessageDialog(null, "O Saldo atual é: : " + Saldo);
    }
    
}
