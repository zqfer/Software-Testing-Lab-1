package test;

public class lab1 {
	int num[] = {50,20,5,5,1,1,1};
	public boolean pay(int n){
		for(int i = 0; i < num.length;i++){
			if(n >= num[i]){
				n = n - num[i];
			}
		}
		if(n == 0){
			return true;
		}
		else
			return false;
	}

}
