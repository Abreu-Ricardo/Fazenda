import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoJegue implements ActionListener{
    private double precoPasseio;
    private int contaVisitas;
    
    @Override
    public void actionPerformed(ActionEvent infoEvento){
        this.setPrecoPasseio(Float.parseFloat(JOptionPane.showInputDialog(null, "Preco do passeio", "Jegue", 3)));
        this.setContaVisitas(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de Visitas", "Jegue", 3)));
        System.out.println(getPrecoPasseio()+" / "+getContaVisitas());
    }

    /**
     * @return double return the precoPasseio
     */
    public double getPrecoPasseio() {
        return precoPasseio;
    }

    /**
     * @param precoPasseio the precoPasseio to set
     */
    public void setPrecoPasseio(double precoPasseio) {
        this.precoPasseio = precoPasseio;
    }

    /**
     * @return int return the contaVisitas
     */
    public int getContaVisitas() {
        return contaVisitas;
    }

    /**
     * @param contaVisitas the contaVisitas to set
     */
    public void setContaVisitas(int contaVisitas) {
        this.contaVisitas = contaVisitas;
    }

}