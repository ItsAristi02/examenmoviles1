package org.example.clases;

public class Jugador {

    public String nombre;
    public int edad;
    public String apellidos; //principalmente la variable estaba declarada como boolean
    public String posición;
    public int numeroCamiseta;
    public String equipo;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String apellidos, String posición, int numeroCamiseta, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.posición = posición;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
