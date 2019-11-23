package com.examples.exception;

public class Login {
	public void checkLogin(String uname, String psw) throws ValidException, InvalidException {
		if ((uname.equals("test")) && psw.equals("satya")) {
			ValidException v = new ValidException("login sucess");
			throw (v);
		} else {
			InvalidException i = new InvalidException("login failed");
			throw (i);
		}
	}
}