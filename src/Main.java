import Classes.Animal;
import Classes.SubClasses.Ave;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Quantidade de Animais a serem cadastrados
        int quantidadeAve;

        //Variavel para captar dados do usuario
        Scanner sc = new Scanner(System.in);

        //Capturando dado do usuario
        System.out.print("Quantas Aves voce deseja cadastrar: ");
        quantidadeAve = sc.nextInt();

        //Criando o array com a quantidade de aves solicitada
        Animal[] ave = new Ave[quantidadeAve];

        for (int i = 0; i < quantidadeAve; i++) {
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Especie: ");
            String especie = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Pode Voar Sim ou Não: ");
            String podeVoar = sc.next();
            boolean voar;
            if(podeVoar.equals("Sim")) {
                 voar = true;
            } else {
                 voar = false;
            }
            ave[i] = new Ave(nome, especie,idade,voar);
            System.out.println(ave[i].toString());
        }
 }
}