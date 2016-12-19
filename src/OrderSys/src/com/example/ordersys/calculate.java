package com.example.ordersys;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class calculate extends Activity{
	Button pay;
	TextView s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculate);
		s=(TextView)findViewById(R.id.sum);
		pay=(Button)findViewById(R.id.pay);
		SharedPreferences sp=getSharedPreferences("meal1", MODE_PRIVATE);
	     int js=sp.getInt("js",sp.getInt("js",0));
	     String sr= String.valueOf(js);
	     s.setText(sr);
	}

}
