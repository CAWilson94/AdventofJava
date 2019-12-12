public class RocketModule {


    public int calculateFuelAmount(int mass){
        mass = (int) Math.floor(mass/3);
        return mass - 2;
    }

    public static void main(String[] args) {
        // fuel based on mass
        // round_down(mass / 3) - 2
    }
}
