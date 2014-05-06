package dmitry.play.awesome2;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Dmitry", "Verbose logging");
        Log.d("Dmitry","Debug logging");
        Log.i("Dmitry","Info logging");
        Log.e("Dmitry", "Error logging");
        Log.w("Dmitry","Warning logging");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
