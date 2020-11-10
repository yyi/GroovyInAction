assert """aBcaaa""" =~ /^(?is:abc).+$/
assert "\\d" == /\d/

def reference = "hello"
assert reference == /$reference/

assert "\$" == /$/
