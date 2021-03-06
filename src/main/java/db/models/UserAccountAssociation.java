package db.models;

import org.springframework.lang.Nullable;

public class UserAccountAssociation {

  @Nullable
  public long id;

  private long user_id;

  private long account_id;

  public UserAccountAssociation(long id, long user_id, long account_id) {
    this.id = id;
    this.user_id = user_id;
    this.account_id = account_id;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUser_id() {
    return user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }

  public long getAccount_id() {
    return account_id;
  }

  public void setAccount_id(long account_id) {
    this.account_id = account_id;
  }
}
