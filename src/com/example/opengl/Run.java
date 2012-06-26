package com.example.opengl;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Run extends Activity {
  private GameView gameView;


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    
    // Full screen.
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    
    gameView = new GameView(this);
    gameView.initialize();
    
    setContentView(gameView);
  }


  @Override
  protected void onResume() {
    super.onResume();
    gameView.onResume();
  }


  @Override
  protected void onPause() {
    super.onPause();
    gameView.onPause();
  }
}