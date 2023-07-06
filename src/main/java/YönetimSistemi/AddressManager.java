package YönetimSistemi;

import java.util.List;
import java.util.Scanner;

public class AddressManager
{
    Scanner ınput=new Scanner(System.in);


    static void adresEkleme(User user, Address address){
        System.out.println("2- Adres ekleme yapmak ");
        address.cadde();
        address.sokak();
        address.kapinumarasi();


        List<Address> addresses=user.addresses;
        addresses.add(address);
        System.out.println("Adres ekleme başarılı ");





    }
    static void adrescikarma(User user, Address address){
        System.out.println("3-Adres çıkarma yapmak");
        List<Address> addresses=user.addresses;
        addresses.remove(address);

    }
}
