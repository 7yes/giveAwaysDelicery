package com.example.gamergiveawaysapp.views

import android.app.AlertDialog
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.gamergiveawaysapp.adapter.GiveawayAdapter
import com.example.gamergiveawaysapp.viewmodel.GiveawaysViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

open class BaseFragment : Fragment() {
    protected val giveawaysViewModel: GiveawaysViewModel by sharedViewModel()

    protected val giveawaysAdapter by lazy {
        GiveawayAdapter (onClickItem = {
            AlertDialog.Builder(context,1)
                .setTitle(it.title)
                .setMessage(it.description)
                .setCancelable(true)
                .show()


        })
    }
}