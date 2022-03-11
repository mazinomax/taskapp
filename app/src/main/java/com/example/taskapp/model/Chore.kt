package com.example.taskapp.model

class Chore () {
    var taskname: String? = null
    var assignedto:String? = null
    var assignedby: String? = null
    var id: Int? = null
    var timeassigned:Long? = null


    constructor(taskname:String, assignedto:String,assignedby:String, timeassigned:Long, id:Int) :this(){

        this.assignedby = assignedby
        this.assignedto = assignedto
        this.taskname = taskname
        this.id = id
        this.timeassigned = timeassigned

    }
}