package sa_lab3;

public class NumberExpression implements Expression {

	private String number;

	public NumberExpression(String number) {
		this.number = number;
	}

	@Override
	public long interpret() {
		number = number.toLowerCase();
		int result = -1;
		switch (number) {
		case "zero":
			result = 0;
			break;
		case "one":
			result = 1;
			break;
		case "two":
			result = 2;
			break;
		case "three":
			result = 3;
			break;
		case "four":
			result = 4;
			break;
		case "five":
			result = 5;
			break;
		case "six":
			result = 6;
			break;
		case "seven":
			result = 7;
			break;
		case "eight":
			result = 8;
			break;
		case "nine":
			result = 9;
			break;
		case "eleven":
			result = 11;
			break;
		case "twelve":
			result = 12;
			break;
		case "thirteen":
			result = 13;
			break;
		case "fourteen":
			result = 14;
			break;
		case "fifteen":
			result = 15;
			break;
		case "sixteen":
			result = 16;
			break;
		case "seventeen":
			result = 17;
			break;
		case "eighteen":
			result = 18;
			break;
		case "nineteen":
			result = 19;
			break;
		case "twenty":
			result = 20;
			break;
		case "thirty":
			result = 30;
			break;
		case "forty":
			result = 40;
			break;
		case "fifty":
			result = 50;
			break;
		case "sixty":
			result = 60;
			break;
		case "seventy":
			result = 70;
			break;
		case "eighty":
			result = 80;
			break;
		case "ninety":
			result = 90;
			break;
		case "ten":
			result = 10;
			break;
		default:
			break;
		}
		return result;
	}

}
