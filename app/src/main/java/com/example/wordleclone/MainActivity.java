package com.example.wordleclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    public static Game game;
    Keyboard keyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyboard = findViewById(R.id.keyboard);
        game = new Game(this);
    }

    public void setupGrid(int rows, int columns) {
        TableLayout table = findViewById(R.id.wordsGrid);
        table.removeAllViews();
        for(int row = 0;row < rows;row++){
            TableRow tableRow = new TableRow(this);
            for(int column = 0;column < columns;column++) {
                tableRow.addView(new Cell(this));
            }
            table.addView(tableRow);
        }
    }

    public Cell getCell(int row, int column) {
        TableLayout table = findViewById(R.id.wordsGrid);
        TableRow tableRow = (TableRow) table.getChildAt(row);
        return (Cell) tableRow.getChildAt(column);
    }
}