package gov.moron.estacionarme;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

public class MyFragment extends Fragment {
    protected OnFragmentInteractionListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void onButtonPressed(int buttonId) {
        if (listener != null) {
            getView().setEnabled(false);
            listener.onFragmentInteraction(buttonId);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) activity;
        } else {
            throw new RuntimeException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
