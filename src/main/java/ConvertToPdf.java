import com.aspose.cells.PdfSaveOptions;
import  com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class ConvertToPdf {





        public static void main(String[] args) throws Exception {

            Workbook workbook = new Workbook("C:\\\\Users\\\\Sebastian\\\\Desktop\\\\doTestu\\\\raporty_wysortowane\\\\alt-198\\\\A0751S_Alt198.xlsx");
            PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
            pdfSaveOptions.setPageIndex(0);
            pdfSaveOptions.setPageCount(1);
            workbook.save("C:\\Users\\Sebastian\\Desktop\\doTestu\\raporty_PDF\\Output.pdf", pdfSaveOptions);

        }
    }


