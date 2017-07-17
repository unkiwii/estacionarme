package gov.moron.estacionarme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CreateUser extends MyFragment {
    public CreateUser() {
        // Required empty public constructor
    }

    public static CreateUser newInstance() {
        return new CreateUser();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_user, container, false);

        TextView acceptCreateUser = view.findViewById(R.id.acceptCreateUser);
        acceptCreateUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonPressed(R.id.acceptCreateUser);
            }
        });

        return view;
    }
}
