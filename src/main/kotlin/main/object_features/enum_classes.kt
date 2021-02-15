package main.object_features

import java.util.*

fun main(){
    val easyEntity = EntityFactory2.create(EntityType.EASY)
    val mediumEntity = EntityFactory2.create(EntityType.MEDIUM)
    val hardEntity = EntityFactory2.create(EntityType.HARD)
    println(easyEntity)
    println(mediumEntity)
    println(hardEntity)
}


object EntityFactory2{
    fun create(type: EntityType) : Entity3{
        val id = UUID.randomUUID().toString()

        val name = when(type){
            EntityType.EASY -> type.name //1st approach
            EntityType.MEDIUM -> type.getFormattedName() //2nd approach
            EntityType.HARD -> "Hard"      //3nd approach
        }

        return Entity3(id, name)
    }
}

class Entity3 (val id: String, val name:String){

    override fun toString(): String {
        return "id: $id name: $name"
    }
}

enum class EntityType{
    EASY,
    MEDIUM,
    HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()

}
