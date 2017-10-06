package com.kazakago.friedtoast.extension

import com.kazakago.friedtoast.FriedToast
import com.kazakago.friedtoast.R

fun FriedToast.setDoneIcon(): FriedToast {
    setIconImageResource(R.drawable.ic_done_white_80dp)
    return this
}

fun FriedToast.setDoneAllIcon(): FriedToast {
    setIconImageResource(R.drawable.ic_done_all_white_80dp)
    return this
}

fun FriedToast.setDoneBoxIcon(): FriedToast {
    setIconImageResource(R.drawable.ic_check_box_white_80dp)
    return this
}

fun FriedToast.setDoneCircleIcon(): FriedToast {
    setIconImageResource(R.drawable.ic_check_circle_white_80dp)
    return this
}

fun FriedToast.setErrorIcon(): FriedToast {
    setIconImageResource(R.drawable.ic_error_white_80dp)
    return this
}

fun FriedToast.setErrorOutlineIcon(): FriedToast {
    setIconImageResource(R.drawable.ic_error_outline_white_80dp)
    return this
}

fun FriedToast.setWarningIcon(): FriedToast {
    setIconImageResource(R.drawable.ic_warning_white_80dp)
    return this
}