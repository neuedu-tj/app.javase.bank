package service;

import java.util.Map;

import handler.AccountAssembleHandler;
import model.Account;
import model.WrapData;
import storage.AccountCache;

public class AccountAssembleService {
	
	//调用 handler 层 进行装配
	private AccountAssembleHandler handler = new AccountAssembleHandler();
	
	//用来暂存  所有的账户们
	private Map<String , Account> accounts ;

	//
	public void loadAccounts() {
		
		//加载账户信息
		accounts = handler.loadAccounts();
		
		WrapData wrapData = new WrapData();
		wrapData.setAccounts(accounts);
		
		AccountCache.getInstance().setWrapData(wrapData);
	}

}
