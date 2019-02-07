package br.edu.ifc.aula.aula01;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;
public class OlaMundo {
    public static void main(String[] args){

        String Nome;
        double n1,n2,trabalho,media;
        int p1,p2,p3,Peso;
        try {    
            Nome = JOptionPane.showInputDialog("Informe seu nome:");

            n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira Nota:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunga Nota: "));
            trabalho = Double.parseDouble(JOptionPane.showInputDialog("Nota do trabalho: "));

            p1 = Integer.parseInt(JOptionPane.showInputDialog("Informe Peso1:"));
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Informe Peso2:"));
            p3 = Integer.parseInt(JOptionPane.showInputDialog("Informe Peso3:"));

            Peso = p1+p2+p3;
            if (Peso != 10){
                JOptionPane.showMessageDialog(null, "A soma dos pesos deve ser 10!");
            }else{
                media = (n1*p1 + n2*p2 + trabalho*p3) / 10;
                JOptionPane.showMessageDialog(null, "A Media do aluno: " + Nome + " é: " + media);
                if (media >= 7)
                    JOptionPane.showMessageDialog(null, "Aluno Aprovado");
                else if (media >= 4)
                    JOptionPane.showMessageDialog(null, "Aluno em Exame");
                else if (media < 4)
                    JOptionPane.showMessageDialog(null, "Aluno Reprovado");


            }    
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Houve erro na conversão dos números!",
                                              "Informe números válidos!",
                                              TrayIcon.MessageType.WARNING.ordinal());
            ex.printStackTrace();
        }finally{
            System.out.println("Saindo...");
            System.exit(0);
        }
    }
    
}
