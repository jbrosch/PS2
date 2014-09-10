
public class myInteger {
	private int value;

	public myInteger(int value){
		this.value=value;
	}

	public int getValue(){
		return this.value;
	}

	public boolean isEven(){
		return this.value%2==0;
	}
	public boolean isOdd(){
		return this.value%2!=0;
	}
	public boolean isPrime(){
		return checkPrime(this.value);
	}

	public static boolean isEven(int num){
		return num%2==0;
	}
	public static boolean isOdd(int num){
		return num%2!=0;
	}
	public static boolean isPrime(int num){
		return checkPrime(num);
	}

	public static boolean  isEven(myInteger num){
		return num.getValue()%2==0;
	}

	public static boolean isOdd(myInteger num){
		return num.getValue()%2!=0;
	}

	public static boolean  isPrime(myInteger num){
		return checkPrime(num.getValue());
	}

	public boolean equalsInt(int integer){
		return this.value==integer;
	}

	public boolean equals(myInteger num){
		return this.value==num.getValue();
	}

	public static int parseInt(char[] string){
		return Integer.parseInt(new String(string));
	}

	public static int parseInt(String string){
		return Integer.parseInt(new String(string));
	}
	private static boolean checkPrime(int num){
		if (num%2==0)
			return false;
		else{
			for(int i=2;i<=Math.floor(Math.sqrt((double) (num))); i=i+2){
				if (num%i==0){
					break;
				}
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//put stuff in here if desired
	}

}
