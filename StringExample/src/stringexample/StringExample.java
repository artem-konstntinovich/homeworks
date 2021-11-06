package stringexample;
import java.util.Scanner;

public class StringExample {


    public static void main(String[] args) {
        
        System.out.println("Как вас зовут?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        //String name = input.next();// input.nextLine();
        // String name = input.next("");// pattern ДЗ найти примеры паттернов строк для next
        //String StringBuilder StringBuffer
        System.out.println("Ну, привет, " + name);
        //Длина строки
        int n = name.length();
        int numLastChar = n - 1;// номер последней буквы
        //Чтение заданного символа-буквы (нумерация от нуля)
        for(int i = numLastChar; i >= 0; i--)
        {
            System.out.println(name.charAt(i));//charAt(i) возвращает символ под номером i
        }
        //получение части строки, например, все символы между вторым и четвертым (включительно)
        if (n >= 4)
        {
            //Ivan
            //0123
            String newString = name.substring(1,3 + 1);
            //0 - первый
            //1 - второй
            //3 - четвертый
            System.out.println(newString);
        }
        //разбиение строки на части, например, все слова отдельно
        //Получит отдельно Имя и Фамилию
        String[] words = name.split(" ");
        int M = words.length;// M - будет количеством слов
        String firstName = words[0];
        String lastName = words[1];
        System.out.printf("Вы ввели слов %d, это имя = %s и фамилия = %s \n", M, firstName, lastName);
        
        //определение, входит ли одна строка в другую
        boolean result = name.contains(lastName);
        if (result == true)
        {
            System.out.println("Строка = "+name+" содержит строку = "+lastName);
        }
        
        
          
        
        
    }
    
}
