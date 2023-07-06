package YönetimSistemi;

public class CarInsurance extends Insurance
{
    @Override
    public double calculate() {
        return super.calculate()*5;
    }
}
