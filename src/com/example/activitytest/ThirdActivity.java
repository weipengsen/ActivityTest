package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ThirdActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.third_activity);
	}

}
