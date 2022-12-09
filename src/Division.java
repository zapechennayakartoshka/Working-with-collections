/**
 * Класс подразделение
 * @author Юля Кузнецова (3 к. 7 гр.)
 * @version 1.0
 */
public class Division {
    /** Поле id подразделения */
    private int id;
    /** Счетчик для формирования id подразделений */
    private static int count = 0;
    /** Поле название подразделения */
    private  String title;

    /** Конструктор
     * @param title название подразделения */
    public Division(String title)
    {
        this.title = title;
        this.id = count;
        count++;
    }

    /** Метод получения id подразделения
     * @return id */
    public int getIdDivision() { return id; }

    /** Метод получения названия подразделения
     * @return title */
    public String getTitle() { return title; }


}
