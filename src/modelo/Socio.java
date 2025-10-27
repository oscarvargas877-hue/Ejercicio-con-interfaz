package modelo;

public class Socio extends Persona{
    private int idSocio;
    private int numCuenta;
    private String fechaIngreso;
    private String estado;//banderas"A":Activo,"I":Inactivo,"B":Bloqueado

    public Socio() {
    }

    public Socio(int idSocio, int numCuenta, String fechaIngreso, String estado) {
        this.idSocio = idSocio;
        this.numCuenta = numCuenta;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }
    
    public Socio(int idPersona, String nombre, String cedula, String direccion, int telefono, String email, boolean genero, String fechaNacimiento,int idSocio, int numCuenta, String fechaIngreso, String estado) {
        super(idPersona,nombre,cedula,direccion,telefono,email,genero,fechaNacimiento);
        this.idSocio = idSocio;
        this.numCuenta = numCuenta;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
                 "Fecha de Nacimiento:"+getFechaNacimiento()+"\n"+"Id Socio:"+getIdSocio()+"\n"+
                "Número de Cuenta:"+getNumCuenta()+"\n"+
                "Fecha de Ingreso:"+getFechaIngreso()+"\n"+
                "Estado:"+getEstado();}
    
    
    
   
}