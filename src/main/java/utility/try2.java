package utility;

import java.util.Objects;

public class try2 {
	 String name="Tushar";

	public static void main(String[] args) {
		try2 obj =new try2();
		
		obj.x();

	}
	
	public void x() {
		if(!Objects.isNull(name)){
			System.out.println("String name is not null "+name);
		}else {
			System.out.println("String name is "+ name);
		}
		
		String name2=name.contains("z")?name:"stushar";
		
		System.out.println(name2);
		
		
	}

}
