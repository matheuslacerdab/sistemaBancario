package contole;

import javax.swing.JTextField;
import model.BancoDeDados;
import model.TitularJuridica;
import view.InterfaceTitular;

public class ControleTitularJuridica {
    
    InterfaceTitular interfaceTitular = new InterfaceTitular();
    TitularJuridica titularJ;
    BancoDeDados bd = new BancoDeDados();
    
    public ControleTitularJuridica (InterfaceTitular interfaceTitular){
        titularJ = new TitularJuridica();
        this.interfaceTitular = interfaceTitular;
    }
    
    public void cadastarControleTitular(){
        JTextField txtNome = (JTextField) interfaceTitular.getElementById("txtNome");
        titularJ.setNomeTitular(txtNome.getText());
        
        JTextField txtDataNasc = (JTextField) interfaceTitular.getElementById("txtDataNasc");
        titularJ.setDataNascimento(txtDataNasc.getText());
        
        JTextField txtConta = (JTextField) interfaceTitular.getElementById("txtConta");
        titularJ.setConta(txtConta.getText());
        
        JTextField txtRua = (JTextField) interfaceTitular.getElementById("txtRua");
        titularJ.setRua(txtRua.getText());
        
        JTextField txtNumero = (JTextField) interfaceTitular.getElementById("txtNumero");
        titularJ.setNumero(txtNumero.getText());
        
        JTextField txtCidade = (JTextField) interfaceTitular.getElementById("txtCidade");
        titularJ.setCidade(txtCidade.getText());
        
        JTextField txtTelefone = (JTextField) interfaceTitular.getElementById("txtTelefone");
        titularJ.setTelefone(txtTelefone.getText());
        
        JTextField txtLogin = (JTextField) interfaceTitular.getElementById("txtLogin");
        titularJ.setUsuario(txtLogin.getText());
        
        JTextField txtSenha = (JTextField) interfaceTitular.getElementById("txtSenha");
        titularJ.setSenha(txtSenha.getText());
        
        JTextField txtDocumento = (JTextField) interfaceTitular.getElementById("txtDocumento");
        titularJ.setCnpj(txtDocumento.getText());
        
        bd.cadastarTitular(titularJ);
    }
    
}
