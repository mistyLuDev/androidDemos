package com.hitomi.fungamerefreshdemo;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.*;
import android.widget.ListView;

import com.hitomi.refresh.view.FunGameRefreshView;

public class ListViewActivity extends BaseActivity {

    private ListView listView;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_list_view);
    }

    @Override
    public void initView() {
        Log.d("HELLO","Init");
        refreshView = (FunGameRefreshView) findViewById(R.id.refresh_fun_game);
        refreshView.setLoadingText("皮一下:)");
        refreshView.setGameOverText("游戏结束");
        refreshView.setLoadingFinishedText("加载完成");
        refreshView.setTopMaskText("下拉刷新");
        refreshView.setBottomMaskText("上下滑动控制游戏");

        listView = (ListView) findViewById(R.id.list_view);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("Hello World!","Liu");
                //String name = listView.getChildAt(i).toString();


                String text = ((TextView)view).getText().toString();
                Toast.makeText(ListViewActivity.this,text, Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public void setViewListener() {
        refreshView.setOnRefreshListener(new FunGameRefreshView.FunGameRefreshListener() {
            @Override
            public void onPullRefreshing() {
                SystemClock.sleep(2000);
            }

            @Override
            public void onRefreshComplete() {
                updateDataList();
                baseAdapter.notifyDataSetChanged();
            }

        });

    }

    @Override
    public void processLogic() {
        baseAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, createDate());
        listView.setAdapter(baseAdapter);
    }

}
