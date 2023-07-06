package YönetimSistemi;

public class HealthInsurance extends Insurance
{

    @Override
    public double calculate() {
        return super.calculate()*2;
    }
}
