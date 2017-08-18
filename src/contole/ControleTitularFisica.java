package contole;

import javax.swing.JTextField;
import model.BancoDeDados;
import model.TitularFisica;
import view.InterfaceTitular;

public class ControleTitularFisica {
    
    InterfaceTitular interfaceTitular = new InterfaceTitular();
    TitularFisica titularF;
    BancoDeDados bd = new BancoDeDados();
    
    public ControleTitularFisica (InterfaceTitular interfaceTitular){
        titularF= new TitularFisica();
        this.interfaceTitular = interfaceTitular;
    }
    
    public void cadastarControleTitular(){
        JTextField txtNome = (JTextField) interfaceTitular.getElementById("txtNome");
        titularF.setNomeTitular(txtNome.getText());
        
        JTextField txtDataNasc = (JTextField) interfaceTitular.getElementById("txtDataNasc");
        titularF.setDataNascimento(txtDataNasc.getText());
        
        JTextField txtConta = (JTextField) interfaceTitular.getElementById("txtConta");
        titularF.setConta(txtConta.getText());
        
        JTextField txtRua = (JTextField) interfaceTitular.getElementById("txtRua");
        titularF.setRua(txtRua.getText());
        
        JTextField txtNumero = (JTextField) interfaceTitular.getElementById("txtNumero");
        titularF.setNumero(txtNumero.getText());
        
        JTextField txtCidade = (JTextField) interfaceTitular.getElementById("txtCidade");
        titularF.setCidade(txtCidade.getText());
        
        JTextField txtTelefone = (JTextField) interfaceTitular.getElementById("txtTelefone");
        titularF.setTelefone(txtTelefone.getText());
        
        JTextField txtLogin = (JTextField) interfaceTitular.getElementById("txtLogin");
        titularF.setUsuario(txtLogin.getText());
        
        JTextField txtSenha = (JTextField) interfaceTitular.getElementById("txtSenha");
        titularF.setSenha(txtSenha.getText());
        
        JTextField txtDocumento = (JTextField) interfaceTitular.getElementById("txtDocumento");
        titularF.setCpf(txtDocumento.getText());
        
        bd.cadastarTitular(titularF);
    }
    
}
