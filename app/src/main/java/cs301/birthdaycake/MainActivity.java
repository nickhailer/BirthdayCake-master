package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main);
        CakeView cakeview = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeview);

        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(cakeController);

        Switch candles = findViewById(R.id.Candles);
        candles.setOnCheckedChangeListener(cakeController);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(cakeController);
    }

    public void goodbye(View button){
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
