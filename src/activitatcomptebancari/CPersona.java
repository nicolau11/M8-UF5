/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitatcomptebancari;

/**
 *
 * @author Nico
 */
public class CPersona {
    private String nom;
    private String cognom;
    private String scognom;
    private int nsecret;

    public CPersona(String nom, String cognom, String scognom, int nsecret) {
        this.nom = nom;
        this.cognom = cognom;
        this.scognom = scognom;
        this.nsecret = nsecret;
    }
    
    public CPersona() {
        this("", "", "", 0);  
    }
    
    public CPersona(CPersona per) {
        this(per.nom, per.cognom, per.scognom, per.nsecret);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getScognom() {
        return scognom;
    }

    public void setScognom(String scognom) {
        this.scognom = scognom;
    }

    public int getNsecret() {
        return nsecret;
    }

    public void setNsecret(int nsecret) {
        this.nsecret = nsecret;
    }
    
    
}
