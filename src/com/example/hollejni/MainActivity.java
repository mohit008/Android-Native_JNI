package com.example.hollejni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	static{
		System.loadLibrary("HelloJNI");
	}

	
	public native String getMessage();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView text = new TextView(this);
		text.setText(getMessage());
		
		setContentView(text);
		
	}

}
