import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.xml.crypto.Data;

public class SmartBankinApp2 {
    private static final Scanner scanner = new Scanner(System.in);
    final static String CLEAR = "\033[H\033[2J";
    final static String GREEN_COLOR = "\033[32m";
    final static String RESET_COLOR = "\033[0m";
    final static String RED_BOLD = "\033[35;1m";
    final static String REST_BOLD_COLOR = "\033[0;0m";
    final static String YELLO_COLOR = "\033[33m";
    final static String RED_COLOR_BOLD = "\033[31;1m";

    final static String DOTTED_LINE = String.format("%s%s%s", GREEN_COLOR, "-".repeat(75), RESET_COLOR);
    final static String OPTION_LINE = String.format("%s%s%s", YELLO_COLOR, "%s", RESET_COLOR);
    final static String ERROR_LINE = String.format("%s%s%s", RED_COLOR_BOLD, "%s", REST_BOLD_COLOR);
    final static String APP_TITLE = String.format("%s%s%s", RED_BOLD,
            " ".repeat((75 - "%1$s".length() - 20) / 2) + "%1$s",
            REST_BOLD_COLOR);
    final static String FINAL_APP_TITLE = String.format("%s\n%s\n%s", DOTTED_LINE, String.format(APP_TITLE, "%s"),
            DOTTED_LINE);
    final static String SUCCESSFULL_MESSAGE = String.format("%s%s%s", GREEN_COLOR, "%s", RESET_COLOR);

    final static String DASHBOARD = "Welcome to SMART Banking";
    final static String ADD_ACCOUNT = "Create new Account";
    final static String DEPOSITE = "DEPOSITE";
    final static String WITHDRAW = "WITHDRAW";
    final static String TRANSFER = "TRANSFER";
    final static String PRINT_STATEMENT = "PRINT_STATEMENT";
    final static String DELETE_ACCOUNT = "DELETE_ACCOUNT";

    static String screen = DASHBOARD;

    final static String branchCode = "SDB-";

    static String idStringMain;
    static String nameStringMain;
    static double depositeMain;

    static String add_Yes_No_Option;

    static ArrayList<String[]> bankDetails = new ArrayList<>();
    static String[] accountDetails1;

