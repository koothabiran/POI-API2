
public class DemoPOI2 {
	
	
	
	public static void main (String[] args) {
		
		
		MyXLSReader reader = new MyXLSReader("src\\ExcelXLSX.xlsx");
		
		int rowcount = reader.getRowCount("EmployeeData");
		System.out.println(rowcount);
		
		String cellvalue = reader.getCellData("EmployeeData", "Occupation",4);
		System.out.println(cellvalue);
		
		String cellvalue2 = reader.getCellData("EmployeeData", 3, 4);
	
		System.out.println(cellvalue2);
		
		
	boolean exists =	reader.isSheetExist("EmployeeData");
	System.out.println(exists);
	
	boolean exists1 =	reader.isSheetExist("koothabiran");
	System.out.println(exists1);
	
	
	int ccount =reader.getColumnCount("EmployeeData");
	System.out.println(ccount);
	
	int rnumber = reader.getCellRowNum("EmployeeData", "ID", "002");
	System.out.println(rnumber);
		
	}
	
	

}
