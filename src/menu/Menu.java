package menu;
import java.util.Scanner;
public class Menu {
public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     int pilihan0, pilihan1, pesanan0, pesanan1, pesanan2, yn0, yn1, yn2;
     int count = 0;
     String[] yn = {"Iya","Tidak"};
     String[] menu = {"Ayam Geprek ", "Ayam Bakar  ", "Bebek Bakar "};
     int[] harga = {15000,20000,25000};
     System.out.println("Selamat Datang di Warung Kami");
     System.out.println("Daftar menu hari ini : ");
     for (int i = 0; i < menu.length; i++) {
         System.out.println(i+". "+menu[i]+"   = Rp "+harga[i]+",00"); 
    }
     System.out.print("Masukkan pilihan anda : ");
     pilihan0 = input.nextInt();
     //IF pilihan pertama 0
     if (pilihan0 == 0) {
        System.out.print("Masukkan banyak pesanan : ");
        pesanan0 = input.nextInt();
        count += harga[pilihan0]*pesanan0;
        System.out.println("Total = Rp "+count+",00");
        System.out.println("Ingin menambah pesanan? ");
         for (int i = 0; i < yn.length; i++) {
             System.out.println(i+". "+yn[i]);
         }
        System.out.print("Masukkan pilihan anda : ");
        yn0 = input.nextInt();
         if (yn0 == 0) {
             System.out.println("1. "+menu[1]+"  = Rp "+harga[1]+",00");
             System.out.println("2. "+menu[2]+"  = Rp "+harga[2]+",00");
             System.out.print("Masukkan pilihan anda : ");
             pilihan1 = input.nextInt();
             //IF pilihan kedua = 1
             if (pilihan1 == 1) {
                 System.out.print("Masukkan banyak pesanan : ");
                 pesanan1 = input.nextInt();
                 count += harga[pilihan1]*pesanan1;
                 System.out.println("Total = Rp "+count+",00");
                 System.out.println("Ingin menambah pesanan?");
                 for (int i = 0; i < yn.length; i++) {
                     System.out.println(i+". "+yn[i]);
                 }
                 System.out.print("Masukkan pilihan anda : ");
                 yn1 = input.nextInt();
                 if (yn1 == 0) { //IF pilihan ketiga = 2
                     System.out.println("2. "+menu[2]+"  = Rp "+harga[2]);
                     System.out.print("Masukkan banyak pesanan : ");
                     pesanan2 = input.nextInt();
                     count += harga[2]*pesanan2;
                     System.out.println("Total  = Rp "+count+",00");
                 } else if (yn1 == 1) {
                     System.out.println("Total  = Rp "+count+",00");
                 }
             } //IF jika pilihan kedua = 2
             else if (pilihan1 == 2) {
                 System.out.print("Masukkan banyak pesanan : ");
                 pesanan1 = input.nextInt();
                 count += harga[pilihan1]*pesanan1;
                 System.out.println("Total = Rp "+count+",00");
                 System.out.print("Ingin menambah pesanan?");
                 for (int i = 0; i < yn.length; i++) {
                     System.out.println(i+". "+yn[i]);
                 }
                 System.out.print("Masukkan pilihan anda : ");
                 yn1 = input.nextInt();
                 if (yn1 == 0) {
                     System.out.println("1. "+menu[1]+"  = Rp "+harga[1]);
                     System.out.print("Masukkan banyak pesanan : ");
                     pesanan2 = input.nextInt();
                     count += harga[1]*pesanan2;
                     System.out.println("Total = Rp "+count+",00");
                 } else if (yn1 == 1) {
                     System.out.println("Total  = Rp "+count+",00");
                 }
             }
         } else if (yn0 == 1) {
             System.out.println("Total  = Rp "+count+",00");
         }
    } //IF pilihan pertama 1
     else if (pilihan0 == 1) {
         System.out.print("Masukkan banyak pesanan : ");
        pesanan0 = input.nextInt();
        count += harga[pilihan0]*pesanan0;
        System.out.println("Total = Rp "+count+",00");
        System.out.println("Ingin menambah pesanan? ");
         for (int i = 0; i < yn.length; i++) {
             System.out.println(i+". "+yn[i]);
         }
        System.out.print("Masukkan pilihan anda : ");
        yn0 = input.nextInt();
         if (yn0 == 0) {
             System.out.println("0. "+menu[0]+"  = Rp "+harga[0]+",00");
             System.out.println("2. "+menu[2]+"  = Rp "+harga[2]+",00");
             System.out.print("Masukkan pilihan anda : ");
             pilihan1 = input.nextInt();
             if (pilihan1 == 0) {
                 System.out.print("Masukkan banyak pesanan : ");
                 pesanan1 = input.nextInt();
                 count += harga[pilihan1]*pesanan1;
                 System.out.println("Total = Rp "+count+",00");
                 System.out.println("Ingin menambah pesanan?");
                 for (int i = 0; i < yn.length; i++) {
                     System.out.println(i+". "+yn[i]);
                 }
                 System.out.print("Masukkan pilihan anda : ");
                 yn1 = input.nextInt();
                 if (yn1 == 0) {
                     System.out.println("2. "+menu[2]+"  = Rp "+harga[2]);
                     System.out.print("Masukkan banyak pesanan : ");
                     pesanan2 = input.nextInt();
                     count += harga[2]*pesanan2;
                     System.out.println("Total  = Rp "+count+",00");
                 } else if (yn1 == 0) {
                     System.out.println("Total  = Rp "+count+",00");
                 }
             } 
             else if (pilihan1 == 2) {
                 System.out.print("Masukkan banyak pesanan : ");
                 pesanan1 = input.nextInt();
                 count += harga[pilihan1]*pesanan1;
                 System.out.println("Total = Rp "+count+",00");
                 System.out.println("Ingin menambah pesanan?");
                 for (int i = 0; i < yn.length; i++) {
                     System.out.println(i+". "+yn[i]);
                 }
                 System.out.print("Masukkan pilihan anda : ");
                 yn1 = input.nextInt();
                 if (yn1 == 0) {
                     System.out.println("0. "+menu[0]+"  = Rp "+harga[0]);
                     System.out.print("Masukkan banyak pesanan : ");
                     pesanan2 = input.nextInt();
                     count += harga[0]*pesanan2;
                     System.out.println("Total  = Rp "+count+",00");
             }
         } else if (yn0 == 1) {
             System.out.println("Total  = Rp "+count+",00");
         }
    } 
     else if (pilihan0 == 2) {
         System.out.print("Masukkan banyak pesanan : ");
        pesanan0 = input.nextInt();
        count += harga[pilihan0]*pesanan0;
        System.out.println("Total = Rp "+count+",00");
        System.out.println("Ingin menambah pesanan? ");
         for (int i = 0; i < yn.length; i++) {
             System.out.println(i+". "+yn[i]);
         }
        System.out.print("Masukkan pilihan anda : ");
        yn0 = input.nextInt();
         if (yn0 == 0) {
             System.out.println("0. "+menu[0]+"  = Rp "+harga[0]+",00");
             System.out.println("1. "+menu[1]+"  = Rp "+harga[1]+",00");
             System.out.print("Masukkan pilihan anda : ");
             pilihan1 = input.nextInt();
             if (pilihan1 == 1) {
                 System.out.print("Masukkan banyak pesanan : ");
                 pesanan1 = input.nextInt();
                 count += harga[pilihan1]*pesanan1;
                 System.out.println("Total = Rp "+count+",00");
                 System.out.println("Ingin menambah pesanan?");
                 for (int i = 0; i < yn.length; i++) {
                     System.out.println(i+". "+yn[i]);
                 }
                 System.out.print("Masukkan pilihan anda : ");
                 yn1 = input.nextInt();
                 if (yn1 == 0) {
                     System.out.println("0. "+menu[0]+"  = Rp "+harga[0]);
                     System.out.print("Masukkan banyak pesanan : ");
                     pesanan2 = input.nextInt();
                     count += harga[0]*pesanan2;
                     System.out.println("Total  = Rp "+count+",00");
                 } else if (yn1 == 1) {
                     System.out.println("Total  = Rp "+count+",00");
                 }
             }
         } else if (yn0 == 1) {
             System.out.println("Total  = Rp "+count+",00");
         }
     } //IF pilihan tidak ada
     else {
         System.out.println("Error!");
         System.out.println("Kode yang anda masukkan salah!");
         System.out.println("Harap ulang program!");
     }
    } //IF pilihan pertama = 2
     else if (pilihan0 == 2) {
         System.out.print("Masukkan banyak pesanan : ");
        pesanan0 = input.nextInt();
        count += harga[pilihan0]*pesanan0;
        System.out.println("Total = Rp "+count+",00");
        System.out.println("Ingin menambah pesanan? ");
         for (int i = 0; i < yn.length; i++) {
             System.out.println(i+". "+yn[i]);
         }
        System.out.print("Masukkan pilihan anda : ");
        yn0 = input.nextInt();
         if (yn0 == 0) {
             System.out.println("0. "+menu[0]+"  = Rp "+harga[0]+",00");
             System.out.println("1. "+menu[1]+"  = Rp "+harga[1]+",00");
             System.out.print("Masukkan pilihan anda : ");
             pilihan1 = input.nextInt();
             if (pilihan1 == 1) {
                 System.out.print("Masukkan banyak pesanan : ");
                 pesanan1 = input.nextInt();
                 count += harga[pilihan1]*pesanan1;
                 System.out.println("Total = Rp "+count+",00");
                 System.out.println("Ingin menambah pesanan?");
                 for (int i = 0; i < yn.length; i++) {
                     System.out.println(i+". "+yn[i]);
                 }
                 System.out.print("Masukkan pilihan anda : ");
                 yn1 = input.nextInt();
                 if (yn1 == 0) {
                     System.out.println("0. "+menu[0]+"  = Rp "+harga[0]);
                     System.out.print("Masukkan banyak pesanan : ");
                     pesanan2 = input.nextInt();
                     count += harga[0]*pesanan2;
                     System.out.println("Total  = Rp "+count+",00");
                 } else if (yn1 == 1) {
                     System.out.println("Total  = Rp "+count+",00");
                 }
             } else if (pilihan1 == 0) {
                 System.out.print("Masukkan banyak pesanan : ");
                 pesanan1 = input.nextInt();
                 count += harga[pilihan1]*pesanan1;
                 System.out.println("Total = Rp "+count+",00");
                 System.out.println("Ingin menambah pesanan?");
                 for (int i = 0; i < yn.length; i++) {
                     System.out.println(i+". "+yn[i]);
                 }
                 System.out.print("Masukkan pilihan anda : ");
                 yn1 = input.nextInt();
                 if (yn1 == 0) {
                     System.out.println("1. "+menu[1]+"  = Rp "+harga[1]);
                     System.out.print("Masukkan banyak pesanan : ");
                     pesanan2 = input.nextInt();
                     count += harga[1]*pesanan2;
                     System.out.println("Total  = Rp "+count+",00");
             }
             
         } else if (yn0 == 1) {
             System.out.println("Total  = Rp "+count+",00");
         }
     }
}
}
}