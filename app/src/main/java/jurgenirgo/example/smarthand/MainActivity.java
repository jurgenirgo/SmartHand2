package jurgenirgo.example.smarthand;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView abjad = (ImageView) findViewById(R.id.btnAbjad);
        ImageView angka = (ImageView) findViewById(R.id.btnAngka);
        ImageView perasaan = (ImageView) findViewById(R.id.btnPerasaan);
        ImageView ucapan = (ImageView) findViewById(R.id.btnUcapan);
        ImageView video = (ImageView) findViewById(R.id.btn_Video);
        ImageView profil = (ImageView) findViewById(R.id.profil);

        abjad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MainActivity.this, AbjadActivity.class);
                startActivity(int1);
            }
        });

        angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MainActivity.this, AngkaActivity.class);
                startActivity(int1);
            }
        });

        perasaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MainActivity.this, PerasaanActivity.class);
                startActivity(int1);
            }
        });
        ucapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MainActivity.this, UcapanActivity.class);
                startActivity(int1);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(int1);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MainActivity.this, MenuVideoActivity.class);
                startActivity(int1);
            }
        });
    }

    private boolean exit = false;

    @Override
    public void onBackPressed() {
        if (exit) {
            Intent intent = new Intent(MainActivity.this, Splash.class);
            intent.putExtra("exit", "exit");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Press Back Again to Exit", Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);
        }
    }
}
