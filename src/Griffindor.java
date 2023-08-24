public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String fullName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void compare(Griffindor griffindor) {
        if (nobility + honor + bravery > griffindor.getNobility() + griffindor.getHonor() + griffindor.getBravery()) {
            System.out.println(fullName + " лучший Гриффиндорец, чем " + griffindor.getFullName());
        } else {
            System.out.println(griffindor.getFullName() + " лучший Гриффиндорец, чем " + fullName);
        }

    }
    @Override
    public String toString() {
        return "Griffindor: имя и фамилия студента - " + fullName + ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance + ", благородство = " + nobility +
                ", честь = " + honor + ", храбрость = " + bravery + ".";
    }

    public static void printStudent(Griffindor griffindor) {

        System.out.println(griffindor.toString());
    }


}
