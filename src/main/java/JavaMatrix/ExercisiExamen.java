package JavaMatrix;

import java.util.Scanner;

public class ExercisiExamen {
    public static void main(String[] args) {

        final String BLACK = "\033[40m";
        final String WHITE_TEXT = "\033[37m";
        final String RED = "\033[41m";
        final String GREEN = "\033[42m";
        final String YELLOW = "\033[43m";
        final String BLUE = "\033[44m";
        final String PURPLE = "\033[45m";
        final String CYAN = "\033[46m";
        final String WHITE = "\034[47m";
        final String RESET = "\u001B[0m";

        Scanner scanner = new Scanner(System.in);

        String[][] horari = {{"Mates","Català","Castellà","Anglès","Educació Física"},
                {"Socials", "Naturals","Tecnologia","Educació Plàstica"}
        };

        String[] torn = {"Matí", "Tarda"};
        String[] diesSetmana = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"};

        // Matí
        horari[0][0] = RED+"Mates"+RESET;
        horari[0][1] = "Català";
        horari[0][2] = WHITE+"Castellà"+RESET;
        horari[0][3] = YELLOW+"Anglès"+RESET;
        horari[0][4] = GREEN+"Educació Física"+RESET;

        // Tarda
        horari[1][0] = BLUE+"Socials"+RESET;
        horari[1][1] = GREEN+"Naturals"+RESET;
        horari[1][2] = WHITE_TEXT+BLACK+"Tecnologia"+RESET;
        horari[1][3] = PURPLE+"Educació Plàstica"+RESET;
        //horari[1][4] = "";

        int opcio = 0;
        System.out.println("Benvingut/da al programa");

        do {
            System.out.println("Tria una opció:"
                    + "\n\t1. Mostrar horari complet"
                    + "\n\t2. Mostrar horari de torn"
                    + "\n\t3. Mostrar horari d'un dia"
                    + "\n\t4. Canvia les assignatures d'un dia"
                    + "\n\t5. Sortir"
                    + "");

            // TODO: Aplicar control d'errors

            //if input not a number ask again
            while (!scanner.hasNextInt()) {
                System.out.println("Has d'introduir un número");
                scanner.next();
            }

            opcio = scanner.nextInt();

            scanner.nextLine();

            switch (opcio) {
                case 1:
                    for (int i = 0; i < diesSetmana.length; i++) {
                        System.out.printf("%15s",diesSetmana[i]);
                    }
                    System.out.println("");

                    for (int i = 0; i < horari.length; i++) {
                        System.out.print(torn[i]+"\t"); // Matí o Tarda
                        for (int col = 0; col < horari[i].length; col++) {
                            System.out.print(horari[i][col] + "\t\t");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:

                    for (int i = 0; i < diesSetmana.length; i++) {
                        System.out.printf("%15s",diesSetmana[i]);
                    }
                    System.out.println("");

                    for (int i = 0; i < 1; i++) {
                        System.out.print(torn[0] + "\t"); // Matí o Tarda

                        for (int col = 0; col < horari[0].length; col++) {
                            System.out.print(horari[0][col] + "\t\t");
                        }
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    // TODO: Implementar que permeti mostrar horari d'un dia concret
                    int opcio2 = 0;
                    System.out.println("Si vols que et mostri Dilluns, apreta 1 \n" +
                                        "Si vols que et mostri Dimarts apreta 2 \n" +
                                        "Si vols que et mostri Dimecres apreta 3 \n" +
                                        "Si vols que et mostri Dijous apreta 4\n" +
                                        "Si vols que et mostri Divendres apreta 5 \n");

                    opcio2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcio2){

                        case 1:
                            for (int i = 0; i < 1; i++) {
                                System.out.printf(diesSetmana[0] +"\n");
                            }
                            for (int i = 0; i < torn.length; i++) {
                                System.out.print(torn[i] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[i][j] + "\n");
                                }
                            }
                            break;

                        case 2:
                            for (int i = 0; i < 1; i++) {
                                System.out.printf(diesSetmana[1] +"\n");
                            }
                            for (int i = 0; i < 1; i++) {
                                System.out.print(torn[0] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[0][1] + "\n");
                                }
                            }
                            for (int i = 0; i < 1; i++) {
                                System.out.print(torn[1] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[1][1] + "\n");
                                }
                            }
                            break;
                        case 3:
                            for (int i = 0; i < 1; i++) {
                                System.out.printf(diesSetmana[1] +"\n");
                            }
                            for (int i = 0; i < 1; i++) {
                                System.out.print(torn[0] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[0][2] + "\n");
                                }
                            }
                            for (int i = 0; i < 1; i++) {
                                System.out.print(torn[1] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[1][2] + "\n");
                                }
                            }
                            break;
                        case 4:
                            for (int i = 0; i < 1; i++) {
                                System.out.printf(diesSetmana[1] +"\n");
                            }
                            for (int i = 0; i < 1; i++) {
                                System.out.print(torn[0] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[0][3] + "\n");
                                }
                            }
                            for (int i = 0; i < 1; i++) {
                                System.out.print(torn[1] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[1][3] + "\n");
                                }
                            }
                            break;
                        case 5:
                            for (int i = 0; i < 1; i++) {
                                System.out.printf(diesSetmana[1] +"\n");
                            }
                            for (int i = 0; i < 1; i++) {
                                System.out.print(torn[0] + "\n"); // Matí o Tarda
                                for (int j = 0; j < 1; j++) {
                                    System.out.println(horari[0][4] + "\n");
                                }
                            }
                            break;
                    }
                    break;

                case 4:
                    int dia = 0;
                    String mati;
                    String tarda;

                    System.out.println("De quin dia vols canviar l'horari? ");
                    dia = scanner.nextInt();
                    System.out.println("Quina assignatura del mati vols:");
                    mati  = scanner.next();
                    System.out.println("Quna assignatura de la tarda vols: ");
                    tarda = scanner.next();

                    if (dia == 1) {
                        for (int i = 0; i < 1; i++) {
                            System.out.printf(diesSetmana[0] +"\n");
                        }
                        for (int i = 0; i < 1; i++) {
                            System.out.print(torn[0] + "\n"); // Matí o Tarda
                                System.out.println(mati);
                        }
                        for (int i = 0; i < 1; i++) {
                            System.out.print(torn[1] + "\n"); // Matí o Tarda
                            System.out.println(tarda);
                        }
                    }

                    break;

                case 5:
                    System.out.println("Adéu i gràcies");
                    break;
                default:
                    System.out.println(RED + "ERROR: Valor no vàlid" + RESET);
                    break;
            }
        }while(opcio != 4);

    }
}


