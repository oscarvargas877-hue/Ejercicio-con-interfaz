/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class CuadradoH extends FiguraGeometricaH{
     private int idCuadrado;
    private double lado;

    public CuadradoH() {
    }

    public CuadradoH(int idCuadrado, double lado) {
        this.idCuadrado = idCuadrado;
        this.lado = lado;
        // Calcular y actualizar los valores del padre
        this.setArea(calcularArea());
        this.setPerimetro(calcularPerimetro());
    }

    public CuadradoH(int idCuadrado, double lado, int idFiguraGeometrica, String nombre, double area, double perimetro) {
        super(idFiguraGeometrica, nombre, area, perimetro);
        this.idCuadrado = idCuadrado;
        this.lado = lado;
        // Calcular y actualizar los valores del padre
        this.setArea(calcularArea());
        this.setPerimetro(calcularPerimetro());
      
    }

    
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
        // Recalcular y actualizar cuando se cambia el lado
        this.setArea(calcularArea());
        this.setPerimetro(calcularPerimetro());
    }
   // Métodos de lógica
    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    // Perimetro
    @Override
    public String toString() {
        return super.toString() +"\n"+ "Id Cuadrado: "+ idCuadrado+"\n"+ "Lado: " + lado;
    }

   

}
