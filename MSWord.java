package com.bpi.SW5;

public class MSWord extends Program {
	
	public MSWord(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		System.out.println("Opening MS Word...");
		this.setRunning(true);
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping MS Word...");
		this.setRunning(false);
	}
}
