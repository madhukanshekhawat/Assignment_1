package day10;

class PaymentProcessing extends Thread {
    public void run() {
        System.out.println("Processing payment...");
    }
}

class InventoryUpdate extends Thread {
    public void run() {
        System.out.println("Updating inventory...");
    }
}

class EmailConfirmation extends Thread {
    public void run() {
        System.out.println("Sending confirmation email...");
    }
}

class InvoiceGeneration extends Thread {
    public void run() {
        System.out.println("Generating invoice...");
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        PaymentProcessing paymentThread = new PaymentProcessing();
        InventoryUpdate inventoryThread = new InventoryUpdate();
        EmailConfirmation emailThread = new EmailConfirmation();
        InvoiceGeneration invoiceThread = new InvoiceGeneration();

        paymentThread.start();
        inventoryThread.start();
        emailThread.start();
        invoiceThread.start();
    }
}
