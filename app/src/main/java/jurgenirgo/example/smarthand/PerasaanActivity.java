package jurgenirgo.example.smarthand;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import jurgenirgo.example.smarthand.Model.AbjadModel;
import jurgenirgo.example.smarthand.Model.PerasaanModel;

public class PerasaanActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perasaan);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new PerasaanAdapter(this, getdata()));
    }

    public ArrayList<PerasaanModel> getdata() {
        ArrayList<PerasaanModel> list = new ArrayList<>();

        int[] abjad = {
                R.drawable.takut,
                R.drawable.senang,
                R.drawable.sedih,
                R.drawable.marah,
                R.drawable.kecewa,
                R.drawable.gembira,
                R.drawable.bingung,
                R.drawable.bahagia,
        };

        int[] jari = {
                R.drawable.takut1,
                R.drawable.senang1,
                R.drawable.sedih1,
                R.drawable.marah1,
                R.drawable.kecewa1,
                R.drawable.gembira1,
                R.drawable.bingung1,
                R.drawable.bahagia1,
        };


        for (int i = 0; i < abjad.length; i++) {
            list.add(new PerasaanModel(
                    abjad[i],
                    jari[i]
            ));
        }

        return list;
    }
}