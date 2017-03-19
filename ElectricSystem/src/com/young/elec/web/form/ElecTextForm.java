package com.young.elec.web.form;

import java.util.Date;

public class ElecTextForm {

	/**
	 * VO对象，对应页面表单的属性值
	 * VO对象和PO对象的关系：
	 * 		相同点: 都是javabean
	 * 		不同点: VO对象的属性可以随
	 */

	private int textID;
	private String textName;
	private String textDate;
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
	public String getTextDate() {
		return textDate;
	}
	public void setTextDate(String textDate) {
		this.textDate = textDate;
	}
	public String getTextRemark() {
		return textRemark;
	}
	public void setTextRemark(String textRemark) {
		this.textRemark = textRemark;
	}

}
