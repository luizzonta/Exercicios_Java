package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;


public class EX02 {

    public static void main(String[] args){

        double Base, Altura, Area1;
            Base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base:"));
            Altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));

            JOptionPane.showMessageDialog(null, "A área do triangulo é: " + CalcularArea(Base, Altura));
    }
    
    public static double CalcularArea(double base, double altura ){
        return base * altura;
        
        
        
    }
}
