# ms_module_examples
Examples of MS module

## How to write a module in Java so one can use it in MS development?


### Name your module

First of all, we will need to name our class with a name that ends with JSModule so it can be loaded by the MS when it starts up.

Next, we need to annotate the module with the Module annotation:

```Java
@Module(name = "hello")
```

The module name will become the tag name to be used in the MML file:

```XML
   <hello encoding="UTF8" />
```

### Implement a consuctor

We will then need to implement a constructor for this module. If you need configurations to be passed in from MML, then implement the following constructor:

```Java
    public AbstractJSModule(Properties props, ILogger logger) {
    }

```





### Implement the JSModule interface


The JSModule interface  has one method:

```Java

package org.xmlpipe.ms.api;

public interface JSModule {
    /**
     * @return An object for JS to use. The object should contain methods that can
     *         be called within JavaScript. The easiest approach is to use only
     *         primitives in method arguments.
     */
    Object getJSObject();
}

```

So the module is reponsible for returning an object which will be put into the JavaScript engine for others to use.  It is up to the module author to decide how this object is created.  For this object to be easily called inside JavaScript, we recommend to use only Java primatives in method arguments.

