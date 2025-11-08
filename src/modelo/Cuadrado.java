/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Cuadrado implements FiguraGeometrica{
    //atributos
    private int idCuadrado;
    private double lado;
    //constructor vacio
    public Cuadrado() {
    }
    //Constructor 
    public Cuadrado(int idCuadrado, double lado) {
        this.idCuadrado = idCuadrado;
        this.lado = lado;
    }
    //Metodo set y get
    public int getIdCuadrado() {
        return idCuadrado;
    }

    public void setIdCuadrado(int idCuadrado) {
        this.idCuadrado = idCuadrado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    //sobreescribir 
    @Override
    public String toString() {
        return "Cuadrado"+"\n"+
                "El lado es:"+lado;}

    @Override
    public void calcularArea() {
            double area=getLado()*getLado();
            System.out.println("El área es:"+area);
         }

    @Override
    public double calcularPerimetro() {
        return 4*getLado();
        }
    
    
    
}
