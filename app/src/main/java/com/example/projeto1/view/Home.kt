package com.example.projeto1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto1.R
import com.example.projeto1.adapter.servicosAdapter
import com.example.projeto1.databinding.ActivityHomeBinding
import com.example.projeto1.moodel.servicos

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var servicosAdapter: servicosAdapter
    private val listaservicos: MutableList <servicos> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val nome = intent.extras?.getString("nome")
        binding.txtNomeUsuario.text = "Bem vindo(a), $nome"
        val recyclerViewservicos = binding.recyclerViewArtes
        recyclerViewservicos.layoutManager=GridLayoutManager(this,2)
        servicosAdapter = servicosAdapter(this,listaservicos)
        recyclerViewservicos.setHasFixedSize(true)
        recyclerViewservicos.adapter=servicosAdapter
        getServicos()

    }
    private fun getServicos (){
        val servico1= servicos (R.drawable.jiujitsu,"JiuJitsu")
        listaservicos.add(servico1)

        val servico2= servicos (R.drawable.judo,"Judo")
        listaservicos.add(servico2)

        val servico3= servicos (R.drawable.boxxx,"Box")
        listaservicos.add(servico3)

        val servico4= servicos (R.drawable.muaythay,"MuayThay")
        listaservicos.add(servico4)
    }

}