/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KLASE;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jasmin
 */
public class Radnik {
    private int id;
    private String ime;
    private String telefon;
    private HitniTim ht;
    private int uloga_id;
    private Ambulanta ambulanta;
    private List<Dezura> dezure;
    private List<Smjena> smjene;
    public Radnik(int id, String ime, String telefon, HitniTim ht, int uloga_id, Ambulanta ambulanta) {
        this.id = id;
        this.ime = ime;
        this.telefon = telefon;
        this.ht = ht;
        this.uloga_id = uloga_id;
        this.ambulanta = ambulanta;
    }
    public Radnik() {
        this.id = 0;
        this.ime = null;
        this.telefon = null;
        this.ht = null;
        this.uloga_id = 0;
        this.ambulanta = null;
        this.dezure = new ArrayList<>();
        this.smjene = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public HitniTim getHt() {
        return ht;
    }

    public void setHt(HitniTim ht) {
        this.ht = ht;
    }

    public int getUloga_id() {
        return uloga_id;
    }

    public void setUloga_id(int uloga_id) {
        this.uloga_id = uloga_id;
    }

    public Ambulanta getAmbulanta() {
        return ambulanta;
    }

    public void setAmbulanta(Ambulanta ambulanta) {
        this.ambulanta = ambulanta;
    }
    
    
}
