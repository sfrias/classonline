/**
 * Clase Geopoint de coordenadas geodesicas
 */
package org.visualia.prg.edxjav00.geopoint;
/**
 * @author sfrias
 *
 */
public class GeoPoint {
	//Establece un tipo de punto geográfico 
	private double longit, latit ;
	final protected int K_RadiusAverageEarth = 6371000;
	/**
	 * Constructor de la clase
	 */
	public GeoPoint(double longit, double latit) {
		this.longit = longit;
		this.latit = latit;
	}
	/**
	 * @return devuelve el string de coordenadas del punto de la clase.
	 */
	public String strCoordGeodesic (){
		return "["+longit+","+latit+"]";
	}
	/**
	 * @param newPlace nuevo punto al que calcular la distancia
	 * @return distancia en metros entre los dos puntos
	 */
	public double pathDist (GeoPoint newPlace){
		double dlatit = Math.toRadians(latit-newPlace.latit);
		double dlongit = Math.toRadians(longit-newPlace.longit);
		double lat1 = Math.toRadians(newPlace.latit);
		double lat2 = Math.toRadians(latit);
		double a = Math.sin(dlatit/2)*Math.sin(dlatit/2)+
				Math.sin(dlongit/2)*Math.sin(dlongit/2)	+
				Math.cos(lat1)*Math.cos(lat2);
		double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return c * K_RadiusAverageEarth;
	}
	public static void main(String[] args) {
		GeoPoint place1, place2;
		place1 = new GeoPoint(123.03964, -45.3343);
		place2 = new GeoPoint(140.0001, 90.363246235);
		System.out.println("Distancia en metros: "+ place1.pathDist(place2));
	}
}
