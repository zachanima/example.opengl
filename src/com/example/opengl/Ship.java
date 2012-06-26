package com.example.opengl;

import javax.microedition.khronos.opengles.GL10;

public class Ship extends Square {
  public void draw(GL10 gl) {
    gl.glScalef(2.0f, 1.0f, 1.0f);
    gl.glTranslatef(-0.5f, 0.5f, -20.0f);
    super.draw(gl);
  }
}