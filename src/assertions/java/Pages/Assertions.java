package Pages;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class Assertions {

  /**
   * Creates a new instance of <code>{@link Pages.EmployeeDetailsPageAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static Pages.EmployeeDetailsPageAssert assertThat(Pages.EmployeeDetailsPage actual) {
    return new Pages.EmployeeDetailsPageAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link Pages.SummaryPageAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static Pages.SummaryPageAssert assertThat(Pages.SummaryPage actual) {
    return new Pages.SummaryPageAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link Pages.UserAndTaxYearPageAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static Pages.UserAndTaxYearPageAssert assertThat(Pages.UserAndTaxYearPage actual) {
    return new Pages.UserAndTaxYearPageAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
