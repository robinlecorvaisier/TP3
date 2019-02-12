package fr.umontpellier.iut.exo3;
import java.time.LocalDate;


public class EtudiantBeans {
    private String nom;
    private String prénom;
    private LocalDate naissance;
    private String mail;
    private String adresse;

    public EtudiantBeans(){}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public void setNaissance(LocalDate naissance) {
        this.naissance = naissance;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
