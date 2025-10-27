/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuadrado;
import modelo.CuadradoH;
import modelo.Empleado;
import modelo.FiguraGeometricaH;
import modelo.Humano;
import modelo.Persona;
import modelo.Socio;

/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) {
        //INSTANCIA DE PERSONA UPCASTING
        Persona p1 = new Socio();
        p1.setIdPersona(101);
        p1.setNombre("Juan Pérez");
        Persona p2 = new Empleado();
        p2.setIdPersona(102);

        //DOWNCASTING
        Socio s1 = (Socio) p1;
        s1.setIdSocio(1);
        System.out.println(s1.toString());

        //INTERFACE
        System.out.println("\n" + "---PROBANDO LA INTERFACE----");
        Persona p3 = new Persona(106, "Ana Montenegro", " 1002003002", "Ibarra", 0, "a@gmai.com", true, "12/12/1992");
        System.out.println(p3.obtenerDireccion());

        //FIGURA GEOMÉTRICA INTERFACE
        
        System.out.println("FIGURAS GEOMÉTRICAS");
        Cuadrado x=new Cuadrado(1, 6.3);
        x.calcularArea();
        System.out.println( "El perímetro es:"+x.calcularPerimetro());
        
        //FIGURA GEOMÉTRICA HERENCIA
        //UPCASTING
        FiguraGeometricaH fgh1=new CuadradoH();
        fgh1.setIdFiguraGeometrica(1);
        fgh1.setNombre("Cuadrado");
        //DOWNCASTING
    
    }
}
