package dispatcher;

import service.AccountService;
import service.MainService;
import utils.Biz;

 public class MainDispatch {

	private static AccountService accountService = new AccountService();
	private static MainService mainService = new MainService();

	public static void dispatch(String forward) {

		switch (forward) {

		case Biz.LOGIN:

			accountService.doLogin();

			break;
			
		case Biz.MAIN:
			mainService.main();

			break;

		default:
			break;
		}

	}

}
