package gov.moron.estacionarme;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CreatorOffice extends MyFragment {
    public CreatorOffice() {
        // Required empty public constructor
    }

    public static CreatorOffice newInstance() {
        return new CreatorOffice();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_creator_office, container, false);

        TextView web = view.findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.office_url)));
                startActivity(browserIntent);
            }
        });

        return view;
    }
}
