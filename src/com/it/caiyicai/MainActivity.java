package com.it.caiyicai;

import java.util.Random;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}

	int rand;

	public void startGame(View view) {
		EditText num1ET = (EditText) findViewById(R.id.num1_et);
		EditText num2ET = (EditText) findViewById(R.id.num2_et);
		int num1 = Integer.parseInt(num1ET.getText().toString());
		int num2 = Integer.parseInt(num2ET.getText().toString());
		rand = new Random().nextInt(num2 - num1) + num1;
		System.out.println(rand);
		if (num1 >= num2) {
			Toast.makeText(this, "第一个数字要小于等于第二个数字", 1).show();
		} else {
			rand = new Random().nextInt(num2 - num1) + num1;
			System.out.println(rand);

		}
	}

	public void submit(View view) {
		EditText resET = (EditText) findViewById(R.id.res_et);
		int res = Integer.parseInt(resET.getText().toString());
		if (res == rand) {
			Toast.makeText(this, "恭喜", 1).show();
		} else if (res > rand) {
			Toast.makeText(this, "大了", 1).show();
		} else {
			Toast.makeText(this, "小了", 1).show();
		}
	}
}
