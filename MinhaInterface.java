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

    private JMenuItem produtoVaca, produtoCavalo, produtoJegue, produtoGalinha, produtoOvelha;  // Itens do Registra
    private ActionListener ouvidoVaca, ouvidoCavalo, ouvidoJegue, ouvidoGalinha, ouvidoOvelha;
    private ActionListener ouvidoAumentaVisita;
    private JLabel[] nome = new JLabel[2];

    private Vaca minhaVaca;
    private Cavalo meuCavalo;
    private Jegue meuJegue;
    private Galinha minhaGalinha;
    private Ovelha minhaOvelha;

    private int iD; // Nescessario para identificar qual animal de entreterimento vai ter o numero
                    // de visitas aumentado

    // Barra de status inferior
    private JLabel status;


    //  Ouvidos e os produz(s)Vaca...  Sao criados com os itens do menu
    MinhaInterface(){
        setNome("ASDASGDJKASd", 0);

        setStatus();
        
        setMinhaVaca();
        setMeuCavalo();
        setMeuJegue();
        setMinhaGalinha();
        setMinhaOvelha();
        
        setAumentaCavalo();
        setAumentaJegue();
        setAumentaVisitas();




        

        //setOuvidoVaca();
        // setOuvidoCavalo();
        // setOuvidoJegue();
        // setOuvidoGalinha();
        // setOuvidoOvelha();


        
        setProduzVaca();
        setProduzCavalo();
        setProduzJegue();
        setProduzGalinha();
        setProduzOvelha();


        setVaca();
        setCavalo();
        setJegue();
        setGalinha();
        setOvelha();

        
        

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
    //############### iD nescessario para registrar no banco de dados
    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }
    //##############

    public JLabel getNome(int i){
        return this.nome[i];
    }

    public void setNome(String nome, int i){
        this.nome[i] = new JLabel(nome);

        this.nome[1] = new JLabel("VAI DAR TUDO CERTO");
        
    }
    

    public JFrame getJanela() {
        return janela;
    }

    public void setJanela() {
        this.janela = new JFrame("Fazenda");
        this.janela.setLayout(new BorderLayout());
        this.janela.setJMenuBar(this.getBarraDoMenu());

        this.janela.add(this.getStatus(), BorderLayout.SOUTH);
        //this.janela.add(nome[0], BorderLayout.NORTH);
        //this.janela.add(nome[1], BorderLayout.EAST);


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
        this.produto = new JMenu("Salva");

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
        
        setOuvidoAumentaVisita();
        this.getAumentaCavalo().addActionListener(this.getOuvidoAumentaVisita());
    }

    public JMenuItem getAumentaJegue(){
        return this.aumentaJegue;
    }

    public void setAumentaJegue(){
        this.aumentaJegue = new JMenuItem("Aumentar visita do Jegue");
        setOuvidoAumentaVisita();

        this.aumentaJegue.addActionListener(this.getOuvidoAumentaVisita());

    }

    // PARTE DOS ITENS DO MENU
    // ##########################################################################################

    public JMenu getVaca() {
        return this.Vaca;
    }

    public void setVaca() {
        this.Vaca = new JMenu("Vaca");

        this.Vaca.add(this.getProduzVaca());
    }

    public JMenu getCavalo() {
        return Cavalo;
    }

    public void setCavalo() {
        this.Cavalo = new JMenu("Cavalo");
        
        this.Cavalo.add(this.getProduzCavalo());
    }

    public JMenu getJegue() {
        return Jegue;
    }

    public void setJegue() {
        this.Jegue = new JMenu("Jegue");

        this.Jegue.add(this.getProduzJegue());
    }

    public JMenu getGalinha() {
        return Galinha;
    }

    public void setGalinha() {
        this.Galinha = new JMenu("Galinha");

        this.Galinha.add(this.getProduzGalinha());
    }

    public JMenu getOvelha() {
        return Ovelha;
    }

    public void setOvelha() {
        this.Ovelha = new JMenu("Ovelha");

        this.Ovelha.add(this.getProduzOvelha());
    }

    // PARTE DO OUVIDO
    // ##########################################################################################

    public ActionListener getOuvidoVaca() {
        return ouvidoVaca;
    }

    public void setOuvidoVaca() {
        this.ouvidoVaca = new OuvidoVaca(this.minhaVaca , this.produzVaca, this.getStatus(), this.getID());
    }

    public ActionListener getOuvidoCavalo() {
        return ouvidoCavalo;
    }

    public void setOuvidoCavalo() {
        this.ouvidoCavalo = new OuvidoCavalo(this.meuCavalo, this.produzCavalo ,this.getStatus(), this.getID());
    }

    public ActionListener getOuvidoJegue() {
        return ouvidoJegue;
    }

    public void setOuvidoJegue() {
        this.ouvidoJegue = new OuvidoJegue(this.meuJegue , this.produzJegue, this.getStatus(), this.getID());
    }

    public ActionListener getOuvidoGalinha() {
        return ouvidoGalinha;
    }

    public void setOuvidoGalinha() {
        this.ouvidoGalinha = new OuvidoGalinha(this.minhaGalinha , this.produzGalinha , this.getStatus(), this.getID());
    }

    public ActionListener getOuvidoOvelha() {
        return ouvidoOvelha;
    }

    public void setOuvidoOvelha() {
        this.ouvidoOvelha = new OuvidoOvelha(this.minhaOvelha , this.produzOvelha , this.getStatus(), this.getID());
    }

    public ActionListener getOuvidoAumentaVisita(){
        return this.ouvidoAumentaVisita;
    }

    public void setOuvidoAumentaVisita(){
        this.ouvidoAumentaVisita = new OuvidoVisita( this.meuCavalo, this.meuJegue , this.aumentaCavalo, this.aumentaJegue, this.getStatus(), this.getID());
    }

    // PARTE DO PRODUTO salva no BD
    // ##########################################################################################

    public void setProdutoVaca(){
        this.produtoVaca = new JMenuItem("Salva Vaca");
        this.produtoVaca.addActionListener(this.getOuvidoVaca());
    }

    public JMenuItem getProdutoVaca(){
        return this.produtoVaca;
    }

    public void setProdutoCavalo(){
        this.produtoCavalo = new JMenuItem("Salva Cavalo");
        this.produtoCavalo.addActionListener(this.getOuvidoCavalo());
    }

    public JMenuItem getProdutoCavalo(){
        return this.produtoCavalo;
    }
    
    public void setProdutoJegue(){
        this.produtoJegue = new JMenuItem("Salva Jegue");
        this.produtoJegue.addActionListener(this.getOuvidoJegue());
    }

    public JMenuItem getProdutoJegue(){
        return this.produtoJegue;
    }

    public void setProdutoGalinha(){
        this.produtoGalinha = new JMenuItem("Salva Galinha");
        this.produtoGalinha.addActionListener(this.getOuvidoGalinha());
    }

    public JMenuItem getProdutoGalinha(){
        return this.produtoGalinha;
    }

    public void setProdutoOvelha(){
        this.produtoOvelha = new JMenuItem("Salva Ovelha");
        this.produtoOvelha.addActionListener(this.getOuvidoOvelha());
    }

    public JMenuItem getProdutoOvelha(){
        return this.produtoOvelha;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = new JLabel("Esperando cadastro...");
        this.status.setSize(100, 100);
    }


    // PARTE DO PRODUZ registra no BD
    // ##########################################################################################


    public JMenuItem getProduzVaca(){
        return this.produzVaca;
    }

    public void setProduzVaca(){
        this.produzVaca = new JMenuItem("Registra Vaca");
        this.setOuvidoVaca();
        this.produzVaca.addActionListener(this.getOuvidoVaca());
    }

    public void setProduzCavalo(){
        this.produzCavalo = new JMenuItem("Registra Cavalo");
        this.setOuvidoCavalo();
        this.produzCavalo.addActionListener(this.getOuvidoCavalo());
    }

    public JMenuItem getProduzCavalo(){
        return this.produzCavalo;
    }
    
    public void setProduzJegue(){
        this.produzJegue = new JMenuItem("Registra Jegue");
        this.setOuvidoJegue();

        this.produzJegue.addActionListener(this.getOuvidoJegue());
    }

    public JMenuItem getProduzJegue(){
        return this.produzJegue;
    }

    public void setProduzGalinha(){
        this.produzGalinha = new JMenuItem("Registra Galinha");
        this.setOuvidoGalinha();

        this.produzGalinha.addActionListener(this.getOuvidoGalinha());
    }

    public JMenuItem getProduzGalinha(){
        return this.produzGalinha;
    }

    public void setProduzOvelha(){
        this.produzOvelha = new JMenuItem("Registra Ovelha");
        this.setOuvidoOvelha();

        this.produzOvelha.addActionListener(this.getOuvidoOvelha());
    }

    public JMenuItem getProduzOvelha(){
        return this.produzOvelha;
    }

    // PARTE DOS ANIMAIS SAO INICIALIZADOS COM VALORES IRRELEVANTES
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