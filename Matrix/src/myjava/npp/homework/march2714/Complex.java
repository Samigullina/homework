package myjava.npp.homework.march2714;

/**
 * Created on 27.03.14.
 */
public class Complex implements TrigonometricForm, ComplexActions, ComplexMath{
    private double a, b;

    public void setRe(double a) {
        this.a = a;
    }
    public void setIm(double b) {
        this.b = b;
    }

    public double getRe(){
        return a;
    }
    public double getIm(){
        return b;
    }

   public String toString() {
       if(b<0) return a+""+ b+"i";
       else return a+" + "+ b+"i";
    }

    public boolean equals(Complex complex){
        if(this.a==complex.a&&this.b==complex.b) return true;
        else return false;
    }

    public Complex(double a, double b){
        this.a=a;
        this.b=b;
    }
    public Complex(){}//?????

    //меняет число на сопряженное
    public void conjugate(){
        this.b=-1*b;
    }

    //прибавляет к данному числу переданное в параметре
   public void sum(Complex complex){
        this.a+=complex.a;
        this.b+=complex.b;
    }

    //вычитает из данного числа переданное
    public void difference(Complex complex){
        this.a-=complex.a;
        this.b-=complex.b;
    }

    //умножает данное число на действительное
    public void productOnNumber(double number){
        this.a*=number;
        this.b*=number;
    }

    //возвращает модуль
    public double getModule(){
        return Math.sqrt(a*a+b*b);
    }

    //возвращает аргумент
    public double getArg(){
        return Math.atan2(b,a);
    }
}
