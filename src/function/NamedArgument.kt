package function
fun main(){
    println(volume("Record Box",1,height=10,width=2));
}

fun volume(boxname:String,lenght:Int,width:Int,height:Int):Int{
    println(boxname);
    return lenght*width*height;
}
