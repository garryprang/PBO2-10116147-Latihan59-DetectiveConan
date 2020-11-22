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
public class HeijiHattori extends DetectiveConan{
    
    private String keahlian;
    private String ciriKhas;
    private String kendaraan;
    private String hobi;
    
    public HeijiHattori(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getKeahlian(){
        return keahlian;
    }
    
    public void setKeahlian(String keahlian){
        this.keahlian = keahlian;
    }
    
    public String getCiriKhas(){
        return ciriKhas;
    }
    
    public void setCiriKhas(String ciriKhas){
        this.ciriKhas = ciriKhas;
    }
    
    public String getKendaraan(){
        return kendaraan;
    }
    
    public void setKendaraan(String kendaraan){
        this.kendaraan = kendaraan;
    }
    
    public String getHobi(){
        return hobi;
    }
    
    public void setHobi(String hobi){
        this.hobi = hobi;
    }
    
    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
}
