public class Car {
    private String Brand;
    private String modelYear;
    private String color;
    private double engine;



    public String getBrand(){
        return Brand.toUpperCase();
    }

    public void setBrand(String brnd){
        Brand = brnd;
    }

    public String getModelYear(){
        return modelYear.toUpperCase();
    }

    public void setModelYear(String year){
        modelYear = year;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String clr){
        color = clr;
    }


    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


    public String getFullInfo(){
        return getBrand() + " | " + getModelYear() + " | " + getColor() + " | ";
    }



    public  double getIntInfo(){
        return getEngine();
    }


}