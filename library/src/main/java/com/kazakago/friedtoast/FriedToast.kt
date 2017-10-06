package com.kazakago.friedtoast

import android.content.Context
import android.graphics.Bitmap
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.widget.ImageView

interface FriedToast {

    companion object {
        @JvmOverloads
        fun create(context: Context,
                   duration: Int? = null,
                   gravity: Int? = null,
                   xOffset: Int? = null,
                   yOffset: Int? = null,
                   @FloatRange(from = 0.0, to = 1.0) alpha: Float? = null,
                   minimumWidth: Int? = null,
                   minimumHeight: Int? = null,
                   @ColorInt backgroundColor: Int? = null,
                   @ColorRes backgroundColorRes: Int? = null,
                   backgroundCornerRadius: Float? = null,
                   iconImageDrawable: Drawable? = null,
                   @DrawableRes iconImageResourceId: Int? = null,
                   iconImageBitmap: Bitmap? = null,
                   iconScaleType: ImageView.ScaleType? = null,
                   iconColorFilter: ColorFilter? = null,
                   @ColorInt iconColorFilterColor: Int? = null,
                   @ColorRes iconColorFilterColorRes: Int? = null,
                   titleText: CharSequence? = null,
                   @StringRes titleTextRes: Int? = null,
                   titleTextSize: Float? = null,
                   @ColorInt titleTextColor: Int? = null,
                   @ColorRes titleTextColorRes: Int? = null,
                   titleTypeFace: Typeface? = null,
                   titleGravity: Int? = null,
                   descriptionText: CharSequence? = null,
                   @StringRes descriptionTextRes: Int? = null,
                   descriptionTextSize: Float? = null,
                   @ColorInt descriptionTextColor: Int? = null,
                   @ColorRes descriptionTextColorRes: Int? = null,
                   descriptionTypeFace: Typeface? = null,
                   descriptionGravity: Int? = null): FriedToast {
            return FriedToastImpl(context).apply {
                duration?.let { setDuration(it) }
                gravity?.let { setGravity(it) }
                xOffset?.let { setXOffset(it) }
                yOffset?.let { setYOffset(it) }
                alpha?.let { setAlpha(it) }
                minimumWidth?.let { setMinimumWidth(it) }
                minimumHeight?.let { setMinimumHeight(it) }
                backgroundColor?.let { setBackgroundColor(it) }
                backgroundColorRes?.let { setBackgroundColorRes(it) }
                backgroundCornerRadius?.let { setBackgroundCornerRadius(it) }
                iconImageDrawable?.let { setIconImageDrawable(it) }
                iconImageResourceId?.let { setIconImageResource(it) }
                iconImageBitmap?.let { setIconImageBitmap(it) }
                iconScaleType?.let { setIconScaleType(it) }
                iconColorFilter?.let { setIconColorFilter(it) }
                iconColorFilterColor?.let { setIconColorFilter(it) }
                iconColorFilterColorRes?.let { setIconColorFilterRes(it) }
                titleText?.let { setTitle(it) }
                titleTextRes?.let { setTitle(it) }
                titleTextSize?.let { setTitleTextSize(it) }
                titleTextColor?.let { setTitleTextColor(it) }
                titleTextColorRes?.let { setTitleTextColorRes(it) }
                titleTypeFace?.let { setTitleTypeFace(it) }
                titleGravity?.let { setTitleGravity(it) }
                descriptionText?.let { setDescription(it) }
                descriptionTextRes?.let { setDescription(it) }
                descriptionTextSize?.let { setDescriptionTextSize(it) }
                descriptionTextColor?.let { setDescriptionTextColor(it) }
                descriptionTextColorRes?.let { setDescriptionTextColorRes(it) }
                descriptionTypeFace?.let { setDescriptionTypeFace(it) }
                descriptionGravity?.let { setDescriptionGravity(it) }
            }
        }
    }

    fun show()

    /* alpha */

    fun setAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float): FriedToast

    /* Minimum Size */

    fun setMinimumWidth(width: Int): FriedToast

    fun setMinimumHeight(height: Int): FriedToast

    /* Background */

    fun setBackgroundColor(@ColorInt color: Int): FriedToast

    fun setBackgroundColorRes(@ColorRes colorRes: Int): FriedToast

    fun setBackgroundCornerRadius(cornerRadius: Float): FriedToast

    /* Duration */

    fun setDuration(duration: Int): FriedToast

    /* Gravity */

    fun setGravity(gravity: Int): FriedToast

    fun setXOffset(xOffset: Int): FriedToast

    fun setYOffset(yOffset: Int): FriedToast

    /* IconImageView */

    fun setIconImageDrawable(drawable: Drawable?): FriedToast

    fun setIconImageResource(@DrawableRes resourceId: Int): FriedToast

    fun setIconImageBitmap(bitmap: Bitmap?): FriedToast

    fun setIconScaleType(scaleType: ImageView.ScaleType): FriedToast

    fun setIconColorFilter(colorFilter: ColorFilter): FriedToast

    fun setIconColorFilter(@ColorInt color: Int, mode: PorterDuff.Mode): FriedToast

    fun setIconColorFilterRes(@ColorRes color: Int, mode: PorterDuff.Mode): FriedToast

    fun setIconColorFilter(@ColorInt color: Int): FriedToast

    fun setIconColorFilterRes(@ColorRes color: Int): FriedToast

    /* TitleTextView */

    fun setTitle(text: CharSequence?): FriedToast

    fun setTitle(@StringRes textRes: Int): FriedToast

    fun setTitleTextSize(textSize: Float): FriedToast

    fun setTitleTextColor(@ColorInt textColor: Int): FriedToast

    fun setTitleTextColorRes(@ColorRes textColorRes: Int): FriedToast

    fun setTitleTypeFace(typeFace: Typeface): FriedToast

    fun setTitleGravity(gravity: Int): FriedToast

    /* DescriptionTextView */

    fun setDescription(text: CharSequence?): FriedToast

    fun setDescription(@StringRes textRes: Int): FriedToast

    fun setDescriptionTextSize(textSize: Float): FriedToast

    fun setDescriptionTextColor(@ColorInt textColor: Int): FriedToast

    fun setDescriptionTextColorRes(@ColorRes textColorRes: Int): FriedToast

    fun setDescriptionTypeFace(typeFace: Typeface): FriedToast

    fun setDescriptionGravity(gravity: Int): FriedToast

}