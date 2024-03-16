package com.example.yanndaym;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class recycleradaptor extends RecyclerView.Adapter<recycleradaptor.ViewHolder> {

    ArrayList<String> hatırlatıcı = new ArrayList<>();
    ArrayList<String> hatırlatıcıacıklama = new ArrayList<>();
    ArrayList<Integer> resimler = new ArrayList<>();
    Context context;

    public recycleradaptor(ArrayList<String> hatırlatıcı, ArrayList<String> hatırlatıcıacıklama, ArrayList<Integer> resimler, Context context) {
        this.hatırlatıcı = hatırlatıcı;
        this.hatırlatıcıacıklama = hatırlatıcıacıklama;
        this.resimler = resimler;
        this.context = context;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycle, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.resim.setImageResource(resimler.get(i));
        viewHolder.hatırlatıcı.setText(hatırlatıcı.get(i));
        viewHolder.hatırlatıcıacıklama.setText(hatırlatıcıacıklama.get(i));

    }

    @Override
    public int getItemCount() {
        return hatırlatıcı.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView resim;
        TextView hatırlatıcı;
        TextView hatırlatıcıacıklama;
        LinearLayout basLayout;


        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            resim = itemView.findViewById(R.id.HatırlatmaImage1Id);
            hatırlatıcı =itemView.findViewById(R.id.Hatırlatma1Id);
            hatırlatıcıacıklama = itemView.findViewById(R.id.Acıklama1Id);
            basLayout = itemView.findViewById(R.id.BasLayoutId);

        }
    }
}
