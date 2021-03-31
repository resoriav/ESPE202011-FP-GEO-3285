/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.beach.controler;

import util.FileManager;
import ec.edu.espe.beach.model.beach;
/**
 *
 * @author Rodrigo Soria
 */
public class beachControler {
  public void save(beach beach) {
        String data = beach.getprovince() + ";" + beach.getcity() + ";" + beach.getaltitud() + ";" + beach.getlenghtofbeach() + ";" + beach.gettypeOfcoast();
        FileManager.save(data, " beach ");
    }
    public String read() {

        String data;
        data = FileManager.read(" beach.csv ");
        return data;
    }
    }