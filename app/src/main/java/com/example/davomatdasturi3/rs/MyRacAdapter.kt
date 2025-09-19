package com.example.davomatdasturi3.rs

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.davomatdasturi3.databese.StudentModel
import com.example.davomatdasturi3.databinding.IytimRecBinding


class MyRacAdapter(var list: List<StudentModel>) : RecyclerView.Adapter<MyRacAdapter.VH>() {
    lateinit var binding: IytimRecBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        binding = IytimRecBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.item.text1.text = list[position].ism
        holder.item.text2.text = list[position].familya
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class VH(var item: IytimRecBinding) : RecyclerView.ViewHolder(item.root)
}