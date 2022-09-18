package com.example.homework_3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ArrayList <String> gameList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.resycler_view);
        Collections.addAll(gameList,"Sonic the Hedgehog","Undertale","FNaF","Bendy and the Ink Mashine","Ведьмак","Call of Duty","Hollow Knight","Civilization","The Last Of Us","Resident Evil","Outlast","Need for Speed","Battletoads","Mortal Kombat","League of Legends","Nier","Amnesia:The Dark Descent","The Legend Of Zelda","Red Dead Redemption","Dead Space","GTA","Prey","Dead by Daylight","Team Fortress","TES:Skyrim","World of Warcraft","Far Cry","Bioshock","Dishonered","Little Nightmares","Mafia","Half-Life","Stray");
        GameAdapter adapter = new GameAdapter(gameList);
        recyclerView.setAdapter(adapter);
    }
}