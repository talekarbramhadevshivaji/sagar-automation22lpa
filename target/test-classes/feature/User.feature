Feature: validate userlist API

 Scenario: validate API GET request for userlist
 
 
 Given  the base API endpint is set
 When  A GET request send to the endpoint "api/users?page=2"
 Then status code shoild be 200
 And  the resonse should contains list of user
 And  validate the json response 