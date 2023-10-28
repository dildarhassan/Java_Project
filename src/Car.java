interface GeneralBank{


    public  double getSavingInterestRate(double amount);


    double getFixedInterestRate(double amount);
}
class ICICIBank implements GeneralBank{


    @Override
    public double getSavingInterestRate(double amount) {
        return 4*amount;
    }


    @Override
    public double getFixedInterestRate(double amount) {
        return 8.5*amount;
    }
}

class KOTAKBank implements GeneralBank{


    @Override
    public double getSavingInterestRate(double amount) {
        return 6.0*amount;
    }

    @Override
    public double getFixedInterestRate(double amount) {
        return 9*amount;

    }


}




