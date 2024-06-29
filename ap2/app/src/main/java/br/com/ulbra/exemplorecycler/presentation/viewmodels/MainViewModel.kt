package br.com.ulbra.exemplorecycler.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import br.com.ulbra.exemplorecycler.data.Product

class MainViewModel : ViewModel() {
    private var list = mutableListOf(
        Product(
            urlImage = "https://image.api.playstation.com/vulcan/ap/rnd/202206/0720/0kRqUeSBIbQzz7cen3c989c6.jpg",
            name = "The Last Of Us",
            price = "250.00"
        ),
        Product(
            urlImage = "https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_1240/b_white/f_auto/q_auto/ncom/software/switch/70010000003208/4643fb058642335c523910f3a7910575f56372f612f7c0c9a497aaae978d3e51",
            name = "Hollow Knight",
            price = "50.00"
        ),
        Product(
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpHQ0JFOVvS0fI9LJH5LSGizeXzzR1WFKPug&s",
            name = "Elden Ring",
            price = "229.90"
        ),
        Product(
            urlImage = "https://cdn1.epicgames.com/offer/8ae7b3c0f490471b967ce26cc2f6e0e6/EGS_ItTakesTwo_Hazelight_S1_2560x1440-3ca0f21dd4d9ce4416e2d8e2a2178906_2560x1440-3ca0f21dd4d9ce4416e2d8e2a2178906",
            name = "It Takes Two",
            price = "199,90"
        )
    )

    fun getProducts() = list

    fun removeItem(index: Int) {
        list.removeAt(index)
    }

    fun addItem(product: Product){
        list.add(product)

        Log.i("Lista", getProducts().toString())
    }

}