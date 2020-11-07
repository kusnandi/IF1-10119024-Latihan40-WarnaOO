/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan40warnakepribadianoo;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA  : Kusnandi Pirmansyah
 * KELAS : IF-1
 * NIM   : 10119024
 */
public class WarnaOO {
    public String warnaMu, namaMu;
    Scanner sc = new Scanner (System.in);
    //https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html
        // Warna font 
    String ANSI_RESET = "\u001b[0m";
    String ANSI_RED = "\u001b[31m";
    String ANSI_YELLOW = "\u001b[33m";
    String ANSI_BLUE = "\u001b[34m";
    String ANSI_MAGENTA = "\u001b[35m";
    String ANSI_CYAN = "\u001b[36m";
    String ANSI_GREEN = "\u001b[32m";
    String ANSI_WHITE = "\u001b[37m";
        
    //https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html
        // Warna background     
    String ANSI_BLACK_BG ="\u001B[40m";
    String ANSI_GREEN_BG ="\u001b[42m";
    String ANSI_RED_BG ="\u001b[41m";
    String ANSI_YELLOW_BG ="\u001b[43m";
    String ANSI_BLUE_BG="\u001b[44m";
    String ANSI_MAGENTA_BG="\u001b[45m";
        
    public String inputWarna () {
        System.out.print("" + ANSI_RED + "YUK " + ANSI_RESET);
        System.out.print("" + ANSI_GREEN + " CEK " + ANSI_RESET);
        System.out.print("" + ANSI_YELLOW + " KEPRIBADIANMU " + ANSI_RESET);
        System.out.print("" + ANSI_CYAN + " DARI " + ANSI_RESET);
        System.out.print("" + ANSI_MAGENTA + " WARNA " + ANSI_RESET);
        System.out.print("" + ANSI_BLUE + " FAVORITMU " + ANSI_RESET);
        
        System.out.println();
        
        System.out.println("" + ANSI_RED_BG + ANSI_WHITE + "Merah\t\t" + ANSI_RESET);
        System.out.println("" + ANSI_GREEN_BG + ANSI_WHITE + " Hijau\t\t" + ANSI_RESET);
        System.out.println("" + ANSI_YELLOW_BG + ANSI_WHITE + " Kuning\t\t" + ANSI_RESET);
        System.out.println("" + ANSI_BLUE_BG + ANSI_WHITE + " Biru\t\t" + ANSI_RESET);
        System.out.println("" + ANSI_MAGENTA_BG + ANSI_WHITE + " Ungu\t\t" + ANSI_RESET);
        
        System.out.print("PILIH WARNA FAVORITMU\t: ");
        warnaMu = sc.nextLine();
        warnaMu = warnaMu.toUpperCase();
        return warnaMu;
    }
    
    public String inputNama () {
        System.out.print("NAMA KAMU\t:");
        namaMu = sc.nextLine();
        namaMu = namaMu.toUpperCase();
        return namaMu;
    }
    
    public void cekWarna () {
        System.out.println();
        System.out.print("===HASIL TEST KEPRIBADIANMU===");
        switch (warnaMu) {
            case "MERAH":
                System.out.print("" + ANSI_RED + "MERAH" + ANSI_RESET);
                System.out.println("1. Periang"
                        + "2. Pemberani"
                        + "3. Berani mengambil resiko dalam setiap langkah"
                        + "4. Menyukai tantangan"
                        + "5. Kurang sabar"
                        + "6. Dapat menaha amarah namun jika sudah di tahap puncak toleransi, kemarahannya akan sulit dikendalikan"
                        + "7. Memiliki energi kehangatan dan cinta");
                    break;
            case "HIJAU":
                System.out.print("" + ANSI_GREEN + "HIJAU" + ANSI_RESET);
                System.out.println("1. Romantis"
                        + "2. Menyukai hal yang berbau alami dan keindahan"
                        + "3. Teguh pada prinsip"
                        + "4. Menginginkan kesempurnaan"
                        + "5. Mudah cemburu"
                        + "6. Mudah merasa iri"
                        + "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan");
                    break;
            case "KUNING":
                System.out.print("" + ANSI_YELLOW + "KUNING" + ANSI_RESET);
                System.out.println("1. Optimis"
                        + "Suka Bergaul"
                        + "Periang"
                        + "Senang menolong"
                        + "Lincah dan aktif"
                        + "Tidak suka meremehkan kekurangan"
                        + "Loyal"
                        + "Hangat"
                        + "Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil"
                        + "Cenderung penakut");
                    break;
            case "BIRU":
                System.out.print("" + ANSI_BLUE + "BIRU" + ANSI_RESET);
                System.out.println("1. Menyenangkan"
                        + "2. Bijaksana"
                        + "3. Pembawaan diri tenang saat menghadapi masalah"
                        + "4. Dinamis"
                        + "5. Senang berbagi"
                        + "6. Bersahabat"
                        + "7. Tidak terlalu suka menjadi sorotan"
                        + "8. Menyembunyikan perasaan karena karakternya");
                    break;
            case "UNGU":
                System.out.print("" + ANSI_MAGENTA + "UNGU" + ANSI_RESET);
                System.out.println("1. Optimis"
                        + "2. Tidak pernah ragu"
                        + "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat"
                        + "4. Memiliki ambisi yang besar"
                        + "5. Memiliki empati yang besar"
                        + "6. Memiliki sisi misterius"
                        + "7. Terkadang bersikap keras kepala dan angkuh");
                    break;
            default:
                System.out.print("Ooops.. Belum teridentifikasi");
                    break;
        }
    }
}
