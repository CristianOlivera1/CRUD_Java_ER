
package com.mycompany.crud_regex;

import java.util.regex.Pattern;

/**
 *
 * @author CristianOlivera1
 */
public class Helpers {
       public static boolean verifyPattern(String regExp, String value){
              return Pattern.compile(regExp).matcher(value).matches();
        }

    
}
