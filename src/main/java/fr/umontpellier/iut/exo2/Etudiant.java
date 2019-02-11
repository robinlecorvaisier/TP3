package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {

    private String Nom;
    private String Prenom;
    private LocalDate Dateofbirth;
    private String Mail;
    private String Address;
    private ArrayList<Note> ListeNote;



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
        ListeNote = new ArrayList<>();
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
    public void noter(Matiere Mat, double Val)
    {
        Note N = new Note(Mat, Val);
        ListeNote.add(N);
    }

    public Double calculerMoyenne()
    {
        Double moy = 0.0;
        Double coef = 0.0;
        for (Note n: ListeNote)
        {
            moy += n.getvNote() * n.getMat().getCoef();
            coef += n.getMat().getCoef();
        }

        moy = moy / coef;
        return moy;
    }

}
