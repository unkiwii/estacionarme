package gov.moron.estacionarme;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity extends Activity implements OnFragmentInteractionListener {

    private Fragment currentFragment;

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

        show(Login.newInstance());
    }

    @Override
    public void onFragmentInteraction(int buttonId) {
        switch (buttonId) {
            case R.id.login:
                show(MainMenu.newInstance());
                break;
            case R.id.createUser:
                show(CreateUser.newInstance());
                break;
            case R.id.acceptCreateUser:
                show(Login.newInstance());
                break;
            case R.id.selectParking:
                show(Parking.newInstance());
                break;
            case R.id.seeCredits:
                show(Credits.newInstance());
                break;
            case R.id.updateUserData:
                show(CreateUser.newInstance()); // change user data in the future
                break;
            case R.id.privateParking:
                show(Map.newInstance(R.string.private_parking));
                break;
            case R.id.publicParking:
                show(Map.newInstance(R.string.public_parking));
                break;
            case R.id.map:
                show(Navigation.newInstance());
                break;
            case R.id.aboutUs:
                show(About.newInstance());
                break;
            case R.id.creatorOffice:
                show(CreatorOffice.newInstance());
                break;
        }
    }

    private void show(Fragment newFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        if (newFragment != null) {
            if (currentFragment != null) {
                transaction.replace(R.id.fragmentsLayout, newFragment);
                transaction.addToBackStack(null);
            } else {
                transaction.add(R.id.fragmentsLayout, newFragment);
            }
            currentFragment = newFragment;
        }

        transaction.commit();
    }
}
