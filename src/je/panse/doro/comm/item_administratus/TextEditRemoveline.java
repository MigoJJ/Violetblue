package je.panse.doro.comm.item_administratus;

import java.io.*;	
import java.util.Scanner;

public class TextEditRemoveline {
	public static void main(String[] args) {
        final String EMPTY_STRING = "";
        Scanner file;
        PrintWriter writer;
        try {
            file = new Scanner(new File("/home/migowj/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate"));
            writer = new PrintWriter("/home/migowj/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate.tmp");

            while (file.hasNext()) {
//		                String line = file.nextLine().trim();
                String line = file.nextLine();
            	  String line1 =line.replaceAll("\\s+$", "");
                if (!line1.isEmpty()) {
                    writer.write(line1);
                    writer.write("\n");
                }
            }
            file.close();
            writer.close();
            
            File file1 = new File("/home/migowj/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate");
            File file2 = new File("/home/migowj/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate.tmp");
            file1.delete();
            file2.renameTo(file1);

        } catch (FileNotFoundException ex) {
//		            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
         }
		}
}
