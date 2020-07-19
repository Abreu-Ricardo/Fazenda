
import javax.swing.*;
import java.awt.event.*;

public class OuvidoProduto implements ActionListener{

    private ID identidade;
    private JMenuItem registraProduto;
    private JLabel status;

    OuvidoProduto(ID identidade, JMenuItem registraProduto, JLabel status){
        setIdentidade(identidade);
        setRegistraProduto(registraProduto);
        setStatus(status);
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){
        this.getStatus().setText("Cadastrando o produto...");

        // Pegar o ID pelo produto.getId();
       this.identidade.setID((Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID do produto?", "Produto", 3))));

        this.getStatus().setText("Esperando outro cadastro...");

        return;
    }

    public JMenuItem getRegistraProduto() {
        return this.registraProduto;
    }

    public void setRegistraProduto(JMenuItem registraProduto) {
        this.registraProduto = registraProduto;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public ID getIdentidade() {
        return identidade;
    }

    public void setIdentidade(ID identidade) {
        this.identidade = identidade;
    }

}