package four;

import java.util.ArrayList;
import java.util.List;

import four.models.CommonAccount;
import four.models.StudentAccount;
import four.services.AccountService;

public class App {
    public static void main(String[] args) {
        List<CommonAccount> accounts = new ArrayList<>();
        AccountService service = new AccountService();

        accounts.add(new CommonAccount(6000d));
        accounts.add(new CommonAccount(20000d));
        accounts.add(new StudentAccount(20000d));
        accounts.add(new StudentAccount(1000d));

        service.applyDailyInterests(accounts);
    }
}

