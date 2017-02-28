package com.example.multithreading;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	Handler hand_obj=new Handler();
	TextView t;
	int a=-1,b=1,c=0;
	String temp,prime;
	int p=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.fib);
        //t.setText("");
        hand_obj.postDelayed(run, 1000);
        hand_obj.postDelayed(run2, 1000);
        
    }
Runnable run=new Runnable(){

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		c=a+b;
		temp=temp + Integer.toString(c);
	
		t.setText("" +  temp);
		t.setTextColor(Color.CYAN);
	a=b;
	b=c;
	hand_obj.postDelayed(run, 2000);
	}
	
};
Runnable run2=new Runnable(){

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Next Thread...", Toast.LENGTH_SHORT).show(); 	
		
	hand_obj.postDelayed(run2, 5000);
	}
	
};
Runnable run3=new Runnable(){

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		int i,count=0;
		if(p==2){
		prime=prime + Integer.toString(c);
	
		t.setText("" +  prime);
		t.setTextColor(Color.GREEN);
		}
		else
		{
			for(i=2;i<=(p/2);i++)
			{
				if(p%i==0)
					count++;
					break;
			}
			if(count!=0)
			{
				prime=prime + Integer.toString(c);
				
				t.setText("" +  prime);
				t.setTextColor(Color.GREEN);
			}
		}
	
	hand_obj.postDelayed(run3, 4000);
	}
	
};
}
