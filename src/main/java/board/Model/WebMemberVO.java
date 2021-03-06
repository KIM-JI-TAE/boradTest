package board.Model;

import java.util.Date;

public class WebMemberVO {

	private String mem_id;
	private String mem_name;
	private String mem_pass;
	private Date mem_bir;
	private String mem_addr1;
	private String mem_addr2;
	private String mem_zip;
	private String mem_profile;
	private String mem_alias;

	@Override
	public String toString() {
		return "WebMemberVO [mem_id=" + mem_id + ", mem_name=" + mem_name + ", mem_pass=" + mem_pass + ", mem_bir="
				+ mem_bir + ", mem_addr1=" + mem_addr1 + ", mem_addr2=" + mem_addr2 + ", mem_zip=" + mem_zip
				+ ", mem_profile=" + mem_profile + ", mem_alias=" + mem_alias + "]";
	}

	public WebMemberVO() {

	}

	public WebMemberVO(String mem_id, String mem_name, String mem_pass, Date mem_bir, String mem_addr1,
			String mem_addr2, String mem_zip, String mem_profile, String mem_alias) {
		super();
		this.mem_id = mem_id;
		this.mem_name = mem_name;
		this.mem_pass = mem_pass;
		this.mem_bir = mem_bir;
		this.mem_addr1 = mem_addr1;
		this.mem_addr2 = mem_addr2;
		this.mem_zip = mem_zip;
		this.mem_profile = mem_profile;
		this.mem_alias = mem_alias;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_pass() {
		return mem_pass;
	}

	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}

	public Date getMem_bir() {
		return mem_bir;
	}

	public void setMem_bir(Date mem_bir) {
		this.mem_bir = mem_bir;
	}

	public String getMem_addr1() {
		return mem_addr1;
	}

	public void setMem_addr1(String mem_addr1) {
		this.mem_addr1 = mem_addr1;
	}

	public String getMem_addr2() {
		return mem_addr2;
	}

	public void setMem_addr2(String mem_addr2) {
		this.mem_addr2 = mem_addr2;
	}

	public String getMem_zip() {
		return mem_zip;
	}

	public void setMem_zip(String mem_zip) {
		this.mem_zip = mem_zip;
	}

	public String getMem_profile() {
		return mem_profile;
	}

	public void setMem_profile(String mem_profile) {
		this.mem_profile = mem_profile;
	}

	public String getMem_alias() {
		return mem_alias;
	}

	public void setMem_alias(String mem_alias) {
		this.mem_alias = mem_alias;
	}
}
