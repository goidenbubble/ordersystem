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

public class one extends Activity{
	 private Button next,last;
	 ImageButton cart,ok;
	 ImageView add1,add2,add3,add4,add5,reduce1,reduce2,reduce3,reduce4,reduce5;
	 TextView num1,num2,num3,num4,num5,name1,name2,name3,name4,name5,p1,p2,p3,p4,p5;
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.meal_menu1);
	findView();
	SharedPreferences sp=getSharedPreferences("meal1", MODE_PRIVATE);
	num1.setText(String.valueOf(sp.getInt("num1", 0)));
	num2.setText(String.valueOf(sp.getInt("num2", 0)));
	num3.setText(String.valueOf(sp.getInt("num3", 0)));
	num4.setText(String.valueOf(sp.getInt("num4", 0)));
	num5.setText(String.valueOf(sp.getInt("num5", 0)));
	final Intent intent=new Intent();
	next.setOnClickListener(new OnClickListener() {	
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub			
    		intent.setClass(one.this,two.class);
    		startActivity(intent);
    		finish();			
		}
	});
	last.setOnClickListener(new OnClickListener() {		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			intent.setClass(one.this,last.class);
    		startActivity(intent);
    		finish();
		}
	});
	cart.setOnClickListener(listener);
	ok.setOnClickListener(listener);
	add1.setOnClickListener(listener);
	add2.setOnClickListener(listener);
	add3.setOnClickListener(listener);
	add4.setOnClickListener(listener);
	add5.setOnClickListener(listener);
	reduce1.setOnClickListener(listener);
	reduce2.setOnClickListener(listener);
	reduce3.setOnClickListener(listener);
	reduce4.setOnClickListener(listener);
	reduce5.setOnClickListener(listener);	
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
			case R.id.add1:
				n=name1.getText().toString();
				p=p1.getText().toString();
				i=Integer.parseInt(num1.getText().toString());
				result = dc.add(i);	
				num1.setText(String.valueOf(result));
				editor.putInt("num1",result);
				editor.putString("name1", n);
				editor.putString("price1", p);
				editor.commit();
				break;
			case R.id.add2:
				n=name2.getText().toString();
				p=p2.getText().toString();
				i=Integer.parseInt(num2.getText().toString());
				result = dc.add(i);	
				num2.setText(String.valueOf(result));
				editor.putInt("num2",result);
				editor.putString("name2", n);
				editor.putString("price2", p);
				editor.commit();
				break;
			case R.id.add3:
				n=name3.getText().toString();
				p=p3.getText().toString();
				i=Integer.parseInt(num3.getText().toString());
				result = dc.add(i);	
				num3.setText(String.valueOf(result));
				editor.putInt("num3",result);
				editor.putString("name3", n);
				editor.putString("price3", p);
				editor.commit();
				break;
			case R.id.add4:
				n=name4.getText().toString();
				p=p4.getText().toString();
				i=Integer.parseInt(num4.getText().toString());
				result = dc.add(i);	
				num4.setText(String.valueOf(result));
				editor.putInt("num4",result);
				editor.putString("name4", n);
				editor.putString("price4", p);
				editor.commit();
				break;
			case R.id.add5:
				n=name5.getText().toString();
				p=p5.getText().toString();
				i=Integer.parseInt(num5.getText().toString());
				result = dc.add(i);	
				num5.setText(String.valueOf(result));
				editor.putInt("num5",result);
				editor.putString("name5", n);
				editor.putString("price5", p);
				editor.commit();
				break;
			case R.id.reduce1:
				n=name1.getText().toString();
				p=p1.getText().toString();
				i=Integer.parseInt(num1.getText().toString());
				result = dc.reduce(i);	
				num1.setText(String.valueOf(result));
				editor.putInt("num1",result);
				editor.putString("name1", n);
				editor.putString("price1", p);
				editor.commit();
				break;
			case R.id.reduce2:
				n=name2.getText().toString();
				p=p2.getText().toString();
				i=Integer.parseInt(num2.getText().toString());
				result = dc.reduce(i);	
				num2.setText(String.valueOf(result));
				editor.putInt("num2",result);
				editor.putString("name2", n);
				editor.putString("price2", p);
				editor.commit();
				break;
			case R.id.reduce3:
				n=name3.getText().toString();
				p=p3.getText().toString();
				i=Integer.parseInt(num3.getText().toString());
				result = dc.reduce(i);	
				num3.setText(String.valueOf(result));
				editor.putInt("num3",result);
				editor.putString("name3", n);
				editor.putString("price3", p);
				editor.commit();
				break;
			case R.id.reduce4:
				n=name4.getText().toString();
				p=p4.getText().toString();
				i=Integer.parseInt(num4.getText().toString());
				result = dc.reduce(i);	
				num4.setText(String.valueOf(result));
				editor.putInt("num4",result);
				editor.putString("name4", n);
				editor.putString("price4", p);
				editor.commit();
				break;
			case R.id.reduce5:
				n=name5.getText().toString();
				p=p5.getText().toString();
				i=Integer.parseInt(num5.getText().toString());
				result = dc.reduce(i);	
				num5.setText(String.valueOf(result));
				editor.putInt("num5",result);
				editor.putString("name5", n);
				editor.putString("price5", p);
				editor.commit();
				break;
			case R.id.cart:				
	    		intent.setClass(one.this,shop_cart.class);
	    		startActivity(intent);
	    		finish();
	    		break;
			case R.id.ok:
	    		intent.setClass(one.this,calculate.class);
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
	next=(Button)findViewById(R.id.next1);
	last=(Button)findViewById(R.id.last1);
	add1=(ImageView)findViewById(R.id.add1);
	add2=(ImageView)findViewById(R.id.add2);
	add3=(ImageView)findViewById(R.id.add3);
	add4=(ImageView)findViewById(R.id.add4);
	add5=(ImageView)findViewById(R.id.add5);
	reduce1=(ImageView)findViewById(R.id.reduce1);
	reduce2=(ImageView)findViewById(R.id.reduce2);
	reduce3=(ImageView)findViewById(R.id.reduce3);
	reduce4=(ImageView)findViewById(R.id.reduce4);
	reduce5=(ImageView)findViewById(R.id.reduce5);
	num1=(TextView)findViewById(R.id.num1);
	num2=(TextView)findViewById(R.id.num2);
	num3=(TextView)findViewById(R.id.num3);
	num4=(TextView)findViewById(R.id.num4);
	num5=(TextView)findViewById(R.id.num5);
	name1=(TextView)findViewById(R.id.tv1);
	name2=(TextView)findViewById(R.id.tv2);
	name3=(TextView)findViewById(R.id.tv3);
	name4=(TextView)findViewById(R.id.tv4);
	name5=(TextView)findViewById(R.id.tv5);
	p1=(TextView)findViewById(R.id.p1);
	p2=(TextView)findViewById(R.id.p2);
	p3=(TextView)findViewById(R.id.p3);
	p4=(TextView)findViewById(R.id.p4);
	p5=(TextView)findViewById(R.id.p5);
}
}
