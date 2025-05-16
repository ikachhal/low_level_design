package lld.composite_pattern;

public class CompositeDemo {
    public static void run() {
        Developer developer1 = new Developer("Alice", 70000);
        Developer developer2 = new Developer("Bob", 80000);
        Designer designer1 = new Designer("Charlie", 60000);

        Manager manager = new Manager("Emily Brown", 100000);
        manager.add(developer1);
        manager.add(developer2);
        manager.add(designer1);

        Manager generalManager = new Manager("David Wilson", 300000);
        generalManager.add(manager);

        System.out.println("General Manager Details:");
        generalManager.showDetails();
        System.out.println("Total Salary: " + generalManager.getSalary());
    }
}
