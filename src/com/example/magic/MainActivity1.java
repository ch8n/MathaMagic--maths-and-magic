package com.example.magic;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity1 extends Activity
{
	//initialise
	Button btn_card,btn_hat;
	ImageView img_wond;
	//Handler
    final Handler hand = new Handler();
    //Variable
    int Click_no=0;
    
    
    
	@Override
    protected void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        
        //binding
        btn_card=(Button)findViewById(R.id.btn_card);
        img_wond=(ImageView)findViewById(R.id.Image_wond);
        btn_hat=(Button)findViewById(R.id.btn_hat);
        
        //Animations
        final Animation card_anim= AnimationUtils.loadAnimation(this,R.anim.to_middle);
        final Animation card_anim2= AnimationUtils.loadAnimation(this,R.anim.from_middle);
        
        //VisiblilityOnScreen
        img_wond.setVisibility(View.INVISIBLE);
        btn_card.setVisibility(View.INVISIBLE);
        
        btn_hat.setOnClickListener(new View.OnClickListener()
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				
				if(Click_no==0)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Click On Card to Begin!", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==1)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Step 2 Click On Card!", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==2)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Step 3 Carry On with Card!", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==3)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Step 4 Click Card!", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==4)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Step 5 Again The Card!", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==5)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Step 6 lol the Card!", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==6)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Step 7 Almost there,Card!", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==7)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "Step 8..CLICK CARD!..", Toast.LENGTH_LONG).show();
				}
				else if(Click_no==8)
				{
					btn_card.setClickable(true);
					btn_card.setText("");
					btn_card.setBackgroundResource(R.drawable.cardback);
					call_effect();
					Toast.makeText(MainActivity1.this, "THE MAGIC", Toast.LENGTH_LONG).show();
				}
				
				
			}
		});
        
        btn_card.setOnClickListener(new View.OnClickListener()
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				btn_card.startAnimation(card_anim);
				btn_card.startAnimation(card_anim2);
				
				if(Click_no==0)
				{
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("Select a Number"+"\n"+" Between 0-9."+"\n"+"Click Magic"+"\n"+"Hat to Continue");
					Click_no=1;
					btn_card.setClickable(false);
				}
				else if(Click_no==1)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("Multiply Your Selected"+"\n"+"Number with 9."+"\n"+"Click Magic"+"\n"+"Hat to Continue");
					Click_no=2;
					btn_card.setClickable(false);
				}
				else if(Click_no==2)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("Now You Have a"+"\n"+"Two Digit Number."+"\n"+"Ex:12"+"\n"+"Now Add Both Digits"+"\n"+"Example:1+2=3."+"\n"+"Click Magic"+"\n"+"Hat to Continue");
					Click_no=3;
					btn_card.setClickable(false);
				}
				else if(Click_no==3)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("Now You Have a"+"\n"+"Single Digit Number."+"\n"+"Subtract 5"+"\n"+"From it."+"Click Magic"+"\n"+"Hat to Continue");
					Click_no=4;
					btn_card.setClickable(false);
				}
				else if(Click_no==4)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("Now Match Your"+"\n"+"Number To"+"\n"+"Alphabets"+"\n"+"Example:1 to A,"+"\n"+"2 to B,Etc"+"\n"+"Click Magic"+"\n"+"Hat to Continue");
					Click_no=5;
					btn_card.setClickable(false);
				}
				else if(Click_no==5)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("Now You have a"+"\n"+"Alphabets."+"\n"+"Select a Country Name"+"\n"+"Starting From That"+"\n"+"Alphabets."+"\n"+"Example:A-America"+"\n"+",B-Brazil.Etc."+"\n"+"Click Magic"+"\n"+"Hat to Continue");
					Click_no=6;
					btn_card.setClickable(false);
				}
				else if(Click_no==6)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("Now You have a"+"\n"+"Country Name."+"\n"+"Select Second"+"\n"+"Alphabet"+"\n"+"Of that Country"+"\n"+"Starting From That"+"\n"+"Alphabets Select"+"\n"+"a Animal Name."+"\n"+"Example:D-Dog,"+"\n"+"C-Cat.Etc."+"\n"+"Click Magic"+"\n"+"Hat to Continue");
					Click_no=7;
					btn_card.setClickable(false);
				}
				else if(Click_no==7)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("CLICK ON HAT"+"\n"+"TO FINISH."+"\n"+"THE TRICK");
					Click_no=8;
					btn_card.setClickable(false);
				}
				else if(Click_no==8)
				{
					
					btn_card.setBackgroundResource(R.drawable.cardfront);
					btn_card.setVisibility(View.VISIBLE);
					btn_card.setText("WoW I DID'NT KNOW"+"\n"+"DENMARK HAS"+"\n"+"ELEPHANTS"+"\n"+"TryAgain?");
					Click_no=0;
					btn_card.setClickable(false);
				}
				
				
			}
		});
	
	
        
	}
	
	public void call_effect()
	{
		btn_card.setVisibility(View.INVISIBLE);
		hand.postDelayed(new Runnable() 
		{
	        @Override
	        public void run() 
	        {
	            // Do something after 2s = 2000ms
	        	img_wond.setVisibility(View.VISIBLE);
	        	hand.postDelayed(new Runnable() 
	    		{
	    	        @Override
	    	        public void run() 
	    	        {
	    	            // Do something after 2s = 2000ms
	    	        	img_wond.setVisibility(View.INVISIBLE);
	    	        	btn_card.setVisibility(View.VISIBLE);
	    	        }
	    	    }, 800);
	        }
	    }, 500);
		
		
	}
        
            
}
