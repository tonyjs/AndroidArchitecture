package iammert.com.androidarchitecture

class ExampleTestKt {

    fun test() {

    }

}

abstract class WildcardTest<Data> {
    abstract fun setList(list: List<@JvmSuppressWildcards Data>)
}
