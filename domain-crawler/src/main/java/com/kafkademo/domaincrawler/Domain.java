package com.kafkademo.domaincrawler;

public class Domain {
 String domain;
 String create_date;
 String update_date;
 String country;
 boolean isDead;
 String A;
 String NS;
 String CNAME;
 String MX;
 String TXT;
 
 public Domain() {
	 
 }
 public Domain(String domain, String create_date, String update_date, String country, boolean isDead, String a,
		String nS, String cNAME, String mX, String tXT) {
	super();
	this.domain = domain;
	this.create_date = create_date;
	this.update_date = update_date;
	this.country = country;
	this.isDead = isDead;
	A = a;
	NS = nS;
	CNAME = cNAME;
	MX = mX;
	TXT = tXT;
}
@Override
public String toString() {
	return "Domain [domain=" + domain + ", create_date=" + create_date + ", update_date=" + update_date + ", country="
			+ country + ", isDead=" + isDead + ", A=" + A + ", NS=" + NS + ", CNAME=" + CNAME + ", MX=" + MX + ", TXT="
			+ TXT + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((A == null) ? 0 : A.hashCode());
	result = prime * result + ((CNAME == null) ? 0 : CNAME.hashCode());
	result = prime * result + ((MX == null) ? 0 : MX.hashCode());
	result = prime * result + ((NS == null) ? 0 : NS.hashCode());
	result = prime * result + ((TXT == null) ? 0 : TXT.hashCode());
	result = prime * result + ((country == null) ? 0 : country.hashCode());
	result = prime * result + ((create_date == null) ? 0 : create_date.hashCode());
	result = prime * result + ((domain == null) ? 0 : domain.hashCode());
	result = prime * result + (isDead ? 1231 : 1237);
	result = prime * result + ((update_date == null) ? 0 : update_date.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Domain other = (Domain) obj;
	if (A == null) {
		if (other.A != null)
			return false;
	} else if (!A.equals(other.A))
		return false;
	if (CNAME == null) {
		if (other.CNAME != null)
			return false;
	} else if (!CNAME.equals(other.CNAME))
		return false;
	if (MX == null) {
		if (other.MX != null)
			return false;
	} else if (!MX.equals(other.MX))
		return false;
	if (NS == null) {
		if (other.NS != null)
			return false;
	} else if (!NS.equals(other.NS))
		return false;
	if (TXT == null) {
		if (other.TXT != null)
			return false;
	} else if (!TXT.equals(other.TXT))
		return false;
	if (country == null) {
		if (other.country != null)
			return false;
	} else if (!country.equals(other.country))
		return false;
	if (create_date == null) {
		if (other.create_date != null)
			return false;
	} else if (!create_date.equals(other.create_date))
		return false;
	if (domain == null) {
		if (other.domain != null)
			return false;
	} else if (!domain.equals(other.domain))
		return false;
	if (isDead != other.isDead)
		return false;
	if (update_date == null) {
		if (other.update_date != null)
			return false;
	} else if (!update_date.equals(other.update_date))
		return false;
	return true;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getCreate_date() {
	return create_date;
}
public void setCreate_date(String create_date) {
	this.create_date = create_date;
}
public String getUpdate_date() {
	return update_date;
}
public void setUpdate_date(String update_date) {
	this.update_date = update_date;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public boolean isDead() {
	return isDead;
}
public void setDead(boolean isDead) {
	this.isDead = isDead;
}
public String getA() {
	return A;
}
public void setA(String a) {
	A = a;
}
public String getNS() {
	return NS;
}
public void setNS(String nS) {
	NS = nS;
}
public String getCNAME() {
	return CNAME;
}
public void setCNAME(String cNAME) {
	CNAME = cNAME;
}
public String getMX() {
	return MX;
}
public void setMX(String mX) {
	MX = mX;
}
public String getTXT() {
	return TXT;
}
public void setTXT(String tXT) {
	TXT = tXT;
}

 
 
}
