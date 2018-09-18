package com.hitomi.fungamerefreshdemo;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button btnListView, btnGridView, btnRecycleView,btnGIFView;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        btnListView = (Button) findViewById(R.id.btn_list_view);
        btnGridView = (Button) findViewById(R.id.btn_grid_view);
        btnRecycleView = (Button) findViewById(R.id.btn_recycle_view);
        btnGIFView = (Button) findViewById(R.id.activity_gif_view);

    }

    @Override
    public void setViewListener() {
        btnListView.setOnClickListener(this);
        btnGridView.setOnClickListener(this);
        btnRecycleView.setOnClickListener(this);
    }

    @Override
    public void processLogic() {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_list_view:
                Log.w("xxxxxx[Lu-debug]xxxxxxx","btn_list_view");
                startActivity(new Intent(this, ListViewActivity.class));
                break;
            case R.id.btn_grid_view:
                startActivity(new Intent(this, GridViewActivity.class));
                break;
            case R.id.btn_recycle_view:
                startActivity(new Intent(this, RecycleViewActivity.class));
                break;
            case R.id.activity_gif_view:
                Log.w("xxxxxx[Lu-debug]xxxxxxx","activity_gif_view");
                startActivity(new Intent(this, GifDemoActivity.class));
                break;
        }
    }
}
