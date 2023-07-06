package YönetimSistemi;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Scanner;

public class sifredogrulama
{

    User user=new User();
    Scanner input=new Scanner(System.in);
    String Kullanici;
    String Sifre;

    public String getKullanici() {
        return Kullanici;
    }

    public void setKullanici(String kullanici) {
        Kullanici = kullanici;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String sifre) {
        Sifre = sifre;
    }

    public void dogrulama(User user){
        System.out.println("Lütfen Kullanıcı adı ve şifrenizi giriniz");
        System.out.println("-----------------------------------------------");
        System.out.println("Kullanıcı Email :");
        Kullanici=input.nextLine();
        System.out.println("Şifre :");
        Sifre=input.nextLine();

        while (true){

                if (user.getPassword().equals(getSifre())&&user.getEmail().equals(getKullanici())){
                    System.out.println("Sisteme giriş başarılı ");


                }else {
                    System.out.println("Yanlış Kullanıcı bilgisi !!");


            }
                break;


        }

    }
}
