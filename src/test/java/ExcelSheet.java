import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void writeExcelSheet() {

		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet worksheet = workBook.createSheet("sheet1");
		
int rowNum =0;
for(int i=1;i<=10;i++) {
	Row row = worksheet.createRow(rowNum++);
	int colNum=0;
	
	
	
}


	}
}
