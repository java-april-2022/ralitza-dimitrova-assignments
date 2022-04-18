public class Bat extends Mammal {

    public Bat() {
        super (300);
    }

    public void fly() {
        System.out.println("Whoosh~ The bat flew away!");
        energy -= 50;
    }

    public void eatHumans() {
        System.out.println("CRUNCH! The bat ate a human :(");
        energy += 25;
    }

    public void attackTown() {
        System.out.println("Scream-crackle-pop! The bat attacked a town.");
        energy -= 100;
    }

    public void Energy() {
        displayEnergy();
    }
}