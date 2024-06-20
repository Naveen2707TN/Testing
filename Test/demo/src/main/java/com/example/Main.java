package com.example;

import java.util.Scanner;

public class Main {

    public void Currency(){
        int indiaCurrency;
        int usa = 81;
        System.err.println("Enter the indian money in Rupee : ");
        Scanner scanner = new Scanner(System.in);
        indiaCurrency = scanner.nextInt();
        int cal = indiaCurrency * usa;
        System.err.println(cal);
    }

    public void Euro(){
        int indiaCurrency;
        int Euro = 89;
        System.err.println("Enter the indian money in Rupee : ");
        Scanner scanner = new Scanner(System.in);
        indiaCurrency = scanner.nextInt();
        int cal = indiaCurrency * Euro;
        System.err.println(cal);
    }

    public void Yen(){
        int indiaCurrency;
        float Euro = 0.53f;
        System.err.println("Enter the indian money in Rupee : ");
        Scanner scanner = new Scanner(System.in);
        indiaCurrency = scanner.nextInt();
        float cal = indiaCurrency * Euro;
        System.err.println(cal); 
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        System.err.println("Avaliable currency are : To check curreny value Type USA, EURO, YEN ");
        System.err.println("Enter the to check the currency value");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("USA")) {
            
        }else if (name.equals("EURO")) {
            
        }else if (name.equals("YEN")) {
            
        }
        switch (name.toUpperCase()) {
            case "USA":
                main.Currency();
                break;
        
            case "EURO":
                main.Euro();
                break;

            case "YEN" :
                main.Yen();
                break;
            default:
                System.out.println("Enter the currency name");
                break;
        }
    }
}