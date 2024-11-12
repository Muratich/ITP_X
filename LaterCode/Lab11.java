//package LaterCode;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//enum Drinks {
//    CocaCola(30), Pepsi(32), Bear(40), Sprite(100), TatarTea(1000);
//    Drinks(int value) {this.value = value;}
//    private final int value;
//    public int value() {return value;}
//}
//
//enum Money {
//    Quater(25), Half(50), Full(100);
//    Money(int value) {this.value = value;}
//    private final int value;
//    public int value() {return value;}
//}
//
//public class Lab11 {
//    Drinks drinks;
//    Money money;
//    System.out.println("Drinks list: ");
//    for (Drinks drink: Drinks.values()) {
//        System.out.println(drink.toString()+" Cost: "+Integer.toString(drink.value()));
//    }
//
//    Scanner scanner = new Scanner(System.in);
//    List<Drinks> numberOfBanknotes = new ArrayList<>(3);
//        for (Money moneyTemp: Money.values()) {
//        System.out.println("Print how much "+moneyTemp.toString()+" you want");
//        numberOfBanknotes.set(moneyTemp.ordinal(), scanner.nextInt());
//    }
//
//        System.out.println("Choose drink that you want to buy: ");
//    int choseIndex = scanner.nextInt();
//        if (choseIndex < Drinks.values().length) {
//        int cost = Drinks.values()[choseIndex].value();
//        System.out.println(cost);
//    } else {
//        System.out.println("Incorrect input");
//    }
//}
