/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Motor {
    //Atributos
    protected String tipo;
    protected int rpm,velocidade;
    protected double peso,precoM;
    
    public Motor(){}
    
    public Motor(String tipo, int rpm){
        this.tipo = tipo;
        this.rpm = rpm;   
    }
    
    public Motor(String tipo, double peso){
        this.tipo = tipo;
        this.peso = peso;   
    }
    
    public Motor(String tipo, int rpm, int velocidade){
        this.tipo = tipo;
        this.rpm = rpm;
        this.velocidade = velocidade;
    }
    
    public Motor(String tipo, int rpm, int velocidade, double peso, double precoM){
        this.tipo = tipo;
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.peso = peso;
        this.precoM = precoM;   
    }
    
    //Setters e getters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecoM() {
        return precoM;
    }

    public void setPrecoM(double precoM) {
        this.precoM = precoM;
    }
    
    //Métodos extras 
    
    public void cadastrar(String tipo, int rpm, int velocidade, double peso, double precoM){
        this.tipo = tipo;
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.peso = peso;
        this.precoM = precoM; 
    }
    
    public void entradaDados(){
        try{
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite o tipo de motor:");
        tipo=(sc.nextLine());
        
        System.out.println("Digite o RPM máx do motor:");
        rpm=(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Digite a velocidade máx do motor:");
        velocidade=(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Digite o peso do motor:");
        peso=(Double.parseDouble(sc.nextLine()));
        
        System.out.println("Digite o preço do motor:");
        precoM=(Double.parseDouble(sc.nextLine()));
        }catch(NumberFormatException ex){
        System.out.println("Por favor não digite letras no lugar de números!");
    }     
    }
    
    public void imprimir(){
        System.out.println("------------------------------------");
        System.out.println("Tipo de motor   :" + getTipo());
        System.out.println("Rpm máx         :" + getRpm());
        System.out.println("Velocidade máx  :" + getVelocidade()+"km/h");
        System.out.println("Peso            :" + getPeso()+"(KG)");
        System.out.println("Preço do motor  :R$" + getPrecoM());
        System.out.println("------------------------------------");
    }
      
}
