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
  
  
  @Override
  public boolean onTouchEvent(final MotionEvent event) {
    switch (event.getAction()) {
      case MotionEvent.ACTION_DOWN:
        renderer.ship.omega = 0.01f;
        break;

      case MotionEvent.ACTION_UP:
      case MotionEvent.ACTION_CANCEL:
        renderer.ship.omega = 0.0f;
        break;
        
      default:
        break;
    }
    
    return true;
  }
  
  
  private GameRenderer renderer;
  private Context context;
}