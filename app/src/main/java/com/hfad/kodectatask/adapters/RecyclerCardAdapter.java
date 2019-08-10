//package com.hfad.kodectatask.adapters;
//
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.hfad.kodectatask.R;
//
//import java.util.List;
//
//public class RecyclerCardAdapter extends RecyclerView.Adapter<CardViewHolder> {
//
//    private String[] names;
//
//    public RecyclerCardAdapter(String[] names) {
//        this.names = names;
//    }
//
//    @Override
//    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        CardView v = (CardView) LayoutInflater
//                                    .from(parent.getContext())
//                                    .inflate(R.layout.text_view, parent, false);
//        CardViewHolder cardViewHolder = new CardViewHolder(v);
//        return cardViewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
//        holder.getName().setText(names[position]);
//    }
//
//    @Override
//    public int getItemCount() {
//        return names.length;
//    }
//}
