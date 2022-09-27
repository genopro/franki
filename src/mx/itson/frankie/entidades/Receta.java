/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.frankie.entidades;

import java.util.List;
import mx.itson.frankie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Receta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the numeroPorciones
     */
    public int getNumeroPorciones() {
        return numeroPorciones;
    }

    /**
     * @param numeroPorciones the numeroPorciones to set
     */
    public void setNumeroPorciones(int numeroPorciones) {
        this.numeroPorciones = numeroPorciones;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the ingrediente
     */
    public List<ingredientes> getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente the ingrediente to set
     */
    public void setIngrediente(List<ingredientes> ingrediente) {
        this.ingrediente = ingrediente;
    }

    /**
     * @return the pasos
     */
    public List<paso> getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(List<paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * @return the dificultad
     */
    public Dificultad getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

   
    private String nombre;
    private String descripcion;
    private int numeroPorciones;
    private int duracion;
    private List<ingredientes> ingrediente;
    private List<paso> pasos;
    private Dificultad dificultad;
    
    //Agregar pasos
    
    receta.setDoficultad(Dificultad.LEGENDARIO);
}
