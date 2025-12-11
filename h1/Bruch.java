package h1;

public class Bruch {
int zaehler;
int nenner;
public Bruch(int zaehler, int nenner){
	this.zaehler= zaehler;
	this.nenner= nenner;
}
private int ggT(int x, int y) {
	if (x>0 && y>0) {
		if (x>y) {	
		while (y!=0) {
			int r= x%y;
			x=y;
			y=r;
		} return x;
			
		} else  {
		int z=x;
		int a=y;
		x=a;
		y=z;
		return ggT(x,y);
		}
		}
	return 0;
}
public int getGgT(int x, int y) {
return ggT(x,y);	
}
public void shorten() {
	if (nenner==0) return;
	int divider=ggT(Math.abs(zaehler), Math.abs(nenner));
	zaehler/= divider;
	nenner/= divider;
}
public boolean hasSameValueAs(Bruch b) {
	Bruch temp1= new Bruch(this.zaehler, this.nenner);
	temp1.shorten();
	Bruch temp2= new Bruch (b.zaehler,b.nenner);
	temp2.shorten();
if(temp1.zaehler== temp2.zaehler && temp1.nenner==temp2.nenner) {
	return true;
}else { return false;
}
}
}
