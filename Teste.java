import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Teste {
    public static void main(String[] args) {
        // Declaracao da interface
        JFrame janela = new JFrame("Minha Interface Grafica");
        janela.setLayout(new BorderLayout());

        JMenuBar barraDoMenu;
        JMenu menu, menu1, menu2;
        JMenuItem[] chama = new JMenuItem[5];
        JMenuItem itemDoMenu, texto, texto2;
        JButton escutador = new JButton("BUTAO N SEI O Q FAZ");
        ActionListener ouvido = new Ouvido();

        JPopupMenu pop = new JPopupMenu("NAO SEI O Q FAZER");
        JLabel[] textos = new JLabel[2];

        // Criando a barra de menu
        barraDoMenu = new JMenuBar();

        // Labels
        textos[0] = new JLabel("TEXTO 1**");
        textos[1] = new JLabel("TEXTO 2**");

        janela.add(textos[0], BorderLayout.NORTH);
        janela.add(textos[1], BorderLayout.SOUTH);

        // Criando os menus
        menu = new JMenu("Animal");
        menu1 = new JMenu("Produto");
        menu2 = new JMenu("SUBMENU###");

        // Adicionando menu na barra de menu
        barraDoMenu.add(menu);
        barraDoMenu.add(menu1);


        // Grupo de itens itens
        itemDoMenu = new JMenuItem("Item do Menu");
        chama[0] = new JMenuItem("Vaca");
        chama[1] = new JMenuItem("Cavalo");
        chama[2] = new JMenuItem("Jegue");
        chama[3] = new JMenuItem("Galinha");
        chama[4] = new JMenuItem("Ovelha");
        texto = new JMenuItem("CHAAAMMAAA");
        
        ActionListener ouviVaca = new OuvidoVaca();
        ActionListener ouviCavalo = new OuvidoCavalo();
        ActionListener ouviJegue = new OuvidoJegue();
        ActionListener ouviGalinha = new OuvidoGalinha();
        ActionListener ouviOvelha = new OuvidoOvelha();
        
        chama[0].addActionListener(ouviVaca);
        chama[1].addActionListener(ouviCavalo);
        chama[2].addActionListener(ouviJegue);
        chama[3].addActionListener(ouviGalinha);
        chama[4].addActionListener(ouviOvelha);
        texto.addActionListener(ouvido);

        menu2.add(texto);
        
        // Grupo de itens
        

        // Adicionando os itens ao menu
        menu.add(chama[0]);
        menu.add(chama[1]);
        menu.add(chama[2]);
        menu.add(chama[3]);
        menu.add(chama[4]);

        menu1.add(itemDoMenu);
        menu.add(menu2); // Criando Submenu

        // Criando eventos nos itens de menu
        // menu.addActionListener();


        // Colocando a barra de menu na janela
        janela.setJMenuBar(barraDoMenu);

        // Trocando a cor do plano de fundo, deixando visivel e setando a dimensao;
        //janela.getContentPane().setBackground(Color.DARK_GRAY);
        janela.setSize(1920, 1080);
        janela.setVisible(true);

        // IMPORTANTE se a janela for fechada, fecha o programa
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}