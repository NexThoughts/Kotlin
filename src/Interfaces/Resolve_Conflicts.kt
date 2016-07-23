package Interfaces

/**
 * Created by chetan on 23/7/16.
 */
interface A {
  fun foo() { print("A") }
  fun bar()
}

interface B {
  fun foo() { print("B") }
  fun bar() { print("bar") }
}

class C : A {
  override fun bar() { print("bar") }
}

class D : A, B {
    override fun bar() {
     println("mm")
    }
  override fun foo() {
    super<A>.foo()
    super<B>.foo()
  }
}