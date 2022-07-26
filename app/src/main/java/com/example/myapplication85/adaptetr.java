package com.example.myapplication85;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class adaptetr extends RecyclerView.Adapter<adaptetr.MyViewHolder> {
    Context context;
    ArrayList<String> Name,Descriptiob;
    adaptetr(Context context, ArrayList<String> Name, ArrayList<String> Description)
    {
        this.context = context;
        this.Name= Name;
        this.Descriptiob= Description;

    }    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sin, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.FC.setText(String.valueOf(Name.get(position)));
        holder.dsc.setText(String.valueOf(Descriptiob.get(position)));
    }

    @Override
    public int getItemCount() {
        return Descriptiob.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView FC,dsc;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            FC= itemView.findViewById(R.id.xxxxxxxxx);
            dsc= itemView.findViewById(R.id.textView2);
        }
    }

}
