package net.nice19.smboard.member.model;

import java.io.Serializable;

public class MemberModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idx;
	private String userId;
	private String userPw;
	private String userName;
	private String joinDate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
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
		MemberModel other = (MemberModel) obj;
		if (idx != other.idx)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MemberModel [idx=" + idx + ", userId=" + userId + ", userPw="
				+ userPw + ", userName=" + userName + ", joinDate=" + joinDate
				+ "]";
	}	
	
	
}
