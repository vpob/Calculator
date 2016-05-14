// Класс который реализует сам калькулятор

public class Calculator {
		
		private double resault;
		
		public void add(String act, double first, double second){
			
			char b = (act).charAt(0);
			switch (b) {
			case '+' : sum(Double.valueOf(first), Double.valueOf(second));
				break;
			case '-' : sub(Double.valueOf(first), Double.valueOf(second));
				break;
			case '*' : mult(Double.valueOf(first), Double.valueOf(second));
				break;
			case '/' : div(Double.valueOf(first), Double.valueOf(second));
				break;		
			case '^' : raise(Double.valueOf(first), Double.valueOf(second));
				break;
		}
			}
				
		// Суммируем аргументы	
		public double sum(double ... params) {
			for (double param : params) {
				resault += param;
			}
			return resault;
		}
		
		// Отнимаем ... (вычетание)	
			public double sub(double ... params) {	
				resault = params[0] - params[1];
			return resault;
		}
		
		// Умножаем ...		
		public double mult(double ... params) {			
				resault = params[0] * params[1];		
			return resault;
	
}

		// Делим
		public double div(double ... params) {		
				resault = params[0] / params[1];
			return resault;
		}
	
		// Возводим в степень
		public double raise(double ... params) {
				resault = Math.pow(params[0], params[1]);
			return resault;
		}
			
		// Получить результат	
		public double getResault(){
			return this.resault;
		}
		
		// Очистить результат	 
		 public void cleanResault() {
			 this.resault = 0;
		 }
}
	