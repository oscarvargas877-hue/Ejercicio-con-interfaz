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
    }

    public CuadradoH(int idCuadrado, double lado, int idFiguraGeometrica, String nombre, double area, double perimetro) {
        super(idFiguraGeometrica, nombre, area, perimetro);
        this.idCuadrado = idCuadrado;
        this.lado = lado;
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
    }

    @Override
    public String toString() {
        return "Id:"+getIdFiguraGeometrica()+"\n"+
                "Nombre:"+getNombre()+"\n"+
                "Área:"+getArea()+"\n"+
                "Perímetro:"+getPerimetro()+"\n"+
                "IdCuadrado:"+idCuadrado+"\n"+
                "Lado:"+lado;}

   

}
