
import java.awt.event.*;
import javax.swing.*;

public class OuvidoVisita implements ActionListener{
    
    private JMenuItem itemCavalo;
    private JMenuItem itemJegue;
    private Cavalo cavalo;
    private Jegue jegue;
    private JLabel status;
    private ID identidade = new ID();

    OuvidoVisita( Cavalo cavalo , Jegue jegue , JMenuItem itemCavalo, JMenuItem itemJegue, JLabel status, ID identidade){
        setCavalo(cavalo);
        setJegue(jegue);
        setItemCavalo(itemCavalo);
        setItemJegue(itemJegue);
        setStatus(status);
        setIdentidade(identidade);   
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){
        //this.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID do animal?")));
        
        if ( infoEvento.getSource().equals(this.getItemCavalo()) ){
            this.getStatus().setText("Aumentando o numero de visitas do cavalo");

            this.identidade.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Cavalo", "Cavalo", 3)));
            //this.getCavalo().registraVisita();
            this.getCavalo().setContaVisitas(this.getCavalo().getContaVisitas() + 1);
        }

        else {
            this.getStatus().setText("Aumentando o numero de visitas do jegue");

            this.identidade.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Jegue", "Jegue", 3)));
            this.getJegue().registraVisita();
        }

        this.getStatus().setText("Esperando outro cadastro...");
        return;
    }

    public ID getIdentidade() {
        return identidade;
    }

    public void setIdentidade(ID identidade) {
        this.identidade = identidade;
    }

    public JMenuItem getItemCavalo() {
        return itemCavalo;
    }

    public void setItemCavalo(JMenuItem itemCavalo) {
        this.itemCavalo = itemCavalo;
    }


    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public JMenuItem getItemJegue() {
        return itemJegue;
    }

    public void setItemJegue(JMenuItem itemJegue) {
        this.itemJegue = itemJegue;
    }

    public void setCavalo(Cavalo cavalo) {
        this.cavalo = cavalo;
    }

    public Cavalo getCavalo(){
        return this.cavalo;
    }

    public void setJegue(Jegue jegue) {
        this.jegue = jegue;
        
    }

    public Jegue getJegue(){
        return this.jegue;
    }

}