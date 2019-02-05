package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant toto = new Etudiant("dupoint","toto", LocalDate.of(2013, Month.MAY, 12),"toto.dupoint@etu.umontpellier", "rue pere noel");
        System.out.println(toto);
        Etudiant lolo = new Etudiant("dupoint", "toto", LocalDate.of(2013, Month.MAY, 12),"toto.dupoint@etu.umontpellier","rue pere noel");
        System.out.println(lolo);

        //System.out.println(lolo == toto); ne fonctionne pas, il compare l'adresse de l'object.


    }
}
