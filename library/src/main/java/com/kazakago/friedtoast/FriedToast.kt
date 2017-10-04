package com.kazakago.friedtoast

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.support.annotation.*

interface FriedToast {

    companion object {
        fun create(context: Context): FriedToast = FriedToastImpl(context)
    }

    /* IconImageView */

    fun setIconImageResource(@DrawableRes resourceId: Int): FriedToast

    fun setIconImageDrawable(drawable: Drawable?): FriedToast

    fun setIconImageBitmap(bitmap: Bitmap?): FriedToast

    /* TitleTextView */

    fun setTitle(text: CharSequence? = null, textSize: Float? = null, @ColorInt textColor: Int? = null, typeFace: Typeface? = null, gravity: Int? = null): FriedToast

    fun setTitle(@StringRes textRes: Int, textSize: Float? = null, @ColorInt textColor: Int? = null, typeFace: Typeface? = null, gravity: Int? = null): FriedToast

    fun setTitleTextSize(textSize: Float): FriedToast

    fun setTitleTextColor(@ColorInt textColor: Int): FriedToast

    fun setTitleTextColorRes(@ColorRes textColorRes: Int): FriedToast

    fun setTitleTypeFace(typeFace: Typeface): FriedToast

    fun setTitleGravity(gravity: Int): FriedToast

    /* DescriptionTextView */

    fun setDescription(text: CharSequence? = null, textSize: Float? = null, @ColorInt textColor: Int? = null, typeFace: Typeface? = null, gravity: Int? = null): FriedToast

    fun setDescription(@StringRes textRes: Int, textSize: Float? = null, @ColorInt textColor: Int? = null, typeFace: Typeface? = null, gravity: Int? = null): FriedToast

    fun setDescriptionTextSize(textSize: Float): FriedToast

    fun setDescriptionTextColor(@ColorInt textColor: Int): FriedToast

    fun setDescriptionTextColorRes(@ColorRes textColorRes: Int): FriedToast

    fun setDescriptionTypeFace(typeFace: Typeface): FriedToast

    fun setDescriptionGravity(gravity: Int): FriedToast

    /* alpha */

    fun setAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float): FriedToast

    /* Minimum Size */

    fun setMinimumSize(width: Int, height: Int): FriedToast

    /* Background */

    fun setBackground(@ColorInt color: Int, cornerRadius: Float? = null): FriedToast

    /* Duration */

    fun setDuration(duration: Int): FriedToast

    /* Gravity */

    fun setGravity(gravity: Int): FriedToast

    fun setGravity(gravity: Int, xOffset: Int, yOffset: Int): FriedToast

    /* Show */

    fun show()

}