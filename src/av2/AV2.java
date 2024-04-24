/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2;

/**
 *
 * @author Pedro
 */
public class AV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Lancha l7 = new Lancha("seadoo", "gtxo", "branca", 6.2, 2.78, 350000);
        l7.imprimir();
        
        Lancha l8 = new Lancha();
        l8.cadastrar("seadoo", "gtx45", "preto", 5.80, 2.75, 350000, "vulto", "diesel", 5000, 90, 1000, 10000, "Gasolina", 4500, 45, 950, 15000);
        l8.imprimir();
        
        Carro c6 = new Carro();
        c6.cadastrar("Mazda", "RX7", "Vermelho", 4.25, 1.75, 65000, "LTO8N10", "gasolina", 7000, 220, 600, 40000);
        c6.imprimir();
        
        
        Aviao a1 = new Aviao();
        a1.cadastrar("Boeing", "737", "branco", 20.2, 4.8, 900000, "Flyer", "Jato", 20000, 800, 1000, 100000, "Jato", 20000, 800, 1000, 100000, "Jato", 20000, 800, 1000, 100000, "Jato", 20000, 800, 1000, 100000);
        a1.imprimir();
        */
        
        
        
        Lancha l[] = new Lancha[1];
        try{
        for(int i=0; i<l.length; i++){
         l[i]= new Lancha();
         l[i].entradaDados();
         l[i].imprimir();
         System.out.println("Valor com desconto de 10%: R$" +l[i].valorDesconto());
         System.out.println("------------------------------------");
        }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Captura de exceção de índice vetorial!");
        }
        
        
        Carro c[] = new Carro[1];
        try{
        for(int i=0; i<c.length; i++){
         c[i]= new Carro();
         c[i].entradaDados();
         c[i].imprimir();
         System.out.println("Valor com desconto de 15%: R$" +c[i].valorDesconto());
         System.out.println("------------------------------------");
        }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Captura de exceção de índice vetorial!");
        }
        
        
        Aviao a[] = new Aviao[1]; 
        try{
        for(int i=0; i<a.length; i++){
         a[i]= new Aviao();
         a[i].entradaDados();
         a[i].imprimir();
         System.out.println("Valor com desconto de 8%: R$" +a[i].valorDesconto());
         System.out.println("------------------------------------");
        }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Captura de exceção de índice vetorial!");
        }    
    }     
    }
    

