package Factory.MethodFactory.aboutMainBoard;

public class IntelMainBoardFactory implements MainBoardFactory {

	@Override
	public Mainboard createMainboard() {
		return new IntelMainboard(755);
	}

}
