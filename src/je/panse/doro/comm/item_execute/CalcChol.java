package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcChol {
	public void main(String skeys) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc();

		if (skeys == "Itemcategorykey") {
			fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
		}else {
			fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
		}
    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input TC : ");
	        int TC = input.nextInt();
	        
	        System.out.print("========= Input HDL  : ");
	        int HDL = input.nextInt();
	        
	        System.out.print("========= Input TG : ");
	        int TG = input.nextInt();
	        
	        System.out.print("========= Input LDL  : ");
	        int LDL = input.nextInt();
//      input.close();
	        String Cholresult = ("    TC-HDL-TG LDL     [  " 
	        + TC + " - " + HDL + " - " + TG + " - " + LDL +  "  ] mg/dl" );
			System.out.print(Cholresult);
				fcp1.writeliner(Enter.wts + "/7LAB", Cholresult);
			Key_Iwbb bb1 = new Key_Iwbb();
			bb1.returnkeylist(skeys);
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
}