import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class MinhaInterface{
    private JFrame janela;
    private JMenuBar barraDoMenu; 
    private JMenu Animal, produto, aumentaVisita;
    
    private JMenu Vaca, Cavalo, Jegue, Galinha, Ovelha;     // Menu dentro do Animal
    private JMenuItem produzVaca, produzCavalo, produzJegue, produzGalinha, produzOvelha;   // Itens de cada animal
    private JMenuItem aumentaCavalo, aumentaJegue;

    private JMenuItem produtoVaca, produtoCavalo, produtoJegue, produtoGalinha, produtoOvelha;   
    private ActionListener ouvidoVaca, ouvidoCavalo, ouvidoJegue, ouvidoGalinha, ouvidoOvelha;
    private JLabel[] nome = new JLabel[2];

    private Vaca minhaVaca;
    private Cavalo meuCavalo;
    private Jegue meuJegue;
    private Galinha minhaGalinha;
    private Ovelha minhaOvelha;


    // Declarar objetos (vaca, cavalo, jegue...) com seus atributos para retornar
    private JLabel status;


    //  Ouvidos e os produz(s)Vaca...  Sao criados com os itens do menu
    MinhaInterface(){
        setNome("ASDASGDJKASd", 0);

        setStatus();

        setAumentaCavalo();
        setAumentaJegue();
        setAumentaVisitas();

        setMinhaVaca();
        setMeuCavalo();
        setMeuJegue();
        setMinhaGalinha();
        setMinhaOvelha();

        setVaca();
        setCavalo();
        setJegue();
        setGalinha();
        setOvelha();
        
        setProduzVaca();
        setProduzCavalo();
        setProduzJegue();
        setProduzGalinha();
        setProduzOvelha();

        setProdutoVaca();
        setProdutoCavalo();
        setProdutoJegue();
        setProdutoGalinha();
        setProdutoOvelha();

        setProduto();
        setAnimal();
        setBarraDoMenu();
        setJanela();
    }

    public JLabel getNome(int i){
        return this.nome[i];
    }

    public void setNome(String nome, int i){
        this.nome[i] = new JLabel(nome);
        this.nome[i].setSize(1, 1);

        this.nome[1] = new JLabel("VAI DAR TUDO CERTO");
        this.nome[1].setSize(1, 2);
        
    }
    

    public JFrame getJanela() {
        return janela;
    }

    public void setJanela() {
        this.janela = new JFrame("Fazenda");
        this.janela.setLayout(new GridLayout(3,3,5,5));
        this.janela.setJMenuBar(this.getBarraDoMenu());
        this.janela.add(this.getStatus());
        this.janela.add(nome[0]);
        this.janela.add(nome[1]);


        this.janela.setSize(1250, 1080);
        // this.janela.setVisible(true);
        this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // IMPORTANTE se a janela for fechada, finaliza o programa junto
    }
    
    public JMenuBar getBarraDoMenu() {
        return barraDoMenu;
    }

    public void setBarraDoMenu() {
        this.barraDoMenu = new JMenuBar();
        this.barraDoMenu.add(this.getAnimal());
        this.barraDoMenu.add(this.getProduto());
        this.barraDoMenu.add(this.getAumentaVisitas());
    }

    public JMenu getAnimal() {
        return Animal;
    }

    // Menu Animal
    public void setAnimal() {
        this.Animal = new JMenu("Animal");
        Animal.add(this.getVaca());
        Animal.add(this.getCavalo());
        Animal.add(this.getJegue());
        Animal.add(this.getGalinha());
        Animal.add(this.getOvelha());
    }

    public JMenu getProduto(){
        return this.produto;
    }

    // Menu Produto
    public void setProduto(){
        this.produto = new JMenu("Produto");

        produto.add(this.getProdutoVaca());
        produto.add(this.getProdutoCavalo());
        produto.add(this.getProdutoJegue());
        produto.add(this.getProdutoGalinha());
        produto.add(this.getProdutoOvelha());
    }

    public JMenu getAumentaVisitas(){
        return this.aumentaVisita;
    }

    public void setAumentaVisitas(){
        this.aumentaVisita = new JMenu("Aumenta Visita");

        this.aumentaVisita.add(this.getAumentaCavalo());
        this.aumentaVisita.add(this.getAumentaJegue());
    }

    public JMenuItem getAumentaCavalo(){
        return this.aumentaCavalo;
    }

    public void setAumentaCavalo(){
        this.aumentaCavalo = new JMenuItem("Aumentar visita do Cavalo");
    }

    public JMenuItem getAumentaJegue(){
        return this.aumentaJegue;
    }

    public void setAumentaJegue(){
        this.aumentaJegue = new JMenuItem("Aumentar visita do Jegue");
    }

    // PARTE DOS ITENS DO MENU
    // ##########################################################################################

    public JMenu getVaca() {
        return this.Vaca;
    }

    public void setVaca() {
        this.Vaca = new JMenu("Vaca");

        // setProduz vem sempre primeiro, pois ouvido tem ouvir um objeto ja criado
        this.setProduzVaca();
        this.setOuvidoVaca();

        this.Vaca.add(this.getProduzVaca());
        this.Vaca.addActionListener(ouvidoVaca);
        this.produzVaca.addActionListener(ouvidoVaca);
    }

    public JMenu getCavalo() {
        return Cavalo;
    }

    public void setCavalo() {
        this.Cavalo = new JMenu("Cavalo");

        // setProduz vem sempre primeiro, pois ouvido tem ouvir um objeto ja criado

        this.setProduzCavalo();
        this.setOuvidoCavalo();
        
        this.Cavalo.add(this.getProduzCavalo());
        this.Cavalo.addActionListener(ouvidoCavalo);
        this.produzCavalo.addActionListener(ouvidoCavalo);
    }

    public JMenu getJegue() {
        return Jegue;
    }

    public void setJegue() {
        this.Jegue = new JMenu("Jegue");

        // setProduz vem sempre primeiro, pois ouvido tem ouvir um objeto ja criado
        this.setProduzJegue();
        this.setOuvidoJegue();

        this.Jegue.add(this.getProduzJegue());
        this.Jegue.addActionListener(ouvidoJegue);
        this.produzJegue.addActionListener(ouvidoJegue);
    }

    public JMenu getGalinha() {
        return Galinha;
    }

    public void setGalinha() {
        this.Galinha = new JMenu("Galinha");
        
        // setProduz vem sempre primeiro, pois ouvido tem ouvir um objeto ja criado
        this.setProduzGalinha();
        this.setOuvidoGalinha();

        this.Galinha.add(this.getProduzGalinha());
        this.Galinha.addActionListener(ouvidoGalinha);
        this.produzGalinha.addActionListener(ouvidoGalinha);
    }

    public JMenu getOvelha() {
        return Ovelha;
    }

    public void setOvelha() {
        this.Ovelha = new JMenu("Ovelha");

        // setProduz vem sempre primeiro, pois ouvido tem ouvir um objeto ja criado
        this.setProduzOvelha();
        this.setOuvidoOvelha();

        this.Ovelha.add(this.getProduzOvelha());
        this.Ovelha.addActionListener(ouvidoOvelha);
        this.produzOvelha.addActionListener(ouvidoOvelha);
    }

    // PARTE DO OUVIDO
    // ##########################################################################################

    public ActionListener getOuvidoVaca() {
        return ouvidoVaca;
    }

    public void setOuvidoVaca() {
        this.ouvidoVaca = new OuvidoVaca(this.minhaVaca, this.produzVaca ,this.getStatus());
    }

    public ActionListener getOuvidoCavalo() {
        return ouvidoCavalo;
    }

    public void setOuvidoCavalo() {
        this.ouvidoCavalo = new OuvidoCavalo(this.getMeuCavalo(), this.produzCavalo ,this.getStatus());
    }

    public ActionListener getOuvidoJegue() {
        return ouvidoJegue;
    }

    public void setOuvidoJegue() {
        this.ouvidoJegue = new OuvidoJegue(this.meuJegue , this.produzJegue, this.getStatus());
    }

    public ActionListener getOuvidoGalinha() {
        return ouvidoGalinha;
    }

    public void setOuvidoGalinha() {
        this.ouvidoGalinha = new OuvidoGalinha(this.minhaGalinha , this.produzGalinha , this.getStatus());
    }

    public ActionListener getOuvidoOvelha() {
        return ouvidoOvelha;
    }

    public void setOuvidoOvelha() {
        this.ouvidoOvelha = new OuvidoOvelha(this.minhaOvelha , this.produzOvelha, this.getStatus());
    }

    // PARTE DO PRODUTO
    // ##########################################################################################

    public void setProdutoVaca(){
        this.produtoVaca = new JMenuItem("Salva Vaca");
        produtoVaca.addActionListener(ouvidoVaca);
    }

    public JMenuItem getProdutoVaca(){
        return this.produtoVaca;
    }

    public void setProdutoCavalo(){
        this.produtoCavalo = new JMenuItem("Salva Cavalo");
        this.produtoCavalo.addActionListener(ouvidoCavalo);
    }

    public JMenuItem getProdutoCavalo(){
        return this.produtoCavalo;
    }
    
    public void setProdutoJegue(){
        this.produtoJegue = new JMenuItem("Salva Jegue");
        this.produtoJegue.addActionListener(ouvidoJegue);
    }

    public JMenuItem getProdutoJegue(){
        return this.produtoJegue;
    }

    public void setProdutoGalinha(){
        this.produtoGalinha = new JMenuItem("Salva Galinha");
        this.produtoGalinha.addActionListener(ouvidoGalinha);
    }

    public JMenuItem getProdutoGalinha(){
        return this.produtoGalinha;
    }

    public void setProdutoOvelha(){
        this.produtoOvelha = new JMenuItem("Salva Ovelha");
        this.produtoOvelha.addActionListener(ouvidoOvelha);
    }

    public JMenuItem getProdutoOvelha(){
        return this.produtoOvelha;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = new JLabel("Esperando cadastro...", JLabel.CENTER);
        this.status.setSize(100, 100);
    }


    // PARTE DO PRODUZ
    // ##########################################################################################


    public JMenuItem getProduzVaca(){
        return this.produzVaca;
    }

    public void setProduzVaca(){
        this.produzVaca = new JMenuItem("Registra Vaca");

    }

    public void setProduzCavalo(){
        this.produzCavalo = new JMenuItem("Registra Cavalo");
    }

    public JMenuItem getProduzCavalo(){
        return this.produzCavalo;
    }
    
    public void setProduzJegue(){
        this.produzJegue = new JMenuItem("Registra Jegue");
    }

    public JMenuItem getProduzJegue(){
        return this.produzJegue;
    }

    public void setProduzGalinha(){
        this.produzGalinha = new JMenuItem("Registra Galinha");
    }

    public JMenuItem getProduzGalinha(){
        return this.produzGalinha;
    }

    public void setProduzOvelha(){
        this.produzOvelha = new JMenuItem("Registra Ovelha");
    }

    public JMenuItem getProduzOvelha(){
        return this.produzOvelha;
    }

    // PARTE DOS ANIMAIS
    // ##########################################################################################


    public Vaca getMinhaVaca() {
        return minhaVaca;
    }

    public void setMinhaVaca() {
        // String ProdutoDerivado, String tipoAlimentacao, int id, String nome, int idade
        this.minhaVaca = new Vaca(null, null, 0, null, 2);
    }

    public Cavalo getMeuCavalo() {
        return meuCavalo;
    }

    public void setMeuCavalo() {
        this.meuCavalo = new Cavalo(1.0, 1, null, 1, null, 1);
    }

    public Jegue getMeuJegue() {
        return meuJegue;
    }

    public void setMeuJegue() {
        this.meuJegue = new Jegue(1.0, 1,null, 1, null, 1);
    }

    public Galinha getMinhaGalinha() {
        return minhaGalinha;
    }

    public void setMinhaGalinha() {
        this.minhaGalinha = new Galinha(null, 1.0, 1, null, 1);
    }

    public Ovelha getMinhaOvelha() {
        return minhaOvelha;
    }

    public void setMinhaOvelha() {
        this.minhaOvelha = new Ovelha(null, 1.0, 1, null, 1);
    }

}