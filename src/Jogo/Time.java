package Jogo;

public class Time {

    //Atributos
    private String nome;
    private Jogador jogadores;
    private int vitorias = 10;
    private int derrotas = 5;
    private int empates = 3;

    //metodos
    public void Time(String pNom) {
    } // metodo contrutor 

    public void impremeJogadores() {

    }

    public int somaVitoria() {

        return 0;
    }

    public int somaDerrota() {

        return 0;
    }

    public int somaEmpate() {

        return 0;
    }

    //public 
    //Metodos gets e sets
    public String getNome() {
        return this.nome;
    }

    public String getResultados() {

        System.out.println("Historico do time " + this.nome + "\nVitorias: " + this.vitorias + "Derrotas: " + this.derrotas + "empates: " + this.empates);

        return "";
    }

}
