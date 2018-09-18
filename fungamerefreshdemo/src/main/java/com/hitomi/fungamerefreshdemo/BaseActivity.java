package com.hitomi.fungamerefreshdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.hitomi.refresh.view.FunGameRefreshView;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Created by hitomi on 2016/12/2.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected FunGameRefreshView refreshView;
    protected BaseAdapter baseAdapter;

    protected List<String> dataList;

    public abstract void setContentView();
    public abstract void initView();
    public abstract void setViewListener();
    public abstract void processLogic();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        initView();
        setViewListener();
        processLogic();

    }

    protected List<String> createDate() {
        dataList = new ArrayList<>();
        dataList.add("Liu LaoBan");
        dataList.add("Lao Huang");
        dataList.add("Shuang Jie");
        dataList.add("Zhao Zong");
        dataList.add("Lin Zong");
        dataList.add("Ning Zong");
        dataList.add("Qiu Shuji");
        return dataList;
    }

    protected void updateDataList() {
//        String lastStr = dataList.get(dataList.size() - 1);
//        char lastChar = lastStr.toCharArray()[0];
//        int c = (int) lastChar;
//        ++c;
//        String str = String.valueOf((char) c);
//        dataList.add(str);
          Toast.makeText(this, "不想整安卓", LENGTH_LONG).show();
//          myToast.show();
    }
}
