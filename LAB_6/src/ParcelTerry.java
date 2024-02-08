public class ParcelTerry {

    private double paymoney;
    private double weight;
    private int typeservice;

    public ParcelTerry() {
        this.paymoney = 0;
        this.weight = 0;
        this.typeservice = 0;
    }

    public ParcelTerry(double paymoney, int typeservice) {
        this.paymoney = paymoney;
        this.typeservice = typeservice;
    }

    public void Setpaymoney(double m) {
        this.paymoney = m;
    }

    public void Setweight(double w) {
        this.weight = w;
    }

    public void gettypeservice(int t) {
        this.typeservice = t;
    }

    public double getPaymoney() {
        return this.paymoney;
    }

    public double getweight() {
        return this.weight;
    }

    public double gettypeservice() {
        return this.typeservice;
    }

    public double ParcelCalculator(int typeservice, double weight) {
       if (typeservice == 1) {
           if (weight <= 1) {
                return 30;
           } else if (weight <= 20) {
               return 30 + (weight - 1) * 10;
           } else {
               return 30 + 19 * 10 + (weight - 20) * 5;
           }
        } else if (typeservice == 2) {
            if (weight <= 1) {
                return 40;
            } else if (weight <= 20) {
                return 40 + (weight - 1) * 15;
            } else {
                return 40 + 19 * 15 + (weight - 20) * 10;
            }
        } else if (typeservice == 3) {
            if (weight <= 1) {
                return 50;
            } else if (weight <= 20) {
                return 50 + (weight - 1) * 20;
            } else {
                return 50 + 19 * 20 + (weight - 20) * 15;
            }
        }

        return 0;
    }

}
