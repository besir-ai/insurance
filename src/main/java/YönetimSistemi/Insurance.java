package YönetimSistemi;

import java.util.Date;

public abstract class Insurance
{
    private String Sigortaismi;
    private double sigortaucreti;
    private Date baslangictarihi;

    private double hesaplama=(sigortaucreti*1000);


    public double calculate(){

        return (hesaplama);
    }
}
