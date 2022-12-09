import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main{
    /** Главный метод
     * @param args главные аргументы
     * @throws IOException An exception that is thrown when an I/O error occurs */
    public static void main(String[] args) throws IOException {
        String filePath = "foreign_names.csv";
        String separator = ";";
        List <Person> personList = new ArrayList <> ();
        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(filePath)){
            CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(new FileReader(filePath));
            CSVReader csvReader = csvReaderBuilder.withSkipLines(1).build();
            if (csvReader == null)
                throw new FileNotFoundException(filePath);
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null){
                nextLine = nextLine[0].split(separator);
                if(nextLine.length > 2){
                    Person person = new Person(nextLine[0], nextLine[1], nextLine[2], nextLine[4], nextLine[5], nextLine[3]);
                    personList.add(person);
                }
            }
        }
        catch(FileNotFoundException | CsvValidationException e){
            e.printStackTrace();
        }

            for (int i=1; i< personList.size(); i++)
        {
            System.out.print(personList.get(i).getID()+"; ");
            System.out.print(personList.get(i).getName()+"; ");
            System.out.print(personList.get(i).getGender()+"; ");
            System.out.print(personList.get(i).getBirthday()+"; ");
            System.out.print(personList.get(i).getTitle()+"; ");
            System.out.print(personList.get(i).getIdDiv()+"; ");
            System.out.print(personList.get(i).getSalary()+"; ");
            System.out.println();
        }

    }
}