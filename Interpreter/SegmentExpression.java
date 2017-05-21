package sa_lab3;

import java.util.ArrayList;
import java.util.List;

public class SegmentExpression implements Expression {

	private List<Expression> numberExps = new ArrayList<Expression>();
	private List<Expression> amountExps = new ArrayList<Expression>();

	public SegmentExpression() {
	}

	public void addNumber(Expression number) {
		numberExps.add(number);
	}

	public void addAoumnt(Expression amount) {
		amountExps.add(amount);
	}

	@Override
	public long interpret() {
		long sum = 0;
		for (Expression i : numberExps) {
			sum += i.interpret();
		}
		for (Expression i : amountExps) {
			sum *= i.interpret();
		}
		return sum;
	}
}
