package model;

public class Conta {
    
    private float saldo;
    private String titular;
    private int idConta;
    
    public void sacar(float valor){
        try{
            saldo = saldo - valor;
        }catch(Exception e){
            System.err.println("O valor desejado de saque é maior que seu saldo!");
        }
        
    }
    
    public void depositar(float valor){
        saldo = saldo + valor;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getProprietario() {
        return titular;
    }

    public void setProprietario(String titular) {
        this.titular = titular;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    
    
}
