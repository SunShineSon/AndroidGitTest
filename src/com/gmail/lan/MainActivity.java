package com.gmail.lan;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_layout);

		// 百度
		Button button_baidu = (Button) findViewById(R.id.button_baidu);
		button_baidu.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent);
			}
		});

		//弹出语
		Button button_click = (Button) findViewById(R.id.button_click);
		button_click.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "your click a button", Toast.LENGTH_SHORT).show();
			}
		});
		
		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//finish();	// 4.1、 关闭activity的事件
				
				// 4.2、活动启动另一个活动的事件(显式启动)
				//Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				//startActivity(intent);
				
				// 4.3、活动启动另一个活动的事件(隐式启动)
				Intent intent = new Intent("com.action.ACTION_START");
				startActivity(intent);
			}
		});

	}

}
