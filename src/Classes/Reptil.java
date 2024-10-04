package Classes;

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
                + "Nome: " + this.getNome()
                + "Espécie: " + this.getEspecie()
                + "Idade: " + this.getIdade()
                + "Tem pelo: " + getVenenoso() ;
    }
}
