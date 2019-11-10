package bamsapp;

public class Prompt {

    public void mainPrompt(int num) {
        if (num == 0) {
            System.out.println("\n--------Welcom To Our System--------\n");
            System.out.println("Options");
            System.out.println("    1.Registration");
            System.out.println("    2.Deposite");
            System.out.println("    3.Withdraw");
            System.out.println("    4.Transfer");
            System.out.println("    5.Exit");
            System.out.print("Enter: ");
        }
        if (num == 1) {
            System.out.println("<-Wrong Input->");
            System.out.print("Enter Again: ");
        }
    }

    public void registrationPrompt(int num) {
        switch (num) {
            case -1:
                System.out.println("\n---------Registration Panel---------\n");
                break;
            case 0:
                System.out.print("Your Transaction ID: ");
                break;
            case 1:
                System.out.print("Create Password: ");
                break;
            case 2:
                System.out.print("Name      : ");
                break;
            case 3:
                System.out.print("Profession: ");
                break;
            case 4:
                System.out.print("Age       : ");
                break;
            case 5:
                System.out.print("Address   : ");
                break;
            case 6:
                System.out.print("Phone     : ");
                break;
        }
    }

    public void depositePrompt(int num, String notes) {
        switch (num) {
            case 0:
                System.out.print("Enter Trasaction ID: ");
                break;
            case 1:
                System.out.print("Enter Ammount: ");
                break;
            case 2:
                System.out.println("\n-----Transaction ID: " + notes + " -----\n");
                break;
            case 3:
                System.out.println("New Balance: $" + notes);
                break;
            case 4:
                System.out.println("\n-------Deposite has Completed-------\n");
                break;
        }
    }

    public void withdrawPrompt(int num, String notes) {
        switch (num) {
            case 0:
                System.out.print("Enter Trasaction ID: ");
                break;
            case 1:
                System.out.print("Enter Ammount: ");
                break;
            case 2:
                System.out.println("\n-----Transaction ID: " + notes + " -----\n");
                break;
            case 3:
                System.out.print("Enter Varification Code: ");
                break;
            case 4:
                System.out.println("New Balance: $" + notes);
                break;
            case 5:
                System.out.println("<-Denied!->");
                break;
            case 6:
                System.out.println("\n-------Withdraw has Completed-------\n");
                break;
            case 7:
                System.out.println("<-Not Enough Balance!->\n");
                break;
        }
    }

    public void transferPrompt(int num) {
        switch (num) {
            case 0:
                System.out.print("Enter Sender Transaction ID: ");
                break;
            case 1:
                System.out.print("Enter Receiver Transaction ID: ");
                break;
            case 2:
                System.out.print("Enter Ammount: ");
                break;
            case 3:
                System.out.print("<-Not Enough Balance!->\n");
                break;
            case 4:
                System.out.print("\n-------Transfar has Completed-------");
                break;
            case 5:
                System.out.print("Enter Varification Code: ");
                break;
        }
    }

    public void transferPrompt(String note, String notes) {
        System.out.println("Balance of " + note + ": $" + notes);
    }

    public void printline() {
        System.out.println();
    }
}
