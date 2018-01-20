package com.example.android.parkiteasy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Neeraj on 20-01-2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<viewHolder> {


    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.parkingcardview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

class viewHolder extends RecyclerView.ViewHolder{

    TextView DistanceTextView;
    TextView AvailableTextView;
    TextView NameTextView;

    public viewHolder(View itemView) {
        super(itemView);
        DistanceTextView  = itemView.findViewById(R.id.distanceInKm);
        AvailableTextView = itemView.findViewById(R.id.availableSlots);
        NameTextView     =  itemView.findViewById(R.id.detailsOfAssignment);
    }
}
