/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg101108015.latihan6kambingstatic.konstanta;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program variabel kambing menjadi 
 *                        variabel ststic dan konstanta
 */
public class IF1101108015Latihan6kambingstaticKonstanta {

//NAMA_KAMBING sebagai Konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                + Mamalia.jumlahKambing);
    }
    
}
