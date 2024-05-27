/*
Создать справочник сотрудников.
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер;
Номер телефона;
Имя;
Стаж.
Добавить метод, который ищет сотрудника по стажу (может быть список).
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список).
Добавить метод, который ищет сотрудника по табельному номеру.
Добавить метод добавления нового сотрудника.
 */
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEmployee(new Employee(1, 89124567648L, "Ivan", 5));
        phoneBook.addEmployee(new Employee(2, 89234567648L, "Inna", 2));
        phoneBook.addEmployee(new Employee(3, 89124567612L, "Anna", 2));
        phoneBook.addEmployee(new Employee(4, 89124599648L, "Max", 5));
        phoneBook.addEmployee(new Employee(5, 89124567612L, "Anna", 5));
        phoneBook.addEmployee(new Employee(6, 89124500648L, "Alexandr", 9));

        System.out.println(phoneBook.findFromExp(5));
        System.out.println(phoneBook.findFromName("Anna"));
        System.out.println(phoneBook.findFromId(6));
        System.out.println(phoneBook.findFromId(9));
    }
}
