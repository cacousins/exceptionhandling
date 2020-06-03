package bicycle;

//I dont like green bicycle
public class Bicycle {

    private String make;
    private String colour;

    public Bicycle(String make, String colour) throws InvalidColourException {
        this.make = make;
        if (colour.toLowerCase().equals("green")) {
            throw new InvalidColourException(colour);
        } else {
            this.colour = colour;
        }

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) throws InvalidColourException{
        if (colour.toLowerCase().equals("green")) {
            throw new InvalidColourException(colour);
        } else {
            this.colour = colour;
        }
    }

}
