package com.lanou.bean;

public class House {

	private String local;

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "House [local=" + local + "]";
	}
}
