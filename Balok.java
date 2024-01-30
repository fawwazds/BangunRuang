package Inheritance_BangunRuang;


public class Balok extends BangunRuang {
    float p;
    float l;
    float t; 
    
     float volume(){
        float volume = p * l * t;
        System.out.println("Volume Balok: " + volume);
        return volume;
    }

   
    float luasPermukaan(){
        float luasPermukaan = 2 * (p * l + p * t + l * t);
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
        return luasPermukaan;
    }
}

