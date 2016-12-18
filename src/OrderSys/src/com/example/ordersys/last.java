package com.example.ordersys;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class last extends Activity{
	private Button first, before;	
	ImageButton cart,ok;
	ImageView add11,add12,add13,reduce11,reduce12,reduce13;
	 TextView num11,num12,num13,name11,name12,name13,p11,p12,p13;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.last_mealmenu);
		findView();
		SharedPreferences sp=getSharedPreferences("meal1", MODE_PRIVATE);
		num11.setText(String.valueOf(sp.getInt("tv11", 0)));
		num12.setText(String.valueOf(sp.getInt("tv12", 0)));
		num13.setText(String.valueOf(sp.getInt("tv13", 0)));
		final Intent intent=new Intent();
		first.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent.setClass(last.this, one.class);
				startActivity(intent);
				finish();
			}
		});
		before.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent.setClass(last.this, two.class);
				startActivity(intent);
				finish();
			}
		});
		cart.setOnClickListener(listener);
		ok.setOnClickListener(listener);
		add11.setOnClickListener(listener);
		add12.setOnClickListener(listener);
		add13.setOnClickListener(listener);
		reduce11.setOnClickListener(listener);
		reduce12.setOnClickListener(listener);
		reduce13.setOnClickListener(listener);
	}
	OnClickListener listener=new OnClickListener() {	
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int i,result;
			String n,p;
			ImageView imgv=(ImageView)v;
			Intent intent=new Intent();
			SharedPreferences sp=getSharedPreferences("meal1", MODE_PRIVATE);
			Editor editor=sp.edit();
			switch(imgv.getId()){
			case R.id.add11:
				n=name11.getText().toString();
				p=p11.getText().toString();
				i=Integer.parseInt(num11.getText().toString());
				result = dc.add(i);	
				num11.setText(String.valueOf(result));
				editor.putInt("num11",result);
				editor.putString("name11", n);
				editor.putString("price11", p);
				editor.commit();
				break;
			case R.id.add12:
				n=name12.getText().toString();
				p=p12.getText().toString();
				i=Integer.parseInt(num12.getText().toString());
				result = dc.add(i);	
				num12.setText(String.valueOf(result));
				editor.putInt("num12",result);
				editor.putString("name12", n);
				editor.putString("price12", p);
				editor.commit();
				break;
			case R.id.add13:
				n=name13.getText().toString();
				p=p13.getText().toString();
				i=Integer.parseInt(num13.getText().toString());
				result = dc.add(i);	
				num13.setText(String.valueOf(result));
				editor.putInt("num13",result);
				editor.putString("name13", n);
				editor.putString("price13", p);
				editor.commit();
				break;
			case R.id.reduce11:
				n=name11.getText().toString();
				p=p11.getText().toString();
				i=Integer.parseInt(num11.getText().toString());
				result = dc.reduce(i);	
				num11.setText(String.valueOf(result));
				editor.putInt("num11",result);
				editor.putString("name11",n);
				editor.putString("price11",p);
				editor.commit();
				break;
			case R.id.reduce12:
				n=name12.getText().toString();
				p=p12.getText().toString();
				i=Integer.parseInt(num12.getText().toString());
				result = dc.reduce(i);	
				num12.setText(String.valueOf(result));
				editor.putInt("num12",result);
				editor.putString("name12", n);
				editor.putString("price12", p);
				editor.commit();
				break;
			case R.id.reduce13:
				n=name13.getText().toString();
				p=p13.getText().toString();
				i=Integer.parseInt(num13.getText().toString());
				result = dc.reduce(i);	
				num13.setText(String.valueOf(result));
				editor.putInt("num13",result);
				editor.putString("name13", n);
				editor.putString("price13", p);
				editor.commit();
				break;
			case R.id.cart:				
	    		intent.setClass(last.this,shop_cart.class);
	    		startActivity(intent);
	    		finish();
	    		break;
			case R.id.ok:
	    		intent.setClass(last.this,calculate.class);
	    		startActivity(intent);
	    		finish();
	    		break;
			}
		}
	};
	private void findView() {
		// TODO Auto-generated method stub
		cart=(ImageButton)findViewById(R.id.cart);
		ok=(ImageButton)findViewById(R.id.ok);
		first=(Button)findViewById(R.id.first);
		before=(Button)findViewById(R.id.before);
		add11=(ImageView)findViewById(R.id.add11);
		add12=(ImageView)findViewById(R.id.add12);
		add13=(ImageView)findViewById(R.id.add13);
		reduce11=(ImageView)findViewById(R.id.reduce11);
		reduce12=(ImageView)findViewById(R.id.reduce12);
		reduce13=(ImageView)findViewById(R.id.reduce13);
		num11=(TextView)findViewById(R.id.num11);
		num13=(TextView)findViewById(R.id.num13);
		num12=(TextView)findViewById(R.id.num12);
		name11=(TextView)findViewById(R.id.tv11);
		name12=(TextView)findViewById(R.id.tv12);
		name13=(TextView)findViewById(R.id.tv13);
		p11=(TextView)findViewById(R.id.p11);
		p12=(TextView)findViewById(R.id.p12);
		p13=(TextView)findViewById(R.id.p13);
	}

}
