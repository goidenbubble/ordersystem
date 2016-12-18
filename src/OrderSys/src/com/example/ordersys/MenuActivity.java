package com.example.ordersys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {       
 Button order;  
 
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.menu_layout);
	order=(Button)findViewById(R.id.order);
	order.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
    		intent.setClass(MenuActivity.this,one.class);
    		startActivity(intent);
    		finish();
			
		}
	});
}

}
