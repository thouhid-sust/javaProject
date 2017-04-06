package onlineexamsystem;

import java.io.FileReader;
import java.io.*;
import java.lang.*;
import java.util.*;
import onlineexamsystem.fileFactory;

/**
 *
 * @author towhid
 */
public class Question {
    
    public static String[] getQuestion(){
        String[] array = new String[1000];
        int count = 0;
        while(scanner.hasNextLine()){
            //String line = scanner.nextLine();
            array[count++] = scanner.nextLine();
        }
        fileFactory.close();
        
        return array;
    }
    
    private static Scanner scanner = fileFactory.getScanner();
    
}
