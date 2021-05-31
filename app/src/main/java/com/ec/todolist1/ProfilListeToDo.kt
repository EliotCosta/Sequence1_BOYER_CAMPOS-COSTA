package com.ec.todolist1

class ProfilListeToDo (var login: String, var mesListeToDo: List<ListeToDo>) {

    fun getMesListeToDo() : List<ListeToDo> {
        return this.mesListeToDo
    }

    fun setMesListeToDo(var mesListeToDo: List<ListeToDo>) {
        this.mesListeToDo = mesListeToDo
    }

    fun ajouteListe(var uneListe: ListeToDo) {

    }

}