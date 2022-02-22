package br.com.fiap.baseapp

class FakeAPI {
    fun getEstados(): Array<String> {
        return arrayOf(
            "Acre",
            "Alagoas",
            "Amapá",
            "Amazonas",
            "Bahia",
            "Ceará",
            "Distrito Federal",
            "Espírito Santo",
            "Goiás",
            "Maranhão",
            "Mato Grosso",
            "Mato Grosso do Sul",
            "Minas Gerais",
            "Pará",
            "Paraíba",
            "Paraná",
            "Pernambuco",
            "Piauí",
            "Rio de Janeiro",
            "Rio Grande do Norte",
            "Rio Grande do Sul",
            "Rondônia",
            "Roraima",
            "Santa Catarina",
            "São Paulo",
            "Sergipe",
            "Tocantins",
        )
    }

    fun getContatos(): ArrayList<Contato> {
        val contatoList = ArrayList<Contato>()

        for (i in 1..10) {
            val contato = Contato(
                i,
                "Nome " + i.toString(),
                "telefone " + i.toString(),
                R.drawable.avatar,
                "sobre" + i.toString(),
            )
            contatoList.add(contato)
        }

        return contatoList
    }
}