    public static void main(String[] args) throws InterruptedException {
        String[] newString = { "SDB-00001", "Dak", "6000" };
        String[] newString2 = { "SDB-00002", "Has", "6000" };
        bankDetails.add(newString);
        bankDetails.add(newString2);

        // String[][] bankDetails = new String[0][3];

        loopMain: do {
            // System.out.println(CLEAR);
            System.out.println(String.format(FINAL_APP_TITLE + "\n", screen));

            for (int i = 0; i < bankDetails.size(); i++) {
                System.out.println(Arrays.toString(bankDetails.get(i)));
            }

            // System.out.println(Arrays.toString(bankDetails[i][1]));
            // System.out.println(Arrays.toString(bankDetails[i][2]));
            switch (screen) {
                case DASHBOARD:
                    dashBoard();

                    break;

                case ADD_ACCOUNT:
                    addAccount();
                    break;
                // idStringMain = branchCode + String.format("%05d", bankDetails.size() + 1);
                // System.out.println("ID : " + idStringMain);

                // //Initialize temp array with name Account Details
                // accountDetails1 = new String[3];

                // // add name
                // loopAddName: do {
                // System.out.print("Enter Account holder's name : ");
                // nameStringMain = scanner.nextLine().strip();

                // if (nameStringMain.isBlank()) {
                // System.out.println(String.format(ERROR_LINE, "Name can't be empty!\n"));

                // // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

                // System.out.print("Do you want to enter again? (Y/N)");
                // add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                // if (add_Yes_No_Option.equals("Y")) {
                // System.out.println();
                // System.out.println("ID : " + idStringMain);
                // continue loopAddName;
                // } else {
                // screen = DASHBOARD;
                // continue loopMain;
                // }

                // // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                // }

                // for (int i = 0; i < nameStringMain.length(); i++) {
                // if (!(Character.isLetter(nameStringMain.charAt(i)) ||
                // nameStringMain.charAt(i) == ' ')) {
                // System.out.println(String.format(ERROR_LINE, "Invalid Name!\n"));
                // System.out.println("ID : " + idStringMain);
                // continue loopAddName;
                // }
                // }

                // break;
                // } while (true);

                // // Add deposite
                // loopAddDeposite: do {
                // System.out.print("Enter Deposite ammount : ");
                // depositeMain = scanner.nextDouble();
                // scanner.nextLine();

                // if (depositeMain < 5000) {
                // System.out.println(
                // String.format(ERROR_LINE, "Initial Deposite Should be greater than Rs.5000/=
                // !\n"));
                // System.out.println("ID : " + idStringMain);
                // System.out.println("Name : " + nameStringMain);
                // continue loopAddDeposite;
                // }
                // break;
                // } while (true);

                // // Initialize temp arrays
                // //String[][] bankDetailsTemp = new String[bankDetails.size() + 1][3];

                // //Enter details to the account details Array
                // accountDetails1[0] = idStringMain;
                // accountDetails1[1] = nameStringMain;
                // accountDetails1[2] = String.valueOf(depositeMain);

                // System.out.println(Arrays.toString(accountDetails1));

                // // Enter to new Arrays

                // // for (int i = 0; i < bankDetails.length; i++) {
                // // bankDetailsTemp[i][0] = bankDetails[i][0];
                // // bankDetailsTemp[i][1] = bankDetails[i][1];
                // // bankDetailsTemp[i][2] = bankDetails[i][2];
                // // }

                // // bankDetailsTemp[bankDetailsTemp.length - 1][0] = idStringMain;
                // // bankDetailsTemp[bankDetailsTemp.length - 1][1] = nameStringMain;
                // // bankDetailsTemp[bankDetailsTemp.length - 1][2] =
                // String.valueOf(depositeMain);

                // //bankDetails = bankDetailsTemp;

                // //Enter to the bankDetails ArrayList
                // bankDetails.add(accountDetails1);
                // System.out.println(bankDetails.size());
                // accountDetails1=null;

                // System.out.println();
                // System.out.print(String.format(SUCCESSFULL_MESSAGE,
                // idStringMain + " : " + nameStringMain + " added successfully.\n"));
                // System.out.print("Do you want to add a anothor account? (Y/N)");
                // add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                // if (add_Yes_No_Option.equals("Y")) {
                // screen = ADD_ACCOUNT;
                // continue;
                // } else {
                // screen = DASHBOARD;
                // continue;
                // }

                case DEPOSITE:
                    deposite();
                    break;

                // Body

                case WITHDRAW:
                    withdrawal();
                    // Body

                    break;

                case TRANSFER:
                    transfer();
                    // Body

                    break;

                case PRINT_STATEMENT:

                    // Body

                    break;

                case DELETE_ACCOUNT:

                    // Body

                    break;
            }

        } while (true);

    }

    public static void dashBoard() {
        System.out.println(String.format(OPTION_LINE, "[1] Create New Account"));
        System.out.println(String.format(OPTION_LINE, "[2] Deposite"));
        System.out.println(String.format(OPTION_LINE, "[3] Withdravals"));
        System.out.println(String.format(OPTION_LINE, "[4] Transfer"));
        System.out.println(String.format(OPTION_LINE, "[5] Print Statement"));
        System.out.println(String.format(OPTION_LINE, "[6] Delete Account"));
        System.out.println(String.format(OPTION_LINE, "[7] Exit"));

        System.out.print("\nEnter the option : ");
        String dashboardOption = scanner.nextLine().strip();

        if (dashboardOption.isBlank() || !Character.isDigit(dashboardOption.charAt(0))) {

            // Blinking error alert
            for (int i = 0; i < 3; i++) {
                System.out.print(String.format("\r" + ERROR_LINE, "Enter valid option!"));
                // Thread.sleep(700);
                System.out.printf("%s%s",
                        "\b".repeat(String.format(ERROR_LINE, "Enter valid option!").length() - 10),
                        " ".repeat(String.format(ERROR_LINE, "Enter valid option!\r").length() - 10));
                // Thread.sleep(800);
            }
            // break;
            dashBoard();
            return;
        }
        int dashboardOptionInt = Integer.valueOf(dashboardOption);
        if (dashboardOptionInt > 7 || dashboardOptionInt < 1) {

            // Blinking error alert
            for (int i = 0; i < 3; i++) {
                System.out.print(String.format("\r" + ERROR_LINE, "Enter valid option!"));
                // Thread.sleep(700);
                System.out.printf("%s%s",
                        "\b".repeat(String.format(ERROR_LINE, "Enter valid option!").length() - 10),
                        " ".repeat(String.format(ERROR_LINE, "Enter valid option!\r").length() - 10));
                // Thread.sleep(800);
            }
            dashBoard();
            return;
            // break;
        }
        System.out.println("Passed this line");
        switch (dashboardOptionInt) {
            case 1:
                screen = ADD_ACCOUNT;
                break;
            case 2:
                screen = DEPOSITE;
                break;
            case 3:
                screen = WITHDRAW;
                break;
            case 4:
                screen = TRANSFER;
                break;
            case 5:
                screen = PRINT_STATEMENT;
                break;
            case 6:
                screen = DELETE_ACCOUNT;
                break;
            case 7:
                System.exit(0);
        }
        return;
    }

