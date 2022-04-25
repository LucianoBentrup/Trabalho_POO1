
package Jogo;


public class JogadorAtacante extends Jogador {
   
    //Atributos
    private int velocidade;
    private int tecnica;
    
    //Metodos
    public void JogadorAtacante(int pNom, int pIda,int pHab,int pVel,int pTec){} //Metodo Construtor
    
    //Metodos sets e gets
    @Override
    public int getHabilidade(){
        
        this.habilidade =((habilidade*5) + (velocidade*2) + (tecnica*3) )/10;
        
        return this.habilidade;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }



    
}
