import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.Workbook;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public interface Methods
{
    default ArrayList<String> fileToList(ArrayList<String> list, String pathListOfAlternator) throws Exception{
        FileInputStream fileInputStream = new FileInputStream(pathListOfAlternator);
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        return list;
    }

    default void listToFile(ArrayList<String> list, String pathListOfAlternator) throws Exception{
        PrintWriter printWriter = new PrintWriter(pathListOfAlternator);
        for (String model: list) {
            printWriter.println(model);
        }
        printWriter.close();
    }

    default boolean isModelOnList (ArrayList<String> list, String model){
        for (String modelFromList: list) {
            if(modelFromList.equals(model)) return false;
        }
        return true;
    }

    default void excelToPdf (String excelPath, String model, String nameTester, int pageIndex) throws Exception{
//        String pdfPath = "C:\\Users\\Sebastian\\Desktop\\doTestu\\raporty_PDF\\";
//        Workbook workbook = new Workbook(excelPath);
//        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
//        pdfSaveOptions.setPageIndex(pageIndex);
//        pdfSaveOptions.setPageCount(1);
//        StringBuilder str = new StringBuilder(pdfPath + model + nameTester + ".pdf");
//        String pdfPathWithName = str.toString();
//        workbook.save(pdfPathWithName, pdfSaveOptions);
    }

    void copyFile() throws Exception;
}
