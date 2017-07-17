package gov.moron.estacionarme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Map extends MyFragment {
    private static final String MESSAGE_ID = "messageId";

    private int messageId;

    public Map() {
        // Required empty public constructor
    }

    public static Map newInstance(int messageId) {
        Map fragment = new Map();
        Bundle arguments = new Bundle();
        arguments.putInt(MESSAGE_ID, messageId);
        fragment.setArguments(arguments);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getArguments();
        if (arguments != null) {
            messageId = arguments.getInt(MESSAGE_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        TextView message = view.findViewById(R.id.message);
        message.setText(messageId);

        view.findViewById(R.id.map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.map);
            }
        });

        return view;
    }
}
