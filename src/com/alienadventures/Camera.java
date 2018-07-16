package com.alienadventures;

import com.alienadventures.entity.GameObject;
import com.alienadventures.entity.Particle;
import com.alienadventures.util.Vector;

public class Camera {
	private Vector offset;

	public Camera() {
		this(0, 0);
	}

	public Camera(double x, double y) {
		offset = new Vector(x, y);
	}

	public double getOffsetX() {
		return offset.getX();
	}

	public double getOffsetY() {
		return offset.getY();
	}

	public void setY(double y) { offset.y = y; }
	public void setX(double x) { offset.x = x; }

	public void centerOn(GameObject obj) {
		double goBy = 1.0/100;
		double newOffsetX = obj.getX() + Game.WIDTH / 2;
		double newOffsetY = obj.getY() + Game.HEIGHT / 2;
		offset.x += (newOffsetX - offset.x)*goBy;
		offset.y += (newOffsetY - offset.y)*goBy;
	}

	public static void main(String[] args) {
		Camera cam = new Camera();
		for (int i = 0; i < 100; i++) {
			cam.centerOn(new Particle(100, 100));
			System.out.println(cam.getOffsetX() + ", " + cam.getOffsetY());
		}
	}
}
