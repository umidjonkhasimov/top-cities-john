package uz.gita.topcities_john.util

import uz.gita.topcities_john.R
import uz.gita.topcities_john.data.CityData

fun topCities(): List<CityData> {
    val list = ArrayList<CityData>()

    list.add(
        CityData(
            id = 1,
            img1 = R.drawable.img_bangkok1,
            img2 = R.drawable.img_bangkok2,
            city = "Bangkok",
            country = "Thailand",
            visitors = "22.78 million",
            population = "10.5 million",
            area = "1,568.737 km²",
            gdp = "$338.2 billion",
            rank = "1 (2022)",
            info = R.string.bangkok_info
        )
    )

    list.add(
        CityData(
            id = 2,
            img1 = R.drawable.img_paris1,
            img2 = R.drawable.img_paris2,
            city = "Paris",
            country = "France",
            visitors = "19.10 million",
            population = "2.1 million",
            area = "105.4 km²",
            gdp = "$859 billion",
            rank = "3 (2022)",
            info = R.string.paris_info
        )
    )

    list.add(
        CityData(
            id = 3,
            img1 = R.drawable.img_london1,
            img2 = R.drawable.img_london2,
            city = "London",
            country = "United Kingdom",
            visitors = "19.09 million",
            population = "8.1 million",
            area = "1,572.03 km²",
            gdp = "$637 billion",
            rank = "2 (2022)",
            info = R.string.london_info
        )
    )

    list.add(
        CityData(
            id = 4,
            img1 = R.drawable.img_dubai1,
            img2 = R.drawable.img_dubai2,
            city = "Dubai",
            country = "United Arab Emirates",
            visitors = "15.93 million",
            population = "3.6 million",
            area = "1,610 km²",
            gdp = "$177 billion",
            rank = "4 (2022)",
            info = R.string.dubai_info
        )
    )

    list.add(
        CityData(
            id = 5,
            img1 = R.drawable.img_singapore1,
            img2 = R.drawable.img_singapore2,
            city = "Singapore",
            country = "The Republic of Singapore",
            visitors = "14.67 million",
            population = "5.4 million",
            area = "728.6 km²",
            gdp = "$397 billion",
            rank = "5 (2022)",
            info = R.string.singapore_info
        )
    )

    list.add(
        CityData(
            id = 6,
            img1 = R.drawable.img_kuala_lumpur1,
            img2 = R.drawable.img_kuala_lumpur2,
            city = "Kuala Lumpur",
            country = "Malaysia",
            visitors = "13.79 million",
            population = "1.8 million",
            area = "243 km²",
            gdp = "$239 billion",
            rank = "7 (2022)",
            info = R.string.kuala_lumpur
        )
    )

    list.add(
        CityData(
            id = 7,
            img1 = R.drawable.img_new_york1,
            img2 = R.drawable.img_new_york2,
            city = "New York",
            country = "United States of America",
            visitors = "13.60 million",
            population = "8.5 million",
            area = "783.8 km²",
            gdp = "$1.56 trillion",
            rank = "6 (2022)",
            info = R.string.new_york
        )
    )

    list.add(
        CityData(
            id = 8,
            img1 = R.drawable.img_istanbul1,
            img2 = R.drawable.img_istanbul2,
            city = "Istanbul",
            country = "Turkey",
            visitors = "13.40 million",
            population = "15.46 million",
            area = "5,461 km²",
            gdp = "$2.2 trillion",
            rank = "9 (2022)",
            info = R.string.istanbul
        )
    )

    list.add(
        CityData(
            id = 9,
            img1 = R.drawable.img_tokyo1,
            img2 = R.drawable.img_tokyo2,
            city = "Tokyo",
            country = "Japan",
            visitors = "12.93 million",
            population = "13.96 million",
            area = "2,194 km²",
            gdp = "$834 billion",
            rank = "8 (2022)",
            info = R.string.tokyo
        )
    )

    list.add(
        CityData(
            id = 10,
            img1 = R.drawable.img_antalya1,
            img2 = R.drawable.img_antalya2,
            city = "Antalya",
            country = "Turkey",
            visitors = "12.41 million",
            population = "1.34 million",
            area = "1,417 km²",
            gdp = "$23.2 billion",
            rank = "11 (2022)",
            info = R.string.antalya
        )
    )

    list.add(
        CityData(
            id = 11,
            img1 = R.drawable.img_seoul1,
            img2 = R.drawable.img_seoul2,
            city = "Seoul",
            country = "South Korea",
            visitors = "11.25 million",
            population = "9.7 million",
            area = "605.2 km²",
            gdp = "$384 billion",
            rank = "10 (2022)",
            info = R.string.seoul
        )
    )

    list.add(
        CityData(
            id = 12,
            img1 = R.drawable.img_osaka1,
            img2 = R.drawable.img_osaka2,
            city = "Osaka",
            country = "Japan",
            visitors = "10.14 million",
            population = "8 million",
            area = "223 km²",
            gdp = "$362 billion",
            rank = "19 (2022)",
            info = R.string.osaka
        )
    )

    list.add(
        CityData(
            id = 13,
            img1 = R.drawable.img_mekkah1,
            img2 = R.drawable.img_mekkah2,
            city = "Makkah",
            country = "Saudi Arabia",
            visitors = "10.00 million",
            population = "2.1 million",
            area = "1,200 km²",
            gdp = "$6.6 billion",
            rank = "13 (2022)",
            info = R.string.makkah
        )
    )

    list.add(
        CityData(
            id = 14,
            img1 = R.drawable.img_phuket1,
            img2 = R.drawable.img_phuket2,
            city = "Phuket",
            country = "Thailand",
            visitors = "9.89 million",
            population = "79.3 thousand",
            area = "12.56 km²",
            gdp = "$800.1 thousand",
            rank = "12 (2022)",
            info = R.string.phuket
        )
    )

    list.add(
        CityData(
            id = 15,
            img1 = R.drawable.img_pattaya1,
            img2 = R.drawable.img_pattaya2,
            city = "Pattaya",
            country = "Thailand",
            visitors = "9.44 million",
            population = "120.5 thousand",
            area = "53.4 km²",
            gdp = "$10 million",
            rank = "18 (2022)",
            info = R.string.pattaya
        )
    )

    list.add(
        CityData(
            id = 16,
            img1 = R.drawable.img_milan1,
            img2 = R.drawable.img_milan2,
            city = "Milan",
            country = "Italy",
            visitors = "9.10 million",
            population = "1.352 million",
            area = "181.8 km²",
            gdp = "$232 billion",
            rank = "15 (2022)",
            info = R.string.milan
        )
    )

    list.add(
        CityData(
            id = 17,
            img1 = R.drawable.img_barcelona1,
            img2 = R.drawable.img_barcelona2,
            city = "Barcelona",
            country = "Spain",
            visitors = "9.09 million",
            population = "1.62 million",
            area = "101.9 km²",
            gdp = "$125 billion",
            rank = "17 (2022)",
            info = R.string.barcelona
        )
    )

    list.add(
        CityData(
            id = 18,
            img1 = R.drawable.img_palma1,
            img2 = R.drawable.img_palma2,
            city = "Palma De Mallorca",
            country = "Spain",
            visitors = "8.96 million",
            population = "424 thousand",
            area = "4900 km²",
            gdp = "$4.7 million",
            rank = "16 (2022)",
            info = R.string.palma
        )
    )

    list.add(
        CityData(
            id = 19,
            img1 = R.drawable.img_bali1,
            img2 = R.drawable.img_bali2,
            city = "Bali",
            country = "Indonesia",
            visitors = "8.26 million",
            population = "4.4 million",
            area = "5,780 km²",
            gdp = "$58.4 million",
            rank = "20 (2022)",
            info = R.string.bali
        )
    )

    list.add(
        CityData(
            id = 20,
            img1 = R.drawable.img_hong_kong1,
            img2 = R.drawable.img_hong_kong2,
            city = "Hong Kong SAR",
            country = "China",
            visitors = "8.23 million",
            population = "7.4 million",
            area = "2,755 km²",
            gdp = "$369.2 billion",
            rank = "14 (2022)",
            info = R.string.hong_kong
        )
    )

    return list
}