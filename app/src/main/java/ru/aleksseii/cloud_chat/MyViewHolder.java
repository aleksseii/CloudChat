package ru.aleksseii.cloud_chat;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView message;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        message = itemView.findViewById(R.id.message_item);
    }
}
