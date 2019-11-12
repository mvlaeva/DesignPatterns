package behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();

        employee.setName("John Snow");
        employee.setAddress("111 Main Str");
        employee.setPhone("333-444-5555");

        System.out.println("Employee before save: " + employee);

        caretaker.save(employee);

        employee.setPhone("123-123-1111");
        caretaker.save(employee);

        System.out.println("Employee after changed phone number save: " + employee);

        employee.setPhone("213-213-2222"); // havent called save!
        caretaker.revert(employee);

        System.out.println("Reverts to last save point: " + employee);

        caretaker.revert(employee);

        System.out.println("Reverted to original: " + employee);
    }
}
