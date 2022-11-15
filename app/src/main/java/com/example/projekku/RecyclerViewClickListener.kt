package com.example.projekku

import android.view.View
import com.example.projekku.model.ModelProjek

interface RecyclerViewClickListener {
    fun onClicked(view: View?, modelProjek: ModelProjek)
    fun onClicked2(view: View?, modelProjek: ModelProjek)
}
