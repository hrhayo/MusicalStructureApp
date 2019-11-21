package com.ayobami.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    private static final String LOG_TAG = MusicAdapter.class.getSimpleName();

    public MusicAdapter(Activity context, ArrayList<Music> musicComp) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, musicComp);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Music currentMusic = getItem(position);

        TextView topTextView = listItemView.findViewById(R.id.top_text_view);
        // Get the version name from the current object and
        // set this text on the name TextView
        topTextView.setText(currentMusic.getTopText());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView bottomTextView = listItemView.findViewById(R.id.bottom_text_view);
        // Get the version number from the current object and
        // set this text on the number TextView
        bottomTextView.setText(currentMusic.getBottomText());

        return listItemView;

    }


}
