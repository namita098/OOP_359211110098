package ooplab7;

//1. car brand ,
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

    @Override
    public String toString() {
        return "Supercar{" +
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

    public String countryoforigin;
        //Constructor เม็ดตอดที่มีชื่อเดียวกับคลาส
        public Supercar(){}
    public Supercar  (String a,String b,String c,String d,String e){
            //assign data to properties
            this.carbrand = a;
            this.carcolor = b;
            this.carenginesize = c;
            this.maxspeed = d;
            this.countryoforigin = e;

    }//Supercar
}//class
