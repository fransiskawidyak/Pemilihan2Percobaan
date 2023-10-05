import java.util.Scanner;

public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("Masukkan 3 sudut segitiga: ");
        int sudut1 = input08.nextInt();
        int sudut2 = input08.nextInt();
        int sudut3 = input08.nextInt();
        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga sama sisi");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
                System.out.println("Segitiga sama kaki");
            } else {
                System.out.println("Segitiga sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}

