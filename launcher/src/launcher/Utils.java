package launcher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {

    public static String loadfSt(String location) {
        StringBuilder bd = new StringBuilder();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(location));
            String line;
            
            while ((line=bf.readLine() )!= null) 
                bd.append(line + "\n");
               
            bf.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bd.toString();
    }

    public static int parse(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
