public class Person {

    private String name;
    private int wealth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public Person(String name, int wealth) {
        super();
        this.name = name;
        this.wealth = wealth;
    }

    public Person() {

    }
}


