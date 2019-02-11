package fr.umontpellier.iut.exo2;

public class Matiere {
    private String intitulé;
    private double coef;
    private Professeur prof;

    public Matiere(String intitulé1, double coef1, Professeur prof1){
        intitulé = intitulé1;
        coef = coef1;
        prof = prof1;
    }

    public double getCoef() {
        return coef;
    }
}
