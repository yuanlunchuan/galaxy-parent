package com.galaxy.provider.user.tool;

public class PageHelper<T> {
	private Integer pageSize;
	private Integer pageNumber;
	private T object;

	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
}
