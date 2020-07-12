import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoGalinha implements ActionListener{
    
    private String tamanhoOvo;
    int opcao = 0;
    private String[] tamanhos = new String[3];

    OuvidoGalinha(){
        tamanhos[0] = "P";
        tamanhos[1] = "M";
        tamanhos[2] = "G";
    }


    @Override
    public void actionPerformed(ActionEvent infoEvento){
                                                        // Essa linha cria caixas de opcoes com tamanhos pre-definidos
        this.setTamanhoOvo(JOptionPane.showOptionDialog(null, "Tamanho do ovo da Galinha", "Galinha", 0, 3, null,tamanhos, null));

        System.out.println(getTamanhoOvo());
    }

    /**
     * @return char return the tamanhoOvo
     */
    public String getTamanhoOvo() {
        return tamanhoOvo;
    }

    /**
     * @param tamanhoOvo the tamanhoOvo to set
     */
    public void setTamanhoOvo(int tamanhoOvo) {
        if (tamanhoOvo == 0)
            this.tamanhoOvo = "P";
        else if (tamanhoOvo == 1)
            this.tamanhoOvo = "M";
        else if (tamanhoOvo == 2)
            this.tamanhoOvo = "G";
    }

}