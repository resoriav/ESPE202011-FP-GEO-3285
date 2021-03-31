/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.beach.model;

/**
 *
 * @author Rodrigo Soria
 */
public class beach {

    private String province;
    private String city;
    private float altitud;
    private float lenghtofbeach;
    private String typeOfcoast;
    

    public beach(String province, String city, float altittud, float lenghtofbeach, String typeOfcoast) {
        this.province = province;
        this.city = city;
        this.altitud = altittud;
        this.lenghtofbeach = lenghtofbeach;
        this.typeOfcoast = typeOfcoast;
  
    }

    /**
     * @return the province
     */
    public String getprovince() {
        return province;
    }

    /**
     * @param Brand the city to set
     */
    public void setprovince(String province) {
        this.province = province;
    }

    /**
     * @return the city
     */
    public String getcity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setcity(String city) {
        this.city = city;
    }

    /**
     * @return the altitud
     */
    public float getaltitud() {
        return altitud;
    }

    /**
     * @param altittud the altitud to set
     */
    public void setaltitud(float altitud) {
        this.altitud = altitud;
    }

    /**
     * @return the lenghtofbeach
     */
    public float getlenghtofbeach() {
        return lenghtofbeach;
    }

    /**
     * @param lenghtofbeach the lenghtofbeach to set
     */
    public void setlenghtofbeach(float lenghtofbeach) {
        this.lenghtofbeach = lenghtofbeach;
    }

    /**
     * @return the typeOfcoast
     */
    public String gettypeOfcoast() {
        return typeOfcoast;
    }

    /**
     * @param typeOfcoast the typeOfcoast to set
     */
    public void settypeOfcoast( String typeOfcoast) {
        this.typeOfcoast = typeOfcoast;
    }

}  


