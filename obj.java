class customer {
	String cname,ccont,ccity,cstate,country;
	int cid=1234;
	public customer(String cname, String ccont){
		this.cname=cname;
		this.ccont=ccont;
	}
	public String toString(){
		return cname+" "+ccont;
	}
	public int hashCode(){
	  return cid;
	
	}
	public boolean equals(Object o) {
      try {
        customer c = (customer) o;
         if (cname == c.cname && cid == c.cid)
          return true;
         else
          return false;
           } catch (ClassCastException e) {
             return false;
           } catch (NullPointerException e) {
              return false;
        }
	}
}
public class obj {
public static void main (String [] args){
	customer c = new customer("hosh","999978");
	customer c2 = new customer("joshua","9898");
	customer c1=c;
	System.out.println(c1.equals(c2));
	System.out.println(c1.equals(c));
	System.out.println(c.hashCode());
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	
}
}