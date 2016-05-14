import java.util.Scanner;

// Класс для запуска калькулятора с вводом от пользователя

public class EnterData {

	static double savedResault = 0;

	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "n";			
				while (!exit.equals("e")) {
				double first = savedResault;
				if(first == 0){
				System.out.println("Enter first arg : ");
				first = Double.valueOf(reader.next());
				}
				System.out.println("Enter Math action : ");
				String act = reader.next();
			    
				System.out.println("Enter second arg : ");
				double second = Double.valueOf(reader.next());
				calc.add(act, first, second);
				
				System.out.println("Resault is : " + calc.getResault());
				
				System.out.println("To Save and continue press \"s\"" + "\n" +"To Exit press \"e\"  ");
				System.out.println("To Clean and continue press \"c\"");
				exit = reader.next();		
						if(exit.equals("s")){
							savedResault = calc.getResault();
					}else if(exit.equals("c")){
						exit = "n";
					}
				calc.cleanResault();
				}
			}finally {
				System.out.println("... Close program ..." + "\n" + "----End----");
				reader.close();
			} 
	}
}