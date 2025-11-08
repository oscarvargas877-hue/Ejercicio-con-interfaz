/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class RectanguloH extends FiguraGeometricaH{
    private int idRectangulo;
    private double lado1;
    private double lado2;

    public RectanguloH() {
    }
    
    public RectanguloH(int idRectangulo, double lado1, double lado2) {
        this.idRectangulo = idRectangulo;
        this.lado1 = lado1;
        this.lado2 = lado2;
        // Calcular y actualizar los valores del padre
        calcular();
    }
    

    public RectanguloH(int idRectangulo, double lado1, double lado2, int idFiguraGeometrica, String nombre, double area, double perimetro) {
        super(idFiguraGeometrica, nombre, area, perimetro);
        this.idRectangulo = idRectangulo;
        this.lado1 = lado1;
        this.lado2 = lado2;
        // Calcular y actualizar los valores del padre
        calcular();
    }
    

 
    public void setLado1(double lado1) {
        this.lado1 = lado1;
        // Recalcular cuando cambia el lado
        calcular();
    }

    public void setIdRectangulo(int idRectangulo) {
        this.idRectangulo = idRectangulo;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
        // Recalcular cuando cambia el lado
        calcular();
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public int getIdRectangulo() {
        return idRectangulo;
    }
    //Logica de negocio
     public void calcular(){
     //area
         setArea(lado1*lado2);
     //perimetro
         setPerimetro((lado1+lado2)*2);
     }
    @Override
   
    public String toString() {
        return """
            DATOS DEL RECTANGULO 
            Id: """ + getIdFiguraGeometrica() + "\n" +
           "Nombre: " + getNombre() + "\n" +
           "Id rectángulo: " + idRectangulo + "\n" +
           "Base: " + lado1 + "\n" +
           "Altura: " + lado2+ "\n" +
           "El resultado es: "+ "\n" +
           "Área: " + getArea() + "\n" +
           "Perímetro: " + getPerimetro();

    }
}
//backend