import Constants.*;

import Singleton.*;
import Factory.*;
import Observer.*;
import Builder.*;
import Adapter.*;
import State.*;

public class Examen {
    public static void main(String[] args) {
        System.out.println("Examen I - Carlos Velásquez\n-----");

        boolean salir = false;

        while (!salir) {
            System.out.println(
                    "1) Singleton\n2) Factory\n3) Observer\n4) Builder\n5) Adapter\n6) State\n7) Salir del programa");
            System.out.print("\nIngrese el número del ejercicio a observar: ");

            int opcion = Constants.sc.nextInt();
            System.out.println("-----");

            switch (opcion) {
                case 1:
                    Singleton.run();
                    break;

                case 2:
                    Factory.run();
                    break;

                case 3:
                    Observer.run();
                    break;

                case 4:
                    Builder.run();
                    break;

                case 5:
                    Adapter.run();
                    break;

                case 6:
                    State.run();
                    break;

                case 7:
                    salir = true;
                    break;

                default:
                    System.out.println("\n[ERROR] Opción inválida, por favor intente de nuevo.\n-----");
                    break;
            }

            System.out.println("-----");
        }
    }
}