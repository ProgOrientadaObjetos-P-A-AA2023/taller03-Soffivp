/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Terreno;

/**
 *
 * @author sofiv
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
    Problema 1.
Elaborar una solución que calcule e imprima el costo de un terreno rectangular; se tiene como datos el ancho y 
el largo en metros; el valor del metro cuadrado. El area del terreno es igual a largo por ancho. 
El costo del terreno es igual al valor del metro cuandrado por el area del terreno. 
Luego del análisis se decide usar las siguientes entidades:


 

         */
        Terreno t1 = new Terreno();
        Terreno t2 = new Terreno();
        double area = 0;
        double costo = 0;
        double area2 = 0;
        double costo2 = 0;
        t1.establecerAncho(1236.25);
        t1.establecerLargo(78853.63);
        t1.establecerValorMetroCuadrado(521.23);

        t2.establecerAncho(412.33);
        t2.establecerLargo(1658.3);
        t2.establecerValorMetroCuadrado(856.14);

        area = t1.obtenerArea(t1.obtenerAncho(), t1.obtenerLargo());
        costo = t1.calcularValor(area, t1.obtenerValorMetroCuadrado());

        area2 = t2.obtenerArea(t2.obtenerAncho(), t2.obtenerLargo());
        costo2 = t2.calcularValor(area2, t2.obtenerValorMetroCuadrado());

        System.out.printf("El valor del terreno 1 es de: %.2f\n"
                + "Y el valor del terreno 2 es de: %.2f\n", costo, costo2);
    }

}
