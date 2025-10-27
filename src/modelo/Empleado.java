/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Empleado extends Persona{
    //1.ATRIBUTOS
    private int idEmpleado;
    private String area;
    private String cargo;
    private double salario;
    private String emailInstitucional;
    private int numeroCuenta;
    private String fechaContratacion;
    //2.M.CONSTRUCTORES

    public Empleado() {
    }

    public Empleado(int idEmpleado, String area, String cargo, double salario, String emailInstitucional, int numeroCuenta, String fechaContratacion) {
        this.idEmpleado = idEmpleado;
        this.area = area;
        this.cargo = cargo;
        this.salario = salario;
        this.emailInstitucional = emailInstitucional;
        this.numeroCuenta = numeroCuenta;
        this.fechaContratacion = fechaContratacion;
    }

    public Empleado(int idEmpleado, String area, String cargo, double salario, String emailInstitucional, int numeroCuenta, String fechaContratacion, int idPersona, String nombre, String cedula, String direccion, int telefono, String email, boolean genero, String fechaNacimiento) {
        super(idPersona, nombre, cedula, direccion, telefono, email, genero, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.area = area;
        this.cargo = cargo;
        this.salario = salario;
        this.emailInstitucional = emailInstitucional;
        this.numeroCuenta = numeroCuenta;
        this.fechaContratacion = fechaContratacion;
    }
    //2.2. M.ENCAPSULAMIENTO

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "IdPersona:"+getIdPersona()+"\n"+
                 "Nombre:"+getNombre()+"\n"+
                 "Cédula:"+getCedula()+"\n"+
                 "Dirección:"+getDireccion()+"\n"+
                 "Teléfono:"+getTelefono()+"\n"+
                 "Email:"+getEmail()+"\n"+
                 "Género:"+getGenero()+"\n"+
                 "Fecha de Nacimiento:"+getFechaNacimiento()+"\n"+
                "Id Empleado:"+getIdEmpleado();
    }
    
    
}
