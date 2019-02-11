package fr.umontpellier.iut.exo2;

public class Professeur {
    private String nom;
    private String prénom;

    public Professeur(String nom1, String prénom1) {
        nom = nom1;
        prénom = prénom1;
    }

    public String toString(){
        return nom + " " + prénom;
    }
}
