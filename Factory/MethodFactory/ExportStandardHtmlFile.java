package Factory.MethodFactory;

public class ExportStandardHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		/**
		 * 业务逻辑
		 */
		System.out.println("导出标准HTML文件");
		return true;
	}

}
