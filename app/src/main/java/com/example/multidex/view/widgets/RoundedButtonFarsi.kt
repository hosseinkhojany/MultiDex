package com.example.multidex.view.widgets

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.annotation.Nullable
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.multidex.R

class RoundedButtonFarsi : AppCompatButton {

    constructor(context: Context)
            : super(context) {
            background = ContextCompat.getDrawable(context , R.drawable.rounded_button)
            typeface = Typeface.createFromAsset(context.assets , "b_yekan.ttf")
            setTextColor(Color.WHITE)
    }

    constructor(context: Context , @Nullable attrs: AttributeSet)
            : super(context , attrs) {
        background = ContextCompat.getDrawable(context , R.drawable.rounded_button)
        typeface = Typeface.createFromAsset(context.assets , "b_yekan.ttf")
        setTextColor(Color.WHITE)

    }

    constructor(context: Context, @Nullable attrs: AttributeSet ,defStyleAttr: Int )
            : super(context , attrs , defStyleAttr) {
        background = ContextCompat.getDrawable(context , R.drawable.rounded_button)
        typeface = Typeface.createFromAsset(context.assets , "b_yekan.ttf")
        setTextColor(Color.WHITE)

    }


}