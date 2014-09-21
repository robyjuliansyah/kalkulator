import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int operasi = 0;
        int satu = 0;
        int dua = 0;
        int x = 0;
        while (1>x){
            System.out.println("*********************************");
            System.out.println("* 1. X (kali)                   *");
            System.out.println("* 2. / (bagi)                   *");
            System.out.println("* 3. + (tambah)                 *");
            System.out.println("* 4. - (kurang)                 *");
            System.out.println("*********************************");
            try{
                System.out.print  ("* Input Angka 1        = ");
                satu = input.nextInt();
                System.out.print  ("* pilih operasi hitung = ");
                operasi = input.nextInt();
                System.out.print  ("* Input Angka 2        = ");
                dua = input.nextInt();
            }
            catch (Exception e){
                x = 2;
                System.out.println("* Program dihentikan secara paksa");
            }
            System.out.println("*********************************");
            switch(operasi){
                case 1:
                    perkalian kali = new perkalian(satu, dua);
                    System.out.println("* hasil perkalian = "+ + kali.hasilhitung());
                break;
                case 2:
                    pembagian bagi = new pembagian(satu, dua);
                    System.out.println("* hasil pembagian = "+ + bagi.hasilhitung());
                break;
                case 3:
                    penjumlahan jumlah = new penjumlahan(satu, dua);
                    System.out.println("* hasil penjumlahan = "+ + jumlah.hasilhitung());
                break;
                case 4:
                    pengurangan kurang = new pengurangan(satu, dua);
                    System.out.println("* hasil pengurangan = "+ + kurang.hasilhitung());
                break;
                default:
                    System.out.println("salah input");
                break;
            }
            System.out.println("*********************************");
            System.out.println("");
        }
    }
}