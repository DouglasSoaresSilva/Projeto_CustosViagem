package com.mycompany.percurso;
/**
 *
 * @author Douglas Soares Silva
 */
public class Percurso {
        private double kmPercorrido;
        private double valorCombustivel;
        private double valorPedagio;
        
        public void cadastrarPercurso(double kmPercorrido, double valorCombustivel, double valorPedagio){
            this.kmPercorrido = kmPercorrido;
            this.valorCombustivel = valorCombustivel;
            this.valorPedagio = valorPedagio;
        }
        
        public String listarPercurso(){
        return "Km percorrido: " + kmPercorrido +
                "\nValor do combustível: " + valorCombustivel + 
                "\nValor do pedágio: " + valorPedagio;
 }

        //Getters
        public double getKmPercorrido () {
                return kmPercorrido;
        }

        public double getValorCombustivel () {
                return valorCombustivel;
        }

        public double getValorPedagio () {
                return valorPedagio;
        }
}
