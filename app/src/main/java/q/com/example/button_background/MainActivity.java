package q.com.example.button_background;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    } public void openActivity2(View view) {
        Intent intent = new Intent(this, ACTIVITY2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_un_right, R.anim.slide_out_left);
    }
}


