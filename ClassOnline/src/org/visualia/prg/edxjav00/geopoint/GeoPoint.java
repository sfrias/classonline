/**
 * Clase Geopoint de coordenadas geodesicas
 * Created by Santiago Frias 04/2015
 */
package org.visualia.prg.edxjav00.geopoint;
/**
 * @author sfrias
 *
 */
public class GeoPoint {
	//Establece un tipo de punto geográfico 
	private double longit, latit ;
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
		final int K_RadiusAverageEarth = 6371000;
		double dlatit = Math.toRadians(latit-newPlace.latit);
		double dlongit = Math.toRadians(longit-newPlace.longit);
		double lat1 = Math.toRadians(newPlace.latit);
		double lat2 = Math.toRadians(latit);
		double a = Math.sin(dlatit/2)*Math.sin(dlatit/2)+
				Math.sin(dlongit/2)*Math.sin(dlongit/2)	*
				Math.cos(lat1)*Math.cos(lat2);
		double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return (c * K_RadiusAverageEarth);
	}
	public double getLongit() {
		return longit;
	}
	public void setLongit(double longit) {
		this.longit = longit;
	}
	public double getLatit() {
		return latit;
	}
	public void setLatit(double latit) {
		this.latit = latit;
	}
	public static void main(String[] args) {
		Double Distancia ;
		GeoPoint place1, place2;
		place1 = new GeoPoint(20.019643, 31.334354);
		place2 = new GeoPoint(20.019187, 31.333246);
		Distancia = place1.pathDist(place2);
		System.out.println("Distancia en metros: "+ Distancia );
	}
	
}
