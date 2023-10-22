/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Alexis
 */
public class ViewModelEmpleado {
    
    //ATRIBUTOS
    private int ID_Empleado;
    private String DUI_Empleado;
    private int Isss_Empleado;
    private String nombres;
    private String apellido;
    private Date fechaNac;
    private String telefono;
    private String correo;
    
    
    //Setter y Getters



    /**
     * @return the ID_Empleado
     */
    public int getID_Empleado() {
        return ID_Empleado;
    }

    /**
     * @param ID_Empleado the ID_Empleado to set
     */
    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    /**
     * @return the DUI_Empleado
     */
    public String getDUI_Empleado() {
        return DUI_Empleado;
    }

    /**
     * @param DUI_Empleado the DUI_Empleado to set
     */
    public void setDUI_Empleado(String DUI_Empleado) {
        this.DUI_Empleado = DUI_Empleado;
    }

    /**
     * @return the Isss_Empleado
     */
    public int getIsss_Empleado() {
        return Isss_Empleado;
    }

    /**
     * @param Isss_Empleado the Isss_Empleado to set
     */
    public void setIsss_Empleado(int Isss_Empleado) {
        this.Isss_Empleado = Isss_Empleado;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechaNac
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
    
}
