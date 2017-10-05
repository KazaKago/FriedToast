package com.kazakago.friedtoast

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

abstract class AbsFriedToast(private val context: Context) : FriedToast {

    private var toastDuration: Int? = null
    private var toastGravity: Int? = null
    private var toastXOffset: Int? = null
    private var toastYOffset: Int? = null
    @FloatRange(from = 0.0, to = 1.0) private var viewAlpha: Float? = null
    private var viewMinimumWidth: Int? = null
    private var viewMinimumHeight: Int? = null
    @ColorInt private var viewBackgroundColor: Int? = null
    private var viewBackgroundCornerRadius: Float? = null
    private var iconImageDrawable: Drawable? = null
    private var titleText: CharSequence? = null
    private var titleTextSize: Float? = null
    @ColorInt private var titleTextColor: Int? = null
    private var titleTypeFace: Typeface? = null
    private var titleGravity: Int? = null
    private var descriptionText: CharSequence? = null
    private var descriptionTextSize: Float? = null
    @ColorInt private var descriptionTextColor: Int? = null
    private var descriptionTypeFace: Typeface? = null
    private var descriptionGravity: Int? = null

    abstract protected fun onCreateView(inflater: LayoutInflater): View

    abstract protected fun onCreateIconImageView(view: View): ImageView

    abstract protected fun onCreateTitleTextView(view: View): TextView

    abstract protected fun onCreateDescriptionTextView(view: View): TextView

    abstract protected fun onCreateToast(toast: Toast): Toast

    open protected fun onViewCreated(view: View) {}

    open protected fun onIconImageViewCreated(iconImageView: ImageView) {}

    open protected fun onTitleTextViewCreated(titleTextView: TextView) {}

    open protected fun onDescriptionTextViewCreated(descriptionTextView: TextView) {}

    open protected fun onToastCreated(toast: Toast) {}

    override fun show() {
        val toastView = onCreateView(LayoutInflater.from(context)).apply {
            viewAlpha?.let { alpha = it }
            viewMinimumWidth?.let { minimumWidth = it }
            viewMinimumHeight?.let { minimumHeight = it }
            if (viewBackgroundCornerRadius != null || viewBackgroundColor != null) {
                if (background is GradientDrawable) {
                    val backgroundDrawable = background as GradientDrawable
                    backgroundDrawable.mutate()
                    viewBackgroundCornerRadius?.let { backgroundDrawable.cornerRadius = it }
                    viewBackgroundColor?.let { backgroundDrawable.setColor(it) }
                    setBackgroundCompat(backgroundDrawable)
                } else {
                    val backgroundDrawable = GradientDrawable()
                    backgroundDrawable.mutate()
                    backgroundDrawable.cornerRadius = viewBackgroundCornerRadius ?: context.resources.getDimension(R.dimen.defaultRadius)
                    backgroundDrawable.setColor(viewBackgroundColor ?: ContextCompat.getColor(context, R.color.defaultToastColor))
                    setBackgroundCompat(backgroundDrawable)
                }
            }
            onViewCreated(this)
        }

        onCreateIconImageView(toastView).apply {
            iconImageDrawable?.let { setImageDrawable(it) }
            onIconImageViewCreated(this)
        }

        onCreateTitleTextView(toastView).apply {
            titleText?.let { text = it }
            titleTextSize?.let { textSize = it }
            titleTextColor?.let { setTextColor(it) }
            titleTypeFace?.let { typeface = it }
            titleGravity?.let { gravity = it }
            onTitleTextViewCreated(this)
        }

        onCreateDescriptionTextView(toastView).apply {
            descriptionText?.let { text = it }
            descriptionTextSize?.let { textSize = it }
            descriptionTextColor?.let { setTextColor(it) }
            descriptionTypeFace?.let { typeface = it }
            descriptionGravity?.let { gravity = it }
            onDescriptionTextViewCreated(this)
        }

        onCreateToast(Toast(context)).apply {
            view = toastView
            toastDuration?.let { duration = it }
            setGravity(toastGravity ?: gravity, toastXOffset ?: xOffset, toastYOffset ?: yOffset)
            onToastCreated(this)
        }.show()
    }

