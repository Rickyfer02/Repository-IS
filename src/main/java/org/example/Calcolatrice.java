package org.example;

public class Calcolatrice {
    private int a, b;

    public Calcolatrice(){
        this.a = a;
        this.b = b;
    }

    public int addizione(int a, int b){
        return a+b;
    }

    public int moltiplicazione(int a, int b){
        return a*b;
    }

    public int sottrazione(int a, int b){
        return a-b;
    }

    public double divisione(int a, int b){
        if(b!=0){
            return a/b;
        }
        else return 0;
    }
}
