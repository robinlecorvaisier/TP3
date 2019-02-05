package fr.umontpellier.iut.exo2;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String spécialité;
    private String Address;
    private List<Etudiant> listEtu;

    public Departement(String spécialité, String address) {
        this.spécialité = spécialité;
        Address = address;
        listEtu = new ArrayList<Etudiant>();
    }

    public String toString() {
        return "Departement{" +
                "spécialité='" + spécialité + '\'' +
                ", Address='" + Address + '\'' +
                ", listEtu=" + listEtu +
                '}';
    }

    public void inscrire(Etudiant Etu)
    {
        listEtu.add(Etu);
    }

    public void desinscrire(Etudiant Etu)
    {
        listEtu.remove(Etu);
    }
}
