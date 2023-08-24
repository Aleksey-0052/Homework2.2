public class Slizerin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;

    public Slizerin(String fullName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int desireForPower) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    public int getCunning() {

        return cunning;
    }

    public int getDetermination() {

        return determination;
    }

    public int getAmbition() {

        return ambition;
    }

    public int getResourcefulness() {

        return resourcefulness;
    }

    public int getDesireForPower() {

        return desireForPower;
    }
    public void compare(Slizerin slizerin) {
        if (cunning + determination + ambition + resourcefulness + desireForPower > slizerin.getCunning() + slizerin.getDetermination() + slizerin.getAmbition() + slizerin.getResourcefulness() + slizerin.getDesireForPower()) {
            System.out.println(fullName + " лучший Слизеринец, чем " + slizerin.getFullName());
        } else {
            System.out.println(slizerin.getFullName() + " лучший Слизеринец, чем " + fullName);
        }
    }
    // @Override
    // public String toString() {
        // return "Slizerin: имя и фамилия студента - " + fullName + ", сила магии = " + powerOfMagic
                // + ", расстояние трансгрессии = " + transgressionDistance + ", хитрость = " + cunning
                // + ", решительность = " + determination + ", амбициозность = " + ambition +
                // ", находчивость = " + resourcefulness + ", жажда власти = " + desireForPower + ".";
    // }

    public static void printStudent(Slizerin slizerin) {

        System.out.println("Slizerin: имя и фамилия студента - " + slizerin.getFullName() + ", сила магии = " +
                slizerin.getPowerOfMagic() + ", расстояние трансгрессии = " + slizerin.getTransgressionDistance() +
                ", хитрость = " + slizerin.getCunning() + ", решительность = " + slizerin.getDetermination() +
                ", амбициозность = " + slizerin.getAmbition() + ", находчивость = " + slizerin.getResourcefulness() +
                ", жажда власти = " + slizerin.getDesireForPower() + ".");
    }
}
