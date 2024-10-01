package com.laregebludberry.realstudy.fragment

import android.content.Intent
import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.laregebludberry.realstudy.R
import com.laregebludberry.realstudy.fragment.ui.login.LoginFragment

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.setting, rootKey)
        val loginPreference: Preference? = findPreference("signature")
        loginPreference?.setOnPreferenceClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LoginFragment())
                .addToBackStack(null)
                .commit()
            true
        }
    }
}