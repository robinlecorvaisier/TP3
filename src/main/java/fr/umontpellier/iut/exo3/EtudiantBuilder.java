package fr.umontpellier.iut.exo3;
import java.time.LocalDate;

public class EtudiantBuilder {
    String nom;
    String prénom;
    LocalDate naissance;
    String mail;
    String adresse;

    EtudiantBuilder ajouterNom(String nom) {
        this.nom = nom;
        return this;
    }

    EtudiantBuilder ajouterPrenom(String prenom) {
        this.prénom = prenom;
        return this;
    }

    EtudiantBuilder ajouterNaissance(LocalDate DOB) {
        this.naissance = DOB;
        return this;
    }

    EtudiantBuilder ajouterMail(String mails) {
        this.mail = mails;
        return this;
    }

    EtudiantBuilder ajouterAdresse(String addr) {
        this.adresse = addr;
        return this;
    }

    Etudiant build() {
        return new Etudiant(nom, prénom, naissance, mail, adresse);
    }
}
