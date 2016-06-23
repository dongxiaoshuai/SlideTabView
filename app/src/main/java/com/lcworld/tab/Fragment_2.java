package com.lcworld.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 创建： dongshuaijun .
 * 日期：2016/6/21.
 * 注释：
 */
public class Fragment_2 extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container,false);
        textView = (TextView) view.findViewById(R.id.text);
        textView.setText("这是第2个Fragment");
        return view;

    }

}
