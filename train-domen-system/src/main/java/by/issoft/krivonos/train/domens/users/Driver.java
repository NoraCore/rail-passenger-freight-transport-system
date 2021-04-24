package by.issoft.krivonos.train.domens.users;

import java.util.Date;

public class Driver extends User {
    private Date dateOfBirth;
    private String driverCategory;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDriverCategory() {
        return driverCategory;
    }

    public void setDriverCategory(String driverCategory) {
        this.driverCategory = driverCategory;
    }

    @Override
    public String toString() {
        return "Driver{" +
                super.toString() +
                "dateOfBirth=" + dateOfBirth +
                ", driverCategory='" + driverCategory + '\'' +
                '}';
    }
}
