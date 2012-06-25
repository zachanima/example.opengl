package com.example.opengl;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Run extends Activity {
  private GLSurfaceView glSurfaceView;


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    
    // Full screen.
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    
    // Initiate OpenGL view, create instance with this activity.
    glSurfaceView = new GLSurfaceView(this);
    
    // Set renderer as main.
    glSurfaceView.setRenderer(new GLRenderer(this));
    setContentView(glSurfaceView);
  }


  @Override
  protected void onResume() {
    super.onResume();
    glSurfaceView.onResume();
  }


  @Override
  protected void onPause() {
    super.onPause();
    glSurfaceView.onPause();
  }
}