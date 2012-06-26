package com.example.opengl;

import javax.microedition.khronos.opengles.GL10;

public class Ship extends Square {
  public void draw(GL10 gl) {
    theta += omega;
    gl.glPushMatrix();
    gl.glRotatef((float)Math.toDegrees(theta), 0.0f, 0.0f, 1.0f);
    gl.glScalef(2.0f, 1.0f, 1.0f);
    gl.glTranslatef(-0.5f, 0.5f, -20.0f);
    super.draw(gl);
    gl.glPopMatrix();
  }
  
  
  private float theta = 0.0f; // Angle.
  public float omega = 0.0f; // Angular velocity.
}