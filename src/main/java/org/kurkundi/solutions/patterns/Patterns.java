package org.kurkundi.solutions.patterns;

public class Patterns {

    public void pattern1(int n){
        System.out.println("*******Pattern 1*******");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        System.out.println("*******Pattern 2*******");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        public void pattern3(int n){
            System.out.println("*******Pattern 3*******");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }

        public void pattern4(int n){
            System.out.println("*******Pattern 4*******");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

    public void pattern5(int n){
        System.out.println("*******Pattern 5*******");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern6(int n){
        System.out.println("*******Pattern 6*******");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        System.out.println("*******Pattern 7*******");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern8(int n){
        System.out.println("-------Pattern 8-------");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n - (2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern10(int n){
        System.out.println("-------Pattern 10-------");
        for (int i = 1; i <= 2*n-1; i++) {
            int stars=i;
            if(i>n)
                stars=2*n-i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
