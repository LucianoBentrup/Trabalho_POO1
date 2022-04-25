package Jogo;

public class JogadorGoleiro extends Jogador {

    //Atributos
    private int reflexos;
    private float altura;

    //Metodos
    public void JogadorGoleiro(String pNom, int pIda, int pHab, int pRef, float pAlt) {
    } 


    

    @Override
    public int getHabilidade() {
        
        this.habilidade = ((habilidade * 5) + (((int) (altura * 100)) * 2) + (reflexos * 3)) / 10;
        
        return this.habilidade;
    }

    /**
     * @return the reflexos
     */
    public int getReflexos() {
        return reflexos;
    }

    /**
     * @param reflexos the reflexos to set
     */
    public void setReflexos(int reflexos) {
        this.reflexos = reflexos;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

}
