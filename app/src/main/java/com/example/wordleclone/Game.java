package com.example.wordleclone;

import android.app.AlertDialog;

public class Game {
    MainActivity activity;
    String theme = "";
    int wordLength = 5;
    int rows = 6;
    int currentRow = 0;
    int currentColumn = 0;
    String currentWord;
    WordsDatabase wordsDatabase;

    public Game(MainActivity activity) {
        this.activity = activity;
        wordsDatabase = new WordsDatabase();
        startGame();
    }

    void startGame(){
        currentRow = 0;
        currentColumn = 0;
        currentWord = wordsDatabase.getRandomWord(theme, wordLength);
        activity.setupGrid(rows, wordLength);
        activity.keyboard.reset();
    }

    public void keyPress(char key) {
        if (currentRow >= rows) return;
        if (currentColumn >= currentWord.length()) return;
        activity.getCell(currentRow, currentColumn).setText(String.valueOf(key));
        currentColumn++;
    }

    public void enterPress() {
        if (currentColumn < currentWord.length()) return;
        StringBuilder enteredWordBuilder = new StringBuilder();
        for (int i = 0; i < currentWord.length(); i++) {
            enteredWordBuilder.append(activity.getCell(currentRow, i).getText().charAt(0));
        }
        String enteredWord = enteredWordBuilder.toString();
        if(!wordsDatabase.isWord(theme,enteredWord)){
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage("нет такого слова");
            builder.setPositiveButton("ОК",null);
            AlertDialog dialog = builder.create();
            dialog.show();
            return;
        }

        for (int i = 0; i < currentWord.length(); i++) {
            char enteredChar = activity.getCell(currentRow, i).getText().charAt(0);
            int newState;
            if (enteredChar == currentWord.charAt(i)) {
                newState = Cell.CORRECT;
            } else if (currentWord.contains(String.valueOf(enteredChar))) {
                newState = Cell.WRONG_PLACE;
            } else {
                newState = Cell.WRONG;
            }
            activity.getCell(currentRow, i).setState(newState);
            if(activity.keyboard.getKeyState(enteredChar) < newState) {
                activity.keyboard.setKeyState(enteredChar, newState);
            }
        }

        if(currentWord.equals(enteredWord)){
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage("Правильно!");
            builder.setPositiveButton("ОК", (dialog, which) -> startGame());
            builder.setOnDismissListener((dialog) -> startGame());
            AlertDialog dialog = builder.create();
            dialog.show();
            return;
        }

        if(currentRow == rows-1){
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage("Неправильно!\nСлово: "+currentWord);
            builder.setPositiveButton("ОК", (dialog, btn) -> startGame());
            builder.setOnDismissListener((dialog) -> startGame());
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        currentColumn = 0;
        currentRow++;

    }

    public void erasePress() {
        if (currentColumn == 0) return;
        currentColumn--;
        activity.getCell(currentRow, currentColumn).setText("");
    }
}
