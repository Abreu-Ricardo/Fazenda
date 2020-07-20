import javax.swing.*;
import java.util.*;
import java.util.concurrent.*;

public class Main{
    public static void main(String[] args) {

        MinhaInterface minha = new MinhaInterface();
        Animal[] animal = new Animal[100];
        int idRegistra;
        String tipo;

        minha.getJanela().setVisible(true);

        while (true){
           System.out.printf(""); // RODA SOH SE TIVER ISSO (N SEI PQ)
           tipo = minha.identidade.getNome();


           try { Thread.sleep (500); } catch (InterruptedException ex) {}           
           // EH 0 SE ELE QUISER REGISTRAR UM ANIMAL
            switch (minha.identidade.getValorImpressao()) {
                case 0:
                    System.out.printf("");
                    switch (tipo) {
                        case "Vaca":
                            idRegistra = minha.getMinhaVaca().getId();
                            animal[idRegistra] = minha.getMinhaVaca().copiaVaca();
                            break;
                    
                         case "Cavalo":
                             idRegistra = minha.getMeuCavalo().getId();
                            animal[idRegistra]= minha.getMeuCavalo().copiaCavalo();
                            System.out.println(minha.identidade.getNome()+" Nome aqui");
                            break;
                    
                         case "Jegue":
                            idRegistra = minha.getMeuJegue().getId();
                            animal[idRegistra]=minha.getMeuJegue().copiaJegue();

                             System.out.println(minha.identidade.getNome()+" Nome aqui");
                            break;
                    
                         case "Galinha":
                            idRegistra = minha.getMinhaGalinha().getId();
                            animal[idRegistra]=minha.getMinhaGalinha().copiaGalinha();
                             System.out.println(minha.identidade.getNome()+" Nome aqui");
                             break;
                    
                         case "Ovelha":
                            idRegistra = minha.getMinhaOvelha().getId();
                            animal[idRegistra]=minha.getMinhaOvelha().copiaOvelha();
                             System.out.println(minha.identidade.getNome()+" Nome aqui");
                             break;
                        default:
                            minha.identidade.setValorImpressao(-1);

                            break;
                    }
                    break;
            
                case 1:
                    switch (tipo) {
                        // Todos os casos q ele quiser salvar
                        case "Vaca":
                            System.out.println(minha.identidade.getNome()+" Nome aqui1");
                            //Ex: minha.getMinhaVaca().registraVaca(...);
                            break;
                    
                        case "Cavalo":
                            System.out.println(minha.identidade.getNome()+" Nome aqui2");
                            //Ex: minha.getMeuCavalo().registraCavalo(...);
                            break;

                        case "Jegue":
                            System.out.println(minha.identidade.getNome()+" Nome aqui3");
                            break;

                        case "Galinha":
                            System.out.println(minha.identidade.getNome()+" Nome aqui4");
                            break;

                        case "Ovelha":
                            System.out.println(minha.identidade.getNome()+" Nome aqui5");
                            break;

                        default:
                            minha.identidade.setValorImpressao(-1);

                            break;
                    }
                    break;

                case 2:
                    System.out.println("entrou no 2");
                    minha.identidade.setValorImpressao(-1);

                    int id = minha.identidade.getID();

                    minha.getNome().setText(animal[id].toString());


                    break;

                case 3:
                    System.out.println("entrou no 3");
                    minha.identidade.setValorImpressao(-1);
                    break;

                case 4:
                    System.out.println("ENTREI NO 4");
                    switch (tipo) {
                        case "Cavalo":
                            System.out.println("ENTREI NO CAVALO NO 4");
                            // AUMENTAR   NUMERO DE VISITAS DO CAVALO
                            break;
                    
                        case "Jegue":
                            System.out.println("ENTREI NO JEGUE NO 4");
                            // AUMENTAR   NUMERO DE VISITAS DO CAVALO
                            break;
                    }
                    break;
            }
            minha.identidade.setValorImpressao(-1);
                            
        }
    }
}