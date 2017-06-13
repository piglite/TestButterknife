package com.tarena.testbutterknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @BindView(R.id.tv_main)
    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvMain.setText("Hello");
    }
    @OnClick(R.id.tv_main)
    public void show(View view){
        Toast.makeText(this, "toast", Toast.LENGTH_SHORT).show();
    }
}
