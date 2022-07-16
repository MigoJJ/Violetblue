package je.panse.doro.fourgate.thyroid;

import java.util.Scanner;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.fourgate.thyroid.goiter.EtGoiterProc;
import je.panse.doro.main.Enter;

public class ThyroidEnter {
	public static void main(String[] string) throws Exception {
		Menu_list.main(Enter.wd + "/fourgate/thyroid/dataxlsxfile/ThyroidStart");
		try(Scanner case_code = new Scanner(System.in)) {
			while (true) {
				System.out.println(">>> Enter selected number :  >>>");
				int select_code = case_code.nextInt();
				switch (select_code) {
//					case 1 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/Prologue");
//					case 2 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/VersionInfo");
					case 3 : 
						EtGoiterProc erc2 = new EtGoiterProc();
						erc2.main(0,0);
						break;
					
					default :System.out.println(" uncertain ... please check  !!");
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
			//sf1.readfiler(Enter.wt + "/singlebeam/DoctorLogin");
	}

}