package com.example.projekku.mainactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projekku.*
import com.example.projekku.adapter.ProjekAdapter
import com.example.projekku.activitybaru.ActivityBaru
import com.example.projekku.model.ModelProjek

class MainActivity : AppCompatActivity(), RecyclerViewClickListener {
    private val projekList = ArrayList<ModelProjek>()
    private val projekList2 = ArrayList<ModelProjek>()
    private lateinit var projekAdapter: ProjekAdapter
    private lateinit var projekAdapter2: ProjekAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Projekku"
        val recyclerView: RecyclerView = findViewById(R.id.recyleView)
        val recyclerView2: RecyclerView = findViewById(R.id.recyleView2)

        projekAdapter = ProjekAdapter(projekList)
        projekAdapter.listener = this

        projekAdapter2 = ProjekAdapter(projekList2)
        projekAdapter2.listener = this

        val layoutManager = LinearLayoutManager(applicationContext)
        val layoutManager2 = LinearLayoutManager(applicationContext)

        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = projekAdapter
        prepareDataProjekleg1()

        recyclerView2.layoutManager = layoutManager2
        recyclerView2.itemAnimator = DefaultItemAnimator()
        recyclerView2.adapter = projekAdapter2
        prepareDataProjekleg2()
    }

    private fun prepareDataProjekleg1() {
        var projek = ModelProjek("PSG", "vs", "Bayern Munchen", "15 Februari 2023", "03.00")
        projekList.add(projek)
        projek = ModelProjek("AC Milan", "vs", "Tottenham", "15 Februari 2023", "03.00")
        projekList.add(projek)
        projek = ModelProjek("Club Brugge", "vs", "Benfica", "16 Februari 2023", "03.00")
        projekList.add(projek)
        projek = ModelProjek("Dortmund", "vs", "Chelsea", "16 Februari 2023", "03.00")
        projekList.add(projek)
        projek = ModelProjek("Liverpool", "vs", "Real Madrid", "22 Februari 2023", "03.00")
        projekList.add(projek)
        projek = ModelProjek("Eintracht Frankfurt", "vs", "Napoli", "22 Februari 2023", "03.00")
        projekList.add(projek)
        projek = ModelProjek("RB Leipzig", "vs", "Manchester City", "23 Februari 2023", "03.00")
        projekList.add(projek)
        projek = ModelProjek("Inter Milan", "vs", "FC Porto", "23 Februari 2023", "03.00")
        projekList.add(projek)
        projekAdapter.notifyDataSetChanged()
    }

    private fun prepareDataProjekleg2() {
        var projek = ModelProjek("Chelsea", "vs", "Dortmund", "08 Maret 2023", "03.00")
        projekList2.add(projek)
        projek = ModelProjek("Benfica", "vs", "Club Brugge", "08 Maret 2023", "03.00")
        projekList2.add(projek)
        projek = ModelProjek("Bayern", "vs", "PSG", "09 Maret 2023", "03.00")
        projekList2.add(projek)
        projek = ModelProjek("Tottenham", "vs", "Milan", "09 Maret 2023", "03.00")
        projekList2.add(projek)
        projek = ModelProjek("Porto", "vs", "Inter", "15 Maret 2023", "03.00")
        projekList2.add(projek)
        projek = ModelProjek("Manchester City", "vs", "RB Leipzig", "15 Maret 2023", "03.00")
        projekList2.add(projek)
        projek = ModelProjek("Napoli", "vs", "Eintracht Frankfurt", "16 Maret 2023", "03.00")
        projekList2.add(projek)
        projek = ModelProjek("Real Madrid", "vs", "Liverpool", "16 Maret 2023", "03.00")
        projekList2.add(projek)
        projekAdapter.notifyDataSetChanged()

    }


    override fun onClicked(view: View?, modelProjek: ModelProjek) {
        val intent = Intent(this, ActivityBaru::class.java)
        intent.putExtra("key1", "Laga ${modelProjek.getClub1()} vs ${modelProjek.getClub2()} Belum Dimulai")
        startActivity(intent)
    }

    override fun onClicked2(view: View?, modelProjek: ModelProjek) {
        val intent = Intent(this, ActivityBaru::class.java)
        intent.putExtra("key3", "Leg2")
    }
}