package com.itschool;

public class Main {

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5));  // вызов статического метода (вычисление без использования рекурсии)

	//System.out.println(Factorial.factorialR(5));  // вызов нестатического метода класса без создания объекта запрещён
	    
        Factorial fact = new Factorial();
        System.out.println(fact.factorialR(5));  // вызов нестатического метода (вычисление с использованием рекурсии)
    }
}
