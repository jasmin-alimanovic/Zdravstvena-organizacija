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
public class HitniTim {
    
    private int id;
    private String sifra;
    private String naziv;
    List<Vozilo> vozila;

    public HitniTim(int id, String sifra, String naziv, List<Vozilo> vozila) {
        this.id = id;
        this.sifra = sifra;
        this.naziv = naziv;
        this.vozila = vozila;
    }
    public HitniTim() {
        this.id = 0;
        this.sifra = null;
        this.naziv = null;
        this.vozila = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Vozilo> getVozila() {
        return vozila;
    }

    public void setVozila(List<Vozilo> vozila) {
        this.vozila = vozila;
    }
    
}
