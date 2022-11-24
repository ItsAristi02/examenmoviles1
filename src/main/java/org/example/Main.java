package org.example;
import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entradaPorTeclado=new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int opcionesMenú = 0;
        int contadorJugadores =0;

        do {
            System.out.println();
            System.out.println("******* PREMIER LEAGUE ********");
            System.out.println("*******************************");
            System.out.println("1. Agregar jugador \n2. Buscar jugador \n3. Editar informacion de jugador " +
                    "\n4. Mostrar Convocatoria \n5. Salir");
            System.out.print("INGRESE UNA OPCION: ");
            System.out.println();
            opcionesMenú = entradaPorTeclado.nextInt();

            switch (opcionesMenú){
                case 1:
                    Jugador objetoJugador = new Jugador();
                    if (contadorJugadores == 23 ){
                        System.out.println("La convocatoria de jugadores esta llena");
                    }else{


                        System.out.println("****** SOLICITUD DE INFORMACION********");
                        System.out.println("**************************************");
                        System.out.print("Digite el numero de camiseta del jugador: ");
                        objetoJugador.setNumeroCamiseta(entradaPorTeclado.nextInt());
                        System.out.print("Digite el nombre del jugador: ");
                        objetoJugador.setNombre(entradaPorTeclado.next());
                        System.out.print("Digite el apellido del jugador: ");
                        objetoJugador.setApellidos(entradaPorTeclado.next());
                        System.out.print("Digite la edad del jugador: ");
                        objetoJugador.setEdad(entradaPorTeclado.nextInt());
                        System.out.print("Digite la posicion del jugador: ");
                        objetoJugador.setPosicionJugador(entradaPorTeclado.next());
                        System.out.print("Digite el equipo donde juega el jugador: ");
                        objetoJugador.setEquipo(entradaPorTeclado.next());
                        System.out.println();

                        jugadores.add(objetoJugador);

                        contadorJugadores++;
                    }
                        System.out.println();
                        System.out.println("Haz convocado "+contadorJugadores + " jugadores");
                        System.out.println();
                    break;

                case 2:
                    boolean encontrarJugador = false;
                    int buscarCamiseta;
                    System.out.println("Ingrese el numero de camiseta: ");
                    buscarCamiseta= entradaPorTeclado.nextInt();
                    for (int i = 0; i < jugadores.size(); i++){
                        Jugador jugador=jugadores.get(i);
                        if (Objects.equals(jugador.getNumeroCamiseta(), buscarCamiseta)){
                            System.out.println();
                            System.out.println("El nombre del jugador es: "+jugador.getNombre());
                            System.out.println("El apellido del jugador es: "+jugador.getApellidos());
                            System.out.println("El jugador tiene: "+jugador.getEdad()+ "años");
                            System.out.println("El jugador tiene la posicion de: "+jugador.getPosicionJugador());
                            System.out.println("El jugador hace parte del equipo: "+jugador.getEquipo());
                            System.out.println();
                            encontrarJugador=false;
                            break;
                        }else {
                            encontrarJugador=true;
                        }
                    }
                    if (encontrarJugador) {
                        System.out.println();
                        System.out.println("El JUGADOR NO EXISTE");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("El JUGADOR FUE ENCONTRADO CON EXITO");
                        System.out.println();
                    }
                    break;


                case 3:
                    int editarJugador;
                    System.out.println("Ingrese el número de camiseta del jugador que quiere editar: ");
                    editarJugador = entradaPorTeclado.nextInt();
                    int opcionEditar;

                    for (int i = 0; i < jugadores.size(); i++) {
                        Jugador jugador=jugadores.get(i);
                        if(Objects.equals(jugador.getNumeroCamiseta(), editarJugador)){
                            System.out.println("****El jugador se encuentra en la convocatoria****");

                            int opcionesEditar;
                            do {

                                System.out.println("1. Editar numero de camiseta \n2. Editar nombres del jugador \n3. Editar apellidos del jugador " +
                                        "\n4. Editar la posicion del jugador \n5. Editar la edad del jugador \n6. Editar equipo donde juega " +
                                        "\n7. Salir del editor de jugador");
                                opcionesEditar = entradaPorTeclado.nextInt();

                                switch (opcionesEditar){
                                    case 1:
                                        int nuevoNumeroCamiseta;
                                        System.out.print("Ingrese el nuevo numero de la camiseta del jugador: ");
                                        nuevoNumeroCamiseta = entradaPorTeclado.nextInt();
                                        for (Jugador datosJugador: jugadores) {
                                            if (Objects.equals(datosJugador.getNumeroCamiseta(),nuevoNumeroCamiseta)){
                                                System.out.println("El número ya existe");
                                            }else{
                                                jugador.setNumeroCamiseta(nuevoNumeroCamiseta);
                                                System.out.println("cambio de numero hecho");
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo nombre del jugador: ");
                                        jugador.setNombre(entradaPorTeclado.next());
                                        break;
                                    case 3:
                                        System.out.print("Ingrese el nuevo apellido del jugador: ");
                                        jugador.setApellidos(entradaPorTeclado.next());
                                        break;

                                    case 4:
                                        System.out.print("Ingrese la nueva posición del jugador:");
                                        jugador.setPosicionJugador(entradaPorTeclado.next());
                                        break;

                                    case 5:
                                        System.out.print("Edite la edad del jugador: ");
                                        int editarEdad = entradaPorTeclado.nextInt();
                                        jugador.setEdad(editarEdad);
                                        break;

                                    case 6:
                                        System.out.print("Ingrese el nuevo equipo del jugador: ");
                                        jugador.setEquipo(entradaPorTeclado.next());
                                        break;

                                    case 7:
                                        System.out.println("Saliendo del editor");
                                        break;

                                    default:
                                        System.out.println("Opcion no valida");

                                }// fin switch editar jugador

                            }while (opcionesEditar != 7);
                        }else{
                            System.out.println("EL JUGADOR NO FUE ENCONTRADO");
                        }
                    }
                     break;
                case 4:
                    System.out.println();
                    System.out.println("LOS CONVOCADOS FUERON:");
                    for (Jugador jugador:jugadores){
                    System.out.println(jugador.toString());}
                    break;
                case 5:
                    System.out.println("SALIENDO DE LA CONVOCATORIA");
                    break;
                default:
            }

        } while(opcionesMenú!=5);


    }
}