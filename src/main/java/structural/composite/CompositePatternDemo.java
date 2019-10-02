package structural.composite;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Ivan", "Head Sales", 20000);

        Employee headMarketing = new Employee("George", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Christopher", "Marketing", 10000);
        Employee clerk2 = new Employee("Ana", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Cathelin", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Emma", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
