import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoVaca implements ActionListener{
    
    private String produtoDerivado;

    @Override
    public void actionPerformed(ActionEvent infoEvento){
        this.setProdutoDerivado(JOptionPane.showInputDialog(null, "Produto derivado da Vaca: ", "Vaca", 3));
        System.out.println(getProdutoDerivado());
    }

    /**
     * @return String return the produtoDerivado
     */
    public String getProdutoDerivado() {
        return produtoDerivado;
    }

    /**
     * @param produtoDerivado the produtoDerivado to set
     */
    public void setProdutoDerivado(String produtoDerivado) {
        this.produtoDerivado = produtoDerivado;
    }

}