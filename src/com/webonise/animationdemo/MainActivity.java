package com.webonise.animationdemo;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements AnimationListener,
		OnClickListener {

	TextView textViewMessage;
	Animation animationFadeIn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textViewMessage = (TextView) findViewById(R.id.textViewMessage);
		animationFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.fade_in);
		animationFadeIn.setAnimationListener(this);
		Button buttonStart = (Button) findViewById(R.id.buttonStart);
		buttonStart.setOnClickListener(this);

	}

	@Override
	public void onAnimationEnd(Animation animation) {
		if (animation == animationFadeIn) {
			Toast.makeText(getApplicationContext(), "Animation Stopped",
					Toast.LENGTH_LONG).show();
		}

	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View v) {
		textViewMessage.startAnimation(animationFadeIn);
	}
}
