import javax.swing.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        MinhaInterface minha = new MinhaInterface();
        Vaca[] vaquinha = new Vaca[2];

        minha.getJanela().setVisible(true);
        int flag = -1;

        while (true){
           System.out.printf(""); // RODA SOH SE TIVER ISSO (N SEI PQ)
           
           // EH 0 SE ELE QUISER REGISTRAR UM ANIMAL
            switch (minha.identidade.getValorImpressao()) {
                case 0:
                    switch (minha.identidade.getNome()) {
                        case "Vaca":
                             vaquinha[0] = minha.getMinhaVaca().copiaVaca();
                             System.out.println(vaquinha[0].getNome()+" Nome aqui");
                            break;
                    
                         case "Cavalo":
                            System.out.println(minha.identidade.getNome()+" Nome aqui AKIIII");
                            break;
                    
                         case "Jegue":
                             System.out.println(minha.identidade.getNome()+" Nome aqui");
                            break;
                    
                         case "Galinha":
                             System.out.println(minha.identidade.getNome()+" Nome aqui");
                             break;
                    
                         case "Ovelha":
                             System.out.println(minha.identidade.getNome()+" Nome aqui");
                             break;
                    }
                    break;
            
                case 1:
                    switch (minha.identidade.getNome()) {
                        // Todos os casos q ele quiser salvar
                        case "Vaca":
                            System.out.println(minha.identidade.getNome()+" Nome aqui");
                            //Ex: minha.getMinhaVaca().registraVaca(...);
                            break;
                    
                        case "Cavalo":
                            System.out.println(minha.identidade.getNome()+" Nome aqui");
                            //Ex: minha.getMeuCavalo().registraCavalo(...);
                            break;

                        case "Jegue":
                            System.out.println(minha.identidade.getNome()+" Nome aqui");
                            break;

                        case "Galinha":
                            System.out.println(minha.identidade.getNome()+" Nome aqui");
                            break;

                        case "Ovelha":
                            System.out.println(minha.identidade.getNome()+" Nome aqui");
                            break;

                        default:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("entrou no 2");
                    minha.identidade.setValorImpressao(-1);
                    break;

                case 3:
                    System.out.println("entrou no 3");
                    //System.out.println(minha.identidade.getValorImpressao()+"ENTRAOU 2 ELSE IF "+minha.identidade.getID());
                    minha.identidade.setValorImpressao(-1);
                    break;
            }
            minha.identidade.setValorImpressao(-1);
                            
        }
    }
}