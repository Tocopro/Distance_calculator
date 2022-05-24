
package com.company;

public class Distance_Calc {
    
    // get the longitude and latitude of Nairobi and New York

    public  float new_york_longitude = (float) 40.7128;
    public float new_york_latitude = (float) 74.0060;
    public  float nairobi_latitude = (float) 1.2921;
    public float nairobi_longitude = (float) 36.8219;

    // getters and setters for the values

    public float getNew_york_longitude()
    {
        return new_york_longitude;
    }
    public  void setNew_york_longitude(float new_york_longitude)
    {
        this.new_york_longitude = new_york_longitude;
    }
    public float getNew_york_latitude()
    {
        return new_york_latitude;
    }
    public void setNew_york_latitude(float new_york_latitude)
    {
        this.new_york_latitude = new_york_latitude;
    }
    public float getNairobi_longitude()
    {
        return nairobi_longitude;
    }
    public void setNairobi_longitude(float nairobi_longitude)
    {
        this.nairobi_longitude = nairobi_longitude;
    }
    public float getNairobi_latitude()
    {
        return nairobi_latitude;
    }
    public void setNairobi_latitude(float nairobi_latitude)
    {
        this.nairobi_latitude = nairobi_latitude;
    }

}
 Main function
 package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args)
    {
        // set new variables from the Distance_calc class

        Distance_Calc earth_distance = new Distance_Calc();
        float nai_la = earth_distance.nairobi_latitude;
        float nai_lo = earth_distance.nairobi_longitude;
        float ny_la = earth_distance.new_york_latitude;
        float ny_lo = earth_distance.new_york_longitude;

        // calculate the distance given the two points on the earths surface

        System.out.println("Calculating the Distance on the earths surface between Nairobi and New York ");
        float distance;
        distance = (float) (6371.01 * Math.acos(Math.sin(nai_la) * Math.sin(ny_lo) + Math.cos(nai_la)
                * Math.cos(ny_la)* Math.cos(nai_lo - ny_lo)));
        String distances_earth_surface = String.format("%.2f",distance);
        System.out.println( "Distance = " + distances_earth_surface + " KM");


    }
}

 
