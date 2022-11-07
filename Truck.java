/*
* Truck
*
* @author  Daniel Pawelko
* @version 1.0
* @since   2022-11-04
*/

/**
 * Extends Vehicle to Truck.
 */

public class Truck extends Vehicle {

    /**
    * This is the license plate.
    */
    private String licensePlate;

    /**
     * This is the truck constructor.
     *
     * @param color this is the color.
     * @param licensePlate this is the license plate.
     * @param maxSpeed this is the max speed.
     */
    public Truck(String color, String licensePlate, int maxSpeed) {
        super(color, maxSpeed);
        this.licensePlate = licensePlate;
    }

    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

	/**
     * This sets the air pressure.
     *
     * @return this sets the air pressure.
     */
    public int getAirPressure(int airPressureIn) {
        this.airPressure = airPressureIn;
    }

    /**
     * This gets the air pressure.
     *
     * @return this returns the air pressure.
     */
    public int setAirPressure() {
        return this.airPressure;
    }

    /**
     * This sets the licensePlate.
     *
     * @param newLicensePlate this is the new variable.
     */
    public void setLicensePlate(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * This is the air pressure breaking method.
     *
     * @param airPressure this is the air pressure.
     */
    public void airBrake(int brakePower, int brakeTime) {
        super.setSpeed(super.getSpeed() - brakePower * brakeTime -
        this.airPressure * brakeTime);

        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }

    /**
     * This is the status method.
     */
    public void status() {
        System.out.println(" → Speed: " + super.getSpeed());
        System.out.println(" → MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" → Color: " + super.getColor());
        System.out.println(" → licensePlate: " + this.getLicensePlate());
    }
}

