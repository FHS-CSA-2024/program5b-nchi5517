import java.lang.Math;
public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;

    
    public Car(){
        carName="";
        milesDriven=0;
        gallonsUsed=0;
    }
    public Car(String name, double miles, double gallons){
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }
    public String getCarName(){
        return carName;
    }
    public void setCarName(String name){
        carName = name;
    }
    public double getMilesDriven(){
        return milesDriven;
    }
    public void setMilesDriven(double miles){
        milesDriven = miles;
    }
    public double getGallonsUsed(){
        return gallonsUsed;
    }
    public void setGallonsUsed(double gallons){
        gallonsUsed = gallons;
    }
    public double calculateAverage(){
        double milesPerGallon = (double) Math.round((milesDriven/gallonsUsed)*10)/10;
        
        return (milesPerGallon);
    }
    public String toString(){
        return carName+" averaged "+calculateAverage()+" m/g";
    }
}


