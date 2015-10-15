package yuricfurusho.testedatabinding102;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import yuricfurusho.testedatabinding102.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Handler mHandler;
    User mUser;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mUser = new User(getBaseContext(), "Yuri", "Furusho", "email.com");
        binding.setUser(mUser);
    }

    @Override
    protected void onResume() {
        super.onResume();


        mHandler = new Handler();
        mHandler.postDelayed(runnable(), 1000);


    }

    private Runnable runnable() {
        return new Runnable() {
            @Override
            public void run() {
                mUser.setFirstName("Yuri " + count++);


                mHandler.postDelayed(runnable(), 1000);
            }
        };
    }
}
