package cat.copernic.practica2_mohamed_reda_alakil.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cat.copernic.practica2_mohamed_reda_alakil.R
import com.bumptech.glide.Glide

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer { textView.text = it })

        val imagen: ImageView = root.findViewById(R.id.imagen)
        Glide.with(this).load("https://librosostenibilidad.files.wordpress.com/2017/03/paisaje-cultura-sostenibilidad.jpg")
            .placeholder(android.R.drawable.btn_plus).into(imagen)



        return root
    }
}