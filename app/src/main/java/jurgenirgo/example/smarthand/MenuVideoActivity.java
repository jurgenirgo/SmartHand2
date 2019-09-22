package jurgenirgo.example.smarthand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_video);

        ImageView video1 = (ImageView) findViewById(R.id.btn_video_1);
        ImageView video2 = (ImageView) findViewById(R.id.btn_Video_2);

        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MenuVideoActivity.this, Video1Activity.class);
                startActivity(int1);
            }
        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(MenuVideoActivity.this, Video2Activity.class);
                startActivity(int1);
            }
        });
    }
}
