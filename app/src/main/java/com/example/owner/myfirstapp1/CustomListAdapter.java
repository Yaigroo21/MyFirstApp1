package com.example.owner.myfirstapp1;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Owner on 3/19/2018.
 */

public class CustomListAdapter extends ArrayAdapter {

    //To reference Activity
    private final Activity context;

    //to store the images
    private final Integer[] imageIDarray;

    //to store list of countries
    private final String[] nameArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, Integer[] imageIDarrayParam) {

        super(context,R.layout.listview_row , nameArrayParam);

        this.context = context;
        this.imageIDarray = imageIDarrayParam;
        this.nameArray = nameArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        Log.d("CustomListAdapter", ""+position);
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        //code gets references to objects in listview
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);

        nameTextField.setText(nameArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;

    }
}
