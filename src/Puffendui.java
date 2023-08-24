public class Puffendui extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String fullName, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {

        return industriousness;
    }

    public int getLoyalty() {

        return loyalty;
    }

    public int getHonesty() {

        return honesty;
    }

    public void compare(Puffendui puffendui) {
        if (industriousness + loyalty + honesty > puffendui.getIndustriousness() + puffendui.getLoyalty() + puffendui.getHonesty()) {
            System.out.println(fullName + " лучший Пуффендуец, чем " + puffendui.getFullName());
        } else {
            System.out.println(puffendui.getFullName() + " лучший Пуффендуец, чем " + fullName);
        }
    }

    // @Override
    // public String toString() {
        // return "Puffendui: имя и фамилия студента - " + fullName + ", сила магии = " + powerOfMagic
                // + ", расстояние трансгрессии = " + transgressionDistance + ", трудолюбие = " + industriousness
                // + ", верность = " + loyalty + ", честность = " + honesty + ".";
    // }

    public static void printStudent(Puffendui puffendui) {

        System.out.println("Puffendui: имя и фамилия студента - " + puffendui.getFullName() + ", сила магии = " +
                puffendui.getPowerOfMagic() + ", расстояние трансгрессии = " + puffendui.getTransgressionDistance() +
                ", трудолюбие = " + puffendui.getIndustriousness() + ", верность = " + puffendui.getLoyalty() +
                ", честность = " + puffendui.getHonesty() + ".");
    }
}
