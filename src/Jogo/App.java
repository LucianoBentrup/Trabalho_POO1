package Jogo;

public class App {

    public static void main(String[] args) {

        //Goleiro Casa
        JogadorGoleiro goleiroC = new JogadorGoleiro();

        goleiroC.setName("Antonio");
        goleiroC.habilidade = 1;
        goleiroC.setAltura(1);
        goleiroC.setReflexos(38);
        
        //Goleiro Visitante
        JogadorGoleiro goleiroV = new JogadorGoleiro();
        
        goleiroV.setName("Carlos");
        goleiroV.habilidade = 1;
        goleiroV.setAltura(1);
        goleiroV.setReflexos(45);
        

        System.out.println("Nivel de habilidade do goleiroC: "+ goleiroC.getHabilidade());
        System.out.println("Nivel de habilidade do goleiroV: "+ goleiroV.getHabilidade());
    }

}
