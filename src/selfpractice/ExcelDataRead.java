package selfpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws BiffException, IOException, Exception {
		// Connect to .xls file

		File f = new File("C:\\Users\\Navatha\\cdrive\\ExcelFolder\\LoginData.csv");

		// Open.xls for reading
		Workbook rwb = Workbook.getWorkbook(f);
		Sheet rsh = rwb.getSheet(0);
		// count of used rows
		int nour = rsh.getRows();
		System.out.println(nour);
		// count of used columns
		int nouc = rsh.getColumns();
		System.out.println(nouc);
		// open same excel file for writing
		WritableWorkbook wwb = Workbook.createWorkbook(f, rwb);
		WritableSheet wsh = wwb.getSheet(0);
		// 0 means sheet 1
//Create Result column heading (Next to last column)
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date d=new Date();
		String cname= sf.format(d);
		Label l1=new Label(nouc,0,cname);
		wsh.addCell(l1);
		wwb.close();
		rwb.close();
	}

}
