package gov.moron.estacionarme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Credits extends MyFragment {
    private int balance = 0;

    public Credits() {
        // Required empty public constructor
    }

    public static Credits newInstance() {
        return new Credits();
    }

    private void showBalance(final Resources resources) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(resources.getString(R.string.credits_balance));
        builder.setMessage(resources.getString(R.string.balance, balance));
        builder.setPositiveButton(resources.getString(R.string.accept), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {}
        });
        builder.create().show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_credits, container, false);
        final Resources resources = getResources();

        TextView buy = (TextView) view.findViewById(R.id.buyCredits);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle(resources.getString(R.string.credits_buy_balance));
                builder.setMessage(resources.getString(R.string.buy_balance_ask));
                builder.setPositiveButton(resources.getString(R.string.yes), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        balance += 10;
                        showBalance(resources);
                    }
                });
                builder.setNegativeButton(resources.getString(R.string.no), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {}
                });
                builder.create().show();
            }
        });

        TextView show = (TextView) view.findViewById(R.id.showCredits);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBalance(resources);
            }
        });

        return view;
    }
}
