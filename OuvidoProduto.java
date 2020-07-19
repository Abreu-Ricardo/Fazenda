
import javax.swing.*;
import java.awt.event.*;

public class OuvidoProduto implements ActionListener{

    private Produto produto;
    private JMenuItem registraProduto;
    private JLabel status;

    OuvidoProduto(Produto produto, JMenuItem registraProduto, JLabel status){
        setProduto(produto);
        setRegistraProduto(registraProduto);
        setStatus(status);
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){
        this.getStatus().setText("Cadastrando o produto...");

        // Pegar o ID pelo produto.getId();
        this.getProduto().setNome(JOptionPane.showInputDialog(null, "Qual o nome do produto?", "Produto", 3));
        this.getProduto().setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID do produto?", "Produto", 3)));
        this.getProduto().setQualidade(JOptionPane.showInputDialog(null, "Qual a qualidade do produto?", "Produto", 3));
        this.getProduto().setPreco(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o preco do produto?", "Produto", 3)));

        this.getStatus().setText("Esperando outro cadastro...");

        return;
    }

    public JMenuItem getRegistraProduto() {
        return this.registraProduto;
    }

    public void setRegistraProduto(JMenuItem registraProduto) {
        this.registraProduto = registraProduto;
    }


    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

}