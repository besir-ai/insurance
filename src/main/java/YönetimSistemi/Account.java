package YönetimSistemi;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Account extends User {

Scanner input=new Scanner(System.in);

    public void Showuserinfo(User user){
        ArrayList<Address> addresses = user.getAddresses();

        for (Address address:addresses){
            System.out.println(address.toString());

        }
        System.out.println("Müşteri bilgileri :");
        System.out.println("isim:\t"+user.getName()+
                "soyisim:\t"+user.getLastname()+
                "email:\t"+user.getEmail()+
                "şifre :\t"+user.getPassword()+
                "meslek\t"+user.getOccupation()+
                "yaş\t"+user.getAge()+
                "adres listesi:\t"+addresses+
                "sisteme son giriş tarihi"+user.getSistemeSonGiris());

    }


    enum AuthenticationStatus{
        Success,
        Fail

    }
    public void Idvepasswprdkontrol(Account account){

        AuthenticationStatus authenticationStatus=AuthenticationStatus.Success;
        AuthenticationStatus authenticationStatus1=AuthenticationStatus.Fail;

        if (authenticationStatus==AuthenticationStatus.Success){
            System.out.println("Müsteri bilgileri doğru!");

        }else {

            System.out.println("Müşteri bilgileri sistemde bulunmuyor !");

        }
    }



}

