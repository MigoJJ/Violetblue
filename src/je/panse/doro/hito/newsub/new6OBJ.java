package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.item.CalcBP;
import je.panse.doro.main.Enter;


public class new6OBJ {
	public static void main(String args) throws IOException { 

		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/SubMenu/6OBJ_List");

    	Scanner new_code = new Scanner(System.in);
    			int select_code = 0;
    	try {
   			   			while (true) {
   		    	if (select_code == 99) { break; }
   		 	
   		    	System.out.println("Enter selected code number ...   : ");
   		    	select_code = Integer.valueOf(new_code.nextLine().trim());

   		    	switch (select_code) {
	//			  case 1 : new3CC.main(null);	  	break;
				  case 2 :    CalcBP ob3 = new CalcBP(); 
								CalcBP.main(null); 				break;
	//			  case 2 : new4PMH.main(null);  	break;
	//					  case "3" : new5SUJ.main(null);  	break;

	//					  case "5" : new7LAB.main(null);  	break;
	//					  case "6" : new8ACC.main(null);  	break;
	//					  case "7" : new9PLAN.main(null);  	break;
	//					  case "c" : Com.main(null);  	break;
	//					  case "q" : InputButton.quitButton(null);  	break;
	//					  case "qq" : InputQuitSave.main(null);  	break;
					}
   				}
			} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
// ----------------------------------------------
}
