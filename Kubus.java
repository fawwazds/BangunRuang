package Inheritance_BangunRuang;


public class Kubus extends BangunRuang {
    float s; 
    
     float volume(){
        float volume = s * s * s;
        System.out.println("Volume Kubus: " + volume);
        return volume;
    }

   
    float luasPermukaan(){
        float luasPermukaan = 6 * s * s;
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        return luasPermukaan;
    }
}

