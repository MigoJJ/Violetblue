package je.panse.doro.comm.item_exec;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.comm.item_exec.CalcACC;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcCPA {
	public static void main(String args) throws IOException { 

		File_cdrw_proc ekg1 = new File_cdrw_proc(); 
		ekg1.readfiler(Enter.wt + "/singlebeam/submenu/6OBJs/CPAj");
		
		System.out.println(ekg1);

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected CPA code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : accessInsert("정상 (No Active lesions inLung)"); break;
					case 2 : accessInsert("폐결핵 흔적 (Pulmonary tuberculosis scar)"); break;
					
//					case 5 : accessInsert("심방조기수축 (Early atrial constraction)"); break;
					
					case 9 : NineDeux.unnine();	break;
					default :System.out.println(" uncertain ... please check  !!");
				}
				New6OBJ.main(null);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
	//------------------------------------------------
	static void writecoding(String writec) throws IOException {
			File file_acc = new File(Enter.wts + "/6OBJ");
			System.out.println(file_acc);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_acc,true));
				try {
					bufferedWriter.write("    Chest PA  : " + writec);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
}
//------------------------------------------------
	   static void accessInsert(String EKG_code) throws IOException {
				try {
					System.out.println(EKG_code);
					writecoding(EKG_code);
				} catch (IOException e) {
					e.printStackTrace();
			}
}
// ----------
}