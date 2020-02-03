package relar.sirloco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcular.setOnClickListener {

            var resultado: String = ""
            var total = 0

            if (etcocacola.text.isNotEmpty()) {
                total += (etcocacola.text.toString().toInt() * 0.57).toInt()
                resultado += etcocacola.text.toString() + " Cocacolas " + " a: 0.57 = " +
                        etcocacola.text.toString().toInt() * 0.57 + "\n"
            }

            if (etkaslimon.text.isNotEmpty()) {
                total += (etkaslimon.text.toString().toInt() * 0.54).toInt()
                resultado += etkaslimon.text.toString() + " kases limones " + " a: 0.54 = " +
                        etkaslimon.text.toString().toInt() * 0.54 + "\n"
            }

            if (etkasnaranja.text.isNotEmpty()) {
                total += (etkasnaranja.text.toString().toInt() * 0.54).toInt()
                resultado += etkasnaranja.text.toString() + " kases naranjas " + " a: 0.54 = " +
                        etkasnaranja.text.toString().toInt() * 0.54 + "\n"
            }

            if (etredbull.text.isNotEmpty()) {
                total += (etredbull.text.toString().toInt() * 1.25).toInt()
                resultado += etredbull.text.toString() + " redbules " + " a: 1.25 = " +
                        etredbull.text.toString().toInt() * 1.25 + "\n"
            }

            if (etcerveza.text.isNotEmpty() and !chedad.isChecked) {
                total += (etredbull.text.toString().toInt() * 1.25).toInt()
                resultado += etcerveza.text.toString() + " cervezas " + " a: 0.62 = " +
                        etcerveza.text.toString().toInt() * 0.62 + "\n"
            }

            if (etvino.text.isNotEmpty() and !chedad.isChecked) {
                total += (etredbull.text.toString().toInt() * 1.25).toInt()
                resultado += etvino.text.toString() + " vinos  " + " a: 3.21 = " +
                        etvino.text.toString().toInt() * 3.21 + "\n"
            }

            val texto = resultado + total.toString() + "€"
            tvresultado.text = texto

        }
    }


}
