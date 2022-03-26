package je.panse.doro.hito;

import java.io.IOException;		
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.File_editor_proc;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.main.Enter;
import je.panse.doro.main.SingleBeam;

public class StartForm {
	public static void main(String[] string) throws IOException {
		File_cdrw_proc st1 = new File_cdrw_proc(); 
		st1.readfiler(Enter.wt + "/singlebeam/StartMenuList");

		try (Scanner case_code = new Scanner(System.in)) {
			int select_code = 0;
			
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(case_code.nextLine());
			
				switch (select_code) {
					case 1 : Newcategory st2 = new Newcategory(); 	
							st2.main(null);break;
					case 2 : File_cw_chart st3 = new File_cw_chart();
							st3.callchartlist("/soap");
							Newcategory st4 = new Newcategory(); 
							st4.main(null);break;
				//	case "3" : SOAPInput.main(n_code);  	break;
				 	case 9 : 
				 		File_cdrw_proc.copyfiler(Enter.wts + "/ChartPlate", Enter.wts + "/ChartPlateNote,");
				 		File_editor_proc.main(null);
				 		NineDeux.unnine();
				 		Enter.main(null); break;
					default :System.out.println(" uncertain ... please check  !!");
				}
			}	// while
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
    }
// ----------
}