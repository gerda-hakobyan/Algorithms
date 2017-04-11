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

    void setSugarobject(SugarForCake vle){
        this.sugar  = vle;
    }
    SugarForCake getSugar(){
        return this.sugar;
    }

    void setButter(ButterForCake nba){
        this.butter = nba;
    }

    ButterForCake getButter(){
        return  this.butter;
    }
}
