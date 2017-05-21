package sa_lab3;

import java.util.Stack;

public class InstructionHandler {

	private String instruction = null;

	public InstructionHandler(String instruction) {
		this.instruction = instruction;

	}

	public void handel() {
		instruction = instruction.toLowerCase();
		String[] word = instruction.split(" ");
		Stack stack = new Stack();
		stack.push(new NumberExpression("zero"));
		for (int i = 0; i < word.length;) {
			if (word[i].equals("and")) {
				break;
			}
			SegmentExpression sentenceExp = new SegmentExpression();
			while (true) {
				NumberExpression numberExp = new NumberExpression(word[i]);
				if (numberExp.interpret() == -1) {
					break;
				} else {
					sentenceExp.addNumber(numberExp);
					i++;
				}
			}
			while (true) {
				AmountExpression amountExp = new AmountExpression(word[i]);
				if (amountExp.interpret() == -1) {
					break;
				} else {
					sentenceExp.addAoumnt(amountExp);
					i++;
				}
			}
			Expression right = (Expression) stack.pop();
			stack.push(new AndExpression(sentenceExp, right));
		}

		Expression result = (Expression) stack.pop();
		System.out.println(result.interpret());

	}
}
