/*  Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, 
    imprima las propiedades del vehículo más barato. 
    Para ello, se deberán leer por teclado las características de cada vehículo y crear una clase 
    que represente a cada uno de ellos.  
*/
import java.util.Scanner;

public class Control {

    public static void main(String[] args) {
        //Clase Scanner
        Scanner sc = new Scanner (System.in);
        //Atributos de clase
        String marca;
        String modelo;
        double precio;
        int indice=0;
       
        
        System.out.println("Bievenido a Vehiculos\n");  
        System.out.println("¿Cuantos vehiculos seran?: ");
        int cantidad=sc.nextInt();
         
        //Arreglo de Objetos
        Vehiculos vehiculos[] = new Vehiculos[cantidad];
        
        //Guardamos todos los vehiculos en un arreglo de objetos
        for(int i=0; i<vehiculos.length; i++){
            sc.nextLine();
            System.out.println((i+1)+".-Vehiculo: ");
            System.out.print("Marca: ");
            marca=sc.nextLine();
            System.out.print("Modelo: ");
            modelo=sc.nextLine();
            System.out.print("Precio: ");
            precio=sc.nextDouble();
            
            //Guardamos todos los datos en el objeto
            vehiculos[i]= new Vehiculos(marca, modelo, precio);
        }
        
        //Mostramos todos los Vehiculos guardados
        System.out.println("Todos los Vehiculos son: ");
        for(int i=0; i<vehiculos.length; i++){
            System.out.println((i+1)+".-Vehiculo: ");
            System.out.println("Marca: "+vehiculos[i].getMarca());
            System.out.println("Modelo: "+vehiculos[i].getModelo());
            System.out.println("Precio: "+vehiculos[i].getPrecio());
            sc.nextLine();
        }
        
       
        double barato=vehiculos[0].getPrecio();
             for(int i=0; i<vehiculos.length; i++){
                 if(vehiculos[i].getPrecio() < barato){
                     barato=vehiculos[i].getPrecio();
                      indice=i;
                 }
             }
            System.out.println("el coche mas barato es: "+vehiculos[indice].Mostrar());
        
        
        
        
        
        
        
        
    }
    
}
