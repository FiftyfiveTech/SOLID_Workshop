package two;

import two.models.Payment;
import two.models.PaymentMethod;
import two.services.PaymentService;

public class App {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.pay(new Payment(PaymentMethod.CREDIT, 250d, "46578909"));
        service.pay(new Payment(PaymentMethod.DEBIT, 21.60d, "67547249"));
        service.pay(new Payment(PaymentMethod.CREDIT, 123d, "14534529"));
        service.pay(new Payment(PaymentMethod.DEBIT, 546d, "13321445"));
    }
}
