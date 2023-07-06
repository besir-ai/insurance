package YönetimSistemi;

import java.util.Scanner;
import java.util.SortedMap;

public class BussinessAddress implements Address
{
    private String cadde;
    private String sokak;
    private String kapinumarasi;
    Scanner input=new Scanner(System.in);



    @Override
    public void cadde() {
        System.out.println(" İş Cadde :");
         cadde=input.nextLine();

    }

    @Override
    public void sokak() {
        System.out.println(" İş Sokak :");
         sokak=input.nextLine();
    }

    @Override
    public void kapinumarasi() {
        System.out.println(" İş KapiNumarası :");
         kapinumarasi=input.nextLine();
    }
    @Override
    public String toString() {
        return "İş Adresi: " + cadde + ", " + sokak + ", " + kapinumarasi;
    }
}
