package com.hfad.kodectatask.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hfad.kodectatask.R;
import com.hfad.kodectatask.models.niz;

public class custom_adap extends ArrayAdapter<niz> {
    public custom_adap(Context context, niz[] array) {
        super(context, R.layout.prikaz_liste, array);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater abc = LayoutInflater.from(getContext());
        View nekiview = abc.inflate(R.layout.prikaz_liste,parent,false);

        niz podatak = getItem(position);
        TextView t1 = (TextView) nekiview.findViewById(R.id.vrijeme);
        TextView t2 = (TextView) nekiview.findViewById(R.id.ter1);
        TextView t3 = (TextView) nekiview.findViewById(R.id.ul1);
        t1.setText(podatak.getTime());
        t2.setText(podatak.getTx1());
        t3.setText(podatak.getTx2());
        return  nekiview;
    }
}
