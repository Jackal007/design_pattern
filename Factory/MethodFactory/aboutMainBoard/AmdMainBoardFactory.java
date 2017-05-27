package Factory.MethodFactory.aboutMainBoard;

public class AmdMainBoardFactory implements MainBoardFactory {

	@Override
	public Mainboard createMainboard() {
		return new AmdMainboard(938);
	}

}
