public class factorymethodpattern {
    interface Document {
        void open();
    }
    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening a Word Document.");
        }
    }
    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening a PDF Document.");
        }
    }
    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening an Excel Document.");
        }
    }
    static abstract class DocumentFactory {
        public abstract Document createDocument();
    }
    static class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }
    static class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }
    static class ExcelDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document doc1 = wordFactory.createDocument();
        Document doc2 = pdfFactory.createDocument();
        Document doc3 = excelFactory.createDocument();
        doc1.open();
        doc2.open();
        doc3.open();
    }
}




// OUTPUT  

// Opening a Word Document
// Opening a PDF Document
// Opening an Excel Document


