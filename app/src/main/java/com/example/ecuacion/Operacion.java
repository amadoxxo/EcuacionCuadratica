package com.example.ecuacion;


public class Operacion {

    double varA = 0;
    double varB = 0;
    double varC = 0;
    double res = 0;


    public Operacion(double varA, double varB, double varC, double res) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
        this.res = res;

    }

    public double operacionMas(double varA, double varB, double varC) {

        this.res = (-(this.varB) + Math.sqrt(Math.pow(this.varB, 2) - (4*this.varA*this.varC))) / (2*this.varA);


        return this.res;
    }

    public double operacionMenos(double varA, double varB, double varC) {

        this.res = (-(this.varB) - Math.sqrt(Math.pow(this.varB, 2) - (4*this.varA*this.varC))) / (2*this.varA);


        return this.res;
    }
}
