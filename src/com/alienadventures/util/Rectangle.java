package com.alienadventures.util;

import java.io.Serializable;

public class Rectangle implements Serializable {
	private double x, y, width, height;
	private Object data;
	
	public Rectangle(double x, double y, double width, double height) {
		this(x, y, width, height, null);
	}
	
	public Rectangle(double x, double y, double width, double height, Object data) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.data = data;
	}
	
	public boolean intersects(Rectangle other) {
		return intersects(other.getX(), other.getY(), other.getWidth(), other.getHeight());
	}
	
	public boolean intersects(double x, double y, double width, double height) {
		return (x + width > this.x && y + height > this.y && x < this.x + getWidth() && y < this.y + getHeight());
	}
	
	public boolean contains(Point other) {
		return contains(other.getX(), other.getY());
	}
	
	public boolean contains(double x, double y) {
		return (this.x < x && x <= this.x + this.width && this.y < y && y <= this.y + this.height);
	}
	
	public boolean contains(Rectangle other) {
		return contains(other.getX(), other.getY(), other.getWidth(), other.getHeight());
	}
	
	public boolean contains(double x, double y, double width, double height) {
		return (x >= this.x && y >= this.y && (x + width) <= this.x + this.width && (y + height) <= this.y + this.height);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setRect(double x, double y, double width, double height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	public Object getData() {
		return data;
	}
}

