package HW5;

public class Persons {
    String firstName;
    String lastName;
    Persons nextPosition;
    int pos;

    Persons(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Persons getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(Persons nextPosition) {
        this.nextPosition = nextPosition;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
