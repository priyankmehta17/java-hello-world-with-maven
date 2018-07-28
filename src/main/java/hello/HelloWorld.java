package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current time is: " + currentTime);
		  System.out.println("Hope you ll are having a nice time" );
		  

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
