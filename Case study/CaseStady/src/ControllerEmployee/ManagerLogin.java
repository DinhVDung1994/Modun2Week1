package ControllerEmployee;

import View.ViewAccount;
import Model.Account;
import Service.AccountService;

public class ManagerLogin {
    public static void menuloginAcc() {
        try {
            while (true) {
                int luaChon = ViewAccount.menuTop();
                switch (luaChon) {
                    case 1:
                        Account account = ViewAccount.creatAcc();
                        if (AccountService.loginAdmin(account)) {
                            System.err.println("================Hello! ADMIN================");
                            ManagerEmployee.mainAdmin();
                            break;
                        }
                        if (AccountService.login(account)) {
                            ManagerEmployee.mainUser();
                            break;
                        }
                        break;
                    case 2:
                        AccountService.addAccount(ViewAccount.creatAcc());
                        break;
                    case 3:
                        System.exit(3);
                        break;
                    default:
                        System.err.println("Lua Chon Cua Ban Khong Ton Tai");
                        break;
                }
            }

        } catch (Exception e) {
            System.err.println("Lua Chon Cua Ban Khong Ton Tai");
            menuloginAcc();
        }
    }
}
