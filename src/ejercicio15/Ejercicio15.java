/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    InputStreamReader flujo = new InputStreamReader(System.in);
    BufferedReader teclado = new BufferedReader(flujo);
    Autobus miAtobus;

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Autobus miAutobus = new Autobus();
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        int nBilletes;
        System.out.println("Nº de Billetes");
        nBilletes = Integer.parseInt(teclado.readLine());

        while (nBilletes < 0 && miAutobus.plazasDisponibles() > 0) {
            System.out.println("error de plazas o plazas insuficientes. /n ");
        }

    }

}
