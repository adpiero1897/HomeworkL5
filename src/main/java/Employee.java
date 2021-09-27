public class Employee {
    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String fullName;
    private String position;
    private String email;
    private String phone_Number;
    private String salary;
    private int age;

    // 2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String fullName, String position, String email, String phone_Number, String salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone_Number = phone_Number;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void print_Employee_info(){
        System.out.print("ФИО: " + fullName);
        System.out.print("  Должность: " + position);
        System.out.print("  Email: " + email);
        System.out.print("  телефон: " + phone_Number);
        System.out.print("  Зарплата: " + salary);
        System.out.print("  Возраст: " + age);
        System.out.println();
    }

    // сделаем геттер для получения инфо о возрасте сотрудника извне (нужно для задания 5 вывести возраст 40+)
    public int getAge() {
        return age;
    }
}

