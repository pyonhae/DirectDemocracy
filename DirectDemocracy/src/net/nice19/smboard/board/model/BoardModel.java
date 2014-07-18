package net.nice19.smboard.board.model;

import java.io.Serializable;

public class BoardModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int rnum;
	private int idx;
	private String writer;
	private String subject;
	private String content;
	private int hitcount = 0;
	private int recommendcount = 0;
	private int comment = 0;
	private String writeDate;
	private String writerId;
	private String fileName;
	
	
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}	
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public int getRecommendcount() {
		return recommendcount;
	}
	public void setRecommendcount(int recommendcount) {
		this.recommendcount = recommendcount;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idx;
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
		BoardModel other = (BoardModel) obj;
		if (idx != other.idx)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BoardModel [rnum=" + rnum + ", idx=" + idx + ", writer="
				+ writer + ", subject=" + subject + ", content=" + content
				+ ", hitcount=" + hitcount + ", recommendcount="
				+ recommendcount + ", comment=" + comment + ", writeDate="
				+ writeDate + ", writerId=" + writerId + ", fileName="
				+ fileName + "]";
	}
}
