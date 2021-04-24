package by.issoft.krivonos.train.domens.users;

import java.util.Objects;

public class User {
    private String lastname;
    private String firstname;
    private String secondname;
    private String passport;
    private String password;

    public User() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(lastname, user.lastname) && Objects.equals(firstname, user.firstname) && Objects.equals(secondname, user.secondname) && Objects.equals(passport, user.passport) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, secondname, passport, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", passport='" + passport + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
