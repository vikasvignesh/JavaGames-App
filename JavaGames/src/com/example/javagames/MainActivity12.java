package com.example.javagames;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity12 extends Activity {
	WebView w1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity12);
		w1=(WebView) findViewById(R.id.webView1);
		w1.loadUrl("http://downloadwap.com/java-games/?v=8&cat=0&st=4");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity12, menu);
		return true;
	}

}
