package project.backend.oilcar.coordina;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class CoordinaService {

	private CoordinaService () {
	}
	

	
	public static boolean isInSquareArea(CoordinaModel coordinate,CoordinaModel center, int radius){

		boolean latres = false;
		boolean lonres  = false;

		CoordinaModel p1 = getDerivedPosition(center, radius, 0);
		CoordinaModel p2 = getDerivedPosition(center, radius, 90);
		CoordinaModel p3 = getDerivedPosition(center, radius, 180);
		CoordinaModel p4 = getDerivedPosition(center, radius, 270);

		if(coordinate.getLatitude() >= p3.getLatitude())
			if(coordinate.getLatitude() <= p1.getLatitude())
				latres = true;

		if(coordinate.getLongitude() <= p2.getLongitude())
			if(coordinate.getLongitude() >= p4.getLongitude())
				lonres = true;

		return (latres && lonres);
	}

	
	public  boolean isInCircleArea(CoordinaModel coordinate,CoordinaModel center, int radius){
		boolean res = isInSquareArea(coordinate, center, radius);
		if (getDistanceBetweenTwoPoints(coordinate, center) <= radius)
			res = true;
		else
			res = false;

		return res;

	}

	
	public static CoordinaModel getDerivedPosition(CoordinaModel coordinate,double range, double bearing) {

		double EarthRadius = 6371000; // meters

		double latA = Math.toRadians(coordinate.getLatitude());
		double lonA = Math.toRadians(coordinate.getLongitude());
		double angularDistance = range / EarthRadius;
		double trueCourse = Math.toRadians(bearing);

		double lat = Math.asin(Math.sin(latA) * Math.cos(angularDistance) + Math.cos(latA) * Math.sin(angularDistance) * Math.cos(trueCourse));

		double dlon = Math.atan2(Math.sin(trueCourse) * Math.sin(angularDistance) * Math.cos(latA), Math.cos(angularDistance) - Math.sin(latA) * Math.sin(lat));

		double lon = ((lonA + dlon + Math.PI) % (Math.PI * 2)) - Math.PI;

		lat = Math.toDegrees(lat);
		lon = Math.toDegrees(lon);

		return new CoordinaModel(lat, lon);

	}

	
	public  double getDistanceBetweenTwoPoints(CoordinaModel c1, CoordinaModel c2) {
		
		double R = 6371000; // m
		double dLat = Math.toRadians(c2.getLatitude() - c1.getLatitude());
		double dLon = Math.toRadians(c2.getLongitude() - c1.getLongitude());
		double lat1 = Math.toRadians(c1.getLatitude());
		double lat2 = Math.toRadians(c2.getLatitude());

		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double d = R * c;

		return d;
	}
	
	
	public static CoordinaModel getRandomLocation(double centerLatitude, double centerLongitude, int radius) {
		
		CoordinaModel coor = new CoordinaModel(centerLatitude, centerLongitude);
		
		return getRandomLocation(coor, radius);
	}
	
	
	public static CoordinaModel getRandomLocation(CoordinaModel center, int radius) {
		
		Random random = new Random();

		// Convert radius from meters to degrees
		double radiusInDegrees = radius / 111000f;

		double u = random.nextDouble();
		double v = random.nextDouble();
		double w = radiusInDegrees * Math.sqrt(u);
		double t = 2 * Math.PI * v;
		double x = w * Math.cos(t);
		double y = w * Math.sin(t);

		// Adjust the x-coordinate for the shrinking of the east-west distances
		double new_x = x / Math.cos(center.getLongitude());

		double foundLatitude = new_x + center.getLatitude();
		double foundLongitude = y + center.getLongitude();
		
		return new CoordinaModel(foundLatitude, foundLongitude);
	}
}

