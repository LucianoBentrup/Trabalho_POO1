
package Jogo;


public class JogadorDefesa extends Jogador {
       
    //Atributos
    private int cobertura;
    private int desarme;
    
    //Metodos
    public void JogadorDefesa(String pNom, int pIda,int pHab,int pCob,int pDes){} //Metodo Construtor
    
    
    
    //Metodos sets e gets
    @Override
    public int getHabilidade(){
        
        this.habilidade = ((habilidade*5) + (cobertura*3) + (desarme*2) )/10;
        
        return this.habilidade;
    }
    

    public int getCobertura() {
        return cobertura;
    }


    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }


    public int getDesarme() {
        return desarme;
    }


    public void setDesarme(int desarme) {
        this.desarme = desarme;
    }


            
    
}

