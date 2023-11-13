public class Car
{
    private double fuel;
    private double drive;
    private double remainingFuel;
    private double miles;
    public double m;
    public double r;

    //==========================================

    public Car(double mpg) {
        miles = mpg;
        fuel = 0;
        drive = 0;
    }

    public double printDis(double d) {
        return drive = d;
    }

    public void drive(double distance) {
        double newDrive = drive + distance;
        drive = newDrive;
    }

    public void addGas(double f) {
        double newGas = fuel + f;
        fuel = newGas;
    }

    //==========================================

    public double getGas() {
        remainingFuel = drive / miles;
        return fuel - remainingFuel;
    }

    public double estimateTrip() {
        m = fuel * miles;
        return m;
    }

    public double restTrip() {
        r = fuel - remainingFuel;
        r = r * miles;
        return r;
    }

    public double drive() {
        return drive;
    }
    
    public double addGas() {
    	return fuel;
    }
}