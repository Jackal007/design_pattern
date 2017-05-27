package Factory.MethodFactory;

public class ExportFinancialPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		/**
		 * 业务逻辑
		 */
		System.out.println("导出财务版PDF文件");
		return true;
	}

}
