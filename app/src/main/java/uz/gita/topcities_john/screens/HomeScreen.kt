package uz.gita.topcities_john.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.topcities_john.R
import uz.gita.topcities_john.adapter.CityAdapter
import uz.gita.topcities_john.databinding.ScreenHomeBinding
import uz.gita.topcities_john.util.topCities

class HomeScreen : Fragment(R.layout.screen_home) {
    private val binding by viewBinding<ScreenHomeBinding>()
    private lateinit var adapter: CityAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = CityAdapter { cityData ->
            val action = HomeScreenDirections.actionHomeScreenToDetailsScreen(cityData)
            findNavController().navigate(action)
        }

        binding.apply {
            rvHome.adapter = adapter
            adapter.submitList(topCities())
            rvHome.layoutManager = GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        }
    }
}