package org.xmlpipe.ms.api.examples.helloworld;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Properties;

import org.xmlpipe.ms.api.ILogger;
import org.xmlpipe.ms.api.JSModule;
import org.xmlpipe.ms.api.Module;

/**
 * 
 * An example module.
 * 
 * Compile this module and create a jar file.  Put this jar file under the modules dir of your MS.
 * 
 * In your MML file, add the following
 * 
 * <hello encoding="UTF8" />
 * 
 * This well create a new instance hello in the JavaScript engine.  You should be able to call the instance's methods in JS.  For example,
 * 
 * print(hello.sayHello());
 * 
 * print(encode("test and spaces"));
 * 
 * You can also create a new instance with a different variable name
 * 
 * <hello name="hello2" />
 * 
 * print(hello2.sayHello());
 * 
 * 
 * 
 *
 */
@Module(name = "hello")
public class HelloWorldJSModule implements JSModule {
    private final ILogger log;
    private final String encoding;
    
    public HelloWorldJSModule(Properties props, ILogger log) {
        this.log = log;
        encoding = props.getProperty("encoding", "UTF8");
    }

    
    public String encode(String url) {
        try {
            return URLEncoder.encode("url", encoding);
        } catch (UnsupportedEncodingException e) {
            if (log.logWarn()) {
                log.log(e).flush();
            }
            throw new RuntimeException(e.getMessage());
        }
    }
    
    public String sayHello() {
        return "Hello";
    }
    
    @Override
    public Object getJSObject() {
        return this;
    }
    
}
