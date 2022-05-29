/**
 * Класс, описывающий человека
 */
public class Human {
    String name = "Петя";
    String secondName = "Иванов";
    String lastName = "Пикачувич";
    int age = 30;

    /**
     * Конструктор класса
     *
     * @param name       Имя
     * @param secondName Фамилия
     * @param lastName   Отчество
     * @param age        Возраст
     */
    Human(String name, String secondName, String lastName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;

    }

    /**
     * Пустой конструктор, для возможности создавать объект без передачи аргументов
     */
    Human() {

    }

    /**
     * Метод для информативного вывода информации об объекте
     *
     * @return вернуть информацию об объекте
     */
    public String toString() {
        return "Класс Human " + "Фамилия = " + lastName + "," + "Имя = " + name + "Отчество = " + secondName + "," + "Возраст = " + age;
    }

    /**
     * Установить имя
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Вернуть имя
     */
    String getName() {
        return name;
    }

    /**
     * Установить фамилию
     */
    void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Получить Фамилию
     */
    String getSecondName() {
        return secondName;
    }

    /**
     * Установить Отчество
     */
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Получить Отчество
     */
    String getLastName() {
        return lastName;
    }

    /**
     * Установить возраст
     */
    void setAge(int age) {
        this.age = age;
    }

    /**
     * Получить возраст
     */
    int getAge() {
        return age;
    }

}
