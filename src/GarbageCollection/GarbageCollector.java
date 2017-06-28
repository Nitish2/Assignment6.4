package GarbageCollection;

public class GarbageCollector { // Creating Class 
	
			public static void main(String[] args) { //Main Method 
				// TODO Auto-generated method stub
				
				 GarbageCollector s1=new GarbageCollector();  // Creating first object 
				 GarbageCollector s2=new GarbageCollector(); //Creating second object
				
				  s1=null;  //Making objects unreferenced by initialize their values to null  
				  s2=null; 
				  //Here This Method will Run the garbage Collector
				  System.gc();  

			}
			public void finalize(){  /** Finalize method invoked each time 
			                              before garbage collected
			                          **/
			System.out.println("Garbage is collected");
		}
		}

