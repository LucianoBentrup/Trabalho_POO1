package Jogo;

public class Time {

    
    //Atributos
    private String nome;
    private Jogador jogadores;
    private int vitorias=0;
    private int derrotas=0;
    private int empates=0;

    //metodos
    public void Time(String pNom) {
    } // metodo contrutor 

    public void impremeJogadores() {

    }

    public int somaVitoria() {
        vitorias++;
        return 0;
    }

    public int somaDerrota() {
        derrotas++;
        return 0;
    }

    public int somaEmpate() {
        empates++;
        return 0;
    }

    //public 
    //Metodos gets e sets
    public String getNome() {
        return this.nome;
    }

    public String getResultados() {

        
        System.out.println("Historico do time " + this.nome + 
                            "\nVitorias: " + this.vitorias + 
                            "Derrotas: " + this.derrotas + 
                            "empates: " + this.empates);

        return "";
    }
    
    
    
    public Jogador insJogador(Jogador pJog){
           
        
        return pJog;
    }
    
}
