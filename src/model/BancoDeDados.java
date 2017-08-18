package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoDeDados {
    
    private static List cadTitular;
    private static List<Conta> conta;
    private static Titular titular = new Titular();
    
    
    public void cadastarTitular(TitularFisica titular){
        cadTitular = new ArrayList<TitularFisica>();
        cadTitular.add(titular);
    }
    public void cadastarTitular(TitularJuridica titular){
        cadTitular = new ArrayList<TitularJuridica>();
        cadTitular.add(titular);
        JOptionPane.showMessageDialog(null,"Professor cadastrado com sucesso!");
    }  
    
    public boolean verificarLogin(String usuario, String senha){
        for(Object titular : getCadTitular()){
          if(usuario.equals(this.titular.getUsuario()) && senha.equals(this.titular.getSenha())){
              JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
              return true;
          }
    }
        return false;
}
    
    public String retornaNome(boolean login, String usuario){
        for(Object titular : getCadTitular()){
          if(usuario.equals(this.titular.getUsuario())){
              return this.titular.getNomeTitular();
          }
    }
        return null;
}
    
    public String retornaConta(String usuario){
        for(Object titular : getCadTitular()){
          if(usuario.equals(this.titular.getUsuario())){
              return this.titular.getConta();
          }
    }
        return null;
}
    
    public float retornaSaldo(String conta){
        for(Conta c : getConta()){
          if(conta.equals(c.getIdConta())){
              return c.getSaldo();
          }
    }
        return (float) 0.0;
}

    public static List getCadTitular() {
        return cadTitular;
    }

    public static void setCadTitular(List cadTitular) {
        BancoDeDados.cadTitular = cadTitular;
    }

    public static List<Conta> getConta() {
        return conta;
    }

    public static void setConta(List<Conta> conta) {
        BancoDeDados.conta = conta;
    }

    public static Titular getTitular() {
        return titular;
    }

    public static void setTitular(Titular titular) {
        BancoDeDados.titular = titular;
    }
    
    
    
}
