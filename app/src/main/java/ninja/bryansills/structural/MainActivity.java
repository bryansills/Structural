package ninja.bryansills.structural;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Something here.");
    }

    @Override
    protected void onStart() {
        super.onStart();

        try {
            int lolno = Integer.parseInt("not an int");
        } catch (NumberFormatException exception) {
            Log.e(TAG, "Parsing failed", exception);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Something else.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.w(TAG, "Something here.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        int blarg = 5;
        Log.i(TAG, "There are " + blarg + " blargs");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("other tag", "Something here.");
    }
}
