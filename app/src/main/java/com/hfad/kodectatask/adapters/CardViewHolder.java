package com.hfad.kodectatask.adapters;

import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder {
    CardView card;
    CardViewHolder(CardView card){
        super(card);
        this.card = card;
    }

    public CardView getCard() {
        return card;
    }
}
