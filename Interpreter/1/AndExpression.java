package sa_lab3;

public class AndExpression implements Expression {

	private Expression left = null;
	private Expression right = null;

	public AndExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public long interpret() {
		return left.interpret() + right.interpret();
	}
}
