package com.hfad.kodectatask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

//import com.hfad.kodectatask.adapters.RecyclerCardAdapter;
import com.hfad.kodectatask.adapters.custom_adap;
import com.hfad.kodectatask.models.niz;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int random1;
    private int random2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            random1 = savedInstanceState.getInt("random1");
            random2 = savedInstanceState.getInt("random2");
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        TextView datum = (TextView)findViewById(R.id.todayydate);
        DateFormat df = new SimpleDateFormat("EEEE d.");
        String date = df.format(Calendar.getInstance().getTime());
        datum.setText(date);



       /* ListAdapter ahmoadap = new custom_adap(this, niz.array);
        ListView mojalista= (ListView)findViewById(R.id.therapy_list);
        mojalista.setAdapter(ahmoadap);*/
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat dff = new SimpleDateFormat("d. MMMM");

        String wantedMonday = dff.format(c.getTime());


        TextView datefrom = (TextView)findViewById(R.id.duration_from);
        datefrom.setText(wantedMonday);
        //c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        c.add(Calendar.DATE, 6);
        String wantedSunday = dff.format(c.getTime());

        TextView dateto = (TextView)findViewById(R.id.duration_to);
        dateto.setText(wantedSunday);
        c = Calendar.getInstance();
        c.add(Calendar.DATE, -3);
        TextView checkIn = (TextView)findViewById(R.id.checkInDate);
        String showCheckIn = dff.format(c.getTime());
        checkIn.setText(showCheckIn);
        TextView checkOut = (TextView)findViewById(R.id.checkOutDate);
        c.add(Calendar.DATE, 15);
        String showCheckOut = dff.format(c.getTime());
        checkOut.setText(showCheckOut);
        final int random1 = new Random().nextInt(101) + 0;
        ProgressBar progress = (ProgressBar)findViewById(R.id.progressBar1);
        progress.setProgress(random1);
        TextView percentage_1= (TextView)findViewById(R.id.percentage1);
        percentage_1.setText(String.valueOf(random1));


        final int random2 = new Random().nextInt(101) + 0;
        ProgressBar progress2 = (ProgressBar)findViewById(R.id.progressBar2);
        progress2.setProgress(random2);
        TextView percentage_2= (TextView) findViewById(R.id.percentage2);
        percentage_2.setText(String.valueOf(random2));



        //toolbar.setLogo(R.drawable.mdoc);
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("random1", random1);
        savedInstanceState.putInt("random2", random2);
    }
}
