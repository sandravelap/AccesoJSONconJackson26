package ui;

import models.Highschool;
import myLib.UserMethods;
import org.xml.sax.SAXException;
import tools.jackson.databind.ObjectMapper;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;


public class MainMenu {
    private Scanner scanner = new Scanner(System.in);
    private boolean exitMenu = false;
    Highschool myHighschool = new Highschool();

    public void showMenu(){
        UserMethods userMethods = new UserMethods();
        do{
            userMethods.myPrinter("Choose an option: ");
            userMethods.myPrinter("1. Read JSON file using Jackson");
            userMethods.myPrinter("2. Read and write JSON file using Jackson");
            userMethods.myPrinter("0. Exit.");
            processOption(requestOption());
        }while(!exitMenu);
    }
    private String requestOption(){
        return this.scanner.nextLine();
    }

    private void processOption(String option){
        UserMethods userMethods = new UserMethods();
        switch(option){
            case "0" -> exitMenu = true;
            case "1" -> {
                Path p = userMethods.fileToRead("Introduce the path to the file to be read with DOM: ");
                ObjectMapper objectMapper = new ObjectMapper();
                myHighschool = objectMapper.readValue(p.toFile(), Highschool.class);
                userMethods.myPrinter("Highschool properly loaded.");
            }
            case "2" -> {
                Path p = userMethods.fileToRead("Introduce the path to the file to be read with SAX: ");

            }

            default -> userMethods.myPrinter("Wrong option.");
        }
    }
}
