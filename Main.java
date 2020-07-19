import javax.swing.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        MinhaInterface minha = new MinhaInterface();

        minha.getJanela().setVisible(true);

        while (true){

            // EH 0 SE ELE CLICAR EM QUALQUER COISA QUE NAO FOR IMPRIME 
            // ENTRA AQUI SE FOR REGISTRAR ALGUM ANIMAL OU SE QUISER SALVAR
            if (minha.identidade.getValorImpressao() == 0){
                //System.out.println(minha.identidade.getValorImpressao()+"ENTRAOU IF "+minha.identidade.getID());
            }

            // ENTRA AQUI SE FOR IMPRIMIR ATRIBUTOS DO ANIMAL   (PRA IMPRIMIR VAI CHAMAR UM METODO QUE VAI ESTAR NA MinhaClasse)
            else if ( minha.identidade.getValorImpressao() == 1 ){
                //System.out.println(minha.identidade.getValorImpressao()+"ENTRAOU 1 ELSE IF "+minha.identidade.getID());
            }

            // ENTRA AQUI SE FOR IMPRIMIR VALOR DO ANIMAL   (PRA IMPRIMIR VAI CHAMAR UM METODO QUE VAI ESTAR NA MinhaClasse)
            else if (minha.identidade.getValorImpressao() == 2){
                //System.out.println(minha.identidade.getValorImpressao()+"ENTRAOU 2 ELSE IF "+minha.identidade.getID());
            }
            
            minha.identidade.setValorImpressao(0);  // ESSA LINHA EH PRA VOLTAR AO NORMAL(CASO QUEIRA REGISTRAR)
            
        }
    }
}