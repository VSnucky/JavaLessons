public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Мартьянов Валерий Дмитриевич", "-", "snuckyv@gmail.com", 981680320, 0, 19),
                new Employee("Иванчиков Иван Ивоновна", "Support", "Ivanchikov@gmail.com", 965321013, 10000, 22),
                new Employee("Никола Тесла Милутинович", "Crazy Scientist", "energyismylife@mail.ru", 101010, 1000000, 85),
                new Employee("Маск Илон Эрролович", "Crazy Marketer", "maskinspace@gmail.com", 800553535, 3000000, 49),
                new Employee("Кук Тим", "cook", "bestcake@gmail.com", 0235452, 90000, 59),
        };
        filteredEmployee(employees);
    }
    public static void filteredEmployee(Employee[]employees){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                employees[i].filterEmployee();
            }
        }
    }
}