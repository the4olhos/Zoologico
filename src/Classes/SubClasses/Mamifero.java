package Classes.SubClasses;

import Classes.Animal;

public class Mamifero extends Animal {

    private boolean temPelo;

    public Mamifero(String nome, String especie, int idade, boolean temPelo){
        super(nome, especie, idade);
        this.temPelo = temPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo sons de animal mamífero");
    }

    public String getTemPelo(){
        if (temPelo) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    @Override
    public String toString(){
        return "Informações do Mamífero:"
                + "\nNome: " + this.getNome()
                + "\nEspécie: " + this.getEspecie()
                + "\nIdade: " + this.getIdade()
                + "\nTem pelo: " + this.getTemPelo();
    }
}
