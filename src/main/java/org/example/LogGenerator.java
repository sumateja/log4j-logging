package org.example;


import java.util.logging.Logger;

public class LogGenerator {
    //static Logger logger = LogManager.getLogger(LogGenerator.class);

    public static void main(String[] args) {
        MessageProcessor processor = new MessageProcessor();

        for (int i = 0; i < 1; i++) {
//           ThreadContext.put("siteId","SITED");
//            ThreadContext.put("env","DEV");

            EventMessage eventMessage = new EventMessage();
            eventMessage.setMessageId("Event"+i);
            eventMessage.setEventName("EventName"+i);
            eventMessage.setEventTitle("EventTitle"+i);

            MovieMessage movieMessage = new MovieMessage();
            movieMessage.setMessageId("Movie"+i);
            movieMessage.setMovieName("MovieName"+i);
            movieMessage.setTitle("movieTitle"+i);

            ResortMessage resortMessage = new ResortMessage();
            resortMessage.setMessageId("Resort"+i);
            resortMessage.setResortName("ResortName"+i);
            resortMessage.setResortTitle("ResortTitle"+i);


            processor.process(eventMessage);
            processor.process(movieMessage);
            processor.process(resortMessage);


        }
    }
}