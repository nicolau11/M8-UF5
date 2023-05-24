/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitatcomptebancari;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class CCompteBancari {

    private int numero;
    private CPersona propietari;
    private int saldo;

    private static int seguentCompte = 1234;
    private static int saldoInicial = 100;

    public CCompteBancari(CPersona propietari) {
        this.numero = seguentCompte;
        seguentCompte++;
        this.propietari = propietari;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CPersona getPropietari() {
        return propietari;
    }

    public void setPropietari(CPersona propietari) {
        this.propietari = propietari;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static int getSeguentCompte() {
        return seguentCompte;
    }

    public static void setSeguentCompte(int seguentCompte) {
        CCompteBancari.seguentCompte = seguentCompte;
    }

    public static double getSaldoInicial() {
        return saldoInicial;
    }

    public static void setSaldoInicial(int saldoInicial) {
        CCompteBancari.saldoInicial = saldoInicial;
    }

    public static void modificarSaldoInicial(int saldoInicial) {
        System.out.println("---------- MODIFICA EL SALDO INICIAL ---------");

        Scanner sc = new Scanner(System.in); //Creem el scanner per guardar la informacio del parametres

        int nouSaldoInicial;
        System.out.println("Introdueix el nou saldo inicial: ");
        nouSaldoInicial = sc.nextInt();

        saldoInicial = nouSaldoInicial;
    }

    public int saldoCompte() {
        return this.saldo;
    }

    public boolean comprovarNumeroSecret() {
        System.out.println("---------- COMPROVAR NÚMERO SECRET ---------");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el teu numero secret: ");
        int secret = sc.nextInt();

        if (this.propietari.getNsecret() != secret) {
            System.out.println("El numero de secret no es correcte!");
            
            return false;
        } else {
            System.out.println("S'ha introduit el numero secret correctament!");
            
            return true;
        }
    }
    
    public boolean ingressar() {
        System.out.println("---------- INGRESSAR ---------");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix el teu numero secret: ");
        int secret = sc.nextInt();
        
        System.out.println("Ingressa la quantitat de diners que vols: ");
        int ingres = sc.nextInt();
        
        if (this.propietari.getNsecret() != secret) {
            System.out.println("El numero de secret no es correcte!");
            
            return false;
        } else {
            int saldototal = ingres + this.saldo;
            saldo = saldototal;
            
            System.out.println("S'han ingressat els diners correctament!");
            
            return true;
        }
    }
    
    public boolean extreure() {
        System.out.println("---------- EXTREURE ---------");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix el teu numero secret: ");
        int secret = sc.nextInt();
        
        System.out.println("Extreu la quantitat de diners que vols: ");
        int retirada = sc.nextInt();
        
        if (this.propietari.getNsecret() != secret) {
            System.out.println("El numero de secret no es correcte!");
                    
            return false;
        } else {
            int saldototal = this.saldo - retirada;
            saldo = saldototal;
            
            System.out.println("S'han retirat els diners correctament!");
            
            return true;
        }
    }
    
    public static void saludo2() {
        System.out.println("SALUTACIONS!");
    }
