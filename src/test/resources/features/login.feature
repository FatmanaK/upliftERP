Feature: As a User I should be able to login


#  Background:
#
#    Given User is on the login page
#    When enter right credentials
#    Then user should be able to see username

# @purchase
# Scenario: Requests for Quatation and checks Purchase orders

#    When we are on the landing page click Purchases section
#  Then user will see the purchase page and click Requests for Quotation
#   Then check whether Purchase Order is saved or not
#   Then check delete functionality on the purchase order

  @login
  Scenario Outline: login with different users
    Given User is on the login page
    When enter right "<username>" and "<password>"
    Then User should be able to see "<user_name>" on the page

    Examples:

      | username                    | password         | user_name          |
      | posmanager50@info.com       | posmanager       | POSManager50       |
      | eventscrmmanager40@info.com | eventscrmmanager | EventsCRMManager40 |
      | imm20@info.com              | inventorymanager | InventoryManager20 |
      | salesmanager30@info.com     | salesmanager     | SalesManager30     |
      | expensesmanager40@info.com  | expensesmanager  | ExpensesManager40  |
