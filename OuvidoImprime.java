
import javax.swing.*;
import java.awt.event.*;

public class OuvidoImprime implements ActionListener{

    private JMenuItem animalImprime;
    private JLabel status;
    private ID identidade;

    OuvidoImprime(JMenuItem animalImprime, ID identidade , JLabel status){
        setAnimalImprime(animalImprime);
        setIdentidade(identidade);
        setStatus(status);
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){

        if ( infoEvento.getSource().equals(this.getAnimalImprime()) ){
            this.getStatus().setText("Imprimindo animal");
            this.identidade.setID( Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do animal: ", "Animal" , 3)));
            this.identidade.setValorImpressao(2);
            // IMPRIMIR ATRIBUTOS DO ANIMAL
        }

        else{
            this.getStatus().setText("Imprimindo valor animal");
            this.identidade.setID( Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do animal: ", "Animal" , 3)));
            this.identidade.setValorImpressao(3);
            // IMPRIMIR O VALOR DO ANIMAL
        }

        this.getStatus().setText("Esperando outro cadastro...");

    }

    public JMenuItem getAnimalImprime() {
        return animalImprime;
    }

    public void setAnimalImprime(JMenuItem animalImprime) {
        this.animalImprime = animalImprime;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public ID getIdentidade() {
        return identidade;
    }

    public void setIdentidade(ID identidade) {
        this.identidade = identidade;
    }

}