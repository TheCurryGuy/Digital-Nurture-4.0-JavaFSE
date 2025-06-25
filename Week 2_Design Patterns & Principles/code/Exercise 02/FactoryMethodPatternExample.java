// Step 1
interface Document {
    void open();
    void save();
}

// step 2
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document...");
    }
    public void save() {
        System.out.println("Saving Word document (.docx)");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }
    public void save() {
        System.out.println("Saving PDF document (.pdf)");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel spreadsheet...");
    }
    public void save() {
        System.out.println("Saving Excel workbook (.xlsx)");
    }
}

// step 3
abstract class DocumentFactory {
    public abstract Document createDocument();
    public void newDocument() {
        Document doc = createDocument();
        System.out.print("Created new ");
        doc.open();
    }
}

// step 4
class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// step 5
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // factories
        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();
        
        System.out.println("=== Creating Documents ===");
        
        // factories to create documents
        Document resume = wordFactory.createDocument();
        Document report = pdfFactory.createDocument();
        Document budget = excelFactory.createDocument();
        
        // test 
        resume.save();
        report.open();
        budget.save();
        
        System.out.println("\n=== Creating New Documents ===");
        wordFactory.newDocument();
        pdfFactory.newDocument();
    }
}