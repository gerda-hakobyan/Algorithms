package com.vle;

public class Main {

    public static void main(String[] args) {
      Cake myCake = new Cake();
        int eggnoski = 5;
        myCake.setEggQuantity(eggnoski);


        int sugarq = 2500;
        myCake.setSugar(sugarq);

        double butterkg = 1.2;
        myCake.setButterquantity(butterkg);



        System.out.println("my caki egger@ " + myCake.eggQuantity);
        System.out.println("my caki miji sugari qanak@ " + myCake.sugar.quantity);
        System.out.println("my caki miji butteri qanak@ " + myCake.butter.quantity);

      Cake myCakeCopy = myCake;

    }
}
