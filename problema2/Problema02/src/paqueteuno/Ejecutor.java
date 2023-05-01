/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.EquivalenteHora;

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
        /*Elaborar una solución que lea una cantidad de horas e imprima su equivalente en minutos, segundos, días.

Entididades o Clases

EquivalenteHora
Ejecutor
EquivalenteHora

horas
minutos
segundos
dias
Ejecutor

Tiene el método main

         */
        EquivalenteHora obj = new EquivalenteHora();
        EquivalenteHora obj2 = new EquivalenteHora();

        double minutos;
        double segundos;
        double dias;
        
        double minutos2;
        double segundos2;
        double dias2;

        obj.establecerHoras(6.3);
        minutos = obj.calcularMinutos(obj.obtenerHoras());
        segundos = obj.calcularSegundos(obj.obtenerHoras());
        dias = obj.calcularDias(obj.obtenerHoras());

        obj2.establecerHoras(78);
        minutos2 = obj2.calcularMinutos(obj2.obtenerHoras());
        segundos2 = obj2.calcularSegundos(obj2.obtenerHoras());
        dias2 = obj2.calcularDias(obj2.obtenerHoras());

        System.out.printf("El número de horas dadas es: %.2f \n"
                + "su equivalencia en minutos es: %.2f,\n"
                + "su equivalencia en segundos es %.2f,\n"
                + "su equivalencia en dias es %.2f,\n\n",
                obj.obtenerHoras(), minutos, segundos, dias);
        
                System.out.printf("El número de horas dadas es: %.2f \n"
                + "su equivalencia en minutos es: %.2f,\n"
                + "su equivalencia en segundos es %.2f,\n"
                + "su equivalencia en dias es %.2f,\n\n",
                obj2.obtenerHoras(), minutos2, segundos2, dias2);

    }

}
