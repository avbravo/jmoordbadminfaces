package com.avbravo.analytics.start;



import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.Serializable;

@Singleton
@Startup
public class Application implements Serializable {



    @PostConstruct
    public void init() {
        System.out.println("---->Arranco la aplicacion....");
    }


   

}
