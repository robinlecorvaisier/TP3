package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GestionEtudiantsTest {

    @Disabled
    @Test
    public void test_if_main_method_does_not_throw_exceptions() {

        assertDoesNotThrow(() -> GestionEtudiants.main(new String[1]));

    }
}

