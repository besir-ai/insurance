package YönetimSistemi;

public class Travelınsurance extends Insurance
{
    @Override
    public double calculate() {
        return super.calculate()*4;
    }
}
