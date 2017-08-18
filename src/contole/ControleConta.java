package contole;

import model.BancoDeDados;
import model.Titular;
import view.InterfaceConta;
import view.InterfaceLogin;

public class ControleConta {
    
    InterfaceConta interfaceConta = new InterfaceConta();
    BancoDeDados bd = new BancoDeDados();
    Titular t = new Titular();
    
    public float retornaSaldo(String conta){
        return bd.retornaSaldo(conta);
    }
    
}
