package com.example.opengl;

import javax.microedition.khronos.opengles.GL10;

public class Ship extends Square {
  public void update(long ms) {
    r[0] += v * (float)ms / 1000.0f;
  }
  
  
  public void draw(GL10 gl) {
    gl.glPushMatrix();
    gl.glTranslatef(r[0], r[1], 0.0f);
    gl.glRotatef(v * 8, 0.0f, 1.0f, 0.0f);
    gl.glScalef(2.0f, 1.0f, 1.0f);
    super.draw(gl);
    gl.glPopMatrix();
  }
  
  
  private float r[] = { 0.0f, -10.0f }; // Position, m.
  public float v = 0.0f; // Velocity, m/s.
}