package uz.gita.topcities_john.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.topcities_john.R
import uz.gita.topcities_john.databinding.ScreenDetailsBinding

class DetailsScreen : Fragment(R.layout.screen_details) {
    private val binding by viewBinding<ScreenDetailsBinding>()
    private val args by navArgs<DetailsScreenArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = args.cityData

        binding.apply {
            tvCityDetail.text = data.city
            imgCity1Detail.setImageResource(data.img1)
            imgCity2Detail.setImageResource(data.img2)
            tvCountryDetail.text = "Country: ${data.country}"
            tvVisitorsDetail.text = "Visitors: ${data.visitors}"
            tvPopulationDetail.text = "Population: ${data.country}"
            tvAreaDetail.text = "Area: ${data.area}"
            tvGdpDetail.text = "GDP: ${data.gdp}"
            tvRankDetail.text = "Rank: ${data.rank}"

            tvInfoDetail.setText(data.info)
        }
    }
}