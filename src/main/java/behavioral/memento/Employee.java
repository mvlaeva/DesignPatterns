package behavioral.memento;

//originator
public class Employee {

    private String name;
    private String address;
    private String phone;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento employee) {
        this.name = employee.getName();
        this.phone = employee.getPhone();
    }
}
