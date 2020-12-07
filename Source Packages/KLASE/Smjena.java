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
public class Smjena {
    private int id;
    private String datum;
    private String naziv;

     public Smjena(int id, String datum, String naziv) {
        this.id = id;
        this.datum = datum;
        this.naziv = naziv;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

   
    
}
