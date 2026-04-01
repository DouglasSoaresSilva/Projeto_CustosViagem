/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.custos;

/**
 *
 * @author Admin
 */
public class Custos {

double totalPercurso;
public void calculaViagem(Percurso p) {
    
    totalPercurso = (p.getkmPercorrido / 10) * p.getvalorCombustivel + p.getvalorPedagio;
}
   
    }
