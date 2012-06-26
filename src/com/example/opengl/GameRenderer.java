package com.example.opengl;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLU;

public class GameRenderer implements Renderer {
  private Context context;
  private Square square;
  private float rotation = 0.0f;


  public GameRenderer(Context context) {
    this.context = context;
    this.square = new Square();
  }


  @Override
  public void onDrawFrame(GL10 gl) {
    gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
    gl.glLoadIdentity();

    gl.glRotatef(rotation, 0.0f, 0.0f, 1.0f);
    gl.glScalef(2.0f, 1.0f, 1.0f);
    gl.glTranslatef(-0.5f, 0.5f, -20.0f);
    
    rotation += 1.0f;

    square.draw(gl);
  }


  @Override
  public void onSurfaceChanged(GL10 gl, int width, int height) {
    if (height == 0) { height = 1; } // Avoid division by 0.

    gl.glViewport(0, 0, width, height);
    gl.glMatrixMode(GL10.GL_PROJECTION);
    gl.glLoadIdentity();

    GLU.gluPerspective(gl, 45.0f, (float)width / (float)height, 0.1f, 100.0f);

    gl.glMatrixMode(GL10.GL_MODELVIEW);
    gl.glLoadIdentity();
  }


  @Override
  public void onSurfaceCreated(GL10 gl, EGLConfig config) {
     square.loadGLTexture(gl, this.context);
     
     gl.glEnable(GL10.GL_TEXTURE_2D);
     gl.glShadeModel(GL10.GL_SMOOTH);
     gl.glClearColor(0.0f, 0.0f, 0.0f, 0.5f);
     gl.glClearDepthf(1.0f);
     gl.glEnable(GL10.GL_DEPTH_TEST);
     gl.glDepthFunc(GL10.GL_LEQUAL);
     gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST);
  }
}