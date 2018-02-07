package ooplap9;

public class classPersen {
        private String personID;
        private String name;
        private String Address;
        private String Job;

        public classPersen(String personID, String name, String address, String job) {
            this.personID = personID;
            this.name = name;
            this.Address = address;
            this.Job = job;
        }
        //toString()

    //getter and setter methods

    public String getpersonID() {
        return personID;
    }

    public void setpersonID(String personID) {
        this.personID = personID;
    }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.name = Address;
    }


    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.name = Job;
    }

    @Override
    public String toString() {
        return "classPersen{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Job='" + Job + '\'' +
                '}';
    }
}

