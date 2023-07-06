package YönetimSistemi;

import java.security.InvalidParameterException;
import java.util.Scanner;
import java.util.WeakHashMap;

public class musterimain
{
    User user=new User();
    Account account=new Account()

    {
        @Override
        public void Showuserinfo(User user) {
            super.Showuserinfo(user);
        }

        @Override
        public void Idvepasswprdkontrol(Account account) {
            super.Idvepasswprdkontrol(account);
        }
    };
    sifredogrulama sifredogrulama=new sifredogrulama();

    Scanner input=new Scanner(System.in);
    public void musterisorgu(){
        AddressManager addressManager=new AddressManager();
        while (true){
            System.out.println("SİGORTA YÖNETİM SİSTEMİNE HOŞGELDİNİZ");
            System.out.println("1-SİGN UP");
            System.out.println("2-LOGIN");
            System.out.println("3- Adres işlemleri");

            int secim=input.nextInt();
            switch (secim){
                case 1:
                    user.musteribilgileri();
                    break;
                case 2:

                    try {
                        sifredogrulama.dogrulama(user);
                        account.Showuserinfo(user);


                        break;
                    }catch (InvalidParameterException e){
                        sifredogrulama.dogrulama(user);
                    }
                    break;
                case 3:
                    System.out.println("1- Adres ekleme");
                    System.out.println("2- Adres çıkarma");
                    int adresSecim= input.nextInt();
                    switch (adresSecim){
                        case 1:
                            System.out.println("1- Ev adresi ekleme");
                            System.out.println("2- iş adresi ekleme");
                            int adreseklemesecim= input.nextInt();
                            Address address;
                            switch (adreseklemesecim){
                                case 1:
                                    address=new HomeAddress();
                                    AddressManager.adresEkleme(user,address);
                                    break;
                                case 2:
                                    address=new BussinessAddress();
                                    AddressManager.adresEkleme(user,address);
                                    break;
                                default:
                                    System.out.println("Geçersiz seçim !");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("1-Ev adresi çıkarma");
                            System.out.println("2-İş adresi çıkarma");
                            int adrescikarma=input.nextInt();
                            Address removeAdress;
                            switch (adrescikarma){
                                case 1:
                                    removeAdress= (Address) user.getAddresses().stream().filter(address1 -> address1 instanceof HomeAddress).findFirst().orElse(null);
                                    if (removeAdress!=null){
                                        AddressManager.adrescikarma(user,removeAdress);
                                    }else {
                                        System.out.println("Ev adresi Bulunamadı");
                                    }
                                    break;
                                case 2:
                                    removeAdress = user.getAddresses().stream()
                                            .filter(address1 -> address1 instanceof BussinessAddress)
                                            .findFirst()
                                            .orElse(null);
                                    if (removeAdress != null) {
                                        addressManager.adrescikarma(user,removeAdress);

                            }






            }
        }
    }}}

    public static void main(String[] args) {
        musterimain musterimain=new musterimain();
        musterimain.musterisorgu();
    }
}
