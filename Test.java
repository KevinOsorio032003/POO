/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

import java.util.logging.Logger;

 public class Test Case { 
public static final Logger logger = LoggerFactory.getLogger(lab5TestCase.class);
 @Test 
public void canarioTest Test{ 
Canario canario = new Canario(); 
Assert.assertNotNull(canario); 
logger.debug("canario realizaVuelo");
 System.out.println("canario realizaVuelo");
 canario.realizaVuelo(); 
logger.debug("canario realizaSonido");
 System.out.println("canario realizaSonido"); 
canario.realizaSonido(); 
System.out.println("canario cambiando sonido ave");
 canario.setTipoSonido (new Grasnido()) ;
System.out.println("canario realizaSonido"); 
canario.realizaSonido();
}
}
