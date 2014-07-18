package net.nice19.smboard.board.model;

import java.io.Serializable;

public class BoardCommentModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idx;
	private String writer;
	private String content;
	private String writeDate;
	private int linkedArticleNum;
	private String writerId;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public int getLinkedArticleNum() {
		return linkedArticleNum;
	}
	public void setLinkedArticleNum(int linkedArticleNum) {
		this.linkedArticleNum = linkedArticleNum;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
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
		BoardCommentModel other = (BoardCommentModel) obj;
		if (idx != other.idx)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BoardCommentModel [idx=" + idx + ", writer=" + writer
				+ ", content=" + content + ", writeDate=" + writeDate
				+ ", linkedArticleNum=" + linkedArticleNum + ", writerId="
				+ writerId + "]";
	}
}
