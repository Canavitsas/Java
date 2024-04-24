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
public class Aviao extends Veiculo {

    //Atributos
    protected String identificacao;
    public Motor motor1 = new Motor();
    public Motor motor2 = new Motor();
    public Motor motor3 = new Motor();
    public Motor motor4 = new Motor();

    public Aviao() {
    }

    public Aviao(String marca, String modelo, String cor, double comprimento,
            double largura, double preco) {

        super(marca, modelo, cor, comprimento, largura, preco);
    }

    public Aviao(String modelo, double preco) {
        super(modelo,preco);
    }

    public Aviao(String marca, String modelo) {
        super(marca, modelo);
    }

    public Aviao(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }

    public Aviao(String marca, String modelo, double preco) {
        super(marca,modelo,preco);
    }

    public Aviao(double comprimento, double largura) {
        super(comprimento,largura);
    }
    
    public Aviao(String marca, String modelo, String cor, double comprimento, double largura, double preco, String identificacao,
            String tipoMotor1, int rpmMotor1, int velocidadeMotor1, double pesoMotor1, double precoMMotor1,
            String tipoMotor2, int rpmMotor2, int velocidadeMotor2, double pesoMotor2, double precoMMotor2,
            String tipoMotor3, int rpmMotor3, int velocidadeMotor3, double pesoMotor3, double precoMMotor3,
            String tipoMotor4, int rpmMotor4, int velocidadeMotor4, double pesoMotor4, double precoMMotor4) {
              
        super(marca, modelo, cor, preco, largura, comprimento);
        this.identificacao = identificacao;
        motor1 = new Motor(tipoMotor1, rpmMotor1,velocidadeMotor1, pesoMotor1, precoMMotor1);
        motor2= new Motor(tipoMotor2, rpmMotor2,velocidadeMotor2, pesoMotor2, precoMMotor2);
        motor3= new Motor(tipoMotor3, rpmMotor3,velocidadeMotor3, pesoMotor3, precoMMotor3);
        motor2= new Motor(tipoMotor4, rpmMotor4,velocidadeMotor4, pesoMotor4, precoMMotor4);
                
    }

//Seters e Getters
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

//Métodos extras
    public void cadastrar(String marca, String modelo, String cor, double comprimento, double largura, double preco, String identificacao,
            String tipoMotor1, int rpmMotor1, int velocidadeMotor1, double pesoMotor1, double precoMMotor1,
            String tipoMotor2, int rpmMotor2, int velocidadeMotor2, double pesoMotor2, double precoMMotor2,
            String tipoMotor3, int rpmMotor3, int velocidadeMotor3, double pesoMotor3, double precoMMotor3,
            String tipoMotor4, int rpmMotor4, int velocidadeMotor4, double pesoMotor4, double precoMMotor4) {

        super.cadastrar(marca, modelo, cor, comprimento, largura, preco);
        this.identificacao = identificacao;
        motor1.cadastrar(tipoMotor1, rpmMotor1, velocidadeMotor1, pesoMotor1, precoMMotor1);
        motor2.cadastrar(tipoMotor2, rpmMotor2, velocidadeMotor2, pesoMotor2, precoMMotor2);
        motor3.cadastrar(tipoMotor3, rpmMotor3, velocidadeMotor3, pesoMotor3, precoMMotor3);
        motor4.cadastrar(tipoMotor4, rpmMotor4, velocidadeMotor4, pesoMotor4, precoMMotor4);
    }

    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a identificacao: ");
        identificacao = (sc.nextLine());
        motor1.entradaDados();
        motor2.entradaDados();
        motor3.entradaDados();
        motor4.entradaDados();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Identificacao: " + getIdentificacao());
        System.out.println("------------------------------------");
        motor1.imprimir();
        motor2.imprimir();
        motor3.imprimir();
        motor4.imprimir();
    }

    public double valorDesconto() {

        return preco = preco - preco * 0.08;

    }

}
