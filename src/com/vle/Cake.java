package com.vle;

/**
 * Created by Martha on 4/11/2017.
 */
public class Cake {
    int eggQuantity;
    SugarForCake sugar = new SugarForCake();
    ButterForCake butter = new ButterForCake();

    void setEggQuantity(int eggQuattity) {
        this.eggQuantity = eggQuattity;
    }
    int getEggQuantity(){

        return this.eggQuantity;
    }
    void setSugar(int Sugarquantity) {
        this.sugar.setSugarquantity(Sugarquantity);
        setButterquantity(Sugarquantity);
    }
    void setSugarobject(SugarForCake vle){
        this.sugar  = vle;

    }

    void setButterquantity(double Butterquantity) {

        this.butter.setButterquantity(Butterquantity);

    }
}
