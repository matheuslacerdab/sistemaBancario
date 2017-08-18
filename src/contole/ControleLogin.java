package contole;

import javax.swing.JTextField;
import model.BancoDeDados;
import model.Titular;
import view.InterfaceLogin;

public class ControleLogin {
    
    InterfaceLogin interfaceLogin = new InterfaceLogin();
    BancoDeDados bd = new BancoDeDados();
    Titular t = new Titular();
    
    public ControleLogin (InterfaceLogin interfaceLogin){
        this.interfaceLogin = interfaceLogin;
    }
    
    public boolean verificarLogin(String login, String senha){
        return bd.verificarLogin(login, senha);
    }
    
    public String retornaNome(boolean login, String usuario){
        return bd.retornaNome(login, usuario);
    }
    
    public String retornaConta(String usuario){
        return bd.retornaConta(usuario);
    }
    
}
