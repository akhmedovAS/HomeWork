public class Human {
    String name = "Петя";
    String secondName = "Иванов";
    String lastName = "Пикачувич";
    int age = 30;

    Human(String name, String secondName, String lastName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;

    }

    Human() {

    }

    public String toString() {
        return "Класс Human " + "Фамилия = " + lastName + "," + "Имя = " + name + "Отчество = " + secondName + "," + "Возраст = " + age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    String getSecondName() {
        return secondName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName() {
        return lastName;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

}
