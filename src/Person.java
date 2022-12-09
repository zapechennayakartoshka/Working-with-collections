/**
 * Класс человек
 * @author Юля Кузнецова (3 к. 7 гр.)
 * @version 1.0
 */
public class Person {
    /** Поле id */
    private String ID;
    /** Поле для имени */
    private String name;
    /** Поле для пола человека */
    private String gender;
    /** Поле подразделение */
    private Division division;
    /** Поле зарплата человека */
    private String salary;
    /** Поле дата рождения человека */
    private String birthday;

    /** Конструктор класса по умолчанию */
    public Person() {
        ID = "";
        name = "";
        gender = "";
        salary = "";
        birthday = "";
        division = new Division("");
    }

    /**
     * Конструктор
     * @param ID - id
     * @param name - имя
     * @param gender - пол
     * @param division - подразделение
     * @param salary - зарплата
     * @param birthday - дата рождения
     */
    public Person(String ID, String name, String gender, String division, String salary, String birthday) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.division = new Division(division);
        this.salary = salary;
        this.birthday = birthday;
    }

    /** Метод получения id человека
     * @return ID */
    public String getID() {return ID;}

    /** Метод получения имени человека
     * @return name */
    public String getName() {return name;}

    /** Метод получения пола человека
     * @return gender */
    public String getGender() {return gender;}

    /** Метод получения подразделения
     * @return division */
    public Division getDivision() {return division;}

    /** Метод получения названия подразделения
     * @return Title */
    public String getTitle() {return division.getTitle();}

    /** Метод получения id подразделения
     * @return Id */
    public int getIdDiv() {return division.getIdDivision();}

    /** Метод получения информации о зарплате человека
     * @return salary */
    public String getSalary() {return salary;}

    /** Метод получения даты рождения человека
     * @return birthday */
    public String getBirthday() {return birthday;}

    /** Метод присваивания id человеку
     * @param ID Метод присваивания id человеку */
    public void setID(String ID) {this.ID = ID;}

    /** Метод присваивания имени человеку
     * @param name значение имени человека */
    public void setName(String name) {this.name = name;}

    /** Метод присваивания пола человеку
     * @param gender пол человека */
    public void setGender(String gender) {this.gender = gender;}

    /** Метод присваивания подразделения человеку
     * @param division значение подразделения */
    public void setDivision(Division division) {this.division = division;}

    /** Метод присваивания зарплаты человеку
     * @param salary значение зарплаты */
    public void setSalary(String salary) {this.salary = salary;}

    /** Метод присваивания даты рождения человеку
     * @param birthday значение даты рождения */
    public void setBirthday(String birthday) {this.birthday = birthday;}

}
