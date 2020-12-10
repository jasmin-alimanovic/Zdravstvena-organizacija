/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KLASE;

/**
 *
 * @author Jasmin
 */
public class Ambulanta {
    
    private int id;
    private String naziv;
    private String adresa;

    public Ambulanta(int id, String naziv, String adresa) {
        this.id = id;
        this.naziv = naziv;
        this.adresa = adresa;
    }
    public Ambulanta() {
        this.id = 0;
        this.naziv = null;
        this.adresa = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    
}
