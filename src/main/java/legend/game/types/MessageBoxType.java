package legend.game.types;

public enum MessageBoxType {
  /** This MessageBox has no additional inputs and just displays a message */
  ALERT(0),
  /** This MessageBox displays selectable options, typically yes/no */
  CONFIRMATION(2),
  ;

  public final int type;

  private MessageBoxType(final int type) {
      this.type = type;
  }
}
