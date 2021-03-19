package everis.com.helloworld

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Bt_Calcular = Bt_Calcular
        val Resultado = ResultView

        Bt_Calcular.setOnClickListener {

            val view = currentFocus
                val Keyboard = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                Keyboard.hideSoftInputFromWindow(view?.windowToken, 0)

            val Nota1 = Integer.parseInt(TxtNota1.text.toString())
            val Nota2 = Integer.parseInt(TxtNota2.text.toString())
            val Nota3 = Integer.parseInt(TxtNota3.text.toString())
            val Nota4 = Integer.parseInt(TxtNota4.text.toString())
            val Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4
            val Total = (Nota1 + Nota2 + Nota3 + Nota4)

            if(Media >= 6){
                Resultado.setText("Aluno foi Aprovado" + "\n" + "Total final: " + Total + "\n" + "Media Final: " + Media)
                Resultado.setTextColor(Color.GREEN)
            }
            else{
                Resultado.setText("Aluno foi Reprovado" + "\n" + "Total final: " + Total + "\n" + "Media Final: " + Media)
                Resultado.setTextColor(Color.RED)
            }

        }
    }
}