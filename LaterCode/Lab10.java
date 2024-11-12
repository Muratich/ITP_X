//package LaterCode;//package Legacy_Code;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//abstract class Creature {
//    protected String name = null;
//    protected boolean isAlive = false;
//
//    public Creature(String name, boolean isAlive) {
//        this.name = name;
//        this.isAlive = isAlive;
//    }
//
//    void ShoutName() {
//        if (name == null) {
//            System.out.println("EROR. NO NAME!");
//            return;
//        };
//        System.out.println(name);
//    }
//
//    abstract void Bear();
//    abstract void Die();
//}
//
//class Human extends Creature {
//    public Human(String name, boolean isAlive) {
//        super(name, isAlive);
//    }
//
//    @Override
//    void Bear() {
//        System.out.println("The Human "+name+" was born");
//    }
//
//    @Override
//    void Die() {
//        System.out.println("The Human "+name+" has died");
//    }
//}
//
//class Dog extends Creature {
//    public Dog(String name, boolean isAlive) {
//        super(name, isAlive);
//    }
//
//    @Override
//    void Bear() {
//        System.out.println("The Dog "+name+" was born");
//    }
//
//    @Override
//    void Die() {
//        System.out.println("The Dog "+name+" has died");
//    }
//
//    public void Bark() {
//        System.out.println("Bark!");
//    }
//
//}
//
//class Alien extends Creature {
//    public Alien(String name, boolean isAlive) {
//        super(name, isAlive);
//    }
//
//    @Override
//    void Bear() {
//        System.out.println("The Alien "+name+" was born");
//    }
//
//    @Override
//    void Die() {
//        System.out.println("The Alien "+name+" has died");
//    }
//}
//
//class Lab10 {
//    public static void main(String[] args) {
//        List<Creature> creatures = new ArrayList<>(3);
//
//        Human human1 = new Human("Oleg", true);
//        Dog dog1 = new Dog("Maxim", false);
//        Alien alien1 = new Alien("DSFJVLKSF", false);
//
//        creatures.add(human1);
//        creatures.add(dog1);
//        creatures.add(alien1);
//        //creatures.addAll(Arrays.asList(human1, dog1, alien1));
//
//        for (int i = 0; i < 3; i++) {
//            if (creatures.get(i) instanceof Dog) ((Dog) creatures.get(i)).Bark();
//            creatures.get(i).Bear();
//            creatures.get(i).Die();
//        }
//    }
//}
