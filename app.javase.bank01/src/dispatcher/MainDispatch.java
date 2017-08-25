package dispatcher;

import service.AccountService;
import utils.Biz;

public class MainDispatch {

	private static AccountService accountService = new AccountService();

	public static void dispatch(String forward) {

		switch (forward) {

		case Biz.LOGIN:

			accountService.doLogin();

			break;
			
		case Biz.MAIN:

			System.out.println("主菜单");

			break;

		default:
			break;
		}

	}

}
