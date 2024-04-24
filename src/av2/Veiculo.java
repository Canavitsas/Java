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
public abstract class Veiculo {
    //Atributos
    protected String marca,modelo,cor;
    protected double comprimento,largura,preco;
    
    //Métodos Construtores
    public Veiculo(){};
    
    public Veiculo(String marca, String modelo, String cor, double comprimento,
            double largura, double preco){
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;   
    }
    
    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Veiculo(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public Veiculo(String marca, String modelo, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public Veiculo(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public Veiculo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public Veiculo(String modelo, double comprimento, double largura){
        this.modelo = modelo;
        this.comprimento = comprimento;
        this.largura = largura;
    }
        
    //Setters e getters
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    
    public double getComprimento(){
        return this.comprimento;
    }
   
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public double getLargura(){
        return this.largura;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //Métodos extras 
    public void cadastrar(String marca, String modelo, String cor, double comprimento,
            double largura, double preco){
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;    
    }
    
    public void entradaDados(){
     try{   
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite a marca..:");
     marca=(sc.nextLine()); 
     
     System.out.println("Digite o modelo..:");
     modelo=(sc.nextLine());
     
     System.out.println("Digite o cor..:");
     cor=(sc.nextLine());
     
     System.out.println("Digite o comprimento do veículo em (m)..:");
     comprimento=(Double.parseDouble(sc.nextLine()));
     
     System.out.println("Digite a largura do veículo em (m)..:");
     largura=(Double.parseDouble(sc.nextLine()));
     
     System.out.println("Digite o preço..:");
     preco=(Double.parseDouble(sc.nextLine()));
        }catch(NumberFormatException ex){
        System.out.println("Por favor não digite letras no lugar de números!");
    }    
    }
        
    
      
    public void imprimir(){
        System.out.println("------------------------------------");
        System.out.println("Marca          :" + getMarca());
        System.out.println("Modelo         :" + getModelo());
        System.out.println("Cor            :" + getCor());
        System.out.println("Comprimento    :" + getComprimento()+"(m)");
        System.out.println("Largura        :" + getLargura()+"(m)");
        System.out.println("Preço          :" + getPreco());
    }
    
    public abstract double valorDesconto();
     
}
