package YönetimSistemi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class User
{


    Scanner input=new Scanner(System.in);
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String occupation;
    private int age;

   ArrayList<Address> addresses=new ArrayList<Address>();



    private Date sistemeSonGiris;

    public void musteribilgileri(){
        System.out.println("Lütfen bilgilerinizi giriniz");
        System.out.println("İsim :");
        name=input.nextLine();
        System.out.println("Soyisim:");
        lastname=input.nextLine();
        System.out.println("Email:");
        email=input.nextLine();
        System.out.println("Şifre");
        password =input.nextLine();
        System.out.println("Meslek");
        occupation=input.nextLine();
        System.out.println("Yaş");
        age=input.nextInt();
        System.out.println("Adres listesi");
        Address address=new HomeAddress();
        address.cadde();
        address.sokak();
        address.kapinumarasi();
        addresses.add(address);
        Address address1=new BussinessAddress();
        address1.cadde();
        address1.sokak();
        address1.kapinumarasi();
        addresses.add(address1);
        System.out.println("Kaydınız başarıyla tamamlandı.");
       /* System.out.println("son giriş tarihi");
        String date=input.nextLine();
       DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1=LocalDate.parse(date,formatter);
       */



    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses=addresses;


    }


    public Date getSistemeSonGiris() {
        return sistemeSonGiris;
    }

    public void setSistemeSonGiris(Date sistemeSonGiris) {
        this.sistemeSonGiris = sistemeSonGiris;
    }


    void Musteri(){
        while (true){
            System.out.println("Müşteri bilgileri");
            System.out.println("isim\n"+getName()+"Soyisim\n"+getLastname()+"email\n"+getEmail()+"şifre\n"+getPassword()+"meslek\n"+"yaş"+getAge()+"adres listesi"+"sisteme son giriş"+getSistemeSonGiris());
        }
    }
}
