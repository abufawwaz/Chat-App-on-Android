package star.lut.com.chatdemo.Base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by kamrulhasan on 3/10/18.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        //bind view here for all activities extending this Activity
        ButterKnife.bind(this);
    }


    /**
     * get layout to inflate
     */
    public abstract
    @LayoutRes
    int getLayout();
}
