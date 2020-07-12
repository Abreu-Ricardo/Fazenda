import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoOvelha implements ActionListener{
    private String cor;

    @Override
    public void actionPerformed(ActionEvent infoEvento){
        this.setCor(JOptionPane.showInputDialog(null, "Cor da ovelha","Ovelha", 3));
        System.out.println(getCor());
    }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

}