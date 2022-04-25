
package Jogo;


public class Jogador {
    
    //Atributos
    private String nome;
    protected int idade;
    protected int habilidade;
    private int gols;
    private int camisa;
    
    //Metodos
    public void Jogador (String pNom, int pIda, int pHa){} //Metodo contrutor
    
    public int somaGol(){
        gols = 0;
        
        return 0;
    }
    
    //Metodos sets e gets
    
    
        public String getName(){
        return this.nome;
    }
    
        public int getHabilidade(){
        return this.habilidade;
    }
        
        public int getGols(){
        return this.gols;
    }    

        public void setName(String nome){
            this.nome = nome;
        }
        
        
}
