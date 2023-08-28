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
    @Override
    public String toString() {
        return "Slizerin: " + super.toString() + ", хитрость = " + cunning + ", решительность = "
                + determination + ", амбициозность = " + ambition + ", находчивость = " +
                resourcefulness + ", жажда власти = " + desireForPower + ".";
    }


}
