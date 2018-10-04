package com.why.project.floatingactionbuttondemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private FloatingActionButton mFab;
	private Button mBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initViews();
		initEvents();
	}

	private void initViews() {
		mFab = findViewById(R.id.fab_btn);
		mBtn = findViewById(R.id.btn_open);
	}

	private void initEvents() {
		mFab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view,"删除成功",Snackbar.LENGTH_SHORT).setAction("撤销", new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Toast.makeText(MainActivity.this,"撤销成功",Toast.LENGTH_SHORT).show();
					}
				}).setActionTextColor(Color.parseColor("#ffffff")).show();
			}
		});

		mBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view,"删除成功",Snackbar.LENGTH_SHORT).setAction("撤销", new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Toast.makeText(MainActivity.this,"撤销成功",Toast.LENGTH_SHORT).show();
					}
				}).show();
			}
		});
	}
}
