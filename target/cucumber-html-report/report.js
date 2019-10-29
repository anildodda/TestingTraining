$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Training_h2a.06.17/Desktop/New folder/CucumberCaseStudy/src/test/java/Features/4Cart.feature");
formatter.feature({
  "name": "Invalid Cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "valid add to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "Alex is on the Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "invalidCart.alex_is_on_the_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex Searched for the Product",
  "keyword": "And "
});
formatter.match({
  "location": "invalidCart.alex_Searched_for_the_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex Click on Add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "invalidCart.alex_Click_on_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex Click on Cart link",
  "keyword": "And "
});
formatter.match({
  "location": "invalidCart.alex_Click_on_Cart_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cart should contain the Product",
  "keyword": "Then "
});
formatter.match({
  "location": "invalidCart.cart_should_contain_the_Product()"
});
formatter.result({
  "status": "passed"
});
});