/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Terreno {

    private double costoTerreno = 0;
    private double ancho = 0;
    private double largo = 0;
    private double area = 0;
    private double valorMetroCuadrado = 0;

    public double obtenerCostoTerreno() {
        return costoTerreno;
    }

    public void establecerCostoTerreno(double costoTerreno) {
        this.costoTerreno = costoTerreno;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public void establecerAncho(double ancho) {
        this.ancho = ancho;
    }

    public double obtenerLargo() {
        return largo;
    }


    public void establecerLargo(double largo) {
        this.largo = largo;
    }

    public double obtenerArea() {
        return area;
    }

    public void establecerArea(double area) {
        this.area = area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void establecerValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double obtenerArea(double a, double b) {
        double total;

        total = a * b;

        return total;
    }

    public double calcularValor(double a, double m) {
        double total;

        total = a * m;

        return total;
    }

}
