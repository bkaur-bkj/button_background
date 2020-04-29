package q.com.example.button_background;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class activity4 extends AppCompatActivity {
    private SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
      slidr=  Slidr.attach(this);
    }

    public void lockactivity(View v){
     slidr.lock();
    }
    public void unlockactivity(View v){
     slidr.unlock();
    }
}



