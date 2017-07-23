package com.example.javagames;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	protected static final Class<?> MainActivity1 = null;
	ListView lv;
	String[] s={"GAMES","APPS"};
	ArrayAdapter<String> aa1;
	Intent intent1,intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.listView1);
        aa1=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, s)
        		{
			@Override
			public View getView(int position, View convertView,
					ViewGroup parent) {
				// TODO Auto-generated method stub
				View v=super.getView(position, convertView, parent);
				TextView textView=(TextView) v.findViewById(android.R.id.text1);
				textView.setTextColor(Color.RED);
				return v;
			}
		};
        lv.setAdapter(aa1);
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int a,
					long arg3) {
				// TODO Auto-generated method stub
				switch (a) {
				case 0:
					Intent intent1=new Intent(getApplicationContext(), MainActivity1.class);
					startActivity(intent1);
					
					break;
				case 1:
					Intent intent2=new Intent(getApplicationContext(), MainActivity2.class);
					startActivity(intent2);
					
				default:
					break;
				}
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
