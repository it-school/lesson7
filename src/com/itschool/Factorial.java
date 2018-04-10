package com.itschool;

public class Factorial {
    // 5! = 5*4!
    // 4! = 4*3!
    //...
    // 0! = 1
    //public static int k=0;


    public int factorialR(int n)
    {
        //System.out.println(k++);
        if (n == 0)
            return 1;
        return  n*factorialR(n-1);
    }

    public static int factorial(int n)
    {
        int k = 1;

        for (int i = 2; i <= n; i++)
            k*=i;

        return k;
    }

}
