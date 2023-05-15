import java.time.LocalDate;

public class Employee {
    Integer id;
    String name;
    String city;
    String address;
    LocalDate birth;
    Double salary;

    public Employee() {
    }

    public Employee(
            String name, 
            String city, 
            String address, 
            LocalDate birth, 
            Double salary
        ) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }

    public Employee(Integer id, String name, String city, String address, LocalDate birth, Double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }
    
}
