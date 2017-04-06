/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineexamsystem;

import java.io.FileReader;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author towhid
 */
public class fileFactory {
    private FileReader reader;
    private BufferedReader buffer;
    private Scanner scanner;
    
    private static fileFactory instant = new fileFactory();
    
    public static Scanner getScanner(){
        return instant.scanner;
    }
    
    public static void close(){
        try {
            instant.reader.close();
            instant.buffer.close();
            instant.scanner.close();
        } catch (IOException ex) {
            Logger.getLogger(fileFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private fileFactory(){
        try {
            reader = new FileReader("res/question.txt");
            buffer = new BufferedReader(reader);
            scanner = new Scanner(buffer);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
