public class Car {
    String make,model;
    int year;
    public void drive()
    {

        System.out.println("The car is being driven.");
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}

