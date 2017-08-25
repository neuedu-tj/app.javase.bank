package handler;

import java.util.Map;

import model.Account;
import storage.scope.AccountCache;

public class AccountHandler {

	private Map<String, Account> accounts;

	//校验登录
	public Account checkAccount(Account account) {

		accounts = AccountCache.getInstance().getWrapData().getAccounts();

		if (accounts.containsKey(account.getCard())) {

			Account eq = accounts.get(account.getCard()); //帐号对上了 , 下一步查密码

			if (account.getPwd().equals(eq.getPwd())) {
				return eq;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
