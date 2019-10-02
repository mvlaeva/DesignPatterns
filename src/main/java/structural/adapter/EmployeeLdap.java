package structural.adapter;

public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }

    public String getSurname() {
        return surname;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
