package Classes.SubClasses;

import Classes.Animal;

public class Reptil extends Animal {

    private boolean venenoso;

    public Reptil(String nome, String especie, int idade, boolean venenoso){
        super(nome, especie, idade);
        this.venenoso = venenoso;
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo sons de Réptil");
    }

    public String getVenenoso(){
        if (venenoso) {
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
                + "\nÉ venenoso: " + this.getVenenoso() ;
    }
}
