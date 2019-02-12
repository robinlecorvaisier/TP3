package fr.umontpellier.iut.exo3;
import java.time.LocalDate;


public class EtudiantTelescopique {
    private String nom;
    private String prénom;
    private LocalDate naissance;
    private String mail;
    private String adresse;
    // private List<Note> listNote;

    public EtudiantTelescopique(String nom1, String prénom1, LocalDate naissance1, String mail1, String adresse1) {
        nom = nom1;
        prénom = prénom1;
        naissance = naissance1;
        mail = mail1;
        adresse = adresse1;
        //   listNote = new ArrayList<Note>;

    }


    public EtudiantTelescopique(EtudiantTelescopique copie) {
        this(copie.nom,copie.prénom,copie.naissance,copie.mail,copie.adresse);
    }

    public EtudiantTelescopique(String nom, String prénom) {
        this.nom = nom;
        this.prénom = prénom;
    }

        // ici il a y conflit de constructeur, nous avons 2 constructeurs avec la même signature.


    public EtudiantTelescopique(String nom, String prénom, LocalDate naissance) {
        this(nom, prénom);
        this.naissance = naissance;
    }

    public EtudiantTelescopique(String nom, String prénom, String mail) {
        this(nom,prénom);
        this.mail = mail;
    }


    public String toString() {

        return ("\n \n ETUDIANT \n Nom :" + nom +
                " \n Prénom :" + prénom +
                " \n DOB :" + naissance.toString() +
                "\n Mail :" + mail +
                "\n Adresse :" + adresse);
    }
}
