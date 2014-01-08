package com.ark.abeer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	MediaPlayer sounds;
	@Override
	protected void onCreate(Bundle komal) {
		// TODO Auto-generated method stub
		//setContentView(R.drawable.k0);
		super.onCreate(komal);
		setContentView(R.layout.abeer);
		sounds = MediaPlayer.create(Splash.this, R.raw.auon) ;
		sounds.start();
		Thread timer =  new Thread(){
			public void run(){
				try{
					sleep(5000);
					
				}catch (InterruptedException e){
					e.printStackTrace() ;
					
				}finally{
					Intent openAct1 =  new Intent("com.ark.abeer.MAINACTIVITY");
					startActivity(openAct1);
				}
				
			}
		};
		timer.start() ;		
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub	
		super.onPause();
		//sounds.release();
		finish ();
	}

}
