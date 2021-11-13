
package txtfiletester;

import java.io.BufferedReader;//+ чтение "сырых" байтов
import java.io.FileWriter;//+  запись
import java.io.PrintWriter;//+ логика работы как в консоле
import java.io.IOException;
import java.io.InputStreamReader;//+
import java.io.FileReader;//+ чтение
import java.util.logging.Level;
import java.util.logging.Logger;



public class TxtFileTester {

    
    public static void main(String[] args) {
        
            System.out.println("Hello from TxtFileTester");
            PrintWriter output = null;
            
        BufferedReader input = new BufferedReader(new  InputStreamReader(System.in) );
        try {
            output = new PrintWriter( new FileWriter("data.txt") );
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
         
        //str1
        System.out.println("вывод файла data.txt");
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader("data.txt"));
            String strtmp2;
            while ((strtmp2 = inputFile.readLine()) != null) {
                System.out.println(strtmp2);
                //double d = Double.parseDouble(strtmp2);
            }
            inputFile.close();
        } catch (Exception e) {
        }
         
    }
    
}
