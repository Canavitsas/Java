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
public class Carro extends Veiculo {
    //Atributos
    public Motor motor1 = new Motor();
    protected String placa;
    
//Métodos construtores
public Carro(){
}

public Carro(String modelo, String preco){
    super(modelo,preco);
}

public Carro(double comprimento, double largura){
     super(comprimento,largura);        
}

public Carro(String modelo, double comprimento, double largura){
     super(modelo,comprimento,largura);
    }

public Carro(String marca, String modelo, String cor){
    super(marca,modelo,cor); 
}

public Carro(String marca, String modelo, String cor, String placa){
    super(marca,modelo,cor); 
    this.placa = placa;
}

public Carro(String marca, String modelo, String cor, double comprimento, double largura, double preco, String placa,
            String tipoMotor1, int rpmMotor1, int velocidadeMotor1, double pesoMotor1, double precoMMotor1) {
              
        super(marca, modelo, cor, comprimento, largura, preco);
        this.placa = placa;
        motor1 = new Motor(tipoMotor1, rpmMotor1,velocidadeMotor1, pesoMotor1, precoMMotor1);     
    }



//Seters e Getters
public void setPlaca (String placa){
    this.placa = placa;
}

public String getPlaca(){
    return placa;
}

 //Métodos extras 

public void cadastrar(String marca, String modelo, String cor,double preco, double largura, double comprimento, String placa,
         String tipoMotor1, int rpmMotor1, int velocidadeMotor1, double pesoMotor1, double precoMMotor1){
    super.cadastrar(marca,modelo,cor,preco,largura,comprimento);
    this.placa = placa; 
    motor1.cadastrar(tipoMotor1, rpmMotor1,velocidadeMotor1, pesoMotor1, precoMMotor1);
}

    
public void entradaDados(){
    super.entradaDados();
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a placa: ");
    placa=(sc.nextLine());
    motor1.entradaDados();
}

    
public void imprimir(){
    super.imprimir();
     System.out.println("Placa          : " +getPlaca());
     motor1.imprimir();      
}
    
public double valorDesconto(){
    return preco = preco - preco*0.15;  
}    
}
