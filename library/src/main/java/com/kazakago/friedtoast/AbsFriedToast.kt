package com.kazakago.friedtoast

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

abstract class AbsFriedToast(private val context: Context) : FriedToast {

    private val toast: Toast
    private val iconImageView: ImageView
    private val titleTextView: TextView
    private val descriptionTextView: TextView

    init {
        val view = onCreateView(LayoutInflater.from(context))
        iconImageView = onCreateIconImageView(view)
        titleTextView = onCreateTitleTextView(view)
        descriptionTextView = onCreateDescriptionTextView(view)

        toast = Toast(context)
        toast.view = view
        setGravity(Gravity.CENTER)
        setDuration(Toast.LENGTH_SHORT)
    }

    abstract protected fun onCreateView(inflater: LayoutInflater): View

    abstract protected fun onCreateIconImageView(view: View): ImageView

    abstract protected fun onCreateTitleTextView(view: View): TextView

    abstract protected fun onCreateDescriptionTextView(view: View): TextView

    /* IconImageView */

    override fun setIconImageResource(@DrawableRes resourceId: Int): FriedToast {
        iconImageView.setImageResource(resourceId)
        iconImageView.visibility = View.VISIBLE
        return this
    }

    override fun setIconImageDrawable(drawable: Drawable?): FriedToast {
        iconImageView.setImageDrawable(drawable)
        iconImageView.visibility = if (drawable != null) View.VISIBLE else View.GONE
        return this
    }

    override fun setIconImageBitmap(bitmap: Bitmap?): FriedToast {
        iconImageView.setImageBitmap(bitmap)
        iconImageView.visibility = if (bitmap != null) View.VISIBLE else View.GONE
        return this
    }

    /* TitleTextView */

    override fun setTitle(text: CharSequence?, textSize: Float?, @ColorInt textColor: Int?, typeFace: Typeface?, gravity: Int?): FriedToast {
        titleTextView.text = text
        titleTextView.visibility = if (text != null) View.VISIBLE else View.GONE
        textSize?.let { titleTextView.textSize = it }
        textColor?.let { titleTextView.setTextColor(it) }
        typeFace?.let { titleTextView.typeface = it }
        gravity?.let { titleTextView.gravity = it }
        return this
    }

    override fun setTitle(@StringRes textRes: Int, textSize: Float?, @ColorInt textColor: Int?, typeFace: Typeface?, gravity: Int?): FriedToast {
        return setTitle(context.getString(textRes), textSize, textColor, typeFace, gravity)
    }

    override fun setTitleTextSize(textSize: Float): FriedToast {
        titleTextView.textSize = textSize
        return this
    }

    override fun setTitleTextColor(@ColorInt textColor: Int): FriedToast {
        titleTextView.setTextColor(textColor)
        return this
    }

    override fun setTitleTextColorRes(@ColorRes textColorRes: Int): FriedToast {
        return setTitleTextColor(ContextCompat.getColor(context, textColorRes))
    }

    override fun setTitleTypeFace(typeFace: Typeface): FriedToast {
        titleTextView.typeface = typeFace
        return this
    }

    override fun setTitleGravity(gravity: Int): FriedToast {
        titleTextView.gravity = gravity
        return this
    }

    /* DescriptionTextView */

    override fun setDescription(text: CharSequence?, textSize: Float?, @ColorInt textColor: Int?, typeFace: Typeface?, gravity: Int?): FriedToast {
        descriptionTextView.text = text
        descriptionTextView.visibility = if (text != null) View.VISIBLE else View.GONE
        textSize?.let { descriptionTextView.textSize = it }
        textColor?.let { descriptionTextView.setTextColor(it) }
        typeFace?.let { descriptionTextView.typeface = it }
        gravity?.let { descriptionTextView.gravity = it }
        return this
    }

    override fun setDescription(@StringRes textRes: Int, textSize: Float?, @ColorInt textColor: Int?, typeFace: Typeface?, gravity: Int?): FriedToast {
        return setDescription(context.getString(textRes), textSize, textColor, typeFace, gravity)
    }

    override fun setDescriptionTextSize(textSize: Float): FriedToast {
        descriptionTextView.textSize = textSize
        return this
    }

    override fun setDescriptionTextColor(@ColorInt textColor: Int): FriedToast {
        descriptionTextView.setTextColor(textColor)
        return this
    }

    override fun setDescriptionTextColorRes(@ColorRes textColorRes: Int): FriedToast {
        return setDescriptionTextColor(ContextCompat.getColor(context, textColorRes))
    }

    override fun setDescriptionTypeFace(typeFace: Typeface): FriedToast {
        descriptionTextView.typeface = typeFace
        return this
    }

    override fun setDescriptionGravity(gravity: Int): FriedToast {
        descriptionTextView.gravity = gravity
        return this
    }

    /* alpha */

    override fun setAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float): FriedToast {
        toast.view.alpha = alpha
        return this
    }

    /* Minimum Size */

    override fun setMinimumSize(width: Int, height: Int): FriedToast {
        toast.view.minimumWidth = width
        toast.view.minimumHeight = height
        return this
    }

    /* Background */

    override fun setBackground(@ColorInt color: Int, cornerRadius: Float?): FriedToast {
        val background = GradientDrawable()
        background.mutate()
        background.shape = 0
        cornerRadius?.let { background.cornerRadius = it }
        background.setColor(color)
        toast.view.setBackgroundCompat(background)
        return this
    }

    /* Duration */

    override fun setDuration(duration: Int): FriedToast {
        toast.duration = duration
        return this
    }

    /* Gravity */

    override fun setGravity(gravity: Int): FriedToast {
        toast.setGravity(gravity, 0, 0)
        return this
    }

    override fun setGravity(gravity: Int, xOffset: Int, yOffset: Int): FriedToast {
        toast.setGravity(gravity, xOffset, yOffset)
        return this
    }

    /* Show */

    override fun show() {
        toast.show()
    }

}