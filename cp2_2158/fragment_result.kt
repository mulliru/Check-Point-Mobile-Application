package com.example.cp2_2158

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_result.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_result : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        // Encontre o TextView para mostrar os resultados
        //val resultadoTextView = view.findViewById<TextView>(R.id.resultadoTextView)
        val resultadoNome = view.findViewById<TextView>(R.id.resultadoNome)
        val resultadoSobrenome = view.findViewById<TextView>(R.id.resultadoSobrenome)
        val resultadoEmail = view.findViewById<TextView>(R.id.resultadoEmail)

        // Recupere os dados do Bundle
        val nome = arguments?.getString("nome")
        val sobrenome = arguments?.getString("sobrenome")
        val email = arguments?.getString("email")

        // Mostrar os resultados
        //resultadoTextView.text = "Nome: $nome\nSobrenome: $sobrenome\nEmail: $email"
        resultadoNome.text = "$nome"
        resultadoSobrenome.text = "$sobrenome"
        resultadoEmail.text = "$email"

        return view
    }


}