AndroidAnimationDemo
====================
This application show how to use the xml file to create animation in an application .
Similar to the OnClickListener we are using AnimationListener to set animation on any object .
There are very few steps to use animation in your application.

Step 1: Create the xml file with the animation.
Step 2: Create the layout .
Step 3: Create the class to use the animation object .

____________________________________________________________________________________________________________________________________________________________
####Step 1: Create the xml file with the animation.
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:fillAfter="true" >

    <alpha
        android:duration="3000"
        android:fromAlpha="0.0"
        android:interpolator="@android:anim/accelerate_interpolator"
        android:toAlpha="1.0" />

</set>
____________________________________________________________________________________________________________________________________________________________
####Step 2: Create the layout .

    <TextView
        android:id="@+id/textViewMessage"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/hello_world" />

    <Button
        android:id="@+id/buttonStart"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Start" />
        
__________________________________________________________________________________________________________________________________________________________
####Step 3: Create the class to use the animation object .

	Animation animationFadeIn;

		animationFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
		animationFadeIn.setAnimationListener(this);
	
	@Override
	public void onClick(View v) {
		textViewMessage.startAnimation(animationFadeIn);
	}


____________________________________________________________________________________________________________________________________________________________
