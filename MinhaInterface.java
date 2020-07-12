
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MinhaInterface{
    private JFrame janela;
    private JMenuBar barraDoMenu; //= new JMenuBar();
    private JMenu Animal;
    private JMenuItem Vaca, Cavalo, Jegue, Galinha, Ovelha;
                        
    private ActionListener ouvidoVaca, ouvidoCavalo, ouvidoJegue, ouvidoGalinha, ouvidoOvelha;

    MinhaInterface(){
        setOuvidoVaca();
        setOuvidoCavalo();
        setOuvidoJegue();
        setOuvidoGalinha();
        setOuvidoOvelha();


        setVaca();
        setCavalo();
        setJegue();
        setGalinha();
        setOvelha();

        
        setAnimal();
        setBarraDoMenu();
        setJanela();
    }
    

    public JFrame getJanela() {
        return janela;
    }

    public void setJanela() {
        this.janela = new JFrame("Fazenda");
        this.janela.setLayout(new BorderLayout());
        this.janela.setJMenuBar(this.getBarraDoMenu());

        this.janela.setSize(1920, 1080);
        this.janela.setVisible(true);
        this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // IMPORTANTE se a janela for fechada, finaliza o programa junto
    }
    
    public JMenuBar getBarraDoMenu() {
        return barraDoMenu;
    }

    public void setBarraDoMenu() {
        this.barraDoMenu = new JMenuBar();
        this.barraDoMenu.add(this.getAnimal());
    }

    public JMenu getAnimal() {
        return Animal;
    }

    public void setAnimal() {
        this.Animal = new JMenu("Animal");
        Animal.add(this.getVaca());
        Animal.add(this.getCavalo());
        Animal.add(this.getJegue());
        Animal.add(this.getGalinha());
        Animal.add(this.getOvelha());
        // /this.barraDoMenu.add(Animal);
    }

    public JMenuItem getVaca() {
        return this.Vaca;
    }

    public void setVaca() {
        this.Vaca = new JMenuItem("Vaca");
        this.Vaca.addActionListener(ouvidoVaca);
    }

    public JMenuItem getCavalo() {
        return Cavalo;
    }

    public void setCavalo() {
        this.Cavalo = new JMenuItem("Cavalo");
        this.Cavalo.addActionListener(ouvidoCavalo);
    }

    public JMenuItem getJegue() {
        return Jegue;
    }

    public void setJegue() {
        this.Jegue = new JMenuItem("Jegue");
        this.Jegue.addActionListener(ouvidoJegue);
    }

    public JMenuItem getGalinha() {
        return Galinha;
    }

    public void setGalinha() {
        this.Galinha = new JMenuItem("Galinha");
        this.Galinha.addActionListener(ouvidoGalinha);
    }

    public JMenuItem getOvelha() {
        return Ovelha;
    }

    public void setOvelha() {
        this.Ovelha = new JMenuItem("Ovelha");
        this.Ovelha.addActionListener(ouvidoOvelha);
    }

    public ActionListener getOuvidoVaca() {
        return ouvidoVaca;
    }

    public void setOuvidoVaca() {
        this.ouvidoVaca = new OuvidoVaca();
    }

    public ActionListener getOuvidoCavalo() {
        return ouvidoCavalo;
    }

    public void setOuvidoCavalo() {
        this.ouvidoCavalo = new OuvidoCavalo();
    }

    public ActionListener getOuvidoJegue() {
        return ouvidoJegue;
    }

    public void setOuvidoJegue() {
        this.ouvidoJegue = new OuvidoJegue();
    }

    public ActionListener getOuvidoGalinha() {
        return ouvidoGalinha;
    }

    public void setOuvidoGalinha() {
        this.ouvidoGalinha = new OuvidoGalinha();
    }

    public ActionListener getOuvidoOvelha() {
        return ouvidoOvelha;
    }

    public void setOuvidoOvelha() {
        this.ouvidoOvelha = new OuvidoOvelha();
    }

}