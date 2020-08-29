package br.aulas.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        btnHello.setOnClickListener {

            var pronoun = ""

            when(rgPronouns.checkedRadioButtonId) {
                R.id.rbShe -> pronoun = getString(R.string.she)
                R.id.rbHe -> pronoun = getString(R.string.he)
                R.id.rbNI -> pronoun = getString(R.string.neutral)
            }

            alert("Done!", pronoun, this)
        }

    }
}
