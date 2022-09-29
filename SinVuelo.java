/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

import org.slf4j.Logger;
/**
*@author Juan Sebastian Gil Coy
*
*/

public class SinVuelo implements TipoVuelo {

/* (non-Javadoc)
* @see com.cibancode.patterndesign.lab4.supertype.TipoVuelo#vuelo()
*/

public static final Logger logger =LoggerFactory.getLogger(SinVuelo.class);
@Override
public void vuelo() {
logger.debug("no puedo volar"); 
System.out.println("no puedo volar");
}   
}
