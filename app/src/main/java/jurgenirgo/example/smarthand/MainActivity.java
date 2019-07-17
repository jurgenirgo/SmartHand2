package jurgenirgo.example.smarthand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView abjad = (ImageView) findViewById(R.id.btnAbjad);
        ImageView angka = (ImageView) findViewById(R.id.btnAngka);
        ImageView perasaan = (ImageView) findViewById(R.id.btnPerasaan);
        ImageView ungkapan = (ImageView) findViewById(R.id.btnUcapan);

        abjad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MainActivity.this, AbjadActivity.class);
                startActivity(int1);
            }
        });
    }
}
