/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoautomato03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vinni
 */
public class ProjetoAutomato03 {

    char cadeia[];    

    public static void main(String[] args) {
        ProjetoAutomato03 auto = new ProjetoAutomato03();
        String subCadeia;
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque sua cadeia: ");
        subCadeia = input.nextLine();
        subCadeia = subCadeia.toLowerCase();
        auto.cadeia = subCadeia.toCharArray();
        
        auto.Automato();

    }

    public void Automato() {
        ArrayList<String> listaEstados = new ArrayList<>();
        ProjetoAutomato03 auto = new ProjetoAutomato03();
      
        String estadoAtual = "q0"; 
        listaEstados.add("[q0]");
        boolean validacao = true;

        for (int i = 0; i < cadeia.length; i++) {
            if (cadeia[i] == 'a') {
                if (estadoAtual == "q0") {
                    listaEstados.add("[q5]");
                    estadoAtual = "q5";
                    validacao = false;
                } else if (estadoAtual == "q1") {
                    listaEstados.add("[q8]");
                    estadoAtual = "q8";
                    validacao = false;
                } else if (estadoAtual == "q2") {
                    listaEstados.add("[q7]");
                    estadoAtual = "q7";
                    validacao = true;
                }
                else if (estadoAtual == "q3") {
                    listaEstados.add("[q8]");
                    estadoAtual = "q8";
                    validacao = false;
                }
                else if (estadoAtual == "q4") {
                    listaEstados.add("[q1]");
                    estadoAtual = "q1";
                    validacao = true;
                }
                else if (estadoAtual == "q5") {
                    listaEstados.add("[q9]");
                    estadoAtual = "q9";
                    validacao = true;
                }
                else if (estadoAtual == "q6") {
                    listaEstados.add("[q3]");
                    estadoAtual = "q3";
                    validacao = true;
                }
                else if (estadoAtual == "q7") {
                    listaEstados.add("[q9]");
                    estadoAtual = "q9";
                    validacao = true;
                }
                else if (estadoAtual == "q8") {
                    listaEstados.add("[q9]");
                    estadoAtual = "q9";
                    validacao = true;
                }
                else if (estadoAtual == "q9") {
                    listaEstados.add("[q8]");
                    estadoAtual = "q8";
                    validacao = false;
                }                

                // --------------------- b --------------------
            } else if (cadeia[i] == 'b') {
                
                if (estadoAtual == "q0") {
                    listaEstados.add("[q9]");
                    estadoAtual = "q9";
                    validacao = true;
                } else if (estadoAtual == "q1") {
                    listaEstados.add("[q2]");
                    estadoAtual = "q2";
                    validacao = true;
                } else if (estadoAtual == "q2") {
                    listaEstados.add("[q9]");
                    estadoAtual = "q9";
                    validacao = true;
                }
                else if (estadoAtual == "q3") {
                    listaEstados.add("[q9]");
                    estadoAtual = "q9";
                    validacao = true;
                }
                else if (estadoAtual == "q4") {
                    listaEstados.add("[q8]");
                    estadoAtual = "q8";
                    validacao = false;
                }
                else if (estadoAtual == "q5") {
                    listaEstados.add("[q6]");
                    estadoAtual = "q6";
                    validacao = false;
                }
                else if (estadoAtual == "q6") {
                    listaEstados.add("[q8]");
                    estadoAtual = "q8";
                    validacao = false;
                }
                else if (estadoAtual == "q7") {
                    listaEstados.add("[q8]");
                    estadoAtual = "q8";
                    validacao = false;
                }
                else if (estadoAtual == "q8") {
                    listaEstados.add("[q8]");
                    estadoAtual = "q8";
                    validacao = false;
                }
                else if (estadoAtual == "q9") {
                    listaEstados.add("[q9]");
                    estadoAtual = "q9";
                    validacao = true;
                }              

            } else {
                validacao = false;
                break;

            }
        }
        
        if(validacao == true){            
            System.out.println("Cadeia aceita!");
        }else{
            System.out.println("Cadeia NÃO aceita!");
        }
        System.out.println("\nEstados percorridos: ");
        for (int i = 0; i < listaEstados.size(); i++) {
            System.out.print(" ----> "+listaEstados.get(i));
        }

    }

}
    

