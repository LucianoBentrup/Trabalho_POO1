
package Jogo;

public class App {

    public static void main(String[] args) {
        
        JogadorGoleiro teste = new JogadorGoleiro();
        
        teste.habilidade = 1;
        teste.setAltura(190);
        teste.setReflexos(30);
                
        System.out.println(teste.getHabilidade());
        
    }
    
}
