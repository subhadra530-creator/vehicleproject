package org.fourwheeler;

import org.allvehicle.vehicle;
import org.twowheeler.twowheeler;
import org.threewheeler.threewheeler;

public class fourwheeler {
	 public void car() {
		 System.out.println("maruti");
	 }
	 public void bus() {
		 System.out.println("RTC");
	 }
	 public void lorry() {
		 System.out.println("tata");
	 }
	 public static void main(String[] args) {
		 
		 vehicle v=new vehicle();
		 v.vehiclenecessary();
		 
		 twowheeler tw=new twowheeler();
		 tw.bike();
		 tw.cycle();
		 
		 threewheeler th=new threewheeler();
		 th.auto();
		 
		 fourwheeler f=new fourwheeler();
		 f.car();
		 f.bus();
		 f.lorry();
		 
	 }

}
