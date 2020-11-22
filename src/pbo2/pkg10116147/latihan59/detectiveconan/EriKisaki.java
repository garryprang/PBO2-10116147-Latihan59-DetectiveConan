/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan59.detectiveconan;

/**
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan deskripsi karakter dari anime Detective Conan.
 */
public class EriKisaki extends DetectiveConan{
    
    private String namaAnak;
    private String namaSuami;
    private String profesiSuami;
    private String hewanPeliharaan;
    
    public EriKisaki(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getNamaAnak(){
        return namaAnak;
    }
    
    public void setNamaAnak(String namaAnak){
        this.namaAnak = namaAnak;
    }
    
    public String getNamaSuami(){
        return namaSuami;
    }
    
    public void setNamaSuami(String namaSuami){
        this.namaSuami = namaSuami;
    }
    
    public String getProfesiSuami(){
        return profesiSuami;
    }
    
    public void setProfesiSuami(String profesiSuami){
        this.profesiSuami = profesiSuami;
    }
    
    public String getHewanPeliharaan(){
        return hewanPeliharaan;
    }
    
    public void setHewanPeliharaan(String hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    @Override
    public void setKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
}
