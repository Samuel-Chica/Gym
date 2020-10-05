package gym;

import java.util.Date;


 public class Gym {

    private String nombre;
    private int numeroDeEntrenadores;
    private Date fechaDeFundacion;
    private String especialidad;
    private Boolean altoRendimiento;

    public Gym(String nombre, int numeroDeEntrenadores, Date fechaDeFundacion, String especialidad, Boolean altoRendimiento) {
        this.nombre = nombre;
        this.numeroDeEntrenadores = numeroDeEntrenadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.especialidad = especialidad;
        this.altoRendimiento = altoRendimiento;
    }
    
    /**
     * El metodo aumenta la cantidad de entrenadores del gimnasio en 97
     * y convierte el gimnasio en alto rendimiento
     */
    public void ampliarPersonal(){
        this.numeroDeEntrenadores += 97;
        this.altoRendimiento = true;
    }
    
    /*
    *Este metodo permite cambiar el nombre del gimnasio y su especialidad
     */
    public void aperturaMaquinas(String nuevoNombre, String nuevaEspecialidad){
        this.nombre = nuevoNombre;
        this.especialidad = nuevaEspecialidad;
        this.numeroDeEntrenadores += 11;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeEntrenadores() {
        return numeroDeEntrenadores;
    }

    public void setNumeroDeEntrenadores(int numeroDeEntrenadores) {
        this.numeroDeEntrenadores = numeroDeEntrenadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getAltoRendimiento() {
        return altoRendimiento;
    }

    public void setAltoRendimiento(Boolean altoRendimiento) {
        this.altoRendimiento = altoRendimiento;
    }
    
    
     
    public static void main(String[] args) {
       Gym gymUno = new Gym("Vida Fit",99,new Date(),"Pesas",false);
       Gym gymDos = new Gym("beefit",115,new Date(),"crossfit",true);
       
       System.out.println(gymUno.getNombre());
       System.out.println(gymUno.getNumeroDeEntrenadores());
       System.out.println(gymUno.getAltoRendimiento());
       
       gymUno.ampliarPersonal();
       
       System.out.println(gymUno.getNombre());
       System.out.println(gymUno.getNumeroDeEntrenadores());
       System.out.println(gymUno.getAltoRendimiento());
    }
    
}
