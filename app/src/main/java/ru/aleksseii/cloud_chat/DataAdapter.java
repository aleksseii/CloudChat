package ru.aleksseii.cloud_chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private final LayoutInflater inflater;
    private final List<String> messages;

    public DataAdapter(Context context, List<String> messages) {
        this.inflater = LayoutInflater.from(context);
        this.messages = messages;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_message, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String currMsg = messages.get(position);
        holder.message.setText(currMsg);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
