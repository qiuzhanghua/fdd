Feature: Is it Friday?
  判断今天是否星期五

  Scenario Outline: Today is or is not Friday
    Given today is "<日期>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | 日期            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |