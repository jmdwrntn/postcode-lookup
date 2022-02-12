### Time Taken
As I worked on the task in between university lectures and labs, I did not keep track of the exact time taken. 

I would estimate it took around three hours to complete. Most of my programming experience to date has been with Python,
so it took me some time to get to grips with Java, particularly the parsing of the JSON.

I utilised https://www.jsonschema2pojo.org/ to create POJO classes for Gson to map the API JSON to.

### Assumptions Made
The primary assumption I made was interpreting the instruction 
*"Your application should accept a postcode as an argument to its main() method"* to mean that would be the only
method called, and the subsequent information printed out was also done by main().

For the postcode passed as an argument, I assumed most people would write it naturally, with a space forming a two-part
postcode *e.g. CB3 0FA*. I did account for someone inputting it as a single string with an exception however.

Perhaps an obvious assumption but I did not feel the need to validate any postcodes returned as *'nearest postcodes'*,
as I assumed if the API provided them they were validated already.

### Potential Improvements
I believe I could have created a single HttpResponse object within the HttpHandler class and appended to the URL within
each respective function to validate, lookup and retrieve nearest postcodes.

At this stage in my learning I am not particularly knowledgeable about Exceptions and Testing, so I think these are the 
weakest part of my program. 

The final improvement I thought of was that the Nearest class could possibly be achieved in a more elegant way, perhaps
extending the Postcode class rather than having almost all the same values and functions duplicated.

### Conclusion
Overall I thought the exercise was very good and certainly preferable to completing LeetCode style assessments.
The concept of the task was easy to understand but the implementation was somewhat challenging as mentioned above, so 
due to that I feel I learned quite a bit and feel more comfortable with Java now.