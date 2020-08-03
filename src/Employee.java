public class Employee {
    protected String fullname;
    protected String post;
    protected String email;
    protected long phonenumber;
    protected int salary;
    protected int age;

    public Employee(String fullname, String post,
                    String email, long phonenumber,
                    int salary, int age) {
        this.fullname = fullname;
        this.post = post;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void filterEmployee(){
        System.out.println(String.format("ФИО: %s / Должность: %s / Email: %s / Номер: %d / Зарплата: %d / Возраст: %d", fullname, post, email, phonenumber, salary, age));
    }
}