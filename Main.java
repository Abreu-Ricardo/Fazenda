import javax.swing.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        MinhaInterface minha = new MinhaInterface();

        minha.getJanela().setVisible(true);

        while (true){
           //System.out.println(minha.identidade.getValorImpressao());

           // EH 0 SE ELE QUISER REGISTRAR UM ANIMAL
            if (minha.identidade.getValorImpressao() == 0){
                
                switch (minha.identidade.getNome()) {
                    // Todos os casos q ele quiser registrar
                    case "Vaca":
                        System.out.println(minha.identidade.getNome()+" Nome aqui");
                        //Ex: minha.getMinhaVaca();
                        break;
                
                    case "Cavalo":
                        //Ex: minha.getMeuCavalo();
                        break;

                    case "Jegue":
                        break;
                    
                    case "Galinha":
                        break;
                    
                    case "Ovelha":
                        break;
                    
                    default:
                        break;
                }
                // Settando ao padrao
                minha.identidade.setNome(null);
                minha.identidade.setValorImpressao(-1);  // ESSA LINHA EH PRA VOLTAR AO NORMAL(CASO QUEIRA REGISTRAR OU IMPRIMIR)

            }

            // EH 1 SE ELE CLICAR EM SALVAR ALGUM ANIMAL
            else if ( minha.identidade.getValorImpressao() == 1 ){
                switch (minha.identidade.getNome()) {
                    // Todos os casos q ele quiser salvar
                    case "Vaca":
                        System.out.println(minha.identidade.getNome()+" Nome aqui");
                        //Ex: minha.getMinhaVaca().registraVaca(...);
                        break;
                
                    case "Cavalo":
                        //Ex: minha.getMeuCavalo().registraCavalo(...);
                        break;
                        
                    case "Jegue":
                        break;
                    
                    case "Galinha":
                        break;
                    
                    case "Ovelha":
                        break;
                    
                    default:
                        break;
                }
                // Settando ao padrao
                minha.identidade.setNome(null);
                minha.identidade.setValorImpressao(-1);  // ESSA LINHA EH PRA VOLTAR AO NORMAL(CASO QUEIRA REGISTRAR OU IMPRIMIR)

            }


            // ENTRA AQUI SE FOR IMPRIMIR ATRIBUTOS DO ANIMAL   (PRA IMPRIMIR VAI CHAMAR UM METODO QUE VAI ESTAR NA MinhaClasse)
            else if ( minha.identidade.getValorImpressao() == 2 ){
                System.out.println("entrou no 2");
                minha.identidade.setValorImpressao(-1);  // ESSA LINHA EH PRA VOLTAR AO NORMAL(CASO QUEIRA REGISTRAR OU IMPRIMIR)

            }

            // ENTRA AQUI SE FOR IMPRIMIR VALOR DO ANIMAL   (PRA IMPRIMIR VAI CHAMAR UM METODO QUE VAI ESTAR NA MinhaClasse)
            else if (minha.identidade.getValorImpressao() == 3){
                System.out.println("entrou no 3");
                //System.out.println(minha.identidade.getValorImpressao()+"ENTRAOU 2 ELSE IF "+minha.identidade.getID());
                minha.identidade.setValorImpressao(-1);  // ESSA LINHA EH PRA VOLTAR AO NORMAL(CASO QUEIRA REGISTRAR OU IMPRIMIR)

            }
            
            // minha.identidade.setValorImpressao(-1);  // ESSA LINHA EH PRA VOLTAR AO NORMAL(CASO QUEIRA REGISTRAR OU IMPRIMIR)
            
        }
    }
}