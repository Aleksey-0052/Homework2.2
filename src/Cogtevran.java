public class Cogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Cogtevran(String fullName, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public void compare(Cogtevran cogtevran) {
        if (mind + wisdom + wit + creation > cogtevran.getMind() + cogtevran.getWisdom() + cogtevran.getWit() + cogtevran.getCreation()) {
            System.out.println(fullName + " лучший Когтеврановец, чем " + cogtevran.getFullName());
        } else {
            System.out.println(cogtevran.getFullName() + " лучший Когтеврановец, чем " + fullName);
        }
    }

    @Override
    public String toString() {
        return "Cogtevran: " + super.toString() + ", ум = " + mind + ", мудрость = " +
                wisdom + ", остроумие = " + wit + ", творчество = " + creation + ".";
    }

}
