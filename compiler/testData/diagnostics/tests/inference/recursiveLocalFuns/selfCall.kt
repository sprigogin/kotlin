// !WITH_NEW_INFERENCE
fun foo() {
    fun bar1() = <!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!>bar1<!>()<!>

    fun bar2() = 1 <!NI;OVERLOAD_RESOLUTION_AMBIGUITY!>+<!> <!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!>bar2<!>()<!>
    fun <!NI;IMPLICIT_NOTHING_RETURN_TYPE!>bar3<!>() = <!NI;IMPLICIT_NOTHING_AS_TYPE_PARAMETER, NI;NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>id<!>(<!TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!><!NI;DEBUG_INFO_MISSING_UNRESOLVED!>bar3<!>()<!>)
}

fun <T> id(x: T) = x
