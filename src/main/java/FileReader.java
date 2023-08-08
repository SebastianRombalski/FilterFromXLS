import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.Workbook;

import java.util.ArrayList;

public class FileReader {


    public static void main(String[] args) throws Exception {
//        ArrayList<String> listAlt198 = new ArrayList<>();
//        ArrayList<String> listAlt198_2 = new ArrayList<>();
//        ArrayList<String> listSt116_1 = new ArrayList<>();
//        ArrayList<String> listSt116_2 = new ArrayList<>();
//        ArrayList<String> listBsg198 = new ArrayList<>();

        String startPathAlt198_2_1 = "\\\\192.168.10.120\\maszyny\\Alt-198-2\\report\\ReportStorage";
        alt198_2(startPathAlt198_2_1);

        String startPathBSG198_1 = "\\\\192.168.10.120\\maszyny\\Bsg-198\\report\\ReportStorage";
        bsg198(startPathBSG198_1);

        String startPathAlt198_1_1 = "\\\\192.168.10.120\\maszyny\\Alt-198\\report\\raport";
        String startPathAlt198_1_2 = "\\\\192.168.10.120\\maszyny\\Alt-198\\report\\raporty";
        String startPathAlt198_1_3 = "\\\\192.168.10.120\\maszyny\\Alt-198\\report\\raporty2";
        alt198(startPathAlt198_1_1);
        alt198(startPathAlt198_1_2);
        alt198(startPathAlt198_1_3);

        String startPathSt116_1_1 = "\\\\192.168.10.120\\maszyny\\St-116\\report\\raporty";
        String startPathSt116_1_2 = "\\\\192.168.10.120\\maszyny\\St-116\\report\\raporty 2022-09-15 19;34;43 (Pełna)";
        String startPathSt116_1_3 = "\\\\192.168.10.120\\maszyny\\St-116\\report\\raporty do 16.08.2021 prawidlowa wersja";
 //       String startPathSt116_1_4 = "\\\\192.168.10.120\\maszyny\\St-116\\report\\raporty do 16.08.2021 2022-09-15 13;27;43 (Pełna)";
        String startPathSt116_1_5 = "\\\\192.168.10.120\\maszyny\\St-116\\report\\ReportStorage";
        String startPathSt116_1_6 = "\\\\192.168.10.120\\maszyny\\St-116\\report\\ReportStorage 2022-09-15 12;24;44 (Pełna)";
        st116_1(startPathSt116_1_1);
        st116_1(startPathSt116_1_2);
        st116_1(startPathSt116_1_3);
  //      st116_1(startPathSt116_1_4); // blad w pliku !
        st116_1(startPathSt116_1_5);
        st116_1(startPathSt116_1_6);
//
        String startPathSt116_2_1 = "\\\\192.168.10.120\\maszyny\\St-116-2\\report\\report to 05.05 2022-09-16 09;30;13 (Pełna)";
        String startPathSt116_2_2 = "\\\\192.168.10.120\\maszyny\\St-116-2\\report\\ReportStorage";
        st116_2(startPathSt116_2_1);
        st116_2(startPathSt116_2_2);






    }

    public static void alt198(String startPath) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Long startTime = System.currentTimeMillis();
        String startPathAlt198 = startPath;
        String finalPathAlt198 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\choosen_alternator\\alt-198\\";
        String notePadPathAlt198 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\lista.txt";
        Alt198 alt198 = new Alt198(list, startPathAlt198, finalPathAlt198, notePadPathAlt198);
        alt198.fileToList(list, notePadPathAlt198);
        alt198.copyFile();
        alt198.listToFile(list, notePadPathAlt198);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void alt198_2(String startPath) throws Exception{
        ArrayList<String> list = new ArrayList<>();
        Long startTime = System.currentTimeMillis();
        String startPathAlt198_2 = startPath;
        String finalPathAlt198_2 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\choosen_alternator\\alt-198-2\\";
        String notePadPathAlt198_2 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\lista.txt";
        Alt198_2 alt198_2 = new Alt198_2(list, startPathAlt198_2, finalPathAlt198_2, notePadPathAlt198_2);
        alt198_2.fileToList(list, notePadPathAlt198_2);
        alt198_2.copyFile();
        alt198_2.listToFile(list, notePadPathAlt198_2);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void st116_1(String startPath) throws Exception{
        ArrayList<String> list = new ArrayList<>();
        Long startTime = System.currentTimeMillis();
        String startPathSt116_1 = startPath;
        String finalPathSt116_1 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\choosen_starter\\st-116\\";
        String notePadPathSt116_1 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\lista.txt";
        St116_1 st116_1 = new St116_1(list, startPathSt116_1, finalPathSt116_1, notePadPathSt116_1);
        st116_1.fileToList(list, notePadPathSt116_1);
        st116_1.copyFile();
        st116_1.listToFile(list, notePadPathSt116_1);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void st116_2(String startPath) throws Exception{
        ArrayList<String> list = new ArrayList<>();
        Long startTime = System.currentTimeMillis();
        String startPathSt116_2 = startPath;
        String finalPathSt116_2 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\choosen_starter\\st-116-2\\";
        String notePadPathSt116_2 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\lista.txt";
        St116_2 st116_2 = new St116_2(list, startPathSt116_2, finalPathSt116_2, notePadPathSt116_2);
        st116_2.fileToList(list, notePadPathSt116_2);
        st116_2.copyFile();
        st116_2.listToFile(list, notePadPathSt116_2);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void bsg198(String startPath) throws Exception{
        ArrayList<String> list = new ArrayList<>();
        Long startTime = System.currentTimeMillis();
        String startPathBsg198 = startPath;
        String finalPathBsg198 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\choosen_alternator\\bsg-198\\";
        String notePadPathBsg198 = "C:\\Users\\Lubichowo\\Desktop\\next_raport_challange\\lista.txt";
        Bsg198 bsg198 = new Bsg198(list, startPathBsg198, finalPathBsg198, notePadPathBsg198);
        bsg198.fileToList(list, notePadPathBsg198);
        bsg198.copyFile();
        bsg198.listToFile(list, notePadPathBsg198);
        System.out.println(System.currentTimeMillis() - startTime);
    }



}
