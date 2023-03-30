/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.util.Scanner;

/**
 *
 * @author casta
 */
public class GradebookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nombreCurso = new Scanner(System.in);

        Gradebook planillaNotas = new Gradebook();

        System.out.println("El nombre del curso (antes de la asignacion) es : /n" + planillaNotas.getCourseName());

        System.out.println("Por favor ingrese el nombre del curso /n: ");
        String nombreEntradaCurso = nombreCurso.nextLine();
        planillaNotas.setCourseName(nombreEntradaCurso);

        System.out.println("El nuevo mobre del curso es : " + planillaNotas.getCourseName());
        planillaNotas.displayMessage();

        //planillaNotas.displayMessage("POO ucaldas 2023-1");
    }

}
