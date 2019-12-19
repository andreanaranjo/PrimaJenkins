import java.util.Scanner;

/**
 *
 * @author CltControl
 */
public class PRIMAv3 {
    
    //Los métodos validar y convertir fueron tomados de https://sites.google.com/a/espe.edu.ec/programacion-ii/home/validar-entradas-numericas
    
    public static boolean validar(String cadena) {
        if (cadena.matches("[0-9]*")) {
                return true;
        } else {
                return false;
        }
    }

    public static int convertir(String numero) {
        // Se reemplazan todos los caracteres que no correspondan a un numero
        // por espacio
        numero = numero.replaceAll("[^0-9]", "");

        // Si la cadena queda vacia
        if (numero.equals("")) {
                        numero = "0";
        }

        return Integer.parseInt(numero);
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String band = "y";
        System.out.print("\t\t\tCalculo de Primas");
        while(band.equals("y")){
            System.out.print("\nIngrese la edad del conductor: ");
            String e = sc.next();
            System.out.print("");
            System.out.print("Ingrese los puntos que tiene el conductor: ");
            String p = sc.next();
            System.out.print("");
            if (!validar(e)){
                System.out.println("La edad no es un número entero");
            }
            else{
                if (!validar(p)){
                    System.out.println("Los puntos no son un número entero");
                } 
                else{
                   calcularPrima(e, p) ;
                }    
            }
            
            System.out.print("¿Desea seguir calculando primas? [y/n]: " );
            band = sc.next().toLowerCase();
        }
    }
    
    public static void calcularPrima(String e, String p) {
    	int edad = convertir(e);
        int puntos = convertir(p);
        double prima = 0;
        if((edad >=18 && edad <= 90) && (puntos>0 && puntos<31)){
            if (edad <25){
               if(puntos>28)
                   prima = (500*2.8)-50;
               else
                   prima = 500*2.8;
            }
            if (edad >= 25 && edad < 35){
                if(puntos>26)
                   prima = (500*1.8)-50;
               else
                   prima = 500*1.8;
            }
            if (edad >= 35 && edad < 45) {
                if (puntos > 24) {
                    prima = (500 * 1.0) - 100;
                } else {
                    prima = 500 * 1.0;
                }
            }
            if (edad >= 45 && edad < 65){
                if(puntos>22)
                   prima = (500*0.8)-150;
               else
                   prima = 500*0.8;
            }
            if (edad >= 65){
                if(puntos>24)
                   prima = (500*1.5)-200;
               else
                   prima = 500*1.5;
            }
        }
        else{
            System.out.println("Error al ingresar datos!");
        }
        if(prima != 0){
            System.out.println("El valor de la prima a pagar es: "+prima);
        }
    }
}