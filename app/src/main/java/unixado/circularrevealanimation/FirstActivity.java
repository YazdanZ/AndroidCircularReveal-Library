package unixado.circularrevealanimation;

import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        getWindow ().setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView ( R.layout.activity_first );
    }
}