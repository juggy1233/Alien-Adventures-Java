package com.alienadventures.entity;

import com.alienadventures.Game;

import java.awt.*;

public class Particle extends GameObject {
	private int life;
	private Color color;

	public Particle(double x, double y) {
		super(x, y);
		setWidth(10);
		setHeight(10);
		setVel(Math.random() * 10 - 5, Math.random() * 10 - 5);
		life = (int)(Math.random() * 90 + 30);

		double r = Math.random();
		if (r <= 0.4) {
			this.color = new Color(107, 190, 0, 255);
		} else if (r <= 0.7) {
			this.color = new Color(176, 250, 20, 255);
		} else {
			this.color = new Color(70, 128, 0, 255);
		}
	}

	public boolean dead() {
		return life <= 0;
	}

	@Override
	public void update() {
		life--;
		applyGravity(0.2);
		applyVel();
	}

	@Override
	public void render(Graphics g) {
		g.setColor(color);
		g.fillOval((int)x, (int)y, (int)width, (int)height);
	}
}
