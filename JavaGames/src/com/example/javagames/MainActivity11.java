package com.example.javagames;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity11 extends Activity {
	WebView w2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity11);
		w2=(WebView) findViewById(R.id.webView1);
		w2.loadUrl("http://java.mob.org/screensize/320x240/");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity11, menu);
		return true;
	}

}
