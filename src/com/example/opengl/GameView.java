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
  
  
  public boolean onTouchEvent(final MotionEvent event) {
    switch (event.getAction()) {
      case MotionEvent.ACTION_DOWN:
        renderer.ship.omega = 1.0f;
        break;

      case MotionEvent.ACTION_UP:
        renderer.ship.omega = 0.0f;
        break;
        
      default:
        break;
    }
    
    return super.onTouchEvent(event);
  }
  
  
  private GameRenderer renderer;
  private Context context;
}