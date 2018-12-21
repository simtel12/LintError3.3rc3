package com.example.linterror33rc3

import android.support.annotation.StringRes
import android.text.TextUtils
import android.view.View
import android.widget.AutoCompleteTextView

class BillingAddressRib(val view: View, val activity: MainActivity) {

    internal lateinit var addressField: AutoCompleteTextView


    fun didBecomeActive() {
        initViews(view)

        addressField.apply {
            setOnFocusChangeListener { _, hasFocus ->
                if (!hasFocus) {
                    if (!validateAddress(text.toString())) {
                        error = getString(R.string.ck_field_error_street_address)
                    } else {
                        error = null
                    }
                }
            }
        }

    }

    fun initViews(view: View) {
        addressField = view.findViewById(R.id.address_field) as AutoCompleteTextView
    }

    internal fun getString(@StringRes stringRes: Int): String {
        return activity.getResources().getString(stringRes)
    }

    internal fun validateAddress(address: String): Boolean {
        return !TextUtils.isEmpty(address)
    }


}