public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.createPdfPrototype();
        pdf.open();
        System.out.println(pdf.toString());
        System.out.println();

        Document text = registry.createTextDocumentPrototype();
        text.open();
        System.out.println(text.toString());
        System.out.println();

        Document spreadsheet = registry.createSpreadsheetPrototype();
        spreadsheet.open();
        System.out.println(spreadsheet.toString());
        System.out.println();

        Document customPdf = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        customPdf.open();
    }
}