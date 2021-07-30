package two.services;

import two.models.Payment;

public class PaymentService {
    public void pay(Payment payment) {
        switch (payment.getMethod()) {
            case CREDIT:
                System.out.println(
                        String.format("Paid $%.2f to %s (PAYMENT METHOD: CREDIT)",
                                payment.getValue(), payment.getAccount())
                );
                break;

            case DEBIT:
                System.out.println(
                        String.format("Paid $%.2f to %s (PAYMENT METHOD: DEBIT)",
                                payment.getValue(), payment.getAccount())
                );
                break;
        }
    }
}
