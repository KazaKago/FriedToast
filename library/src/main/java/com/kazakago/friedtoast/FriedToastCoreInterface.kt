package com.kazakago.friedtoast

import android.graphics.Bitmap
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.widget.ImageView

interface FriedToastCoreInterface {

    fun show()

    /* Toast */

    fun setDuration(duration: Int): FriedToastCoreInterface

    fun setGravity(gravity: Int): FriedToastCoreInterface

    fun setXOffset(xOffset: Int): FriedToastCoreInterface

    fun setYOffset(yOffset: Int): FriedToastCoreInterface

    /* View */

    fun setAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float): FriedToastCoreInterface

    fun setMinimumWidth(width: Int): FriedToastCoreInterface

    fun setMinimumHeight(height: Int): FriedToastCoreInterface

    fun setBackgroundColor(@ColorInt color: Int): FriedToastCoreInterface

    fun setBackgroundColorRes(@ColorRes colorRes: Int): FriedToastCoreInterface

    fun setBackgroundCornerRadius(cornerRadius: Float): FriedToastCoreInterface

    /* IconImageView */

    fun setIconImageDrawable(drawable: Drawable?): FriedToastCoreInterface

    fun setIconImageResource(@DrawableRes resourceId: Int): FriedToastCoreInterface

    fun setIconImageBitmap(bitmap: Bitmap?): FriedToastCoreInterface

    fun setIconScaleType(scaleType: ImageView.ScaleType): FriedToastCoreInterface

    fun setIconColorFilter(colorFilter: ColorFilter): FriedToastCoreInterface

    fun setIconColorFilter(@ColorInt color: Int, mode: PorterDuff.Mode): FriedToastCoreInterface

    fun setIconColorFilterRes(@ColorRes color: Int, mode: PorterDuff.Mode): FriedToastCoreInterface

    fun setIconColorFilter(@ColorInt color: Int): FriedToastCoreInterface

    fun setIconColorFilterRes(@ColorRes color: Int): FriedToastCoreInterface

    /* TitleTextView */

    fun setTitle(text: CharSequence?): FriedToastCoreInterface

    fun setTitle(@StringRes textRes: Int): FriedToastCoreInterface

    fun setTitleTextSize(textSize: Float): FriedToastCoreInterface

    fun setTitleTextColor(@ColorInt textColor: Int): FriedToastCoreInterface

    fun setTitleTextColorRes(@ColorRes textColorRes: Int): FriedToastCoreInterface

    fun setTitleTypeFace(typeFace: Typeface): FriedToastCoreInterface

    fun setTitleGravity(gravity: Int): FriedToastCoreInterface

    /* DescriptionTextView */

    fun setDescription(text: CharSequence?): FriedToastCoreInterface

    fun setDescription(@StringRes textRes: Int): FriedToastCoreInterface

    fun setDescriptionTextSize(textSize: Float): FriedToastCoreInterface

    fun setDescriptionTextColor(@ColorInt textColor: Int): FriedToastCoreInterface

    fun setDescriptionTextColorRes(@ColorRes textColorRes: Int): FriedToastCoreInterface

    fun setDescriptionTypeFace(typeFace: Typeface): FriedToastCoreInterface

    fun setDescriptionGravity(gravity: Int): FriedToastCoreInterface

}