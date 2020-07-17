import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoGalinha implements ActionListener{
    
    private JMenuItem produtoGalinha; // Item do Menu Galinha(dentro do Menu Animal)
    private String tamanhoOvo; 
    private String[] tamanhos = new String[3];
    private int iD;

    private Galinha galinha;
    private JLabel status;

    OuvidoGalinha(Galinha galinha , JMenuItem produtoGalinha, JLabel status, int iD){
        tamanhos[0] = "P";
        tamanhos[1] = "M";
        tamanhos[2] = "G";

        setProdutoGalinha(produtoGalinha);
        setStatus(status);
        setGalinha(galinha);
        setID(iD);
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){

        if ( infoEvento.getSource().equals(this.getProdutoGalinha()) ){

            this.getStatus().setText("Cadastrando galinha...");
            
            this.getGalinha().setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da galinha?", "Galinha",3)));
            this.getGalinha().setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade da galinha?", "Galinha",3)));
            this.getGalinha().setNome(JOptionPane.showInputDialog(null, "Qual o nome da galinha?", "Galinha",3));

            this.getGalinha().setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o peso da galinha?", "Galinha", 3)));

                                                            // Essa linha cria caixas de opcoes com valores pre-definidos
            this.setTamanhoOvo(JOptionPane.showOptionDialog(null, "Tamanho do ovo da Galinha", "Galinha", 0, 3, null,tamanhos, null));
            System.out.println(getTamanhoOvo());
        }

        else{
            this.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Galinha", "Galinha", 3)));

            JOptionPane.showMessageDialog(null, "Escrevendo no Banco de Dados...");
            this.getGalinha().registraGalinha(null, null, null);

        }

        this.getStatus().setText("Esperando outro cadastro...");

    }

    public String getTamanhoOvo() {
        return tamanhoOvo;
    }

    // De acordo com o numero passado o tamanho e atribuido ao ovo
    public void setTamanhoOvo(int tamanhoOvo) {
        if (tamanhoOvo == 0)
            this.getGalinha().setTamOvo("P");

        else if (tamanhoOvo == 1)
            this.getGalinha().setTamOvo("M");

        else if (tamanhoOvo == 2)
            this.getGalinha().setTamOvo("G");
    }

    public JMenuItem getProdutoGalinha() {
        return produtoGalinha;
    }

    public void setProdutoGalinha(JMenuItem produtoGalinha) {
        this.produtoGalinha = produtoGalinha;
    }

    public String[] getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(String[] tamanhos) {
        this.tamanhos = tamanhos;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public JLabel getStatus() {
        return this.status;
    }

    public Galinha getGalinha() {
        return galinha;
    }

    public void setGalinha(Galinha galinha) {
        this.galinha = galinha;
    }

    public int getID(){
        return this.iD;
    }

    public void setID(int iD){
        this.iD = iD;
    }

}