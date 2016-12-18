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

public class two extends Activity{
private Button first,next,before,last;	
ImageButton cart,ok;
ImageView add6,add7,add8,add9,add10,reduce6,reduce7,reduce8,reduce9,reduce10;
TextView num6,num7,num8,num9,num10,name6,name7,name8,name9,name10,p6,p7,p8,p9,p10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meal_menu2);
		findView();		
		SharedPreferences sp=getSharedPreferences("meal1", MODE_PRIVATE);
		num6.setText(String.valueOf(sp.getInt("num6", 0)));
		num7.setText(String.valueOf(sp.getInt("num7", 0)));
		num8.setText(String.valueOf(sp.getInt("num8", 0)));
		num9.setText(String.valueOf(sp.getInt("num9", 0)));
		num10.setText(String.valueOf(sp.getInt("num10", 0)));
		final Intent intent=new Intent();
		first.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent.setClass(two.this,one.class);
	    		startActivity(intent);
	    		finish();
			}
		});
		before.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent.setClass(two.this,one.class);
	    		startActivity(intent);
	    		finish();
			}
		});
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent.setClass(two.this,last.class);
	    		startActivity(intent);
	    		finish();
			}
		});
		last.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent.setClass(two.this,last.class);
	    		startActivity(intent);
	    		finish();
			}
		});
		cart.setOnClickListener(listener);
		ok.setOnClickListener(listener);
		add6.setOnClickListener(listener);
		add7.setOnClickListener(listener);
		add8.setOnClickListener(listener);
		add9.setOnClickListener(listener);
		add10.setOnClickListener(listener);
		reduce6.setOnClickListener(listener);
		reduce7.setOnClickListener(listener);
		reduce8.setOnClickListener(listener);
		reduce9.setOnClickListener(listener);
		reduce10.setOnClickListener(listener);
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
			case R.id.add6:
				n=name6.getText().toString();
				p=p6.getText().toString();
				i=Integer.parseInt(num6.getText().toString());
				result = dc.add(i);	
				num6.setText(String.valueOf(result));
				editor.putInt("num6",result);
				editor.putString("name6", n);
				editor.putString("price6", p);
				editor.commit();
				break;
			case R.id.add7:
				n=name7.getText().toString();
				p=p7.getText().toString();
				i=Integer.parseInt(num7.getText().toString());
				result = dc.add(i);	
				num7.setText(String.valueOf(result));
				editor.putInt("num7",result);
				editor.putString("name7", n);
				editor.putString("price7", p);
				editor.commit();
				break;
			case R.id.add8:
				n=name8.getText().toString();
				p=p8.getText().toString();
				i=Integer.parseInt(num8.getText().toString());
				result = dc.add(i);	
				num8.setText(String.valueOf(result));
				editor.putInt("num8",result);
				editor.putString("name8", n);
				editor.putString("price8", p);
				editor.commit();
				break;
			case R.id.add9:
				n=name9.getText().toString();
				p=p9.getText().toString();
				i=Integer.parseInt(num9.getText().toString());
				result = dc.add(i);	
				num9.setText(String.valueOf(result));
				editor.putInt("num9",result);
				editor.putString("name9", n);
				editor.putString("price9", p);
				editor.commit();
				break;
			case R.id.add10:
				n=name10.getText().toString();
				p=p10.getText().toString();
				i=Integer.parseInt(num10.getText().toString());
				result = dc.add(i);	
				num10.setText(String.valueOf(result));
				editor.putInt("num10",result);
				editor.putString("name10", n);
				editor.putString("price10", p);
				editor.commit();
				break;
			case R.id.reduce6:
				n=name6.getText().toString();
				p=p6.getText().toString();
				i=Integer.parseInt(num6.getText().toString());
				result = dc.reduce(i);	
				num6.setText(String.valueOf(result));
				editor.putInt("num6",result);
				editor.putString("name6", n);
				editor.putString("price6", p);
				editor.commit();
				break;
			case R.id.reduce7:
				n=name7.getText().toString();
				p=p7.getText().toString();
				i=Integer.parseInt(num7.getText().toString());
				result = dc.reduce(i);	
				num7.setText(String.valueOf(result));
				editor.putInt("num7",result);
				editor.putString("name7", n);
				editor.putString("price7", p);
				editor.commit();
				break;
			case R.id.reduce8:
				n=name8.getText().toString();
				p=p8.getText().toString();
				i=Integer.parseInt(num8.getText().toString());
				result = dc.reduce(i);	
				num8.setText(String.valueOf(result));
				editor.putInt("num8",result);
				editor.putString("name8", n);
				editor.putString("price8", p);
				editor.commit();
				break;
			case R.id.reduce9:
				n=name9.getText().toString();
				p=p9.getText().toString();
				i=Integer.parseInt(num9.getText().toString());
				result = dc.reduce(i);	
				num9.setText(String.valueOf(result));
				editor.putInt("num9",result);
				editor.putString("name9", n);
				editor.putString("price9", p);
				editor.commit();
				break;
			case R.id.reduce10:
				n=name10.getText().toString();
				p=p10.getText().toString();
				i=Integer.parseInt(num10.getText().toString());
				result = dc.reduce(i);	
				num10.setText(String.valueOf(result));
				editor.putInt("num10",result);
				editor.putString("name10", n);
				editor.putString("price10", p);
				editor.commit();
				break;
			case R.id.cart:				
	    		intent.setClass(two.this,shop_cart.class);
	    		startActivity(intent);
	    		finish();
	    		break;
			case R.id.ok:
	    		intent.setClass(two.this,calculate.class);
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
		next=(Button)findViewById(R.id.next);
		before=(Button)findViewById(R.id.before);
		last=(Button)findViewById(R.id.last);
		add6=(ImageView)findViewById(R.id.add6);
		add7=(ImageView)findViewById(R.id.add7);
		add8=(ImageView)findViewById(R.id.add8);
		add9=(ImageView)findViewById(R.id.add9);
		add10=(ImageView)findViewById(R.id.add10);
		reduce6=(ImageView)findViewById(R.id.reduce6);
		reduce7=(ImageView)findViewById(R.id.reduce7);
		reduce8=(ImageView)findViewById(R.id.reduce8);
		reduce9=(ImageView)findViewById(R.id.reduce9);
		reduce10=(ImageView)findViewById(R.id.reduce10);
		num6=(TextView)findViewById(R.id.num6);
		num7=(TextView)findViewById(R.id.num7);
		num8=(TextView)findViewById(R.id.num8);
		num9=(TextView)findViewById(R.id.num9);
		num10=(TextView)findViewById(R.id.num10);
		name6=(TextView)findViewById(R.id.tv6);
		name7=(TextView)findViewById(R.id.tv7);
		name8=(TextView)findViewById(R.id.tv8);
		name9=(TextView)findViewById(R.id.tv9);
		name10=(TextView)findViewById(R.id.tv10);
		p6=(TextView)findViewById(R.id.p6);
		p7=(TextView)findViewById(R.id.p7);
		p8=(TextView)findViewById(R.id.p8);
		p9=(TextView)findViewById(R.id.p9);
		p10=(TextView)findViewById(R.id.p10);
	}

}
