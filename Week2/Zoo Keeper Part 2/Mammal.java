public class Mammal {
    int energy = 100;

    int displayEnergy() {
        System.out.println("Energy level: " + energy + "\n");
        return energy;
    }
    public Mammal(int energy) {
        this.energy = energy;
    }
}