package homework

package object task2 {
  type UserId = Long

  type UserPhone = String

  object UserPhone {
    def apply(s: String): Option[UserPhone] = ???
  }

}
