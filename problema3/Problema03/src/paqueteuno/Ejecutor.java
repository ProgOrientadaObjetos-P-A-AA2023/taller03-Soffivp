/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

/**
 *
 * @author sofiv
 */
import paquetedos.InstitucionesEducativas;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se necesita representar una entidad que permite administrar Instituciones Educativas.
        Cada institución tienen como características: nombre, 
        tipo de institución, número de alumnos, número de docentes, 
        número de sedes, gastos proyectado por estudiante,
        presupuesto. El presupuesto es igual a la cantidad de alumnos de la 
        institución por el gatos proyectado por estudiante.*/
        InstitucionesEducativas escuela1 = new InstitucionesEducativas();
        InstitucionesEducativas escuela2 = new InstitucionesEducativas();

        double presupuesto1;
        double presupuesto2;

        escuela1.establecerNombre("La Salle");
        escuela1.establecerTipoInstitución("Privada");
        escuela1.establecerNumAlumnos(123);
        escuela1.establecerNumDocentes(56);
        escuela1.establecerNumSedes(4);
        escuela1.establecerGastosEstudiante(496.36);

        presupuesto1 = escuela1.calcularPresupuesto(escuela1.obtenerNumAlumnos(),
                escuela1.obtenerGastosEstudiante());

        escuela2.establecerNombre("Marianas de Jesus");
        escuela2.establecerTipoInstitución("Privada");
        escuela2.establecerNumAlumnos(489);
        escuela2.establecerNumDocentes(127);
        escuela2.establecerNumSedes(8);
        escuela2.establecerGastosEstudiante(678.46);

        presupuesto2 = escuela2.calcularPresupuesto(escuela2.obtenerNumAlumnos(),
                escuela2.obtenerGastosEstudiante());

        System.out.printf("El presupuesto de la escula %s es: %.2f\n\n"
                + "El presupuesto de la escula %s es: %.2f\n\n",
                escuela1.obtenerNombre(), presupuesto1,
                escuela2.obtenerNombre(), presupuesto2);

    }

}
