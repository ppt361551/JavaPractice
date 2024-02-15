package JavaSkill;

public class NullPointerException {
    public static void main(String[] args) {
        Person wilson = new Person("Wilson", 25);
        Person grace = new Person("Grace", 21);
        wilson.setSpouse(grace);
        grace.setSpouse(wilson);
        wilson.talk();
    }
}
