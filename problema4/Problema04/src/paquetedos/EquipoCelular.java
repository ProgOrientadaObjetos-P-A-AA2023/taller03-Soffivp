/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class EquipoCelular {


    private String so;
    private double tpantalla;
    private double costoInicial;
    private int ivaPorcentaje;
    private double ivaCostoI;
    private double costoFin;
    private String mac;
    private String imei;

    public String obtenerSo() {
        return so;
    }

    public void establecerSo(String so) {
        this.so = so;
    }

    public double obtenerTpantalla() {
        return tpantalla;
    }

    public void establecerTpantalla(double tpantalla) {
        this.tpantalla = tpantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public void establecerCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public int obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public void establecerIvaPorcentaje(int ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public double obtenerIvaCostoI() {
        return ivaCostoI;
    }

    public void establecerIvaCostoI(double ivaCostoI) {
        this.ivaCostoI = ivaCostoI;
    }

    public double obtenerCostoFin() {
        return costoFin;
    }

    public void establecerCostoFin(double costoFin) {
        this.costoFin = costoFin;
    }

    public String obtenerMac() {
        return mac;
    }

    public void establecerMac(String mac) {
        this.mac = mac;
    }

    public String obtenerImei() {
        return imei;
    }

    public void establecerImei(String imei) {
        this.imei = imei;
    }

    public double calcularCostoFinal(double costo, double iva) {
        double costofinal;

        costofinal = costo + iva;

        return costofinal;
    }
}
