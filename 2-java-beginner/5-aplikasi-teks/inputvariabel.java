import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputvariabel {
    public static void main(String[] args) throws IOException {

        System.out.println("Muhammad Abiyyu - 13119957");

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nama: ");
        String nama = buff.readLine();
        System.out.print("Kelas: ");
        String kelas = buff.readLine();
        System.out.print("nilai UTS: ");
        Integer uts = Integer.parseInt(buff.readLine());
        System.out.print("nilai UAS: ");
        Integer uas = Integer.parseInt(buff.readLine());

        // Scanner scan = new Scanner(System.in);

        // System.out.print("Nama: ");
        // String nama = scan.nextLine();
        // System.out.print("Kelas: ");
        // String kelas = scan.nextLine();
        // System.out.print("nilai UTS: ");
        // Integer uts = scan.nextInt();
        // System.out.print("nilai UAS: ");
        // Integer uas = scan.nextInt();

        // scan.close();

        System.out.println("==========================");
        System.out.printf("Nama\t\t: %s\n", nama);
        System.out.printf("Kelas\t\t: %s\n", kelas);
        System.out.printf("Nilai UTS\t: %d\n", uts);
        System.out.printf("Nilai UAS\t: %d\n", uas);
        System.out.printf("Hasil\t\t: %d\n", (uts + uas) / 2);
    }
}
