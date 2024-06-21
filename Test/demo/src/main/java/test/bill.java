package main.java.test;

import java.time.LocalDate;
import java.util.Scanner;

import javax.xml.crypto.Data;

import com.example.*;

public class bill {
    public int unit;
    LocalDate lDate;

    public void Unit(){
        System.out.println("Enter the usage of unit : ");
        Scanner scanner = new Scanner(System.in);
        unit = scanner.nextInt();
        if (unit < 100) {
            int cal = unit * 4;
            System.out.println("To pay ammount is : "+cal);
            System.out.println(lDate.now());
        }else if(unit == 100 && unit < 200){
            int cal = unit * 5;
            System.out.println("To pay ammount is : "+cal);
            System.out.println(lDate.now()+);
        }else if (unit == 200 && unit < 300) {
            int cal = unit * 6;
            System.out.println("To pay ammount is : "+cal);
            System.out.println(lDate.now());
        }else{
            int cal = unit * 7;
            System.out.println("To pay ammount is : "+cal);
            System.out.println(lDate.now());
        }
    }

    public static void main(String[] args){
        bill bill = new bill();
        bill.Unit();
    }
}
