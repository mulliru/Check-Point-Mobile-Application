package com.example.cp2_2158

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_teste.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_teste : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_teste, container, false)

        // Encontre os campos de formulário
        val nomeEditText = view.findViewById<EditText>(R.id.editavel_nome)
        val sobrenomeEditText = view.findViewById<EditText>(R.id.editavel_sobrenome)
        val emailEditText = view.findViewById<EditText>(R.id.editavel_email)

        // Adicione um listener ao botão "Enviar"
        val enviarButton = view.findViewById<Button>(R.id.editavel_botao)
        enviarButton.setOnClickListener {
            val nome = nomeEditText.text.toString()
            val sobrenome = sobrenomeEditText.text.toString()
            val email = emailEditText.text.toString()

            // Crie um Bundle para armazenar os dados
            val bundle = Bundle()
            bundle.putString("nome", nome)
            bundle.putString("sobrenome", sobrenome)
            bundle.putString("email", email)

            // Chame o método para substituir a fragment
            substituirFragment(bundle)
        }

        return view
    }

    private fun substituirFragment(bundle: Bundle) {
        // Crie uma nova instância da fragment_result
        val resultadoFragment = fragment_result()
        resultadoFragment.arguments = bundle

        // Substitua a fragment_teste pela fragment_result
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_container_view, resultadoFragment)
        transaction?.commit()
    }
}