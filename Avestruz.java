/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;
import java.util.logging.Logger;

public class Avestruz extends Ave{

public static final Logger logger=LoggerFactory.getLogger(Avestruz.class);
 
public Avestruz(){
logger.debug("instanciando avestruz");
this.setTipoSonido(new SinCanto());
this.setTipoVuelo(new SinVuelo());
 }
}

