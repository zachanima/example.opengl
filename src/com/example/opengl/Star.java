package com.example.opengl;

import javax.microedition.khronos.opengles.GL10;

public class Star extends Square {
  public Star() {
    r[0] = (float)Math.random() * 50.0f - 25.0f;
    r[1] = (float)Math.random() * 20.0f - 10.0f;
  }
  
  
  public void update(long ms) {
    r[1] -= v;
    if (r[1] < -10.0f) {
      r[1] = 10.0f;
    }
  }
  
  
  public void draw(GL10 gl) {
    gl.glPushMatrix();
    gl.glTranslatef(r[0], r[1], 0.0f);
    gl.glScalef(0.05f, 0.1f, 0.05f);
    super.draw(gl);
    gl.glPopMatrix();
  }
  
  
  private float r[] = { 0.0f, 0.0f }; // Position, m.
  private float v = 0.1f;
}
