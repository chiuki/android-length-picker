package com.sqisland.android.length_picker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
  private LengthPicker mWidth;
  private LengthPicker mHeight;
  private TextView mArea;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    mWidth = (LengthPicker) findViewById(R.id.width);
    mHeight = (LengthPicker) findViewById(R.id.height);
    mArea = (TextView) findViewById(R.id.area);
  }

  @Override
  public void onResume() {
    super.onResume();
    updateArea(null);
  }

  public void updateArea(View v) {
    int area = mWidth.getNumInches() * mHeight.getNumInches();
    mArea.setText(getString(R.string.area_format, area));
  }
}