package com.tests;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class PS2 {
    static String Name1 = "Tushar";
    static String Name2 = "Sada";
    static String Name3 = "Sam";
    static String Name4 = "Datta";
    static String Name5 = "Asif";
    static int xz=200;
    static float cv=44.55f;
    
    public static void main(String[] args) throws Exception {
    	
      
        PS2 ps2=new PS2();
        X();
        
    }
        
     public static void X() throws IllegalArgumentException, IllegalAccessException {
        	  	
            Map<String, String> runtimeMap = new HashMap<>();

        Field[] fields = PS2.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == String.class) {
                String name = field.getName();
               String value = (String) field.get(null); // static field, so pass null
              //  String value = (String) field.get(ps2.);
                runtimeMap.put(name, value);
            	}
            }
            System.out.println(runtimeMap); // Prints all name mappings


        }
        
    }



