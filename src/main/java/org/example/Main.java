package org.example;
import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jugador objetoJugador = new Jugador();
        Scanner entradaPorTeclado=new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int opcionesMenú = 0;



        do {

            System.out.print("1. Agregar jugardor \n2. Buscar jugador \n3. Editar informacion de jugador \n4. Mostrar Convocatoria \n5. Salir");
            opcionesMenú = entradaPorTeclado.nextInt();

            switch (opcionesMenú){
                case 1:
                    System.out.println("****** SOLICITUD DE INFORMACION********");
                    System.out.println("**************************************");
                    System.out.print("Digite el numero de camiseta del jugador: ");
                    objetoJugador.setNumeroCamiseta(entradaPorTeclado.nextInt());
                    System.out.print("Digite el nombre del jugador: ");
                    objetoJugador.setNombre(entradaPorTeclado.nextLine());
                    System.out.print("Digite el apellido del jugador: ");
                    objetoJugador.setApellidos(entradaPorTeclado.nextLine());
                    System.out.print("Digite la edad del jugador: ");
                    objetoJugador.setEdad(entradaPorTeclado.nextInt());
                    System.out.print("Digite el equipo donde juega el jugador: ");
                    objetoJugador.setEquipo(entradaPorTeclado.nextLine());
                    System.out.print("Digite el numero de camiseta del jugador: ");
                    objetoJugador.setPosición(entradaPorTeclado.next());
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("SALIENDO DEL PROGRAMA");
                    break;
                default:
            }

        } while(opcionesMenú!=0);


    }
}