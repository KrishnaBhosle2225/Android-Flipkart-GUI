package com.krishna.flipkartactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterProduct  extends BaseAdapter {

    Context mContext;
    String[] mName ;
    int[] mImages;
    String[] mrCount;
    String[] mPrice;
    String[] mOffer;
    public AdapterProduct(Context mContext, String[] mName, int[] mImages, String[] mrCount, String[] mPrice, String[] mOffer) {
        this.mContext = mContext;
        this.mName = mName;
            this.mImages = mImages;
            this.mrCount = mrCount;
            this.mPrice = mPrice;
            this.mOffer = mOffer;
    }

    @Override
    public int getCount() {
        return mName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.mylistview,null);

        }else{
            view = convertView;
        }

        ImageView images = view.findViewById(R.id.img);
        TextView names = view.findViewById(R.id.name);
        TextView counts = view.findViewById(R.id.count);
        TextView prices = view.findViewById(R.id.price);
        TextView offers = view.findViewById(R.id.offer);

        images.setImageResource(mImages[position]);
        names.setText(mName[position]);
        counts.setText(mrCount[position]);
        prices.setText(mPrice[position]);
        offers.setText(mOffer[position]);

        return view;
    }
}
