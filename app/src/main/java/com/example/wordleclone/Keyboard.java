package com.example.wordleclone;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import java.util.HashMap;

public class Keyboard extends TableLayout {
    char[][] keys = {
            "йцукенгшщзхъ".toCharArray(),
            "фывапролджэ".toCharArray(),
            "ячсмитьбю".toCharArray()
    };

    HashMap<Character, Integer> keyStates = new HashMap<>();

    public Keyboard(Context context) {
        super(context);
        init();
    }

    public Keyboard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    OnClickListener KeyClickListener = btnView -> {
        Button btn = (Button) btnView;
        String text = btn.getText().toString();
        MainActivity.game.keyPress(text.charAt(0));
    };

    public static final int NORMAL = 0, WRONG_PLACE = 1, WRONG = 2, CORRECT = 3;

    public void setKeyState(char key, int state) {
        for (int rowI = 0; rowI < getChildCount(); rowI++) {
            TableRow row = (TableRow) getChildAt(rowI);
            for (int i = 0; i < row.getChildCount(); i++) {
                Button btn = (Button) row.getChildAt(i);
                if (btn.getText().charAt(0) != key) continue;
                keyStates.put(key,state);
                switch (state) {
                    case NORMAL:
                        btn.getBackground().clearColorFilter();
                        break;
                    case WRONG_PLACE:
                        btn.getBackground().setColorFilter(0xFFDBC400, PorterDuff.Mode.SRC_OVER);
                        break;
                    case WRONG:
                        btn.getBackground().setColorFilter(0xFF000000, PorterDuff.Mode.SRC_OVER);
                        break;
                    case CORRECT:
                        btn.getBackground().setColorFilter(0xFF039B00, PorterDuff.Mode.SRC_OVER);
                        break;
                }
                return;
            }
        }
    }

    public int getKeyState(char key){
        if(keyStates.containsKey(key)){
            return keyStates.get(key);
        }else{
            return NORMAL;
        }
    }

    public void reset() {
        keyStates.clear();
        for (int rowI = 0; rowI < getChildCount(); rowI++) {
            TableRow row = (TableRow) getChildAt(rowI);
            for (int i = 0; i < row.getChildCount(); i++) {
                Button btn = (Button) row.getChildAt(i);
                btn.getBackground().clearColorFilter();
            }
        }
    }

    void init() {
        inflate(getContext(), R.layout.keyboard, this);
        for (int rowI = 0; rowI < 3; rowI++) {
            TableRow row = (TableRow) getChildAt(rowI);
            for (int i = 0; i < keys[rowI].length; i++) {
                Button btn = new Button(getContext());
                btn.setText(String.valueOf(keys[rowI][i]));
                btn.setPadding(0, 0, 0, 0);
                TableRow.LayoutParams lParams = new TableRow.LayoutParams();
                lParams.width = 0;
                lParams.height = (int) (50 * getResources().getDisplayMetrics().density);
                lParams.weight = 1;
                lParams.setMargins(-5, -5, -5, -5);
                btn.setLayoutParams(lParams);
                btn.setOnClickListener(KeyClickListener);
                row.addView(btn);
            }
        }
        Button eraseBtn = new Button(getContext());
        eraseBtn.setText("<-");
        eraseBtn.setPadding(0, 0, 0, 0);
        TableRow.LayoutParams eraseBtnParams = new TableRow.LayoutParams();
        eraseBtnParams.width = 0;
        eraseBtnParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        eraseBtnParams.weight = 1.5f;
        eraseBtnParams.setMargins(-5, -5, -5, -5);
        eraseBtn.setLayoutParams(eraseBtnParams);
        eraseBtn.setOnClickListener((e) -> MainActivity.game.erasePress());
        ((TableRow) findViewById(R.id.keyboard_row3)).addView(eraseBtn, 0);
        Button enterBtn = new Button(getContext());
        enterBtn.setText("ввод");
        enterBtn.setPadding(0, 0, 0, 0);
        TableRow.LayoutParams enterBtnParams = new TableRow.LayoutParams();
        enterBtnParams.width = 0;
        enterBtnParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        enterBtnParams.weight = 2;
        enterBtnParams.setMargins(-5, -5, -5, -5);
        enterBtn.setLayoutParams(enterBtnParams);
        enterBtn.setOnClickListener((e) -> MainActivity.game.enterPress());
        ((TableRow) findViewById(R.id.keyboard_row3)).addView(enterBtn);
    }
}
