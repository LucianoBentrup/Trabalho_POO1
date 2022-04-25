package Jogo;

public class JogadorGoleiro extends Jogador {

    //Atributos
    private int reflexos;
    private float altura;

    //Metodos
    public void JogadorGoleiro(String pNom, int idade, int habilidade, int reflexos, float altura) 
    {} 


    @Override
    public int getHabilidade() {
        
        this.habilidade = ((habilidade * 5) + (((int) (altura * 100)) * 2) + (reflexos * 3)) / 10;
        
        return this.habilidade;
    }


    public int getReflexos() {
        return reflexos;
    }


    public void setReflexos(int reflexos) {
        this.reflexos = reflexos;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
