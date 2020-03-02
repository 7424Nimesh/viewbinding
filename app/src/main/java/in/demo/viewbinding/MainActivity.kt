package `in`.demo.viewbinding

import `in`.demo.viewbinding.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /** This is a declaration of binding class.
     *  Binding class naming convention is to remove any underscores and then sentance-case the words that were seperated by these underscores.
     *  Finally, you can see here that the word Binding has been added to end of our file name – this is required and will be added for every view binding class that is generated.
     */
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * we’re going to use the LayoutInflator reference within our activity and call the static inflate() method on our Binding class.
         * Doing so will inflate our layout into our binding class so that our bound views are accessible for use.
         */
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHelloWorld.text = "Welcome to Android Studio"

        binding.btnSubmit.setOnClickListener { Toast.makeText(this,"Submit Button Clicked",Toast.LENGTH_LONG).show() }
    }
}
