package Classes;

public class Animal {

    //Atributos da Classe
    private String nome;
    private String especie;
    private int idade;


    //Construtor da Classe
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    //Metodos Especiais
    public void emitirSom() {
        System.out.println("Emitindo Som");
    }

    // Metodo padrao toString
    public String toString() {
        return "Informações do Animal"
                + "\nNome: " + this.getNome()
                + "\nEspecie: " + this.getEspecie()
                + "\nIdade: " + this.getIdade();

    }

    //Metodos Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
