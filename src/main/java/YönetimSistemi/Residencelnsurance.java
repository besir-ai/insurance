package YönetimSistemi;

public class Residencelnsurance extends Insurance
{
    @Override
    public double calculate() {
        return super.calculate()*3;
    }
}
