package com.visibility.remindersapp

import android.content.Context
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.edit
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.visibility.remindersapp.databinding.DialogEditReminderBinding
import com.visibility.remindersapp.databinding.FragmentPasswordsBinding

class PasswordsFragment: Fragment() {
    private lateinit var binding: FragmentPasswordsBinding
    private val preferences by lazy {requireActivity().getSharedPreferences("passwords", Context.MODE_PRIVATE)}
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPasswordsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayValues()
        binding.cardViewWifi.setOnClickListener{showEditDialog(PREF_WIFI)}
        binding.cardViewTablet.setOnClickListener{showEditDialog(PREF_TABLET)}
        binding.cardViewBike.setOnClickListener{showEditDialog(PREF_BIKE)}
    }

    private fun displayValues() {
        binding.textViewWifiValue.text = preferences.getString(PREF_WIFI, null)
        binding.textViewTabletValue.text = preferences.getString(PREF_TABLET, null)
        binding.textViewBikeValue.text = preferences.getString(PREF_BIKE, null)
    }

    private fun showEditDialog(preferenceKey: String){
        val dialogBinding = DialogEditReminderBinding.inflate(requireActivity().layoutInflater)
        dialogBinding.editTextValue.setText(preferences.getString(preferenceKey, null))
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Update value")
            .setView(dialogBinding.root)
            .setPositiveButton("Save") {_,_ ->
                preferences.edit { putString(preferenceKey, dialogBinding.editTextValue.text.toString()) }
                displayValues()
            }
            .setNegativeButton("Cancel") {_,_ ->

            }.show()
    }
    companion object {
        const val PREF_WIFI = "pref_wifi"
        const val PREF_TABLET = "pref_tablet"
        const val PREF_BIKE = "pref_bike"
    }
}
