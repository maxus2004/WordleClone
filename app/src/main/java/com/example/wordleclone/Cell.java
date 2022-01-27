package com.example.wordleclone;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TableRow;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;

public class Cell extends AppCompatTextView {
    public Cell(Context context) {
        super(context);
    }

    public Cell(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Cell(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static final int NORMAL = 0, WRONG_PLACE = 1, WRONG = 2, CORRECT = 3;

    public void setState(int state){
        switch (state){
            case NORMAL:
                getBackground().clearColorFilter();
                break;
            case WRONG_PLACE:
                getBackground().setColorFilter(0xFFDBC400, PorterDuff.Mode.SRC_OVER);
                break;
            case WRONG:
                getBackground().setColorFilter(0xFF000000, PorterDuff.Mode.SRC_OVER);
                break;
            case CORRECT:
                getBackground().setColorFilter(0xFF039B00, PorterDuff.Mode.SRC_OVER);
                break;
        }

    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(size, size);
        TableRow.LayoutParams lParams = new TableRow.LayoutParams();
        lParams.width = 0;
        lParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        lParams.weight = 1;
        lParams.setMargins(10,10,10,10);
        setLayoutParams(lParams);
        setGravity(Gravity.CENTER);
        setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.letter_border));
        TextViewCompat.setAutoSizeTextTypeWithDefaults(this, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);
    }
}
