/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public double obtenerHoras() {
        return horas;
    }

    public void establecerHoras(double horas) {
        this.horas = horas;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public void establecerMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public void establecerSegundos(double segundos) {
        this.segundos = segundos;
    }

    public double obtenerDias() {
        return dias;
    }

    public void establecerDias(double dias) {
        this.dias = dias;
    }

    public double calcularMinutos(double h) {
        double min;
        min = h * 60;
        return min;
    }

    public double calcularSegundos(double h) {
        double t;
        t = h * 3600;
        return t;
    }

    public double calcularDias(double h) {
        double t;
        t = h / 24;
        return t;
    }

}
