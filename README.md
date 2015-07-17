# [PrismJS](http://prismjs.com/) WebJar example

I created this simple Spring Boot application to demonstrate how to use the new PrismJS WebJar.

### Requirements

* Java 8
* Maven

### Try it!

        git clone https://github.com/geocolumbus/colorizer.git
        cd colorizer
        mvn clean package spring-boot:run

        Navigate to localhost:8080

### How to use PrismJS with a WebJar.

Traditionally, you go to the PrismJS website, construct a custom js and css file with
the types of code you wish to highlight and serve that those scripts as static resources. However,
if your project has many client side components, you may wish to use WebJars to manage them.

In this example, I wanted to highlight xml and json, so I added [the PrismJS WebJar](https://github.com/webjars/prismjs) to my POM:

        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>prismjs</artifactId>
            <version>1.0.0</version>
            <scope>runtime</scope>
        </dependency>
        
Then I created a requirejs configuration file. Note how I used the shims to insure that the PrismJS files
were executed in proper dependency order.

`prism-core -> prism-clike -> prism-javascript and prism-core -> prism-markdown`

Finally, I set the specific formatting files as "deps" so that requirejs won't execute the callback until those are loaded. After taking out other components, like jQuery and Bootstrap, the simplified configuration file looks like this:


    var require = {

    paths: {
        "prism-core.min": ["../../webjars/prismjs/1.0.0/components/prism-core.min", "prism-core.min"],

        "prism-clike.min": ["../../webjars/prismjs/1.0.0/components/prism-clike.min", "prism-clike.min"],

        "prism-markup.min": ["../../webjars/prismjs/1.0.0/components/prism-markup.min", "prism-markup.min"],

        "prism-javascript.min": ["../../webjars/prismjs/1.0.0/components/prism-javascript.min", "prism-javascript.min"]
    },

    shim: {
        "prism-clike.min": {"deps": ["prism-core.min"]},
        "prism-javascript.min": {"deps": ["prism-clike.min"]},
        "prism-markup.min": {"deps": ["prism-core.min"]}
    },

    deps: ["prism-javascript.min", "prism-markup.min"],

    callback: function () {
        // Load RequireJS module configurations after RequireJS is loaded.
        console.log("RequireJS callback complete.");
    }
    };

How did I figure out what files to include? By perusing the PrismJS
project [components directory](https://github.com/PrismJS/prism/tree/gh-pages/components) on GitHub.
Everything starts with prism-core, and many require prism-clike as the second dependency.
In addition to the /components directory, this webjar serves files from
the [/plugins](https://github.com/PrismJS/prism/tree/gh-pages/plugins)
and [/themes](https://github.com/PrismJS/prism/tree/gh-pages/themes) directories.

See the [PrismJS Website](http://prismjs.com/) or the [PrismJS Github Project](https://github.com/PrismJS/prism) for more details.

2015-07-17 gcc

