package br.edu.ifc.aula.aula01;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class EX06 {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String User = JOptionPane.showInputDialog("Usuário: ");
        String Senha = JOptionPane.showInputDialog("Senha: ");
        Senha = criptografar(Senha);
        String SenhaBD = criptografar("ifcfraiburgo");
        
        if (User == "aluno" && Senha == SenhaBD){
            JOptionPane.showMessageDialog(null, "Seja bem vindo aluno");
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        }
        
        System.out.println(User);
        System.out.println(Senha);
        System.out.println(SenhaBD);
    }

    public static String criptografar(String Senha) throws NoSuchAlgorithmException {
       MessageDigest m=MessageDigest.getInstance("MD5");
       m.update(Senha.getBytes(),0,Senha.length());
       return Senha;
    }



}
