package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant toto = new Etudiant("dupoint","toto", LocalDate.of(2013, Month.MAY, 12),"toto.dupoint@etu.umontpellier", "rue pere noel");
        System.out.println(toto);
        Etudiant lolo = new Etudiant("dupoint", "toto", LocalDate.of(2013, Month.MAY, 12),"toto.dupoint@etu.umontpellier","rue pere noel");
        System.out.println(lolo);

        System.out.println(lolo == toto); //revoie false car il compare l'adresse des objects et que se sont deux objects differents.

        toto = lolo;

        System.out.println(lolo == toto); //revoie true car toto est devenu une reference du lolo, donc pointe sur la même adresse.

    }
}
