package com.example.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class GameView extends GLSurfaceView {
  public GameView(Context context) {
    super(context);
    this.context = context;
  }
  
  
  public void initialize() {
    renderer = new GameRenderer(context);
    setRenderer(renderer);
  }
  
  
  public boolean onTouchEvent(MotionEvent event) {
    renderer.magic();
    return super.onTouchEvent(event);
  }
  
  
  private GameRenderer renderer;
  private Context context;
}