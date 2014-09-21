import java.util.Scanner;
public class kalkulatorluas {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int bangundatar = 0;
        int x = 0;
        while (1>x){
            System.out.println("*********************************");
            System.out.println("* 1. Persegi                    *");
            System.out.println("* 2. Persegi Panjang            *");
            System.out.println("* 3. Segitiga                   *");
            System.out.println("*********************************");
            try{
                System.out.print  ("* pilih bangun datar = ");
                bangundatar = input.nextInt();
            }
            catch (Exception e){
                x = 2;
                System.out.println("* Program dihentikan secara paksa");
            }
            System.out.println("*********************************");
            switch(bangundatar){
                case 1:
                    int sisi = 0;
                    try{
                        System.out.print  ("* Input Sisi   = ");
                        sisi = input.nextInt();
                        persegi p = new persegi(sisi);
                        System.out.println("* luas persegi = "+ + p.luas());
                    }
                    catch (Exception e){
                        x = 2;
                        System.out.println("* Program dihentikan secara paksa");
                    }
                break;
                case 2:
                    int panjang = 0;
                    int lebar = 0;
                    try{
                        System.out.print  ("* Input Panjang        = ");
                        panjang = input.nextInt();
                        System.out.print  ("* Input Lebar          = ");
                        lebar = input.nextInt();
                        persegipanjang pp = new persegipanjang(panjang, lebar);
                        System.out.println("* luas persegi panjang = "+ + pp.luas());
                    }
                    catch (Exception e){
                        x = 2;
                        System.out.println("* Program dihentikan secara paksa");
                    }
                break;
                case 3:
                    int alas = 0;
                    int tinggi = 0;
                    try{
                        System.out.print  ("* Input Alas    = ");
                        alas = input.nextInt();
                        System.out.print  ("* Input Tinggi  = ");
                        tinggi = input.nextInt();
                        segitiga s = new segitiga(alas, tinggi);
                        System.out.println("* luas segitiga = "+ + s.luas());
                    }
                    catch (Exception e){
                        x = 2;
                        System.out.println("* Program dihentikan secara paksa");
                    }
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