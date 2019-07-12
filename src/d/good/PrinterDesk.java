package d.good;

public class PrinterDesk {
	private Printer printer;

	public PrinterDesk(Printer printer) {

		this.printer = printer;
	}
	
	
	public void printFile(){
		printer.print("File Content");
	}
}