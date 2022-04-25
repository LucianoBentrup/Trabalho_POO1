package Jogo;


import java.util.Date;
public class Partida {

    //atributos
    private Date data;
    private Time timeCasa;
    private Time timeVisitante;
    private int placarCasa;
    private int placarVisitante;

    //metodos
    public Partida(Date pDat, Time pCas, Time pVis) {

    }

    public int golCasa() {
        return placarCasa++;
        
    }

    public int golVisitante() {
        return placarVisitante++;
    }

    Time casa = new Time("Flamengo");
    Time visitante = new Time();

    
    
    public String getPlacar() {

        System.out.println(Time.class.getName() + golCasa() + "x" +  golVisitante() + "nomeVisitante");
        
        return "";

    }

}
