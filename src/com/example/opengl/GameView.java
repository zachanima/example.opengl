package com.example.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class GameView extends GLSurfaceView {
  private GameRenderer renderer;
  private Context context;

  public GameView(Context context) {
    super(context);
    this.context = context;
  }
  
  public void initialize() {
    renderer = new GameRenderer(context);
    setRenderer(renderer);
  }
}