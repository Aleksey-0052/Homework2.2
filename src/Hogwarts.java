import java.util.Objects;

public abstract class Hogwarts {
    protected String fullName;
    protected int powerOfMagic;
    protected int transgressionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {

        return fullName;
    }

    public int getPowerOfMagic() {

        return powerOfMagic;
    }

    public int getTransgressionDistance() {

        return transgressionDistance;
    }

    public void compare(Hogwarts hogwarts) {
        if (powerOfMagic + transgressionDistance > hogwarts.getPowerOfMagic() + hogwarts.getTransgressionDistance()) {
            System.out.println(fullName + " обладает большей мощностью магии, чем " + hogwarts.getFullName());
        } else {
            System.out.println(hogwarts.getFullName() + " обладает большей мощностью магии, чем " + fullName);
        }
    }

    @Override
    public String toString() {
        return "имя и фамилия студента - " + fullName + ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }
}








