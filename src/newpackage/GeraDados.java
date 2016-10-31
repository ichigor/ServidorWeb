/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Random;


/**
 *
 * @author Igor
 */
public class GeraDados implements Runnable{

    private static double temperatura;
    private static int umidade;
    private static String precipitacao;
    private static String Vet[] = new String[9];
    private static int vento;
    
    @Override
    public void run() {
        while(true){
            Random gerador = new Random();
            
            Vet[0]="Ensolarado";
            Vet[1]="Chuva";
            Vet[2]="Nublado";
            Vet[3]="Chuva Forte";
            Vet[4]="Chuva com raio";
            Vet[5]="Chuvoso";
            Vet[6]="Furacao";
            Vet[7]="Terremoto";
            Vet[8]="Tsunamy";
            
            vento = gerador.nextInt(40);
            temperatura = gerador.nextDouble()*45;
            umidade = gerador.nextInt(100);
            System.out.println("precipitaçao "+ Vet[gerador.nextInt(8)]);
            System.out.println("Temperatura " + temperatura);
            System.out.println("Umidade "+umidade+"%");
            System.out.println("Velocidade do vento "+vento+"km");
            precipitacao = Vet[gerador.nextInt(8)];
            try {
                System.out.println("Thread Sleepando");
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("\n\n");
        }
    }
    
}
