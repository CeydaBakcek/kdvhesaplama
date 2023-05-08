import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        double tutar,kdvOran=0.18,kdvliTutar,kdvTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz:");
        tutar= input.nextDouble();
        kdvTutar= tutar * kdvOran;
        kdvliTutar= tutar + kdvTutar;

        System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDV oranı:" +kdvOran);
        System.out.println("KDV Tutarı:"+kdvTutar);
        System.out.println("KDV'Lİ Tutar:"+kdvliTutar);
    }
}