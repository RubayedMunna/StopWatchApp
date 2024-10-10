package com.example.europeanclubfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ClubLegacy legacy = new ClubLegacy();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindClub(View view) {
        Spinner LeagueSpinner = (Spinner) findViewById(R.id.LeagueSpinner);
        String SelectedLeague = String.valueOf(LeagueSpinner.getSelectedItem());

        List<String> clubList = legacy.getClub(SelectedLeague);

        StringBuilder clubFormatted = new StringBuilder();
        for (String club : clubList) {
            clubFormatted.append(club).append('\n');
        }

        TextView ClubTextView = (TextView) findViewById(R.id.ClubTextView);
        ClubTextView.setText(clubFormatted);
    }
}