package Classes.SubClasses;

import Classes.Animal;

public class Ave extends Animal {
    //Atributos da Classe
    private boolean podeVoar;

    //Construtor da Classe
    public Ave(String nome, String especie, int idade, boolean podeVoar) {
        super(nome, especie, idade);
        this.podeVoar = podeVoar;
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo Som de Ave");
    }

    @Override
    public String toString() {
        return "Informações da Ave"
                + "\nNome: " + this.getNome()
                + "\nEspecie: " + this.getEspecie()
                + "\nIdade: " + this.getIdade()
                + "\nPode Voar: " + this.getPodeVoar();
    }

    //Metodos Acessores
    public String getPodeVoar() {
        if(podeVoar){
            return "Sim";
        }else{
            return "Não";
        }
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }
}
