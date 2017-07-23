package com.example.javagames;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity1 extends Activity {
	ListView lv2;
	String[] s={"208*208","320*240","176*220","176*208"};
	Intent intent1,intent2,intent3,intent4;
	ArrayAdapter<String> aa;
	WebView w1,w2,w3;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
		lv2=(ListView) findViewById(R.id.listView1);
		lv2=(ListView) findViewById(R.id.listView1);
        aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, s)
        		{
			@Override
			public View getView(int position, View convertView,
					ViewGroup parent) {
				// TODO Auto-generated method stub
				View v=super.getView(position, convertView, parent);
				TextView textView=(TextView) v.findViewById(android.R.id.text1);
				textView.setTextColor(Color.BLUE);
				return v;
			}
		};
        lv2.setAdapter(aa);
        lv2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int b,
					long arg3) {
				// TODO Auto-generated method stub
				switch (b) {
				case 0:
					Intent intent1=new Intent(getApplicationContext(), MainActivity12.class);
					startActivity(intent1);
					
					break;
				case 1:Intent intent2=new Intent(getApplicationContext(), MainActivity12.class);
				startActivity(intent2);
				break;
				case 2:Intent intent3=new Intent(getApplicationContext(), MainActivity13.class);
				startActivity(intent3);
				break;
				case 3:Intent intent4=new Intent(getApplicationContext(), MainActivity14.class);
				startActivity(intent4);
				break;
				

				default:
					break;
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity1, menu);
		return true;
	}

}
