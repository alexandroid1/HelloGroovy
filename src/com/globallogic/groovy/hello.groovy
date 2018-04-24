package com.globallogic.groovy

println "Hello Groovy World"

println ""
def s = """This is
a multiline
string"""
println s

println ""
println 2+2

println ""
"Hello Groovy World".toUpperCase().each {println it}

println ""
def list = []
list.add("Groovy")
list.add "Groovy"
list << "Groovy"

println ""
def shoppingList = []
def add = shoppingList.&add
def remove = shoppingList.&remove
add "Milk"
add "Bread"
add "Beer"
remove "Beer"
add "Apple Juice"
println shoppingList

println ""
def pattern = ~/a slash must be escaped \/ but backslash, like in a digit match \d does not/
println pattern
println pattern.getClass()

println ""
def matcher = "The Hitchhiker's Guide to the Galaxy" =~ /Galaxy/
if (matcher) {
    println "Found the word 'Galaxy'"
}

println ""
def m = "Groovy is groovy" =~ /(G|g)roovy/
println m[0][0] // The first whole match (i.e. the first word Groovy)
println m[0][1] // The first group in the first match (i.e. G)
println m[1][0] // The second whole match (i.e. the word groovy)
println m[1][1] // The first group in the second match (i.e. g)

Company company = new Company()
if(company.getContact() != null
        && company.getContact().getAddress() != null
        && company.getContact().getAddress().getCountry() == Country.NEW_ZEALAND) println Country.NEW_ZEALAND

// If the contact or the address are null, the result of the left side will just be null, but no exception will be thrown.
if(company.getContact()?.getAddress()?.getCountry() == Country.NEW_ZEALAND) {}





