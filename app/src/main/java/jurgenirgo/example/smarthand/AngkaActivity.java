package jurgenirgo.example.smarthand;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import jurgenirgo.example.smarthand.Model.AbjadModel;
import jurgenirgo.example.smarthand.Model.AngkaModel;

public class AngkaActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new AngkaAdapter(this, getdata()));
    }

    public ArrayList<AngkaModel> getdata() {
        ArrayList<AngkaModel> list = new ArrayList<>();

        int[] abjad = {
                R.drawable.satuangka,
                R.drawable.duaangka,
                R.drawable.tigaangka,
                R.drawable.empatangka,
                R.drawable.limaangka,
                R.drawable.enamangka,
                R.drawable.tujuhangka,
                R.drawable.delapanangka,
                R.drawable.sembilanangka,
                R.drawable.sepuluhangka,
        };

        int[] jari = {
                R.drawable.satu,
                R.drawable.dua,
                R.drawable.tiga,
                R.drawable.empat,
                R.drawable.lima,
                R.drawable.enam,
                R.drawable.tujuh,
                R.drawable.delapan,
                R.drawable.sembilan,
                R.drawable.sepuluh,
        };

        for (int i = 0; i < abjad.length; i++) {
            list.add(new AngkaModel(
                    abjad[i],
                    jari[i]
            ));
        }

        return list;
    }
}