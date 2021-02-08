/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;
        boolean mainLoop = true;
        int option;
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("\n");
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "|     Touristic Places Of Quito      |" + "\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "|  Hello, Where are we going today?  |"
                    + "\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("| 1. Parks                           |");
            System.out.println("| 2. Churches                        |");
            System.out.println("| 3. Square                          |");
            System.out.println("| 4. Viewpoints                      |");
            System.out.println("| 5. Malls                           |");
            System.out.println("| 6. Exit                            |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "______________________________________");

            System.out.println(name + " Enter your option  ");
            System.out.print("--> ");
            option = input.nextInt();
            System.out.println("______________________________________");
            switch (option) {
                case 1:
                    int optionP;
                    do {
                        System.out.println("~~~~~~~~~~~~~~"
                                + "\n" + "| The parks in Quito:" + "\n"
                                + "~~~~~~~~~~~~~~");
                        System.out.println("| 1.Quito metopolitan park           |");
                        System.out.println("| 2.Itchimbia park                   |");
                        System.out.println("| 3.Carolina park                    |");
                        System.out.println("| 4. Exit                            |");
                        System.out.println("~~~~~~~~~~~~~~" + "\n"
                                + "______________");

                        System.out.println(name + " Enter yout option  ");
                        System.out.print("--> ");
                        optionP = input.nextInt();
                        System.out.println("______________");
                        switch (optionP) {
                            case 1:
                                System.out.println("Calle Manrique Lara,Quito");
                            case 2:
                                System.out.println("Calle Itchimbia,Quito");
                            case 3:
                                System.out.println("Av Naciones Unidas y Av De los Shyris ");
                            case 4:
                        }
                    } while (optionP != 4);

                    break;
                case 2:
                    int optionChurches;
                    do {
                        optionChurches = optionChurches(input);
                        switch (optionChurches) {

                            case 1:

                                TheBasilica(name, input);

                                break;

                            case 2:
                                ChurchOfSantoDomingo(name, input);
                                break;

                            case 3:
                                ChurchOfElSagrario(name, input);
                                break;
                            case 4:
                                System.out.println("Good bye " + name + "come back soon");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (optionChurches != 4);
                    int optionQ = 0;
                    do {
                        System.out.println("~~~~~~~~~~~~~~"
                                + "\n" + "| The parks in Quito:" + "\n"
                                + "~~~~~~~~~~~~~~");
                        System.out.println("| 1.Plaza Grande            |");
                        System.out.println("| 2.Plaza del Teatro                   |");
                        System.out.println("| 3.Plaza las Americas                    |");
                        System.out.println("| 4. Exit                            |");
                        System.out.println("~~~~~~~~~~~~~~" + "\n"
                                + "______________");

                        System.out.println(name + " Enter yout option  ");
                        System.out.print("--> ");
                        optionP = input.nextInt();
                        System.out.println("______________");
                        switch (optionQ) {
                            case 1:
                                System.out.println("and Chile St Venezuela,"
                                        + " García Moreno, Quito 170401");
                            case 2:
                                System.out.println("Calle Guayaquil entre "
                                        + "Manabi y Flores, Quito 170150");
                            case 3:
                                System.out.println("Avenida NNUU Oe4-27 y,"
                                        + "a Av. de la República, Quito ");
                            case 4:
                        }
                    } while (optionP != 4);

                    break;
                case 3:

                case 4:
                    int optionV;
                    do {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                + "\n" + "| The Viewpoints In Quito:" + "\n"
                                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("| 1.Panecillo                        |");
                        System.out.println("| 2.Viewpoint the Guapulo            |");
                        System.out.println("| 3.Viewpoint the Cruz Loma          |");
                        System.out.println("| 4. Exit                            |");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                + "\n" + "______________________________________");

                        System.out.println(name + " Enter yout option  ");
                        System.out.print("--> ");
                        optionV = input.nextInt();
                        System.out.println("______________________________________");
                        switch (optionV) {
                            case 1:
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                        + "\n" + "| The Viewpoints Panecillo:" + "\n"
                                        + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("The Ubication" + "sector historical Center");
                                System.out.println("Direction: Cumbre del Panecillo, "
                                        + "Gral Melchor Aymerich");
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "Panecillo");
                                    {
                                        int panecillo;
                                        do {
                                            System.out.println(name + " you know how to get " + "there?");
                                            System.out.println("1. Yes");
                                            System.out.println("2. No");
                                            panecillo = input.nextInt();
                                            switch (panecillo) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (panecillo != 2);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                        + "\n" + "| The Viewpoints Guapulo" + "\n"
                                        + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("The Ubication" + " Sector Guapulo");
                                System.out.println("Direction: the intersection "
                                        + "of Av. Rafael León and Stubel.");
                                 {
                                    {
                                        int Mall_El_Jardin;
                                        do {
                                            System.out.println(name + " you know how to get " + "there?");
                                            System.out.println("1. Yes");
                                            System.out.println("2. No");
                                            Mall_El_Jardin = input.nextInt();
                                            switch (Mall_El_Jardin) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (Mall_El_Jardin != 2);
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                        + "\n" + "| The Viewpoints cruz loma:" + "\n"
                                        + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("The Ubication" + " Lloa Parish");
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "CRUZ LOMA");
                                    {
                                        int Mall_El_Jardin;
                                        do {
                                            System.out.println(name + " you know how to get " + "there?");
                                            System.out.println("1. Yes");
                                            System.out.println("2. No");
                                            Mall_El_Jardin = input.nextInt();
                                            switch (Mall_El_Jardin) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (Mall_El_Jardin != 2);
                                    }
                                }
                                break;
                            case 4:
                        }
                    } while (optionV != 4);
                    break;
                case 5:
                    int optionMalls;
                    do {
                        System.out.println("~~~~~~~~~~~~ Malls in Quito ~~~~~~~~~~~~");
                        System.out.println(" I will give you several options, the most common: ");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("|1.Quicentro_North        |");
                        System.out.println("|2.CCI                    |");
                        System.out.println("|3.Mall_El_Jardin         |");
                        System.out.println("|4. Exit                  |");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        optionMalls = input.nextInt();
                        switch (optionMalls) {

                            case 1:

                                System.out.println(name + "Let's go to Quicentro_North");
                                System.out.println("The Ubication" + " Of The Quicentro_North Is:");
                                System.out.println("Direction: Avenida Naciones Unidas "
                                        + "between Avenida 6 de Diciembre and, "
                                        + "Av. de los Shyris. Quito");
                                 {
                                    int Quicentro_North;
                                    do {
                                        System.out.println(name + "you know how to get " + "there?");
                                        System.out.println("1. Yes");
                                        System.out.println("2. No");
                                        Quicentro_North = input.nextInt();
                                        switch (Quicentro_North) {
                                            case 1:
                                                System.out.println(name + "have a good trip,"
                                                        + " follow the direction given,"
                                                        + " we will be accompanying you");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                System.out.println("we will stay at your original point");
                                                break;
                                        }
                                    } while (Quicentro_North != 2);
                                }

                                break;

                            case 2:
                                System.out.println(name + "Let's go to CCI");
                                System.out.println("The Ubication" + " Of The CCI Is:");
                                System.out.println("Diretion: Av. Amazonas N36-152 "
                                        + "y Naciones Unidas. Quito 170102");
                                 {
                                    System.out.println("Let's go to Viewpoint " + "CCI");
                                    {
                                        int CCI;
                                        do {
                                            System.out.println(name + " you know how to get "
                                                    + "there?");
                                            System.out.println("1. Yes");
                                            System.out.println("2. No");
                                            CCI = input.nextInt();
                                            switch (CCI) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given"
                                                            + " we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at "
                                                            + "your original point");
                                                    break;
                                            }
                                        } while (CCI != 2);
                                    }
                                }
                                break;

                            case 3:
                                System.out.println(name + "Let's go to Mall_El_Jardin");
                                System.out.println("The Ubication" + " Of The Mall_El_Jardin Is:");
                                System.out.println("Direction: Av.Amazonas, Av. de la República N16-114 "
                                        + "y, Quito 170518");
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "Mall_El_Jardin");
                                    {
                                        int Mall_El_Jardin;
                                        do {
                                            System.out.println(name + " you know how to get " + "there?");
                                            System.out.println("1. Yes");
                                            System.out.println("2. No");
                                            Mall_El_Jardin = input.nextInt();
                                            switch (Mall_El_Jardin) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (Mall_El_Jardin != 2);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Good bye " + name + "come back soon");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (optionMalls != 4);

                    break;
                case 6:
                    System.out.println("Good bay " + name);
                    System.exit(0);
                    break;
            }

        } while (option!= 6);

    }

    private static void ChurchOfElSagrario(String name, Scanner input) {
        System.out.println(name + "Let's go to Church Of El Sagrario");
        System.out.println("The Ubication" + " Of Church Of El Sagrario Is:");
        System.out.println("Direction: Quito's Historic center "
                + "García Moreno y Espejo");
        {
            System.out.println(name + "Let's go to Churches "
                    + "Church Of El Sagrario");
            {
                int Church_Of_El_Sagrario;
                do {
                    System.out.println(name + " you know how to get " + "there?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    Church_Of_El_Sagrario = input.nextInt();
                    switch (Church_Of_El_Sagrario) {
                        case 1:
                            System.out.println(name + "have a good trip, "
                                    + "follow the direction given, "
                                    + "we will be accompanying you");
                            System.exit(0);
                            break;
                        case 2:
                            System.out.println("we will stay at your original point");
                            break;
                    }
                } while (Church_Of_El_Sagrario != 2);
            }
        }
    }

    private static void ChurchOfSantoDomingo(String name, Scanner input) {
        System.out.println(name + "Let's go to Church Of Santo Domingo");
        System.out.println("The Ubication" + " Of Church Of Santo Domingo Is:");
        System.out.println("Diretion: Quito's Historic center "
                + "Calle Flores y Pereira");
        {
            System.out.println("Let's go to Churches " + "Church Of Santo Domingo");
            {
                int Church_Of_Santo_Domingo;
                do {
                    System.out.println(name + " you know how to get "
                            + "there?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    Church_Of_Santo_Domingo = input.nextInt();
                    switch (Church_Of_Santo_Domingo) {
                        case 1:
                            System.out.println(name + "have a good trip, "
                                    + "follow the direction given"
                                    + " we will be accompanying you");
                            System.exit(0);
                            break;
                        case 2:
                            System.out.println("we will stay at "
                                    + "your original point");
                            break;
                    }
                } while (Church_Of_Santo_Domingo != 2);
            }
        }
    }

    private static void TheBasilica(String name, Scanner input) {
        System.out.println(name + "Let's go to The Basilica");
        System.out.println("The Ubication" + " Of The Basilica Is:");
        System.out.println("Direction: Quito's Historic center "
                + "between the streets, "
                + "Carchi N122 y Venezuela");
        {
            int The_Basilica;
            do {
                System.out.println(name + "you know how to get " + "there?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                The_Basilica = input.nextInt();
                switch (The_Basilica) {
                    case 1:
                        System.out.println(name + "have a good trip,"
                                + " follow the direction given,"
                                + " we will be accompanying you");
                        System.exit(0);
                        break;
                    case 2:
                        System.out.println("we will stay at your original point");
                        break;
                }
            } while (The_Basilica != 2);
        }
    }

    private static int optionChurches(Scanner input) {
        int optionChurches;
        System.out.println("~~~~~~~~~~~~ Churches in Quito ~~~~~~~~~~~~");
        System.out.println(" I will give you several options, the most common: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|1. The Basilica                 |");
        System.out.println("|2. Church Of Santo Domingo      |");
        System.out.println("|3. Church Of El Sagrario        |");
        System.out.println("|4. Exit                         |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        optionChurches = input.nextInt();
        return optionChurches;
    }

}