    public static void addAccount() {
        idStringMain = branchCode + String.format("%05d", bankDetails.size() + 1);
        System.out.println("ID : " + idStringMain);

        // Initialize temp array with name Account Details
        accountDetails1 = new String[3];

        // add name
        loopAddName: do {
            System.out.print("Enter Account holder's name : ");
            nameStringMain = scanner.nextLine().strip();

            if (nameStringMain.isBlank()) {
                System.out.println(String.format(ERROR_LINE, "Name can't be empty!\n"));

                // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

                System.out.print("Do you want to enter again? (Y/N)");
                add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                if (add_Yes_No_Option.equals("Y")) {
                    System.out.println();
                    System.out.println("ID : " + idStringMain);
                    continue loopAddName;
                } else {
                    screen = DASHBOARD;
                    return;
                    // continue loopMain;
                }

                // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            }

            for (int i = 0; i < nameStringMain.length(); i++) {
                if (!(Character.isLetter(nameStringMain.charAt(i)) || nameStringMain.charAt(i) == ' ')) {
                    System.out.println(String.format(ERROR_LINE, "Invalid Name!\n"));
                    System.out.println("ID : " + idStringMain);
                    continue loopAddName;
                }
            }

            break;
        } while (true);

        // Add deposite
        loopAddDeposite: do {
            System.out.print("Enter Deposite ammount : ");
            depositeMain = scanner.nextDouble();
            scanner.nextLine();

            if (depositeMain < 5000) {
                System.out.println(
                        String.format(ERROR_LINE, "Initial Deposite Should be greater than Rs.5000/= !\n"));
                System.out.println("ID : " + idStringMain);
                System.out.println("Name : " + nameStringMain);
                continue loopAddDeposite;
            }
            break;
        } while (true);

        // Initialize temp arrays
        // String[][] bankDetailsTemp = new String[bankDetails.size() + 1][3];

        // Enter details to the account details Array
        accountDetails1[0] = idStringMain;
        accountDetails1[1] = nameStringMain;
        accountDetails1[2] = String.valueOf(depositeMain);

        System.out.println(Arrays.toString(accountDetails1));

        // Enter to new Arrays

        // for (int i = 0; i < bankDetails.length; i++) {
        // bankDetailsTemp[i][0] = bankDetails[i][0];
        // bankDetailsTemp[i][1] = bankDetails[i][1];
        // bankDetailsTemp[i][2] = bankDetails[i][2];
        // }

        // bankDetailsTemp[bankDetailsTemp.length - 1][0] = idStringMain;
        // bankDetailsTemp[bankDetailsTemp.length - 1][1] = nameStringMain;
        // bankDetailsTemp[bankDetailsTemp.length - 1][2] =
        // String.valueOf(depositeMain);

        // bankDetails = bankDetailsTemp;

        // Enter to the bankDetails ArrayList
        bankDetails.add(accountDetails1);
        System.out.println(bankDetails.size());
        accountDetails1 = null;

        System.out.println();
        System.out.print(String.format(SUCCESSFULL_MESSAGE,
                idStringMain + " : " + nameStringMain + " added successfully.\n"));
        System.out.print("Do you want to add a anothor account? (Y/N)");
        add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

        if (add_Yes_No_Option.equals("Y")) {
            screen = ADD_ACCOUNT;
            return;
            // continue;
        } else {
            screen = DASHBOARD;
            return;
            // continue;
        }
    }

    public static void deposite() throws InterruptedException {
        do {
            System.out.print("Enter your account Number : ");
            idStringMain = scanner.nextLine().strip();
            int bankAccountIndex = idValidation(idStringMain);
            String bankBalanceString;
            String nameString;

            if (bankAccountIndex < 0) {
                System.out.print("Do you want to enter again? (Y/N)");
                add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                if (add_Yes_No_Option.equals("Y")) {
                    // System.out.println();
                    // System.out.println("ID : " + idStringMain);
                    continue;
                } else {
                    screen = DASHBOARD;
                    return;
                    // continue loopMain;
                }

                // continue;
            } else {
                // String idString = bankDetails.get(bankAccountIndex)[0];

                nameString = bankDetails.get(bankAccountIndex)[1].toUpperCase();
                bankBalanceString = bankDetails.get(bankAccountIndex)[2];
                // System.out.print("Current Bank balance : "+id);
                System.out.println("Current Bank balance : " + nameString);
                System.out.println("Current Bank balance : " + bankBalanceString);

            }

            do {
                System.out.println();
                System.out.print("Enter deposite amount : ");
                depositeMain = scanner.nextDouble();
                scanner.nextLine();
                if (depositeMain < 500) {
                    System.out.printf(ERROR_LINE, "Insufficient Deposite!\n");
                    System.out.print("Do you want to enter again? (Y/N)");
                    add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                    if (add_Yes_No_Option.equals("Y")) {
                        // System.out.println();
                        // System.out.println("ID : " + idStringMain);
                        System.out.println("Current Bank balance : " + nameString);
                        System.out.println("Current Bank balance : " + bankBalanceString);
                        continue;
                    } else {
                        screen = DASHBOARD;
                        return;
                        // continue loopMain;
                    }

                }
                break;

            } while (true);

            depositeMain = depositeMain + Double.valueOf(bankBalanceString);
            bankBalanceString = String.valueOf(depositeMain);
            bankDetails.get(bankAccountIndex)[2] = bankBalanceString;
            System.out.println(CLEAR);
            System.out.println("Deposite Completed!");
            System.out.println("Current Bank balance : " + depositeMain);
            Thread.sleep(2000);
            screen = DASHBOARD;
            return;

        } while (true);

    }

    public static int idValidation(String id) {
        // Boolean valid = false;

        if (id.isBlank()) {
            // System.out.println("");
            System.out.println(String.format(ERROR_LINE, "ID can't be empty!\n"));
            return -1;
        }

        if(id.length()<9){
            System.out.println(String.format(ERROR_LINE, "Invalid ID format!\n"));
            System.out.println(false);
            return -1;

        }
        String idFront = id.substring(0, 4);
        String idBack = id.substring(4);

        System.out.println(idFront + " " + idBack);

        if (!idFront.equals("SDB-") || idBack.length() != 5) {
            System.out.println(String.format(ERROR_LINE, "Invalid ID format!\n"));
            System.out.println(false);
            return -1;
        }

        for (int i = 0; i < idBack.length(); i++) {
            if (!Character.isDigit(idBack.charAt(i))) {
                System.out.println(String.format(ERROR_LINE, "Invalid ID format!\n"));
                return -1;
            }
        }

        for (int i = 0; i < bankDetails.size(); i++) {
            accountDetails1 = bankDetails.get(i);
            if (accountDetails1[0].equals(id)) {
                System.out.println("Found");
                return i;
            }
        }

        System.out.println(String.format(ERROR_LINE, "Not found!\n"));

        return -2;
    }

    public static void withdrawal() throws InterruptedException {
        do {

            System.out.print("Enter your account Number : ");
            idStringMain = scanner.nextLine().strip();
            int bankAccountIndex = idValidation(idStringMain);
            String bankBalanceString;
            double bankBalance;
            String nameString;

            if (bankAccountIndex < 0) {
                System.out.print("Do you want to enter again? (Y/N)");
                add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                if (add_Yes_No_Option.equals("Y")) {
                    continue;
                } else {
                    screen = DASHBOARD;
                    return;
                }
            } else {
                nameString = bankDetails.get(bankAccountIndex)[1].toUpperCase();
                bankBalanceString = bankDetails.get(bankAccountIndex)[2];
                bankBalance = Double.valueOf(bankBalanceString);
                System.out.println("Current Bank Name : " + nameString);
                System.out.println("Current Bank balance : " + bankBalanceString);

            }

            do {
                System.out.print("Enter amount to withdraw : ");
                double withdraw = scanner.nextDouble();
                scanner.nextLine();

                if (withdraw < 100) {
                    System.out.println();
                    System.out.printf(ERROR_LINE, "Withdraw amount must be above 100/=\n");

                    System.out.print("Do you want to enter again? (Y/N)");
                    add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                    if (add_Yes_No_Option.equals("Y")) {
                        continue;
                    } else {
                        screen = DASHBOARD;
                        return;

                    }
                }

                if (Double.valueOf(bankBalanceString) - withdraw < 500) {
                    System.out.println();
                    System.out.printf(ERROR_LINE, "Insufficient Balance\n");

                    System.out.print("Do you want to enter again? (Y/N)");
                    add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                    if (add_Yes_No_Option.equals("Y")) {
                        continue;
                    } else {
                        screen = DASHBOARD;
                        return;
                    }
                }

                bankBalance = bankBalance - withdraw;
                bankDetails.get(bankAccountIndex)[2] = String.valueOf(bankBalance);
                System.out.println(CLEAR);
                System.out.println("Withdrawal Completed");
                System.out.println("Current Bank balance : " + bankDetails.get(bankAccountIndex)[2]);
                Thread.sleep(2000);
                screen = DASHBOARD;
                return;

            } while (true);

            // screen = DASHBOARD;
            // break;
        } while (true);
    }

    public static void transfer() {
        do {
            String fromAccountID;
            String toAccountID;
            String fromAccountNAme;
            String toAccountName;

            double fromAccountBalance;
            double toAccountBalance;

            double transferAmount = 0;

            int fromBankAccountIndex;
            int toBankAccountIndex;

            do {
                System.out.print("Enter your account Number : ");
                idStringMain = scanner.nextLine().strip();
                fromBankAccountIndex = idValidation(idStringMain);

                if (fromBankAccountIndex < 0) {
                    // System.out.printf(ERROR_LINE, "Invalid Account ID\n");

                    System.out.print("Do you want to enter again? (Y/N)");
                    add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                    if (add_Yes_No_Option.equals("Y")) {
                        continue;
                    } else {
                        screen = DASHBOARD;
                        return;
                    }
                }
                break;
            } while (true);

            do {
                System.out.print("Enter account Number to transfer : ");
                idStringMain = scanner.nextLine().strip();
                toBankAccountIndex = idValidation(idStringMain);

                if (toBankAccountIndex < 0||toBankAccountIndex==fromBankAccountIndex) {
                    // System.out.printf(ERROR_LINE, "Invalid Account ID\n");

                    System.out.print("Do you want to enter again? (Y/N)");
                    add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                    if (add_Yes_No_Option.equals("Y")) {
                        continue;
                    } else {
                        screen = DASHBOARD;
                        return;
                    }
                }
                break;
            } while (true);

            fromAccountID = bankDetails.get(fromBankAccountIndex)[0];
            toAccountID = bankDetails.get(toBankAccountIndex)[0];

            fromAccountNAme = bankDetails.get(fromBankAccountIndex)[1];
            toAccountName = bankDetails.get(toBankAccountIndex)[1];

            fromAccountBalance = Double.valueOf(bankDetails.get(fromBankAccountIndex)[2]);
            toAccountBalance = Double.valueOf(bankDetails.get(toBankAccountIndex)[2]);

            System.out.println("From account name : " + fromAccountNAme);
            System.out.println("Account balance : " + fromAccountBalance);
            System.out.println();
            System.out.println("To account name : " + toAccountName);
            System.out.println("Account balance : " + toAccountBalance);

            

            do {
                System.out.print("Enter amount to transfer : ");
            transferAmount = scanner.nextDouble();
            scanner.nextLine();

                if (transferAmount < 100) {
                    System.out.println();
                    System.out.printf(ERROR_LINE, "Withdraw amount must be above 100/=\n");

                    System.out.print("Do you want to enter again? (Y/N)");
                    add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                    if (add_Yes_No_Option.equals("Y")) {
                        continue;
                    } else {
                        screen = DASHBOARD;
                        return;

                    }
                }

                if (fromAccountBalance - transferAmount < 500) {
                    System.out.println();
                    System.out.printf(ERROR_LINE, "Insufficient Balance\n");

                    System.out.print("Do you want to enter again? (Y/N)");
                    add_Yes_No_Option = scanner.nextLine().strip().toUpperCase();

                    if (add_Yes_No_Option.equals("Y")) {
                        continue;
                    } else {
                        screen = DASHBOARD;
                        return;
                    }
                }

                fromAccountBalance = fromAccountBalance - (transferAmount * 1.02);
                // System.out.println(tranferAmmount*1.02);
                toAccountBalance = toAccountBalance + transferAmount;

                bankDetails.get(fromBankAccountIndex)[2] = String.valueOf(fromAccountBalance);
                bankDetails.get(toBankAccountIndex)[2] = String.valueOf(toAccountBalance);

                System.out.println(CLEAR);
                System.out.println("Transaction Completed");
                System.out.println("New Account balance of transfer's account : "
                        + bankDetails.get(fromBankAccountIndex)[2] + "/=");
                System.out.println("New Account balance of transferee's account : "
                        + bankDetails.get(toBankAccountIndex)[2] + "/=");

                break;
            } while (true);

            screen = DASHBOARD;
            break;
        } while (true);

    }

}