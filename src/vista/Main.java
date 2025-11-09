/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

//import modelo.Cuadrado;
import modelo.CuadradoH;
import modelo.RectanguloH;
import modelo.TrianguloH;
//import modelo.FiguraGeometricaH;
//import modelo.Persona;
//import modelo.Socio;

/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) {
        //INSTANCIA DE PERSONA UPCASTING
//        Persona p1 = new Socio();
//        p1.setIdPersona(101);
//        p1.setNombre("Juan Pérez");
//        p1.setCedula("1234567890");
//        p1.setDireccion("Quito");
//        p1.setTelefono(1234567);
//        p1.setEmail("juan@example.com");
//        p1.setGenero(true);
//        p1.setFechaNacimiento("01/01/2000");
//
//        //DOWNCASTING
//        Socio s1 = (Socio) p1;
//        s1.setIdSocio(1);
//        s1.setNumCuenta(145654897);
//        s1.setFechaIngreso("01/02/2000");
//        s1.setEstado("Activo");
//        System.out.println(s1.toString());

        //INTERFACE
//        System.out.println("\n---PROBANDO LA INTERFACE----");
//        Persona p3 = new Persona(106, "Ana Montenegro", " 1002003002", "Ibarra", 0, "a@gmai.com", true, "12/12/1992");
//        System.out.println(p3.obtenerDireccion());

        //FIGURA GEOMÉTRICA INTERFACE
        
//        System.out.println("FIGURAS GEOMÉTRICAS");
//        Cuadrado x=new Cuadrado(1, 6.3);
//        x.calcularArea();
//        System.out.println( "El perímetro es:"+x.calcularPerimetro());
        
        //FIGURA GEOMÉTRICA HERENCIA
        //UPCASTING
//        FiguraGeometricaH fgh1=new CuadradoH();
//        fgh1.setIdFiguraGeometrica(1);
//        fgh1.setNombre("Cuadrado");
        
       
        //Cuadrado ejercicio con interfaz
        CuadradoH cuadrado1 = new CuadradoH(5, 4, 100, "Cuadrado ", 2, 4);
        System.out.println(cuadrado1);
        System.out.println("\n");
        
        //Rectangulo ejercicio con interfaz
        RectanguloH rectangulo1 = new RectanguloH(
                8,
                4,
                5, 
                400,
                "Rectangulo",
                5,
                10);
        
        System.out.println(rectangulo1.toString());
        System.out.println("\n");
        
        
        //TRIANGULO EJERCICIO CON INTERFAZ
        TrianguloH triangulo1 = new TrianguloH(1,4,5,6,100,"Triangulo",0,0);
        
        triangulo1.calcular();
        System.out.println(triangulo1.toString());
    
    }
}
