/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import Clases.Funcionario;

/**
 *
 * @author felipe
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("20202020-K","Juan","Fernández"
                ,"López","Su Casa 123","10","10","2010",32500);
        System.out.println(funcionario1.getAtributos());
    }
    
}
