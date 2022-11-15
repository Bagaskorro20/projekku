package com.example.projekku.model

class ModelProjek(club1: String?, vs: String?, club2: String?, bulan: String?, jam: String?) {
    private var club1: String
    private var vs: String
    private var club2: String
    private var bulan: String
    private var jam: String
    init {
        this.club1 = club1!!
        this.vs = vs!!
        this.club2 = club2!!
        this.bulan = bulan!!
        this.jam = jam!!
    }
    fun getClub1(): String? {
        return club1
    }
    fun getClub1(club1: String?){
        this.club1 = club1!!
    }
    fun getVs(): String? {
        return vs
    }
    fun getVs(vs: String?) {
        this.vs = vs!!
    }
    fun getClub2(): String? {
        return club2
    }
    fun getClub2(club2: String?) {
        this.club2 = club2!!
    }
    fun getBulan(): String? {
        return bulan
    }
    fun getBulan(bulan: String?) {
        this.bulan = bulan!!
    }
    fun getJam(): String? {
        return jam
    }
    fun getJam(jam: String?) {
        this.jam
    }

}
