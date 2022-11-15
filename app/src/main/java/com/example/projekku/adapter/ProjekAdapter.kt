package com.example.projekku.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.projekku.model.ModelProjek
import com.example.projekku.R
import com.example.projekku.RecyclerViewClickListener

internal class ProjekAdapter (private var projekList: List<ModelProjek>): RecyclerView.Adapter<ProjekAdapter.MyViewHolder>() {
    var listener: RecyclerViewClickListener? = null

    internal class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var club1: TextView = view.findViewById(R.id.club1)
        var vs: TextView = view.findViewById(R.id.vs)
        var club2: TextView = view.findViewById(R.id.club2)
        val bulan: TextView = view.findViewById(R.id.bulan)
        var jam: TextView = view.findViewById(R.id.jam)
        var itemList: ConstraintLayout = view.findViewById(R.id.itemList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val projek = projekList[position]
        holder.club1.text = projek.getClub1()
        holder.vs.text = projek.getVs()
        holder.club2.text = projek.getClub2()
        holder.bulan.text = projek.getBulan()
        holder.jam.text = projek.getJam()

        holder.itemList.setOnClickListener {
            listener?.onClicked(it, projekList[position])
        }
    }

    override fun getItemCount(): Int {
        return projekList.size
    }
}