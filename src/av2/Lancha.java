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
public class Lancha extends Veiculo {

    //Atributos
    public Motor motor1 = new Motor();
    public Motor motor2 = new Motor();        
    protected String nome;

    //Métodos Construtores
    public Lancha() {    
    }

    public Lancha(String marca, String modelo){
        super(marca,modelo);
    }
    
    public Lancha(String modelo, double preco){
        super(modelo,preco);
    }
    
    public Lancha(double comprimento, double largura){
        super(comprimento,largura);
    }
    
    public Lancha(String marca, String modelo, double preco) {
        super(marca,modelo,preco);
    }
    
    public Lancha(String modelo, double comprimento, double largura){
        super(modelo,comprimento,largura);
    }
    
    public Lancha(String marca, String modelo, String nome){
        super(marca,modelo);
        this.nome = nome;
    }
    
    public Lancha(String marca, String modelo, String cor, double comprimento, double largura, double preco){
        super(marca,modelo,cor,comprimento,largura,preco);
    }
    
    public Lancha(String nome, String modelo, double comprimento, double largura){
       super(modelo,comprimento,largura);
       this.nome = nome;
    }
    
    public Lancha(String marca, String modelo, String cor, double comprimento, double largura, double preco, String nome,
            String tipoMotor1, int rpmMotor1, int velocidadeMotor1, double pesoMotor1, double precoMMotor1,
            String tipoMotor2, int rpmMotor2, int velocidadeMotor2, double pesoMotor2, double precoMMotor2) {
              
        super(marca, modelo, cor, preco, largura, comprimento);
        this.nome = nome;
        motor1 = new Motor(tipoMotor1, rpmMotor1,velocidadeMotor1, pesoMotor1, precoMMotor1);
        motor2= new Motor(tipoMotor2, rpmMotor2,velocidadeMotor2, pesoMotor2, precoMMotor2);
    }

    //Seters e Getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //Métodos extras
    public void cadastrar(String marca, String modelo, String cor, double comprimento, double largura, double preco, String nome,
            String tipoMotor1, int rpmMotor1, int velocidadeMotor1, double pesoMotor1, double precoMMotor1,
            String tipoMotor2, int rpmMotor2, int velocidadeMotor2, double pesoMotor2, double precoMMotor2) {
       
        
        super.cadastrar(marca, modelo, cor, comprimento, largura, preco);
        this.nome = nome;
        motor1.cadastrar(tipoMotor1, rpmMotor1,velocidadeMotor1, pesoMotor1, precoMMotor1);
        motor2.cadastrar(tipoMotor2, rpmMotor2,velocidadeMotor2, pesoMotor2, precoMMotor2);
    }

    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da lancha: ");
        nome=(sc.nextLine());
        motor1.entradaDados();
        motor2.entradaDados();
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Nome           :" + getNome());
        motor1.imprimir();
        motor2.imprimir();       
    }

    public double valorDesconto() {
        return preco = preco - preco * 0.10;
    }
    
}
