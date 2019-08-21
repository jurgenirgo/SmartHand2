package jurgenirgo.example.smarthand;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import jurgenirgo.example.smarthand.Model.AbjadModel;
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
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j,
                R.drawable.k,
                R.drawable.l,
                R.drawable.m,
                R.drawable.n,
                R.drawable.o,
                R.drawable.p,
                R.drawable.q,
                R.drawable.r,
                R.drawable.s,
                R.drawable.t,
                R.drawable.u,
                R.drawable.v,
                R.drawable.w,
                R.drawable.x,
                R.drawable.y,
                R.drawable.z,
        };

        int[] jari = {
                R.drawable.a1,
                R.drawable.b2,
                R.drawable.c3,
                R.drawable.d4,
                R.drawable.e5,
                R.drawable.f6,
                R.drawable.g7,
                R.drawable.h8,
                R.drawable.i9,
                R.drawable.j10,
                R.drawable.k11,
                R.drawable.l12,
                R.drawable.m13,
                R.drawable.n14,
                R.drawable.o15,
                R.drawable.p16,
                R.drawable.q17,
                R.drawable.r18,
                R.drawable.s19,
                R.drawable.t20,
                R.drawable.u21,
                R.drawable.v22,
                R.drawable.w23,
                R.drawable.x24,
                R.drawable.y25,
                R.drawable.z26,
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