package com.example.ordersys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class shop_cart extends Activity{
    String name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
    String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;    
    ImageButton ok,back;
	@Override		
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shop_cart);
		ok=(ImageButton)findViewById(R.id.ok);
		back=(ImageButton)findViewById(R.id.back);
		ok.setOnClickListener(listener);
		back.setOnClickListener(listener);
		getshare();		
     String[] a=new String[]{name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13};
     String[] b=new String[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13};    
	 int[] c=new int[]{num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13};
		ListView listView = (ListView)findViewById(R.id.lv1);
		 List<Map<String,Object>> listItems=new ArrayList<Map<String,Object>>(); 			
		int l=c.length;
		for(int i=0;i<l;i++){
			 Map<String,Object> item=new HashMap<String,Object>();	
			if(c[i]>0){				  
	            item.put("name",a[i]);  
	            item.put("price",b[i]);  
	            item.put("num",c[i]);  	      
	            listItems.add(item); 
			}
			SimpleAdapter adapter = new SimpleAdapter(this,listItems, R.layout.item,   
	                new String[]{"name", "price", "num"}, new int[]{R.id.t1, R.id.t2, R.id.t3});  
	       listView.setAdapter(adapter);			
		}		
	}
	OnClickListener listener=new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			ImageView imgv=(ImageView)v;
			Intent intent=new Intent();
			switch(imgv.getId()){
			case R.id.ok:
				intent.setClass(shop_cart.this,calculate.class);
	    		startActivity(intent);
	    		finish();
	    		break;
			case R.id.back:
				intent.setClass(shop_cart.this,one.class);
	    		startActivity(intent);
	    		finish();
	    		break;
			}
		}
		
	};
	private void getshare() {
		// TODO Auto-generated method stub
		SharedPreferences sp=getSharedPreferences("meal1", MODE_PRIVATE);
	     name1=sp.getString("name1","");
	     name2=sp.getString("name2","");
	     name3=sp.getString("name3","");
	     name4=sp.getString("name4","");
	     name5=sp.getString("name5","");
	     name6=sp.getString("name6","");
	     name7=sp.getString("name7","");
	     name8=sp.getString("name8","");
	     name9=sp.getString("name9","");
	     name10=sp.getString("name10","");
	     name11=sp.getString("name11","");
	     name12=sp.getString("name12","");
	     name13=sp.getString("name13","");
	     p1=sp.getString("price1","");
	     p2=sp.getString("price2","");
	     p3=sp.getString("price3","");
	     p4=sp.getString("price4","");
	     p5=sp.getString("price5","");
	     p6=sp.getString("price6","");
	     p7=sp.getString("price7","");
	     p8=sp.getString("price8","");
	     p9=sp.getString("price9","");
	     p10=sp.getString("price10","");
	     p11=sp.getString("price11","");
	     p12=sp.getString("price12","");
	     p13=sp.getString("price13","");
	     num1=sp.getInt("num1",0);
	     num2=sp.getInt("num2",0);
	     num3=sp.getInt("num3",0);
	     num4=sp.getInt("num4",0);
	     num5=sp.getInt("num5",0);
	     num6=sp.getInt("num6",0);
	     num7=sp.getInt("num7",0);
	     num8=sp.getInt("num8",0);
	     num9=sp.getInt("num9",0);
	     num10=sp.getInt("num10",0);
	     num11=sp.getInt("num11",0);
	     num12=sp.getInt("num12",0);
	     num13=sp.getInt("num13",0);
	}

}
