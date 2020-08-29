package br.aulas.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contacts.*

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        btnDone.setOnClickListener {

            // Raw string
            var msg: String = """Nome: ${etName.text}
            |Phone: ${etPhone.text}
            |Email: ${etEmail.text}
            |
            |Preference:
            """.trimMargin("|")

            if(cbPrefEmail.isChecked) {
                msg += " Email"
            }

            if(cbPrefPhone.isChecked) {
                msg += " Phone"
            }

            if(!cbPrefPhone.isChecked && !cbPrefEmail.isChecked) {
                msg += " No preference"
            }

            alert("Details", msg, this)

        }
    }
}