    /* Toast */

    override fun setDuration(duration: Int): FriedToast {
        toastDuration = duration
        return this
    }

    override fun setGravity(gravity: Int): FriedToast {
        toastGravity = gravity
        return this
    }

    override fun setXOffset(xOffset: Int): FriedToast {
        toastXOffset = xOffset
        return this
    }

    override fun setYOffset(yOffset: Int): FriedToast {
        toastYOffset = yOffset
        return this
    }

    /* View */

    override fun setAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float): FriedToast {
        viewAlpha = alpha
        return this
    }

    override fun setMinimumWidth(width: Int): FriedToast {
        viewMinimumWidth = width
        return this
    }

    override fun setMinimumHeight(height: Int): FriedToast {
        viewMinimumHeight = height
        return this
    }

    override fun setBackgroundColor(@ColorInt color: Int): FriedToast {
        viewBackgroundColor = color
        return this
    }

    override fun setBackgroundColorRes(@ColorRes colorRes: Int): FriedToast {
        viewBackgroundColor = ContextCompat.getColor(context, colorRes)
        return this
    }

    override fun setBackgroundCornerRadius(cornerRadius: Float): FriedToast {
        viewBackgroundCornerRadius = cornerRadius
        return this
    }

    /* IconImageView */

    override fun setIconImageResource(@DrawableRes resourceId: Int): FriedToast {
        iconImageDrawable = ContextCompat.getDrawable(context, resourceId)
        return this
    }

    override fun setIconImageDrawable(drawable: Drawable?): FriedToast {
        iconImageDrawable = drawable
        return this
    }

    override fun setIconImageBitmap(bitmap: Bitmap?): FriedToast {
        iconImageDrawable = BitmapDrawable(context.resources, bitmap)
        return this
    }

    /* TitleTextView */

    override fun setTitle(text: CharSequence?): FriedToast {
        titleText = text
        return this
    }

    override fun setTitle(@StringRes textRes: Int): FriedToast {
        titleText = context.getString(textRes)
        return this
    }

    override fun setTitleTextSize(textSize: Float): FriedToast {
        titleTextSize = textSize
        return this
    }

    override fun setTitleTextColor(@ColorInt textColor: Int): FriedToast {
        titleTextColor = textColor
        return this
    }

    override fun setTitleTextColorRes(@ColorRes textColorRes: Int): FriedToast {
        titleTextColor = ContextCompat.getColor(context, textColorRes)
        return this
    }

    override fun setTitleTypeFace(typeFace: Typeface?): FriedToast {
        titleTypeFace = typeFace
        return this
    }

    override fun setTitleGravity(gravity: Int): FriedToast {
        titleGravity = gravity
        return this
    }

    /* DescriptionTextView */

    override fun setDescription(text: CharSequence?): FriedToast {
        descriptionText = text
        return this
    }

    override fun setDescription(@StringRes textRes: Int): FriedToast {
        descriptionText = context.getString(textRes)
        return this
    }

    override fun setDescriptionTextSize(textSize: Float): FriedToast {
        descriptionTextSize = textSize
        return this
    }

    override fun setDescriptionTextColor(@ColorInt textColor: Int): FriedToast {
        descriptionTextColor = textColor
        return this
    }

    override fun setDescriptionTextColorRes(@ColorRes textColorRes: Int): FriedToast {
        descriptionTextColor = ContextCompat.getColor(context, textColorRes)
        return this
    }

    override fun setDescriptionTypeFace(typeFace: Typeface?): FriedToast {
        descriptionTypeFace = typeFace
        return this
    }

    override fun setDescriptionGravity(gravity: Int): FriedToast {
        descriptionGravity = gravity
        return this
    }

}