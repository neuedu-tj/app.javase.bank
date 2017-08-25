package storage.scope;

import model.WrapData;

public class AccountCache {

	private static final AccountCache cache = new AccountCache();

	private WrapData wrapData;

	private AccountCache() {

	}

	public static AccountCache getInstance() {
		return cache;
	}

	public WrapData getWrapData() {
		return wrapData;
	}

	public void setWrapData(WrapData wrapData) {
		this.wrapData = wrapData;
	}

	

}
