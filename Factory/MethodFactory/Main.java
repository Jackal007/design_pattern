package Factory.MethodFactory;

public class Main {
	public static void main(String[] args) {
		String data = "";
		ExportFactory exportFactory = new ExportHtmlFactory();
		ExportFile ef = exportFactory.factory("financial");
		ef.export(data);
	}
}
