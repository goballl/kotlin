// MODULE: m1-common
// FILE: common.kt
// TODO: .fir.kt version is just a stub.
<!INCOMPATIBLE_MATCHING{JVM}!>expect interface My {
    open fun openFunPositive()
    <!INCOMPATIBLE_MATCHING{JVM}!>open fun openFunNegative()<!>
    abstract fun abstractFun()

    open val openValPositive: Int
    <!INCOMPATIBLE_MATCHING{JVM}!>open val openValNegative: Int<!>
    abstract val abstractVal: Int
}<!>

// MODULE: m1-jvm()()(m1-common)
// FILE: jvm.kt
actual interface My {
    actual fun openFunPositive() = Unit
    <!ACTUAL_WITHOUT_EXPECT!>actual fun openFunNegative()<!>
    actual fun abstractFun()

    actual val openValPositive: Int get() = 0
    <!ACTUAL_WITHOUT_EXPECT!>actual val openValNegative: Int<!>
    actual val abstractVal: Int
}
