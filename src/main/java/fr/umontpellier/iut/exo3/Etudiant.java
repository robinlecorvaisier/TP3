package fr.umontpellier.iut.exo3;

import java.time.LocalDate;

public class Etudiant {
    private String Nom;
    private String Prenom;
    private LocalDate Dateofbirth;
    private String Mail;
    private String Address;


   /* public Etudiant (String Nom, String Prenom, LocalDate Dateofbirth)
    {

        this.Nom = Nom.toUpperCase();
        this.Prenom = Prenom.toLowerCase();
        this.Dateofbirth = Dateofbirth;
        generateDefaultAddressMail();
    }
    public Etudiant(String Nom, String Prenom, LocalDate Dateofbirth, String address)
    {
        this(Nom, Prenom, Dateofbirth);
        Address = address;
    }*/

    public Etudiant(String nom, String prenom, LocalDate dateofbirth, String mail, String address) {
        Nom = nom;
        Prenom = prenom;
        Dateofbirth = dateofbirth;
        Mail = mail;
        Address = address;
    }

    public String toString()
    {
        return "\n\n" +Nom + " " + Prenom + "\n"+
                "Date de naissance : "+Dateofbirth.toString() + "\n" +
                "Adresse Mail : " + Mail + "\n" +
                "Adresse : "+Address;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

   /* private void generateDefaultAddressMail()
    {
        Mail = Prenom.toLowerCase() + "." + Nom.toLowerCase() + "@etu.umontpellier.fr";
    }*/

}
