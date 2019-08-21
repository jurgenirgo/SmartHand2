package jurgenirgo.example.smarthand;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import jurgenirgo.example.smarthand.Model.UcapanModel;

public class UcapanActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucapan);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new UcapanAdapter(this, getdata()));
    }

    public ArrayList<UcapanModel> getdata() {
        ArrayList<UcapanModel> list = new ArrayList<>();

        int[] abjad = {
                R.drawable.halo,
                R.drawable.maaf,
                R.drawable.samasama,
                R.drawable.selamatjalan,
                R.drawable.terimakasih,
        };

        int[] jari = {
                R.drawable.halo1,
                R.drawable.maaf1,
                R.drawable.samasama1,
                R.drawable.selamatjalan1,
                R.drawable.terimakasih1,
        };


        for (int i = 0; i < abjad.length; i++) {
            list.add(new UcapanModel(
                    abjad[i],
                    jari[i]
            ));
        }

        return list;
    }
}