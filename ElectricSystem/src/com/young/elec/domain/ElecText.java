package com.young.elec.domain;

import java.util.Date;

public class ElecText {

	/**
	 * PO对象，对应数据库ElecText表
	 */
	
	/*textID varchar(50) not null,
	textName varchar(50),
	textDate datetime,
	textRemark varchar(500),*/
	private int textID;
	private String textName;
	private Date textDate;
	private String textRemark;
	
	public int getTextID() {
		return textID;
	}

	public void setTextID(int textID) {
		this.textID = textID;
	}

	public String getTextName() {
		return textName;
	}

	public void setTextName(String textName) {
		this.textName = textName;
	}

	public Date getTextDate() {
		return textDate;
	}

	public void setTextDate(Date textDate) {
		this.textDate = textDate;
	}

	public String getTextRemark() {
		return textRemark;
	}

	public void setTextRemark(String textRemark) {
		this.textRemark = textRemark;
	}

}
