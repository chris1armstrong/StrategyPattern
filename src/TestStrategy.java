
public class TestStrategy {
	private Strategy strat;
	
	public static void main(String[] args) {
		Strategy str1 = new Strat1();
		TestStrategy test = new TestStrategy(str1);
		test.getStrat().doBehaviour();

		Strategy str2 = new Strat2();
		test.setStrat(str2);
		test.getStrat().doBehaviour();
	}
	
	private Strategy getStrat() {
		return this.strat;
	}

	public TestStrategy(Strategy str) {
		this.strat = str;
	}
	
	public void setStrat(Strategy str) {
		this.strat = str;
	}

}
