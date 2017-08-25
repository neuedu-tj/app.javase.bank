package main;

import org.junit.Test;

import dispatcher.MainDispatch;
import service.AccountAssembleService;
import utils.Biz;

public class Start {

	@Test
	public void start() {
		
		//初始化加载
		AccountAssembleService accountAssembleService = new AccountAssembleService();
		accountAssembleService.loadAccounts();
		
		MainDispatch.dispatch(Biz.LOGIN);
		
	}
	
}
