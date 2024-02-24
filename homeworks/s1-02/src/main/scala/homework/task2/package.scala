package homework

package object task2 {
  type UserId = Long

  object UserId {
    def apply(long: Long): Option[UserId] = ???
  }

  type UserPhone = String

  object UserPhone {
    def apply(s: String): Option[UserPhone] = ???
  }

}
