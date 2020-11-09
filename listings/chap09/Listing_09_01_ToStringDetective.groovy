import groovy.transform.ToString

@ToString
class Detective2 {
  String firstName, lastName
}

def sherlock  = new Detective(firstName: 'Sherlock', lastName: 'Holmes')
assert sherlock .toString() == 'Detective(Sherlock, Holmes)'
