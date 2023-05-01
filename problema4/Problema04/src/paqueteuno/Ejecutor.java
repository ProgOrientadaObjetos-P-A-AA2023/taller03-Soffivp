/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.EquipoCelular;

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
    Para un sistema, es necesario abstraer las características de dispositivos 
    electrónicos como los son los Equipo Celulares. Cada Equipo Celular tienen 
    como características: sistema operativo, tamaño de pantalla, costo inicial, 
    iva en porcentaje, iva del costo inicial costo final, dirección mac, 
    información IMEI. El costo final del equipo es igual costo inicial más 
    el iva del costo inicial.*/
        EquipoCelular obj1 = new EquipoCelular();
        EquipoCelular obj2 = new EquipoCelular();

        obj1.establecerSo("Android");
        obj1.establecerTpantalla(15.9);
        obj1.establecerCostoInicial(425.14);
        obj1.establecerIvaPorcentaje(12);
        obj1.establecerIvaCostoI(51.02);
        obj1.establecerMac("2544q5f8ww4");
        obj1.establecerImei("55887QADSE45");

        obj1.establecerCostoFin(obj1.calcularCostoFinal(obj1.obtenerCostoInicial(), obj1.obtenerIvaCostoI()));

        obj2.establecerSo("Android");
        obj2.establecerTpantalla(18.23);
        obj2.establecerCostoInicial(589.75);
        obj2.establecerIvaPorcentaje(12);
        obj2.establecerIvaCostoI(71.85);
        obj2.establecerMac("7844wicshw32668");
        obj2.establecerImei("IOJXB36387455");

        obj2.establecerCostoFin(obj2.calcularCostoFinal(obj2.obtenerCostoInicial(), obj2.obtenerIvaCostoI()));

        System.out.printf("El costo total del equipo con direccion Mac: %s,"
                + "es: %.2f\n\nEl costo total del equipo con direccion Mac: %s,"
                + "es: %.2f\n\n", obj1.obtenerMac(), obj1.obtenerCostoFin(),
                obj2.obtenerMac(), obj2.obtenerCostoFin());

    }

}
