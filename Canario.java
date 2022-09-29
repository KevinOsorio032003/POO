/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

import java.util.logging.Logger;
 public class Canario extends Ave{ 
public static final Logger logger = LoggerFactory.getLogger(Canario.class); 

public Canario(){
 logger.debug("instanciando un canario"); 
this.setTipoSonido( new Canto()); 
this.setTipoVuelo(new VueloConAlas()); 
      }
} 

