package evaluation;

public class Scoreevaluation {
	public int eval(int ...a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
}
