/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author Admin
 */
public class Autobus {

    private int totalPlazas;
    private int billetesP;
    private int billetesM;
    private int billetesL;
    private int billetesG;
    private float precioP;
    private float precioM;
    private float precioL;
    private float precioG;

    public Autobus() {

        totalPlazas = 60;
        precioP = 0f;
        precioM = 0.5f;
        precioL = 1f;
        precioG = 0.25f;

    }

/**
 * 
 * @param totalPlazas
 * @param precioP
 * @param precioM
 * @param precioL
 * @param precioG 
 */
    public Autobus(int totalPlazas, float precioP, float precioM, float precioL, float precioG) {
        this.totalPlazas = totalPlazas;
        this.precioP = precioP;
        this.precioM = precioM;
        this.precioL = precioL;
        this.precioG = precioG;
    }
/**
 * 
 * @return 
 */
    public float getPrecioG() {
        return precioG;
    }

    public void setPrecioG(float precioG) {
        this.precioG = precioG;
    }

    public float getPrecioP() {
        return precioP;
    }

    public void setPrecioP(float precioP) {
        this.precioP = precioP;
    }

    public float getPrecioM() {
        return precioM;
    }

    public void setPrecioM(float precioM) {
        this.precioM = precioM;
    }

    public float getPrecioL() {
        return precioL;
    }

    public void setPrecioL(float precioL) {
        this.precioL = precioL;
    }

    public int getTotalPlazas() {
        return totalPlazas;
    }

    public void setTotalPlazas(int totalPlazas) {
        this.totalPlazas = totalPlazas;
    }

    public int getBilletesP() {
        return billetesP;
    }

    public void setBilletesP(int billetesP) {
        this.billetesP = billetesP;
    }

    public int getBilletesM() {
        return billetesM;
    }

    public void setBilletesM(int billetesM) {
        this.billetesM = billetesM;
    }

    public int getBilletesL() {
        return billetesL;
    }

    public void setBilletesL(int billetesL) {
        this.billetesL = billetesL;
    }

    public int getBilletesG() {
        return billetesG;
    }

    public void setBilletesG(int billetesG) {
        this.billetesG = billetesG;
    }

    public int plazasDisponibles() {
        int ocupacion;
        int plazasDisponibles;
        ocupacion = billetesP + billetesM + billetesL + billetesG;
        plazasDisponibles = totalPlazas - ocupacion;
        return plazasDisponibles;
    }
    
}
