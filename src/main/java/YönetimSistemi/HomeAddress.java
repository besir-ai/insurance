package YönetimSistemi;

import java.util.Scanner;

public class HomeAddress implements Address
{
    Scanner input=new Scanner(System.in);



    private String cadde;
    private String sokak;
    private String kapinumarasi;



    @Override
    public void cadde() {
        System.out.println(" Ev Cadde :");
         cadde=input.nextLine();

    }

    @Override
    public void sokak() {
        System.out.println(" Ev Sokak :");
         sokak=input.nextLine();
    }

    @Override
    public void kapinumarasi() {
        System.out.println(" Ev KapiNumarası :");
         kapinumarasi=input.nextLine();
    }
    @Override
    public String toString(){
        return "Ev Adresi:"+cadde+","+sokak+","+kapinumarasi;
    }



}
