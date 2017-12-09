package com.wedddingapp.shankar.assingmentgr;

/**
 * Created by shan on 12/7/2017.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    TextView text;
     String[] mThumbTxt = {
            "Some text view 1", "Some text view 2", "Some text view 3", " Some text view 4","some","some"};


    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.gingerbread, R.drawable.jellybeann,
            R.drawable.honeycomb, R.drawable.kitkatn,
            R.drawable.icecream, R.drawable.lollipop

    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
       // TextView tv=new TextView(mThumbTxt);


        text=new TextView(mContext);

        text.setText(mThumbTxt[position]);

        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(700, 700));
        return imageView;
    }

}