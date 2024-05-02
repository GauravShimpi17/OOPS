package com.tech.bank;


import java.util.Scanner;

public class Axis extends Bank{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Axis axis = new Axis();

        while (true){
            System.out.println("\n1. Deposit \n2. Withdraw \n3. Close");

            System.out.println("Enter your choice ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit " );
                    axis.setAmount(sc.nextInt());
                    axis.deposite();
                    System.out.println("Your Balance is " + axis.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw " );
                    axis.setAmount(sc.nextInt());
                    if(axis.getAmount()>axis.getBalance()){
                        System.out.println("Insufficient Balance");
                        break;
                    }else{
                        axis.withdraw();
                        System.out.println("Your Balance is " + axis.getBalance());
                    }
                    break;
                case 3:
                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);
            }
        }

//        System.out.println("Your Balance is " + axis.getBalance());




    }
}