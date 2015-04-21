package org.visualia.prg.edxjav00.conplexe;
/**
 * @author sfrias
 */
public class ComplExtd extends Complex {
	private boolean esReal;
	/**
	 * @param par1
	 * @param par2
	 * @param concert
	 */
	public ComplExtd(double par1, double par2, boolean concert) {
		super(par1, par2, concert);
		esReal = par1 ==0;
	}
	public ComplExtd(double par1){
		super(par1, 0, true);
		esReal = true;
	}
	@Override
	public void cxPlus(Complex csum) {
		super.cxPlus(csum);
		esReal = getImg() == - csum.getImg();
	}
	@Override
	public String strBinomic (){
	  if(esReal) {
	    return getReal() + " ¡real!";
	  } else{
	    return super.strBinomic();
	  }
	}
	public String strCartesian (){
		  if(esReal) {
		    return getReal() + " ¡real!";
		  } else{
		    return super.strCartesian();
		  }
		}
	public boolean esReal(){
		return esReal;
	}
}
