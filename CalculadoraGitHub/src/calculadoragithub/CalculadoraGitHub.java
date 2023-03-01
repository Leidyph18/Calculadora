/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragithub;

/**
 *
 * @author dam
 */
public class CalculadoraGitHub {
    private int num1;
    private int num2;
    
        /*
    *@param resta si es 0
    */
    public CalculadoraGitHub(int a, int b){
        num1=a;
        num2=b;
    }
    
    /**Este comentario es para el ejercicio 7*/
   
    /*
    *@exception AritmeticException
    */
    public int suma(){
        int result=num1+num2;
        return result;
    }

    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
     
   /**@deprecated resta2*/
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    /*
    *@throws Calculadora es 0
    */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    
    /**@return si el divisor no es 8, devuelve 2*/
    public int divide(){
        int result=num1/num2;
        return result;
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
