# Postcode Lookup

## Description
A small Java program that retrieves details for a given UK postcode from [postcodes.io](https://postcodes.io). 
The postcode is passed as an argument to main(), which firstly validates the postcode, after which the details of the 
postcode are printed to the console, along with a list of the nearest postcodes and their respective details.

I utilised https://www.jsonschema2pojo.org/ to create POJO classes for Gson to map the API JSON to.