package gov.moron.estacionarme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Parking extends MyFragment {
    public Parking() {
        // Required empty public constructor
    }

    public static Parking newInstance() {
        return new Parking();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_parking, container, false);

        TextView privateParking = view.findViewById(R.id.privateParking);
        privateParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.privateParking);
            }
        });

        TextView publicParking = view.findViewById(R.id.publicParking);
        publicParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.publicParking);
            }
        });

        return view;
    }
}
