package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EtudiantTest {


    @Test
    public void test_if_one_note() {
        Etudiant etudiant =new Etudiant("","",null,"","");
        etudiant.noter(new Matiere("",9.0,null),12);

        assertEquals(12,etudiant.calculerMoyenne());
    }

    @Test
    public void test_if_two_note_same_note_same_coef()
    {
        Etudiant etudiant =new Etudiant("","",null,"","");
        etudiant.noter(new Matiere("",9.0,null),12);
        etudiant.noter(new Matiere("",9.0,null),12);

        assertEquals(12,etudiant.calculerMoyenne());
    }

}