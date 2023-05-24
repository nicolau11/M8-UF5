/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitatcomptebancari;

import java.util.*;

/**
 *
 * @author Nico
 */
public class CAplicacio {

    public static void main(String[] args) {
        ArrayList col = new ArrayList();

        Scanner sc = new Scanner(System.in); //Creem el scanner per guardar la informacio del parametres
        Scanner sc2 = new Scanner(System.in); //Creem el scanner per guardar la informacio del parametres
        Scanner sc3 = new Scanner(System.in); //Creem el scanner per guardar la informacio del parametres


        System.out.println(col.toString());

        int sortir;

        do {
            System.out.println("---------- BENVINGUTS AL PROGRAMA ----------");

            //Imprimim les opcions del menu 
            System.out.println("1.Crear nou compte");
            System.out.println("2.Modificar el compte");
            System.out.println("3.Eliminar el compte");
            System.out.println("4.Consultar saldo");
            System.out.println("5.Ingressar");
            System.out.println("6.Extreure");
            System.out.println("7.Modificar el numero secret");
            System.out.println("8.Sortir");

            System.out.println("Quina opcio vols escollir?");
            sortir = sc.nextInt();

            switch (sortir) {
                case 1:
                    System.out.println("---------- CREAR UN NOU COMPTE ----------");

                    CPersona persona = new CPersona("", "", "", 0);
                    CCompteBancari compte = new CCompteBancari(persona);

                    System.out.println("Introdueix el nom: ");
                    persona.setNom(sc.nextLine());
                    System.out.println("Introdueix el cognom: ");
                    persona.setCognom(sc3.nextLine());
                    System.out.println("Introdueix el segon cognom: ");
                    persona.setScognom(sc3.nextLine());
                    System.out.println("Introdueix el numero secret: ");
                    persona.setNsecret(sc3.nextInt());

                    col.add(compte);

                    System.out.println(col.toString());
                    
                    break;
                case 2:
                    System.out.println("---------- MODIFICAR UN COMPTE ----------");
                    //iterator arraylist
                    //obtener primera posicion

                    int secret = 0;
                    
                    System.out.println("Introdueix el numero secret: ");
                    secret = sc2.nextInt();

                    Iterator iter = col.iterator();

                    while (iter.hasNext()) {
                        Object o = iter.next();
                        if (o instanceof CCompteBancari) {
                            CCompteBancari c = (CCompteBancari) o;
                            CPersona p = (CPersona) c.getPropietari();

                            if (p.getNsecret() != secret) {
                                System.out.println("El numero secret no coincideix");
                            } else {
                                System.out.println("EL numero coincideix");

                                System.out.println("Introdueix el nom: ");
                                p.setNom(sc3.nextLine());
                                System.out.println("Introdueix el cognom: ");
                                p.setCognom(sc3.nextLine());
                                System.out.println("Introdueix el segon cognom: ");
                                p.setScognom(sc3.nextLine());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("--------- ELIMINAR UN COMPTE ----------");
                    
                    secret = 0;
                    iter = col.iterator();
                    
                    System.out.println("Introdueix el numero secret: ");
                    secret = sc2.nextInt();
                    
                    while (iter.hasNext()) {
                        Object o = iter.next();
                        if (o instanceof CCompteBancari) {
                            CCompteBancari c = (CCompteBancari) o;
                            CPersona p = (CPersona) c.getPropietari();

                            if (p.getNsecret() != secret) {
                                System.out.println("El numero secret no coincideix");
                            } else {
                                col.remove(o);
                                System.out.println("Eliminat correctament!");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("--------- CONSULTAR SALDO ----------");
                    
                    secret = 0;
                    iter = col.iterator();
                    
                    System.out.println("Introdueix el numero secret: ");
                    secret = sc2.nextInt();
                    
                    while (iter.hasNext()) {
                        Object o = iter.next();
                        if (o instanceof CCompteBancari) {
                            CCompteBancari c = (CCompteBancari) o;
                            CPersona p = (CPersona) c.getPropietari();

                            if (p.getNsecret() != secret) {
                                System.out.println("El numero secret no coincideix");
                            } else {
                                System.out.println("El saldo: " + c.getSaldo());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("--------- INGRESSAR ----------");
                    
                    secret = 0;
                    iter = col.iterator();
                    int nousaldo = 0;
                    int saldototal = 0;
                    
                    System.out.println("Introdueix el numero secret: ");
                    secret = sc2.nextInt();
                    
                    while (iter.hasNext()) {
                        Object o = iter.next();
                        if (o instanceof CCompteBancari) {
                            CCompteBancari c = (CCompteBancari) o;
                            CPersona p = (CPersona) c.getPropietari();

                            if (p.getNsecret() != secret) {
                                System.out.println("El numero secret no coincideix");
                            } else {
                                System.out.println("Quan vols ingressar? ");
                                nousaldo = sc2.nextInt();
                                
                                saldototal = nousaldo + c.getSaldo();
                                c.setSaldo(saldototal);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("--------- EXTREURE ----------");
                    
                    secret = 0;
                    iter = col.iterator();
                    nousaldo = 0;
                    saldototal = 0;
                    
                    System.out.println("Introdueix el numero secret: ");
                    secret = sc2.nextInt();
                    
                    while (iter.hasNext()) {
                        Object o = iter.next();
                        if (o instanceof CCompteBancari) {
                            CCompteBancari c = (CCompteBancari) o;
                            CPersona p = (CPersona) c.getPropietari();

                            if (p.getNsecret() != secret) {
                                System.out.println("El numero secret no coincideix");
                            } else {
                                System.out.println("Quan vols extreure? ");
                                nousaldo = sc2.nextInt();
                                
                                saldototal = c.getSaldo() - nousaldo;
                                c.setSaldo(saldototal);
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("--------- INGRESSAR ----------");
                    
                    secret = 0;
                    iter = col.iterator();
                    int nounsecret = 0;
                    
                    System.out.println("Introdueix el numero secret: ");
                    secret = sc2.nextInt();
                    
                    while (iter.hasNext()) {
                        Object o = iter.next();
                        if (o instanceof CCompteBancari) {
                            CCompteBancari c = (CCompteBancari) o;
                            CPersona p = (CPersona) c.getPropietari();

                            if (p.getNsecret() != secret) {
                                System.out.println("El numero secret no coincideix");
                            } else {
                                System.out.println("Introdueix el nou numero secret: ");
                                p.setNsecret(sc3.nextInt());
                                
                            }
                        }
                    }
                    break;

            }
        } while (sortir != 8);
    }

}
