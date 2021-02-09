package com.company;

public class Token {
    private int counterNumber;
    private static int tokenNumber;
    private String serviceType;

    public Token(String serviceType) {
        this.serviceType = serviceType;
        tokenNumber++;
        switch (serviceType){
            case "Deposit":
                this.counterNumber = 3;
                break;
            case "Withdraw":
                this.counterNumber = 2;
                break;
            case "Cheque deposit":
                this.counterNumber = 1;
                break;
            case "Others":
                this.counterNumber = 4;
                break;
        }
    }

    public int getCounterNumber() {
        return counterNumber;
    }

    public static int getTokenNumber() {
        return tokenNumber;
    }

    public String getServiceType() {
        return serviceType;
    }
}
