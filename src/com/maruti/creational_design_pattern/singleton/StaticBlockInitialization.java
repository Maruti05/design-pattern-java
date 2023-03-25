package com.maruti.creational_design_pattern.singleton;

public class StaticBlockInitialization {
	  private static StaticBlockInitialization instance;
	  
	  public StaticBlockInitialization() {}
	  
	  static {
		  try {
			  instance=new StaticBlockInitialization();
		} catch (RuntimeException e) {
			
		}
	  }
	  
	  public static StaticBlockInitialization getStaticBlockInitializationInstance() {
		return instance;
		
	}
}
