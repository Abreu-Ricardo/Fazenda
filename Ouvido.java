import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class Ouvido implements ActionListener{

    private JMenuItem Vaca;
    private JMenuItem Cavalo;
    private JMenuItem Galinha;
    private JMenuItem Jegue;
    private JMenuItem Ovelha;

    public Ouvido(JMenuItem Vaca, JMenuItem Cavalo, JMenuItem Jegue, JMenuItem Galinha, JMenuItem Ovelha) {
        setVaca(Vaca);
        setCavalo(Cavalo);
        setJegue(Jegue);
        setGalinha(Galinha);
        setOvelha(Ovelha);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent infoEvento){
        if (infoEvento.getSource() == getVaca()){
            JOptionPane.showInputDialog(null, "Cadastre uma Vaca");
        }

        else if (infoEvento.getSource() == getCavalo()){
            JOptionPane.showInputDialog(null, "Cadastre um Cavalo");
        }

        else if (infoEvento.getSource() == getJegue()){
            JOptionPane.showInputDialog(null, "Cadastre um Jegue");
        }

        else if (infoEvento.getSource() == getGalinha()){
            JOptionPane.showInputDialog(null, "Cadastre uma Galinha");
        }

        else if (infoEvento.getSource() == getOvelha()){
            JOptionPane.showInputDialog(null, "Cadastre uma Ovelha");
        }
    }

    /**
     * @return JMenuItem return the Vaca
     */
    public JMenuItem getVaca() {
        return Vaca;
    }

    /**
     * @param Vaca the Vaca to set
     */
    public void setVaca(JMenuItem Vaca) {
        this.Vaca = Vaca;
    }

    /**
     * @return JMenuItem return the Cavalo
     */
    public JMenuItem getCavalo() {
        return Cavalo;
    }

    /**
     * @param Cavalo the Cavalo to set
     */
    public void setCavalo(JMenuItem Cavalo) {
        this.Cavalo = Cavalo;
    }

    /**
     * @return JMenuItem return the Galinha
     */
    public JMenuItem getGalinha() {
        return Galinha;
    }

    /**
     * @param Galinha the Galinha to set
     */
    public void setGalinha(JMenuItem Galinha) {
        this.Galinha = Galinha;
    }

    /**
     * @return JMenuItem return the Jegue
     */
    public JMenuItem getJegue() {
        return Jegue;
    }

    /**
     * @param Jegue the Jegue to set
     */
    public void setJegue(JMenuItem Jegue) {
        this.Jegue = Jegue;
    }

    /**
     * @return JMenuItem return the Ovelha
     */
    public JMenuItem getOvelha() {
        return Ovelha;
    }

    /**
     * @param Ovelha the Ovelha to set
     */
    public void setOvelha(JMenuItem Ovelha) {
        this.Ovelha = Ovelha;
    }

}