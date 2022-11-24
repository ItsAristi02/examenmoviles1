package org.example.clases;

public class Jugador {

    private String nombre;
    private int edad;
    private String apellidos; //principalmente la variable estaba declara como tipo boleean, se hizo la correción
    private String posicionJugador;
    private int numeroCamiseta;
    private String equipo;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String apellidos, String posición, int numeroCamiseta, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.posicionJugador = posición;
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

    public String getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;
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

    public String toString(){
        return "\n"+ numeroCamiseta +" "+ nombre +" "+ apellidos + " "+ edad + " "+ posicionJugador + " " + equipo;
    }
}
