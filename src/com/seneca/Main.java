/**********************************************
 Workshop # 7 Part 2
 Course: JAC444- Semester 4
 Last Name:SINGH
 First Name:GURPREET
 ID: 074913146
 Section:NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature: GURPREET SINGH
 Date:March 28/ 2021
 **********************************************/
package com.seneca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> countryCapital = new HashMap<String, String>(); // creating a hash map

        // getting file path
        String filePath = System.getProperty("user.dir") + File.separator + "src/com/seneca/countries_capital_list.txt";
        File file = new File(filePath);
        if(!file.exists()){
            System.out.println("File not found");
        }

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String s = scanner.nextLine();
                String[] temp = s.trim().split("\\s[—]\\s+"); // splits on delimiter
                countryCapital.put(temp[0].toLowerCase(), temp[1].toLowerCase()); // stores the key and values using "put
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        while (true){
            Scanner scanner = new Scanner(System.in);

            try{
                System.out.print("Enter a Country to find its Capital: ");
                String country = scanner.nextLine();

                // if match is found display
                String capital = countryCapital.get(country.toLowerCase());
                System.out.println(capital);
                System.out.print("Press any key to continue or (E) to exit: ");
                String exit = scanner.nextLine();

                if (exit.equals("E") || exit.equals("e")){
                    break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }



        }





    }



}
