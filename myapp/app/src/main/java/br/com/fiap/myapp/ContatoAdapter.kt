package br.com.fiap.myapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ContatoAdapter(
    private val context: Activity,
    private val arrayList: ArrayList<Contato>
) : ArrayAdapter<Contato>(
    context,
    R.layout.listview_contato,
    arrayList,
) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = layoutInflater.inflate(R.layout.listview_contato, null)

        val imgContato: ImageView = view.findViewById(R.id.imgContato)
        imgContato.setImageResource(arrayList[position].imagem)

        val tvNomeContato: TextView = view.findViewById(R.id.tvNomeContato)
        tvNomeContato.text = arrayList[position].nome

        val tvTelefoneContato: TextView = view.findViewById(R.id.tvTelefoneContato)
        tvTelefoneContato.text = arrayList[position].telefone

        return view
    }
}