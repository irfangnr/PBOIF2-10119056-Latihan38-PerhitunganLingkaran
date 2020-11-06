/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan38.perhitunganlingkaran;

/**
 *
 * @author ACER
 */
public class Lingkaran {
        public double diameter;
        private double jarijari;
        private double Keliling;
        private double Luas;
        private double phi=3;
        
        public double jariJari(){
            jarijari=diameter/2;
            return jarijari;
        }
        public double luas(){
            Luas= phi*jarijari*jarijari;
            return Luas;
        }
        public double keliling(){
            Keliling=2*phi*jarijari;
            return Keliling;
        }
}
