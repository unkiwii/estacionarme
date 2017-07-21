package gov.moron.estacionarme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainMenu extends MyFragment {
    public MainMenu() {
        // Required empty public constructor
    }

    public static MainMenu newInstance() {
        return new MainMenu();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);

        TextView selectParking = (TextView) view.findViewById(R.id.selectParking);
        selectParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.selectParking);
            }
        });

        TextView seeCredits = (TextView) view.findViewById(R.id.seeCredits);
        seeCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.seeCredits);
            }
        });

        TextView updateUserData = (TextView) view.findViewById(R.id.updateUserData);
        updateUserData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.updateUserData);
            }
        });

        return view;
    }
}
