package gov.moron.estacionarme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class About extends MyFragment {
    public About() {
        // Required empty public constructor
    }

    public static About newInstance() {
        return new About();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        TextView creatorOffice = (TextView) view.findViewById(R.id.creatorOffice);
        creatorOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.creatorOffice);
            }
        });

        return view;
    }
}
