package br.aulas.aula05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import kotlinx.android.synthetic.main.activity_alarm.*

class AlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        btnDefinir.setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SET_ALARM)

            intent.putExtra(AlarmClock.EXTRA_HOUR, etHoras.text.toString().toInt())
            intent.putExtra(AlarmClock.EXTRA_MINUTES, etMinutos.text.toString().toInt())
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, etMensagem.text.toString().toInt())

            if(intent.resolveActivity(packageManager) != null) {

                startActivity(intent)
            }



        }
    }
}