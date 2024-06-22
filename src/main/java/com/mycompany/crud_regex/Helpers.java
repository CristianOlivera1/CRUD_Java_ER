/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud_regex;

import java.util.regex.Pattern;

/**
 *
 * @author olive
 */
public class Helpers {
       public static boolean verifyPattern(String regExp, String value){
              return Pattern.compile(regExp).matcher(value).matches();
        }

    
}
