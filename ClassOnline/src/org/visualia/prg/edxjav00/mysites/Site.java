/**
 * 
 */
package org.visualia.prg.edxjav00.mysites;

/**
 * @author sfrias
 *
 */

import org.visualia.prg.edxjav00.geopoint.GeoPoint;

/**
 * 
 */
public class Site {
	private String nombre;
    private String direccion;
    private GeoPoint posicion;
    private String foto;
    private int telefono;
    private String url;
    private String comentario;
    private long fecha;
    private float valoracion;

    public Site(String nombre, String direccion, double longitud,
          double latitud, int telefono, String url, String comentario,
          int valoracion) {
          fecha = System.currentTimeMillis();
          posicion = new GeoPoint(longitud, latitud);
          this.nombre = nombre;
          this.direccion = direccion;
          this.telefono = telefono;
          this.url = url;
          this.comentario = comentario;
          this.valoracion = valoracion;
    }
    @Override
	public String toString() {
		return "Site [nombre=" + nombre + ", direccion=" + direccion + ", posicion=" + posicion + ", foto=" + foto
				+ ", telefono=" + telefono + ", url=" + url + ", comentario=" + comentario + ", fecha=" + fecha
				+ ", valoracion=" + valoracion + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Site NewSite = new Site ("URV Tecnica Tarragona","Campus Sescelades", 43,25, 977123456,
				"http://www.urv.cat", "Zona avenida Catalunya",5);
		System.out.println(NewSite);
		/*System.out.println("-------------------");
		System.out.println(NewSite.fecha);
		System.out.println(NewSite.posicion);
		System.out.println(NewSite.nombre);
		System.out.println(NewSite.direccion);
		System.out.println(NewSite.telefono);
		System.out.println(NewSite.url);
		System.out.println(NewSite.comentario);
		System.out.println(NewSite.valoracion);*/
	}
}