package com.example.homework_3_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GameViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_game;
    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
        this.tv_game = itemView.findViewById(R.id.tv_game);
    }

    public void bind(String game){
        tv_game.setText(game);
    }

}
