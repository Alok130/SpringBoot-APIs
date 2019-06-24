package com.example.demo;


import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

 @Table(name="itemtable")
public class DataModel {

	@Id
	private int itemno;
	
	private String itemname;	
	private BigDecimal itemprice;
	
	public int getItemNo() {
		return itemno;
	}
	public void setItemNo(int itemNo) {
		this.itemno = itemNo;
	}
	public String getItemName() {
		return itemname;
	}
	public void setItemName(String itemName) {
		this.itemname = itemName;
	}
	public BigDecimal getItemPrice() {
		return itemprice;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemprice = itemPrice;
	}
	@Override
	public String toString() {
		return "Model [itemNo=" + itemno + ", itemName=" + itemname + ", itemPrice=" + itemprice + "]";
	}
	
}
