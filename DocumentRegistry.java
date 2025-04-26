public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        textDocumentPrototype = new TextDocument(1, "UTF-8", 250);
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);

        System.out.println("Creating a PDF Document prototype.");
        System.out.println("Creating a Text Document prototype.");
        System.out.println("Creating a Spreadsheet Document prototype.");
        System.out.println();
    }

    public Document createPdfDocument(String fileName, String author, int pages) {
        PdfDocument base = (PdfDocument) pdfPrototype.clone();
        return new PdfDocument(fileName, author, pages, base.getName()); 
    }

    public Document createPdfPrototype() {
        return pdfPrototype.clone();
    }

    public Document createTextDocumentPrototype() {
        return textDocumentPrototype.clone();
    }

    public Document createSpreadsheetPrototype() {
        return spreadsheetPrototype.clone();
    }
}