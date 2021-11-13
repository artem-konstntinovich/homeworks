
package stringscw1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class StringsCW1 {

    
    public static String readFromFile(String fileName) throws IOException
    {
        String result = "";
        BufferedReader inputFile = null;
         try {
            inputFile = new BufferedReader(new FileReader(fileName));
            String strtmp2;
            while ((strtmp2 = inputFile.readLine()) != null) {
                // System.out.println(strtmp2);
                result = result + strtmp2;
                //double d = Double.parseDouble(strtmp2);
            }
            inputFile.close();
        } catch (Exception e) {
        }
         finally{
             inputFile.close();
         }
         return result;
    }
    
    public static void writeToFile(String fileName)
    {
        //
        BufferedReader input = new BufferedReader(new  InputStreamReader(System.in) );
        PrintWriter output = null;
        try {
            output = new PrintWriter( new FileWriter(fileName) );
            while(true)
            {
                String strtmp = input.readLine();
                if (strtmp.equals("stop"))
                    break;
                output.println(strtmp);
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("Чтение файла, к которому нет доступа.");//TxtFileTester.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            output.close();
        }
        //
    }
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // System.out.println("Введите строки в файл. (Ввод прекратится после слова stop)");
        // writeToFile("mydata.txt");
        String resultFromFile = readFromFile("mydata.txt");
        System.out.println("В файле строка = '"+resultFromFile+"'");
        String[] words = resultFromFile.split(" ");
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i < words.length; i++)
        {
            String currentWord = words[i];
            currentWord = currentWord.trim();
            currentWord = currentWord.toLowerCase();
            String punctuation = ",.:;!?";// список символов, которые ищем
            boolean haveSymbol = false;
            for(int j = 0; j < punctuation.length(); j++)
            {
              String symbol = String.valueOf(punctuation.charAt(j));
              if (currentWord.contains(symbol) == true)
              {
                  haveSymbol = true;
                  currentWord = currentWord.replace(symbol, "");
                  newString.append(currentWord + " ");
                  //break;
              }
            }
        }
        System.out.println("слова, после которых шли знаки пунктуации");
        System.out.println(newString);
        //как разбить строку на части без использования метода split
        String myStr = resultFromFile + " ";
        StringBuilder newWords = new StringBuilder();
        String word = "";
        for(int i = 0; i < myStr.length() - 1; i++)
        {
            word = word + myStr.charAt(i);
            if (myStr.charAt(i) != ' ' && myStr.charAt(i + 1) == ' ')
            {
               newWords.append(word + " ");
               word = "";
            }
        }
        System.out.println("разделение на слова без split");
        System.out.println(newWords);
    }
    
}
