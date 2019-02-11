package fr.umontpellier.iut.exo2;

public class Note {
    private Matiere Mat;
    private double vNote;

    public Note(Matiere Mat1, double vNote1){
        Mat = Mat1;
        vNote = vNote1;
    }

    public Matiere getMat() {
        return Mat;
    }

    public double getvNote() {
        return vNote;
    }
}
