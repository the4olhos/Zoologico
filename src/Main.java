import Classes.Animal;
import Classes.SubClasses.Ave;
import Classes.SubClasses.Mamifero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Quantidade de Aves a serem cadastrados (Definido pelo usuarios)
        int quantidadeAve;

        //Variavel para captar dados do usuario
        Scanner sc = new Scanner(System.in);

        //Capturando dado do usuario
        System.out.print("Quantas Aves voce deseja cadastrar: ");
        quantidadeAve = sc.nextInt();

        if (quantidadeAve == 0) {
            System.out.println("A quantidade nao pode ser 0");
            System.out.print("Quantas Aves voce deseja cadastrar: ");
            quantidadeAve = sc.nextInt();
        } else {
            //Criando o array com a quantidade de aves solicitada
            Animal[] ave = new Ave[quantidadeAve];

            ///Loop para criar os objetos
            for (int i = 0; i < quantidadeAve; i++) {
                System.out.print("Nome: ");
                //Capturando dado do usuario
                String nomeAve = sc.next();
                System.out.print("Especie: ");
                //Capturando dado do usuario
                String especieAve = sc.next();
                System.out.print("Idade: ");
                //Capturando dado do usuario
                int idadeAve = sc.nextInt();
                System.out.print("Pode Voar Sim ou Não: ");
                //Capturando dado do usuario
                String podeVoar = sc.next();
                boolean voar;
                if (podeVoar.equals("Sim")) {
                    voar = true;
                } else {
                    voar = false;
                }
                //Objeto criado
                ave[i] = new Ave(nomeAve, especieAve, idadeAve, voar);
                System.out.println(ave[i].toString());
        }




            //Quantidade de Mamiferos a serem cadastrados (Definido pelo usuarios)
            int quantidadeMamiferos;

            //Capturando dado do usuario
            System.out.print("Quantos Mamiferos você deseja cadastrar: ");
            quantidadeMamiferos = sc.nextInt();

            if (quantidadeMamiferos == 0) {
                System.out.println("A quantidade nao pode ser 0");
                System.out.print("Quantos Mamiferos voce deseja cadastrar: ");
                quantidadeMamiferos = sc.nextInt();
            } else {
                //Criando o array com a quantidade de mamiferos solicitada
                Animal[] mamifero = new Mamifero[quantidadeMamiferos];

                ///Loop para criar os objetos
                for (int j = 0; j < quantidadeMamiferos; j++) {
                    System.out.print("Nome: ");
                    //Capturando dado do usuario
                    String nomeMamifero = sc.next();
                    System.out.print("Especie: ");
                    //Capturando dado do usuario
                    String especieMamifero = sc.next();
                    System.out.print("Idade: ");
                    //Capturando dado do usuario
                    int idadeMamifero = sc.nextInt();
                    System.out.print("Tem pelo (Sim ou Não): ");
                    //Capturando dado do usuario
                    String temPelo = sc.next();
                    boolean pelo;
                    if (temPelo.equals("Sim")) {
                        pelo = true;
                    } else {
                        pelo = false;
                    }
                    //Objeto criado
                    ave[j] = new Ave(nomeMamifero, especieMamifero, idadeMamifero, pelo);
                    System.out.println(mamifero[j].toString());
            }





                //Quantidade de Repteis a serem cadastrados (Definido pelo usuarios)
                int quantidadeReptil;

                //Capturando dado do usuario
                System.out.print("Quantos Repteis você deseja cadastrar: ");
                quantidadeReptil = sc.nextInt();

                if (quantidadeReptil == 0) {
                    System.out.println("A quantidade nao pode ser 0");
                    System.out.print("Quantos Repteis você deseja cadastrar: ");
                    quantidadeReptil = sc.nextInt();
                } else{
                    //Criando o array com a quantidade de mamiferos solicitada
                    Animal[] reptil = new Mamifero[quantidadeReptil];

                    ///Loop para criar os objetos
                    for (int k = 0; k < quantidadeReptil; k++) {
                        System.out.print("Nome: ");
                        //Capturando dado do usuario
                        String nomeReptil = sc.next();
                        System.out.print("Especie: ");
                        //Capturando dado do usuario
                        String especieReptil = sc.next();
                        System.out.print("Idade: ");
                        //Capturando dado do usuario
                        int idadeReptil = sc.nextInt();
                        System.out.print("Pode Voar Sim ou Não: ");
                        //Capturando dado do usuario
                        String eVenenoso = sc.next();
                        boolean veneno;
                        if (eVenenoso.equals("Sim")) {
                            veneno = true;
                        } else {
                            veneno = false;
                        }
                        //Objeto criado
                        ave[k] = new Ave(nomeReptil, especieReptil, idadeReptil, veneno);
                        System.out.println(mamifero[k].toString());
                    }
                }
            }
        }
    }
}
