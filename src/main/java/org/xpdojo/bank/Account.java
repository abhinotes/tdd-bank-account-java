package org.xpdojo.bank;

public class Account {

    int currentBalance = 0 ;

    public void deposit (int amountToDepoit) {
         currentBalance = currentBalance + amountToDepoit;
    }

    public float getCurrentBalance(){
        return currentBalance;
    }

}
