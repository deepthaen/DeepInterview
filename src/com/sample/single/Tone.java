package com.sample.single;

public class Tone {
	
	
	public static Tone tonref =null;
	
	public static Tone getInstance() {
		
		if(tonref == null) {
			tonref = new Tone();
		}
		return tonref;
	}
	// DB d = new DB();
}
