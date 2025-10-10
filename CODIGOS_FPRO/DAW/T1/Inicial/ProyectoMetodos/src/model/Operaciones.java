package model;

public class Operaciones {

    public void sumar(int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
        restar(5,7);
    }

    public void sumar(int op1, double op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
        restar(5,7);
    }

    public void sumar(double op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
        restar(5,7);
    }

    public void sumar(double op1, double op2){
        double resultado = op1+op2;
        System.out.println("El resultado de la suma es "+resultado);
        restar(5,7);
    }

    public void restar(int op1, int op2){
        int resultado = op1-op2;
        System.out.println("El resultado de la resta es "+resultado);
    }

}
