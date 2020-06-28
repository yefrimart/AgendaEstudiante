package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://st2.depositphotos.com/3889193/6554/i/950/depositphotos_65548041-stock-photo-cute-student-girl-taking-notes.jpg");
        mNames.add("Maria Antonia");

        mImageUrls.add("https://st2.depositphotos.com/4431055/11856/i/950/depositphotos_118566586-stock-photo-student-man-with-laptop.jpg");
        mNames.add("Ruben Cabreja");

        mImageUrls.add("https://st.depositphotos.com/1594308/2419/i/950/depositphotos_24196475-stock-photo-student-with-copybook.jpg");
        mNames.add("Mariela Bussi");


        mImageUrls.add("https://st3.depositphotos.com/1594308/12588/i/950/depositphotos_125889462-stock-photo-high-school-student-in-corridor.jpg");
        mNames.add("Josefa Maria");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















