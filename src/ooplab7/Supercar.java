package ooplab7;

///1. car brand ,
// 2.car color,
// 3.car engine size,
// 4.max speed
// 5.country of origi

public class Supercar {
    //properties of Supercar
    private String carbrand ;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;

    public Supercar(){}
    public Supercar (String brand, String color, String size, String speed, String origin){
        this.carbrand = brand;
        this.carcolor = color;
        this.carenginesize = size;
        this.maxspeed = speed;
        this.countryoforigin = origin;

    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carenginesize='" + carenginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforigin='" + countryoforigin + '\'' +
                '}';
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }
    public String getSuperCarInfo(){
        return getSuperCarInfo ();
    }

}//class