import java.util.Scanner;
public class Tugas1_27 {

    public static int hitungIteratif(int[] data) {
        int total = 0;
        for (int angka : data) {
            total += angka;
        }
        return total;
    }
    public static int prosesRekursif(int[] data, int angka) {
        if (angka < 0) {
            return 0;
        }
        return data[angka] + prosesRekursif(data,angka - 1);
    }
    public static int hitungRekursif(int[] data) {
        return prosesRekursif(data, data.length - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = input.nextInt();
        
        int[] dataAngka = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            dataAngka[i - 1] = input.nextInt(); 
        }
                
        int hasilIteratif = hitungIteratif(dataAngka);
        int hasilRekursif = hitungRekursif(dataAngka);

        System.out.println("Total dari " + N + " angka yang dimasukkan secara Iteratif & Rekursif adalah: " + hasilIteratif);
      
        
    }
}