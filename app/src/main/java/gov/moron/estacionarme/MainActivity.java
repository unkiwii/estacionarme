package gov.moron.estacionarme;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        ActionBar actionBar = getActionBar();

        // title amd subtitle
        actionBar.setTitle(R.string.office);
        actionBar.setSubtitle(R.string.office_tag);

        // background color
        actionBar.setBackgroundDrawable(new ColorDrawable(res.getColor(R.color.colorPrimary)));

        // logo
        actionBar.setIcon(R.mipmap.ic_launcher);
        actionBar.setDisplayShowHomeEnabled(true);
    }
}
