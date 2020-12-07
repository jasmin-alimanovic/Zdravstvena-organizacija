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
public class Vozilo {
    
    private int id;
    private String marka;
    private String naziv;
    private String reg_tablice;

    public Vozilo(int id, String marka, String naziv, String reg_tablice) {
        this.id = id;
        this.marka = marka;
        this.naziv = naziv;
        this.reg_tablice = reg_tablice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getReg_tablice() {
        return reg_tablice;
    }

    public void setReg_tablice(String reg_tablice) {
        this.reg_tablice = reg_tablice;
    }
    
}
