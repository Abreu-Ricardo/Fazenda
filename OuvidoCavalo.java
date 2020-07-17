import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO

public class OuvidoCavalo implements ActionListener{
    
    private double precoPasseio; // -->
    private int contaVisitas;    // --> CRIAR UM OBJETO DO TIPO CAVALO E SETTAR NELE OS ATRIBUTOS
    
    private Cavalo cavalo;
    private JMenuItem cavaloProduto; // Item do Menu Cavalo
    private JLabel status;
    private int iD;

    OuvidoCavalo(Cavalo Cavalo, JMenuItem cavaloProduto ,JLabel status, int iD){
        setCavalo(Cavalo);
        setCavaloProduto(cavaloProduto);
        setStatus(status);
        setID(iD);
    }
    
    @Override
    public void actionPerformed(ActionEvent infoEvento){
        
        if ( infoEvento.getSource().equals(getCavaloProduto()) ){

            // Atualizando barra de status
            this.getStatus().setText("Cadastrando cavalo...");

            // REgistro do cavalo
            this.getCavalo().setId(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual o ID do cavalo?", "Cavalo", 3))));
            this.getCavalo().setNome(JOptionPane.showInputDialog(null, "Qual nome do cavalo?", "Cavalo", 3));            
            this.getCavalo().setIdade(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual a idade do cavalo?", "Cavalo", 3))));
            
            // Registro do produto do cavalo
            this.getCavalo().setPrecoPasseio(Float.parseFloat((JOptionPane.showInputDialog(null, "Qual o preco passeio do cavalo?", "Cavalo", 3))));
            this.setContaVisitas(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de visitas", "Cavalo", 3)));
            this.getCavalo().setTipoAlimentacao( JOptionPane.showInputDialog(null, "Qual alimentacao do cavalo?", "Cavalo", 3) );
            
            //System.out.println(getPrecoPasseio()+"  / "+getContaVisitas());
        }

        else {
            this.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Cavalo", "Cavalo", 3)));

            JOptionPane.showMessageDialog(null, "Escrevendo no Banco de Dados...");
            this.getCavalo().registraCavalo(null, null, null);
        }

        this.getStatus().setText("Esperando outro cadastro...");
    
    }

    public void cadastraProduto(){
        // Dar um jeito de cadastrar no banco de dados
        return;
    }

    public double getPrecoPasseio() {
        return precoPasseio;
    }

    public void setPrecoPasseio(double precoPasseio) {
        this.precoPasseio = precoPasseio;
    }

    public int getContaVisitas() {
        return contaVisitas;
    }

    public void setContaVisitas(int contaVisitas) {
        this.contaVisitas = contaVisitas;
    }

    public Cavalo getCavalo() {
        return cavalo;
    }

    public void setCavalo(Cavalo cavalo) {
        this.cavalo = cavalo;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status){
        this.status = status;
    }

    public JMenuItem getCavaloProduto() {
        return cavaloProduto;
    }

    public void setCavaloProduto(JMenuItem cavaloProduto) {
        this.cavaloProduto = cavaloProduto;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD){
        this.iD = iD;
    }

}