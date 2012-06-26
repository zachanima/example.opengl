package com.example.opengl;

import javax.microedition.khronos.opengles.GL10;

public class Star extends Square {
  public Star() {
    r[0] = (float)Math.random() * 1.0f - 0.5f;
    r[1] = (float)Math.random() * 1.0f - 0.5f;
  }
  
  
  public void update(long ms) {
    r[0] += v;
  }
  
  
  public void draw(GL10 gl) {
    gl.glPushMatrix();
    gl.glTranslatef(r[0], r[1], 0.0f);
    super.draw(gl);
    gl.glPopMatrix();
  }
  
  
  private float r[] = { 0.0f, 0.0f }; // Position, m.
  private float v = 0.001f;
}
