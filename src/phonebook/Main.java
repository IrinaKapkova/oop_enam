package phonebook;


public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.addPhone("Петр Петров", "89053784660");
        phonebook.addPhone("Петр Петров", "89053784660");
        phonebook.addPhone("Иван Иванов", "89273784660");
        phonebook.addPhone("Сидор Сидоров", "89993784660");
        phonebook.addPhone("Мария Муравьева", "89653784660");
        phonebook.addPhone("Петр Семенов", "89823784660");
        phonebook.addPhone("Семен Петров", "89173784660");
        phonebook.addPhone("Илья Ильин", "89243784660");
        phonebook.addPhone("Савва Ложков", "89053784345");
        phonebook.addPhone("Дарья Петрова", "89053784678");
        phonebook.addPhone("Яна Левина", "89053784987");
        phonebook.addPhone("Ксения Октава", "89054384660");
        phonebook.addPhone("Галина Владова", "89053773460");
        phonebook.addPhone("Андрей Сапранов", "89549784660");
        phonebook.addPhone("Марат Козлов", "89812784660");
        phonebook.addPhone("Елена Шаркова", "89234784660");
        System.out.println(phonebook);
        phonebook.removePhone("Андрей Сапранов");
        System.out.println(phonebook);


    }
}
