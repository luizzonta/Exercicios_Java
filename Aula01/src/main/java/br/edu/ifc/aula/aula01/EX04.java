package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;

public class EX04 {

    public static void main(String[] args){

        
        String Nome = JOptionPane.showInputDialog("Informe seu nome:");
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));

        double imc = Peso / (Altura * Altura);
        JOptionPane.showMessageDialog(null, "O IMC é " + imc + " Resultado: " + CalculaPeso(imc));
    
    }
    public static String CalculaPeso(double imc){

        String Resultado = "";
        
        if (imc < 18.8){
            Resultado = "Peso abaixo do normal";
        }else if (imc >= 18.5 && imc <=24.4){
            Resultado = "Peso ideal";
        }else if (imc >= 24.5 && imc <=29.9){
            Resultado = "Pré-obesidade";
        }else if (imc >= 30 && imc <=34.9){
            Resultado = "Pré-obesidade";
        }else if (imc >= 35 && imc <=39.9){
            Resultado = "Obesidade classe II (severa)";
        }else if (imc >= 40){
            Resultado = "Obesidade classe III (mórbida)";
        }    
        
        return Resultado;
        
    }    
}
