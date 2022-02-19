//package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kg ,boy ;
        System.out.print("Boyunuzu metre cinsinden giriniz=");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz=");
        kg=input.nextDouble();
        double Vke;
        Vke=kg/(boy*boy);
        System.out.println("Vücut kitle endeksiniz="+Vke);

//KOŞUL İFADESİYLE SAĞLIK DURUMUNU BELİRTMEK İSTEDİM

        //Vke= (Vke<25) ? 0:1;
        //System.out.println("SAĞLIK DURUMUNUZ="+Vke);



    }
}

