package main.test;

public class TestA {
    public String publicName;
    private String privateName;
    private int countOfPrivateName = 0;

    public String getPrivateName() {
        countOfPrivateName++;
        printToDo();
        return privateName;
    }

    private void printToDo() {
        System.out.println("To do");
    }

    public void setPrivateName(String privateName) {
        System.out.println("Before set " + privateName);
        this.privateName = privateName;
        System.out.println("After set " + privateName);
    }

    public int getCountOfPrivateName() {
        return countOfPrivateName;
    }
}
