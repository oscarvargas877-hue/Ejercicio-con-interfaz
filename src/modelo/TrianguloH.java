/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class TrianguloH extends FiguraGeometricaH {
    //ATRIBUTOS 
    private int idTriangulo;
    private double lado1;
    private double lado2;
    private double lado3;
    
    //constructor

    public TrianguloH() {
    }
    //CONSTRUCTOR TRIANGULO

    public TrianguloH(int idTriangulo, double lado1, double lado2, double lado3) {
        this.idTriangulo = idTriangulo;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    //CONSTRUCTOR COMPLETO

    public TrianguloH(int idTriangulo, double lado1, double lado2, double lado3, int idFiguraGeometrica, String nombre, double area, double perimetro) {
        super(idFiguraGeometrica, nombre, area, perimetro);
        this.idTriangulo = idTriangulo;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
  
        
    }
    //METODOS SET Y GET

    public int getIdTriangulo() {
        return idTriangulo;
    }

    public void setIdTriangulo(int idTriangulo) {
        this.idTriangulo = idTriangulo;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    //METODO DE LOGICA
    public double CalcularArea(){
            double area = (lado1 * lado2) / 2;   
            setArea(area);  
            return area;
    }
    public double calcularPerimetro(){
            double perimetro = (lado1 + lado2 + lado3);
            setPerimetro(perimetro); 
            return perimetro;
    }
    //  MÉTODO QUE ACTUALIZA AMBOS
    public void calcular() {
        setArea(CalcularArea());
        setPerimetro(calcularPerimetro());
    }

    @Override
    public String toString() {
        return "= DATOS DEL TRIANGULO =" +"\n"+
                "id figura geometrica: " + getIdFiguraGeometrica() +"\n"+
                "Id del triangulo: " + idTriangulo +"\n"+
                "Nombre: "+ getNombre()  +"\n"+
                "Lado1 : " + lado1  +"\n"+
                "Lado2: " + lado2  +"\n"+
                "Lado3: "+ lado3  +"\n"+
                "Área: " + getArea()  +"\n"+
                "Perímetro: " + getPerimetro();
    }
    
    
    
}
