package br.aulas.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sum.*

class SumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)

        btnSum.setOnClickListener {
            val result = etValue1.text.toString().toInt() + etValue2.text.toString().toInt()

            etResult.setText(result.toString())

            etValue1.setText("")
            etValue2.setText("")
        }

    }
}