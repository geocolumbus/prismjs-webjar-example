# Code colorizer example with [Prism](http://prismjs.com/)

### Requirements

* Java 8
* Maven

### Try it!

        git clone https://github.com/geocolumbus/colorizer.git
        cd colorizer
        mvn clean package spring-boot:run

        Navigate to localhost:8080

### How it works

Build the CSS and JS files [here](http://prismjs.com/download.html).

These two files are required:

        prism.css        
        prism.js

Execute Prism after the html is loaded:

        Prism.highlightAll();
       
The code to be formatted should be wrapped in pre and code tags like this:

        <pre class="language-javascript">
        <code class="language-javascript">
        {  
           "menu":{  
              "id":"file",
              "value":"File",
              "popup":{  
                 "menuitem":[  
                    {  
                       "value":"New",
                       "onclick":"CreateNewDoc()"
                    }
                 ]
              }
           }
        }
        </code>
        </pre>
        
in the case of xml, I did have to do a global replace on "<" to "&amp;lt;".

        // You have to handle left angle brackets in XML
        $('.xml').each(function () {
            $(this).html($(this).html().replace(/</g, "&lt;"));
         });

For the sake of clarity, I left the angle brackets unconverted in the example below.

        <pre class="language-markup">
        <code class="language-markup">
        <?xml version="1.0"?>
        <catalog>
           <book id="bk101">
              <author>Gambardella, Matthew</author>
              <title>XML Developer's Guide</title>
              <genre>Computer</genre>
              <price>44.95</price>
              <publish_date>2000-10-01</publish_date>
              <description>An in-depth look at creating applications 
              with XML.</description>
           </book>
           <book id="bk102">
              <author>Ralls, Kim</author>
              <title>Midnight Rain</title>
              <genre>Fantasy</genre>
              <price>5.95</price>
              <publish_date>2000-12-16</publish_date>
              <description>A former architect battles corporate zombies, 
              an evil sorceress, and her own childhood to become queen 
              of the world.</description>
           </book>
        </catalog>
        </code>
        </pre>

### Pros

* Dead simple to use - one js and one css file, and easy markup.
* Looks good.
* Current.

### Cons

* No webjar (css and js are custom built so we'll be including those).
* Have to escape left angle brackets inside the pre tags.
