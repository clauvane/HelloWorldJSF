package br.com.clauvane.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorldBean {
	
	private String message;

	public void helloWorld(){
		setMessage("Hello World!");
	}
	
	public void limpar(){
		setMessage("");
	}
	
	public String getTitulo(){
		return "My Web Application";
	}
	
	public boolean isEmptyMessage(){
		if (message == null || message.isEmpty()) {
			return true;
		}
		return false;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
