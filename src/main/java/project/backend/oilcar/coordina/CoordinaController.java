package project.backend.oilcar.coordina;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Coordina")
public class CoordinaController {
	@Autowired
	CoordinaService coordinaService;
	
	
	@GetMapping("/daiar")
	public double testgeoja() {
//		double rat = 13.715963052965575;
//		double cat = 100.65684083613644;
//		double rat1 = 13.627495;
//		double cat1 = 100.712291;
		double rat = 13.6272;
		double cat = 100.711205;
		double rat1 = 13.92669;
		double cat1 = 100.723111;
//		int pick = 11500;
		CoordinaModel car = new CoordinaModel(rat,cat);
		CoordinaModel car1 = new CoordinaModel(rat1,cat1);
		double coordinates = coordinaService.getDistanceBetweenTwoPoints(car,car1);
		DecimalFormat df = new DecimalFormat("#.00");
		coordinates = coordinates /1000;
		coordinates = Double.valueOf(df.format(coordinates));
		return coordinates ;
	}
	
	@GetMapping("/daiaraa")
	public boolean testgeojaa() {
		double rat = 13.7154165;
		double cat =  100.6570485;
		double rat1 = 13.7166462;
		double cat1 = 100.6536363;
		int pick = 100000;
		CoordinaModel centerBustop = new CoordinaModel(rat,cat);
		CoordinaModel Car = new CoordinaModel(rat1,cat1);
		boolean coordinates = coordinaService.isInCircleArea(Car,centerBustop,pick);
//		DecimalFormat df = new DecimalFormat("#.##");
//		coordinates = Double.valueOf(df.format(coordinates));
		return coordinates;
		
		
	}
	
	@GetMapping("/daiaraa/{letStart},{lngStart}/{letEnd},{lngEnd}")
	public boolean testgeojaa(@PathVariable double letStart,@PathVariable double lngStart
			,@PathVariable double letEnd,@PathVariable double lngEnd) {
		CoordinaModel Start = new CoordinaModel(letStart,lngStart);
		CoordinaModel End = new CoordinaModel(letEnd,lngEnd);
		boolean coordinates = coordinaService.isInCircleArea(Start,End,100000);
		return coordinates;
	}
	
	@GetMapping("/daiaraasbc")
	public String asdw() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
////
		Date d1 = null;
		Date d2 = null;
		String dateStart = "2015/07/1 09:30:58";
		String dateStop = "2015/07/1 11:05:48";
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
			System.out.println(String.valueOf(d1) + '-' + '-'+ String.valueOf(d2));
//			//in milliseconds
////			long diff = d2.getTime() - d1.getTime();
////
////			long diffSeconds = diff / 1000 % 60;
////			long diffMinutes = diff / (60 * 1000) % 60;
////			long diffHours = diff / (60 * 60 * 1000) % 24;
////			long diffDays = diff / (24 * 60 * 60 * 1000);
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) ;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");
//			Date time12 = format(diffDays +"/"+ diffHours +"/"+ diffMinutes +"/"+ diffSeconds);
//			String time13 = diffDays +"-"+ diffHours +"-"+ diffMinutes +"-"+ diffSeconds;
//			if(Integer.valueOf(time12) > time13) {
//				
//			}
			return diffDays + "-" + diffHours + "-" + diffMinutes + "-" + diffSeconds;
//
		} catch (Exception e) {
			e.printStackTrace();
			return "asdw";

		}
	}
		

}

