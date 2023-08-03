package uz.gita.topcities_john.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.gita.topcities_john.data.CityData
import uz.gita.topcities_john.databinding.ItemCityBinding

class CityAdapter(
    private val onClickListener: (CityData) -> Unit
) : ListAdapter<CityData, CityAdapter.CityVH>(MyDiffUtil) {
    inner class CityVH(private val binding: ItemCityBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {

            binding.apply {
                val item = getItem(position)

                root.setOnClickListener {
                    onClickListener.invoke(item)
                }

                imgCity.setImageResource(item.img1)
                tvCity.text = item.city
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityVH =
        CityVH(ItemCityBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: CityVH, position: Int) = holder.bind(position)

    private object MyDiffUtil : DiffUtil.ItemCallback<CityData>() {
        override fun areItemsTheSame(oldItem: CityData, newItem: CityData) = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: CityData, newItem: CityData) = oldItem == newItem
    }
}