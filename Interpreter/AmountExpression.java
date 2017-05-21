package sa_lab3;

public class AmountExpression implements Expression {

	private String amount;

	public AmountExpression(String amount) {
		this.amount = amount;
	}

	@Override
	public long interpret() {
		amount = amount.toLowerCase();
		int result = -1;
		switch (amount) {
		case "billion":
			result = 1000000000;
			break;
		case "million":
			result = 1000000;
			break;
		case "thousand":
			result = 1000;
			break;
		case "hundred":
			result = 100;
			break;
		default:
			break;
		}
		return result;
	}
}
