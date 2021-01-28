package org.xpdojo.bank;

public class Account {

    double currentBalance = 0 ;

    public void deposit (double amountToDepoit) {
         currentBalance = currentBalance + amountToDepoit;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

}
