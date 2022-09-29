/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

import java.lang.System.Logger;
import org.slf4j.Logger;
/**
*@author Juan Sebastian Gil Coy
*
*/

public class SinCanto implements TipoSonido {
/* (non-Javadoc)
* @see com.cibancode.patterndesign.lab4.supertype.TipoSonido#makeSound()
*/

public static final Logger logger = LoggerFactory.getLogger(SinCanto.class);
@Override
public void makeSound() {
logger.debug("<<Silencio>>"); 
System.out.println("<<Silencio>>");
}
}
