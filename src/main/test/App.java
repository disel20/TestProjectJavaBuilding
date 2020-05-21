package main.test;

public class App {
    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.publicName = "Test";
        testA.setPrivateName("Hi!");
        System.out.println(testA.getPrivateName());

        System.out.println(testA.getCountOfPrivateName());
        System.out.println(testA.getPrivateName());
        System.out.println(testA.getCountOfPrivateName());
    }
}
