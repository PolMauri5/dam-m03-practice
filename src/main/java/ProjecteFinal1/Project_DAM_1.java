package ProjecteFinal1;
import java.util.Objects;
import java.util.Scanner;

public class Project_DAM_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] username = new String[10];
        String[] password = new String[10];
        int exit;
        int option = 0;

        System.out.println("Bienvenido a la aplicacion");

        do {
            System.out.println("1. Register" + "\n" + "2. Login" + "\n" + "3. Entrar root" + "\n" + "4. Cambiar usuario o contraseña" + "\n" +  "5. Salir" + "\n" + "Pista: inicia sesion como 'pikachu'");

            while (!scanner.hasNextInt()) {
                System.out.println("Tienes que introducir un numero");
                scanner.next();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.println("Introduce tu nombre de usuario: ");
                    String user = scanner.nextLine();

                    while (user.toUpperCase().equals("GUEST") || user.toUpperCase().equals("ROOT")) {
                        System.out.println("El nombre de usuario no puede ser GUEST o ROOT");
                        System.out.println("Introduce tu nombre de usuario: ");
                        user = scanner.nextLine();
                    }

                    for (int i = 0; i < username.length; i++) {
                        if (username[i] == null) {
                            username[i] = user;
                            break;
                        }
                        while (username[i].equals(user)) {
                            System.out.println("El usuario ya existe");
                            System.out.println("Introduce tu nombre de usuario: ");
                            user = scanner.nextLine();
                        }
                    }

                    System.out.println("Introduce tu contraseña: ");
                    String pass = scanner.nextLine();

                    while (pass.length() < 1 ||
                            !pass.matches(".*[!@#$%&?^*()-+,=<>/].*") ||
                            !pass.matches(".*[0-9].*") ||
                            !pass.matches(".*[A-Z].*") ||
                            !pass.matches(".*[a-z].*")) {

                        System.out.println("La contrtaseña debe tener: Mas de 8 caracteres, un numero, una mayuscula y una minuscula");
                        System.out.println("Introdece tu contraseña: ");
                        pass = scanner.nextLine();
                    }

                    for (int i = 0; i < password.length; i++) {
                        if (password[i] == null) {
                            password[i] = pass;
                            break;
                        }
                    }
                    break;

                case 2:
                    boolean login = false;
                    boolean pikachuLogin = false;

                    System.out.println("Introduce tu nombre de usuario: ");
                    String user2 = scanner.nextLine();
                    for (int i = 0; i < username.length; i++) {
                        if (username[i] == null) {
                            System.out.println("El usuario no existe");
                            break;
                        }
                        if (username[i].equals(user2) && !user2.equals("pikachu")) {
                            System.out.println("Introduce tu contraseña: ");
                            String pass2 = scanner.nextLine();
                            if (Objects.equals(password[i], pass2)) {
                                System.out.println("Bienvenido " + username[i]);
                                login = true;
                            } else {
                                System.out.println("Contraseña incorrecta");
                            }
                            break;

                        } else if (username[i].equals(user2) && user2.equals("pikachu")) {
                            System.out.println("Introduce tu contraseña: ");
                            String pass2 = scanner.nextLine();
                            if (Objects.equals(password[i], pass2)) {
                                pikachuLogin = true;
                            } else {
                                System.out.println("Contraseña incorrecta");
                            }
                            break;
                        }
                    }
                    if (pikachuLogin) {
                        int pikachuHealth = 100;
                        int charizardHealth = 100;
                        int pikachuAttack1 = 20;
                        int pikachuAttack2 = 30;
                        int pikachuAttack3 = 60;
                        int charizardAttack1 = 20;
                        int charizardAttack2 = 30;
                        int charizardAttack3 = 60;
                        int random = 0;
                        int random2 = 0;
                        int ataques = 0;
                        int tirada = 0;
                        random = (int) (Math.random() * 2);

                        System.out.println("Bienvenido " + user2 + " acabas de entrar al combate mas epico de toda tu vida \n" + "Pikachu vs Charizard \n");

                        if (random == 1) {
                            tirada++;
                        }
                        do {


                            while (tirada % 2 == 0) {
                                System.out.println("Pikachu ataca: \n");
                                System.out.println("Que ataque quieres usar? \n");
                                System.out.println("1. Ataque rapido");
                                System.out.println("2. Ataque relampago");
                                System.out.println("3. Ataque bola voltio");

                                ataques = scanner.nextInt();

                                if (ataques == 1) {
                                    charizardHealth = charizardHealth - pikachuAttack1;
                                    System.out.println("Charizard tiene " + charizardHealth + " de vida");
                                    tirada++;
                                } else if (ataques == 2) {
                                    random2 = (int) (Math.random() * 5 + 1);
                                    if (random2 == 1) {
                                        System.out.println("El ataque fallo");
                                        tirada++;
                                    } else {
                                        charizardHealth = charizardHealth - pikachuAttack2;
                                        System.out.println("Charizard tiene " + charizardHealth + " de vida");
                                        tirada++;
                                    }
                                } else if (ataques == 3) {
                                    random2 = (int) (Math.random() * 2 + 1);
                                    if (random2 == 1) {
                                        System.out.println("El ataque fallo");
                                        tirada++;
                                    } else {
                                        charizardHealth = charizardHealth - pikachuAttack3;
                                        System.out.println("Charizard tiene " + charizardHealth + " de vida");
                                        tirada++;
                                    }
                                }
                            }
                            while (tirada % 2 != 0) {
                                System.out.println("Charizard ataca");
                                System.out.println("Que ataque quieres usar?");
                                System.out.println("1. Mordisco");
                                System.out.println("2. Ataque ala");
                                System.out.println("3. Ataque fuego");
                                ataques = scanner.nextInt();
                                if (ataques == 1) {
                                    pikachuHealth = pikachuHealth - charizardAttack1;
                                    System.out.println("Pikachu tiene " + pikachuHealth + " de vida");
                                    tirada++;
                                } else if (ataques == 2) {
                                    random2 = (int) (Math.random() * 5 + 1);
                                    if (random2 == 1) {
                                        System.out.println("El ataque fallo");
                                        tirada++;
                                    } else {
                                        pikachuHealth = pikachuHealth - charizardAttack2;
                                        System.out.println("Pikachu tiene " + pikachuHealth + " de vida");
                                        tirada++;
                                    }
                                } else if (ataques == 3) {
                                    random2 = (int) (Math.random() * 2 + 1);
                                    if (random2 == 1) {
                                        System.out.println("El ataque fallo");
                                        tirada++;
                                    } else {
                                        pikachuHealth = pikachuHealth - charizardAttack3;
                                        System.out.println("Pikachu tiene " + pikachuHealth + " de vida");
                                        tirada++;
                                    }
                                }
                            }
                        } while (pikachuHealth >= 1 && charizardHealth >= 1);

                    }

                break;

                case 3:
                    String root = "root";
                    System.out.println("Inroduce la contraseña de root: ");
                    String passRoot = scanner.nextLine();
                    if (passRoot.equals(root)) {
                        System.out.println("Bienvenido root");
                        System.out.println("1. Mostrar usuarios" + "\n" + "2. Mostrar contraseñas" + "\n" + "3. Cambiar nombre de usuario" + "\n" + "4. Cambiar contraseña" + "\n" + "5. Eliminar un usuario" + "\n" + "6. Salir");
                        int optionRoot = scanner.nextInt();
                        scanner.nextLine();

                        switch (optionRoot) {
                            case 1:
                                int count1 = 1;
                                for (String s : username) {
                                    if (s == null) {
                                        break;
                                    }
                                    System.out.println(count1 + " " + s + "\n");
                                    count1++;
                                }
                                System.out.println("Si quiere salir pulse 1");
                                exit = scanner.nextInt();
                                if (exit == 1) {
                                    break;
                                }
                                break;

                            case 2:
                                int count2 = 1;
                                for (String s : password) {
                                    if (s == null) {
                                        break;
                                    }
                                    System.out.println(count2 + " " + s + "\n");
                                    count2++;
                                }
                                System.out.println("Si quiere salir pulse 1");
                                exit = scanner.nextInt();
                                if (exit == 1) {
                                    break;
                                }
                                break;

                            case 3:
                                System.out.println("Introduce el nombre de usuario que quieres cambiar: ");
                                String userChange = scanner.nextLine();
                                for (int i = 0; i < username.length; i++) {
                                    if (username[i] == null) {
                                        System.out.println("El usuario no existe");
                                        break;
                                    }
                                    if (username[i].equals(userChange)) {
                                        System.out.println("Introduce el nuevo nombre de usuario: ");
                                        String userChange2 = scanner.nextLine();
                                        username[i] = userChange2;
                                        System.out.println("El nombre de usuario ha sido cambiado");
                                        break;
                                    }
                                }
                                System.out.println("Si quiere salir pulse 1");
                                exit = scanner.nextInt();
                                if (exit == 1) {
                                    break;
                                }
                                break;

                            case 4:
                                System.out.println("Introduce el nombre de usuario del que quieres cambiar la contraseña: ");
                                String userChangePass = scanner.nextLine();
                                for (int i = 0; i < username.length; i++) {
                                    if (username[i] == null) {
                                        System.out.println("El usuario no existe");
                                        break;
                                    }
                                    if (username[i].equals(userChangePass)) {
                                        System.out.println("Introduce la nueva contraseña: ");
                                        String passChange = scanner.nextLine();
                                        password[i] = passChange;
                                        System.out.println("La contraseña ha sido cambiada");
                                        break;
                                    }
                                }
                                System.out.println("Si quiere salir pulse 1");
                                exit = scanner.nextInt();
                                if (exit == 1) {
                                    break;
                                }
                                break;

                            case 5:
                                System.out.println("Introduce el nombre de usuario que quieres eliminar: ");
                                String userDelete = scanner.nextLine();
                                for (int i = 0; i < username.length; i++) {
                                    if (username[i] == null) {
                                        System.out.println("El usuario no existe");
                                        break;
                                    }
                                    if (username[i].equals(userDelete)) {
                                        username[i] = null;
                                        password[i] = null;
                                        for (int j = i; j < username.length - 1; j++) {
                                            username[j] = username[j + 1];
                                            password[j] = password[j + 1];
                                        }
                                        System.out.println("El usuario ha sido eliminado");
                                        break;
                                    }
                                }
                                System.out.println("Si quiere salir pulse 1");
                                exit = scanner.nextInt();
                                if (exit == 1) {
                                    break;
                                }
                                break;

                            case 6:
                                System.out.println("Saliendo...");
                                break;
                        }


                    } else {
                        System.out.println("Contraseña incorrecta");
                    }

                    break;

                case 4:
                    System.out.println("Has olvidado la contraseña? Introduce tu nombre de usuario: ");
                    String userForgot = scanner.nextLine();
                    for (int i = 0; i < username.length; i++) {
                        if (username[i] == null) {
                            System.out.println("El usuario no existe");
                            break;
                        }
                        if (username[i].equals(userForgot)) {
                            System.out.println("Introduce tu nueva contraseña: ");
                            String passForgot = scanner.nextLine();
                            password[i] = passForgot;
                            System.out.println("La contraseña ha sido cambiada");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (option != 6);
    }
}
