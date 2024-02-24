package homework.task2

trait UserSettingsService {
  def getPasswordSettings(userId: UserId): Option[PasswordSettings]
}

object UserSettingsService {
  def apply(userService: UserService): UserSettingsService = new UserSettingsService {
    override def getPasswordSettings(userId: UserId): Option[PasswordSettings] = ???
  }
}
