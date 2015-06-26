# Code colorizer example with [Syntaxhighlighter](http://alexgorbatchev.com/SyntaxHighlighter/)

## Requirements

* Java 8
* Maven

## Try it!

        git clone https://github.com/geocolumbus/colorizer.git
        cd colorizer
        mvn clean package spring-boot:run

        Navigate to localhost:8080

## How it works

Load the CSS files.

        shCore.css
        shCoreDefault.css
        shThemeDefault.css
        
Load the core javascript files:

        shCore.js
        shAutoLoader.js

Use the autoloader to load the specific "brushes" you need. For example:

        SyntaxHighlighter.autoloader(
                ['js','/assets/js/brush/shBrushJScript.js'],
                ['xml', '/assets/js/brush/shBrushXml.js'],
                ['text','plain','/assets/js/brush/shBrushPlain.js']
            );
        
        // Change tag type to be colorized from the default <pre> to <script>
        SyntaxHighlighter.config.tagName='script';
        
        // Execute the formatting
        SyntaxHighlighter.all();
       

Code to be formatted should be wrapped in script tags. Using &lt;script&gt; tags means you don't have to convert < to &amp;lt; like with &lt;pre&gt; tags.

        <script type="syntaxhighlighter" class="brush: js"><![CDATA[
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
        ]]></script>
        
or

        <script type="syntaxhighlighter" class="brush: xml"><![CDATA[
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
        ]]></script>

## Pros

* Looks good.
* Same syntax highlighter used by Developer Network.
* Covers every conceivable return type.
* Pretty easy to use

## Cons

* The webjar does not work - it references buggy code. I've [submitted two issues to the webjar Github Repository](https://github.com/webjars/syntaxhighlighter/issues) so hopefully it will get addressed. In the meantime, we have to add all the javascript files to our project.
* Does not offer a plain text mode like some syntax highlighters do.

