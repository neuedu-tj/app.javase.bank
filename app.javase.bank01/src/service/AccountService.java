package service;

import dispatcher.MainDispatch;
import handler.AccountHandler;
import model.Account;
import storage.AccountCache;
import utils.Biz;
import utils.InputFactory;
import utils.InputFactory.TYPE;

public class AccountService {
	
	private AccountHandler accountHandler = new AccountHandler();
	
	int count = 0; //计数器 3
	
	public void doLogin() {
		
		Account temp = new Account();
		System.out.println("请输入用户名 : ");
		temp.setCard(InputFactory.getInput(TYPE.STRING).toString());
		System.out.println("请输入密码 : ");
		temp.setPwd(InputFactory.getInput(TYPE.STRING).toString());
		
		temp = accountHandler.checkAccount(temp);   // 此时的 temp 已经是库里 某位用户的全部信息了
		
		if(temp!=null) { //如果登录成功
			//将登录成功的用户  保存进缓存.
			AccountCache.getInstance().getWrapData().setAccount(temp);
	
			//跳转到主 控制器 
			MainDispatch.dispatch(Biz.MAIN);
			
		}else {
			if(count<2) {
				System.out.println("第 "+ ++count +" 次登录失败 , 请重新登录");
				doLogin();
			} else {
				System.out.println("你是个骗子....  ");
				System.exit(0);
			}
		}
	}
	

}
