import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    /**
     * kelas yang mempresentasikan username dan password a
     */
    public static void main(String[] args) {
        String username = "wawan";
        String password = "oneone1216";

        /**
         * @param username untuk mendeklarasikan nilai nama yang diperiksa pada sistem login
         * @param password untuk mendeklarasikan nilai pasword uang dieriksa pada sistem login
         */

        String namaUser;
        String passwordUser;
        Scanner keyboard = new Scanner(in);

        /**
         * @param namaUser untuk mendeklarasikan nilai nama yang diberikan oleh user
         * @param passwordUser untuk mendeklarasikan nilai pasword yang diberikan oleh user
         */

        out.println("Selamat Datang di System Login");
        out.print("Masukkan username : ");
        namaUser = keyboard.nextLine();
        out.print("Masukkan Password : ");
        passwordUser = keyboard.nextLine();

        /**
         * pada sistem diatas difungsikan untuk dimana user memasukkan nilai username dan passwordUser.
         * dimana user memasukkan nilai setelah perinntah dari program untuk memasukan nilai
         */

        if (namaUser.equals(username) && (passwordUser.equals(password))){
            out.println("Anda telah melakukan login");
        } else {
            out.println("Akun anda tidak terdaftar didalam sistem kami");
        }

        /**
         * @param if untuk mengecek atau memeriksa nilai yang diberi oleh user, dan apabila memenuhi syarat, akan menghasilkan "anda telah melakukan login"
         * @param else untuk menghasilkan "akun anda tidak terdaftar didalam sistem kami" apabila syarat tidak terpenuhi
         */
    }
}