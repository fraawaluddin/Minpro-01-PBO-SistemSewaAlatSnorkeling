/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MyBook Z Series
 */
public class AlatSelam {
    
    private String idAlat;
    private String namaAlat;
    private String ukuran;
    private double tarifPerHari;
    private String kondisi;
    private int jumlahTersedia;
    
    public AlatSelam(String idAlat, String namaAlat, String ukuran, double tarifPerHari, String kondisi, int jumlahTersedia) {
        
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.ukuran = ukuran;
        this.tarifPerHari = tarifPerHari;
        this.kondisi = kondisi;
        this.jumlahTersedia = jumlahTersedia;           
    }
    
    public String getIdAlat() {
        return idAlat;
    }
    
    public String getNamaAlat() {
        return namaAlat;
    }
    
    public String getUkuran() {
        return ukuran;
    }
    
    public double getTarifPerHari() {
        return tarifPerHari;
    }
    
    public String getKondisi() {
        return kondisi;
    }
    
    public int getJumlahTersedia() {
        return jumlahTersedia;
    }
    
    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    public void setTarifPerHari(double tarifPerHari) {
        this.tarifPerHari = tarifPerHari;
    }
    
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    
    public void setJumlahTersedia(int jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
    } 
    
}
