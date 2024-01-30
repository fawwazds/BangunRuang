package Inheritance_BangunRuang;


public class Bola extends BangunRuang {
    float r; 
    
     float volume(){
        float volume = 4 * (22 / 7) * r * r * r / 3;
        System.out.println("Volume Bola: " + volume);
        return volume;
    }

   
    float luasPermukaan(){
        float luasPermukaan = 4 * ( 22 / 7 ) * r * r;
        System.out.println("Luas Permukaan Bola: " + luasPermukaan);
        return luasPermukaan;
    }
}

