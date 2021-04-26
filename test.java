import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

class MainClass {

    String excelFilePath = "/home/liuyi1/Documents/MedicalAssistant/TAMU_EMS_Protocols.tsv";
    int printIdx = 2;
    
    public void readExcel(){
        List<String> vitalList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(excelFilePath);
            BufferedReader reader = new BufferedReader(fr);
            reader.readLine();
            String line = "";
            while((line=reader.readLine()) != null){
//                System.out.println(line);
                String item[] = line.split("\t");
                if(item.length <= 2){
//                    System.out.println("empty line!");
                    continue;
                }
//                System.out.println(item.length);
                System.out.println(item[printIdx]);
                vitalList.add(item[printIdx]);
            }
            fr.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vitalList.size());
//        return vitalList;
    }


public static void main(String[] args){
    
//    System.out.println("Hello World!");

    MainClass mc = new MainClass();
    mc.readExcel();
}
}
