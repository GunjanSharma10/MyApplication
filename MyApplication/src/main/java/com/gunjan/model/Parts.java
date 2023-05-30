package com.gunjan.model;

public class Parts {
	
	private int sNo;
	private String part_id;
	private String part_desc;
	private boolean availability;
	private boolean checklist;
	
	
	public Parts() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Parts(int sNo, String part_id, String part_desc, boolean availability, boolean checklist) {
		super();
		this.sNo = sNo;
		this.part_id = part_id;
		this.part_desc = part_desc;
		this.availability = availability;
		this.checklist = checklist;
	}


	public int getsNo() {
		return sNo;
	}


	public void setsNo(int sNo) {
		this.sNo = sNo;
	}


	public String getPart_id() {
		return part_id;
	}


	public void setPart_id(String part_id) {
		this.part_id = part_id;
	}


	public String getPart_desc() {
		return part_desc;
	}


	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}


	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public boolean isChecklist() {
		return checklist;
	}


	public void setChecklist(boolean checklist) {
		this.checklist = checklist;
	}


	@Override
	public String toString() {
		return "Parts [sNo=" + sNo + ", part_id=" + part_id + ", part_desc=" + part_desc + ", availability="
				+ availability + ", checklist=" + checklist + "]";
	}

	
}
