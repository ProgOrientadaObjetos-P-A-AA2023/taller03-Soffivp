/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class InstitucionesEducativas {

    private String nombre;
    private String tipoInstitución; 
    private int numAlumnos;
    private int numDocentes; 
    private int numSedes; 
    private double gastosEstudiante;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerTipoInstitución() {
        return tipoInstitución;
    }

    public void establecerTipoInstitución(String tipoInstitución) {
        this.tipoInstitución = tipoInstitución;
    }

    public int obtenerNumAlumnos() {
        return numAlumnos;
    }

    public void establecerNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public int obtenerNumDocentes() {
        return numDocentes;
    }

    public void establecerNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }

    public int obtenerNumSedes() {
        return numSedes;
    }

    public void establecerNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public double obtenerGastosEstudiante() {
        return gastosEstudiante;
    }

    public void establecerGastosEstudiante(double gastosEstudiante) {
        this.gastosEstudiante = gastosEstudiante;
    }
    
    public double calcularPresupuesto (int al, double g){
    double total;
    
    total = al * g;
    
    return total;
    }
}
