package org.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.ObjectMessage;
import org.apache.logging.log4j.message.StringMapMessage;


public class MessageProcessor implements MultiMessageInterface{
    static Logger logger = LogManager.getLogger(MessageProcessor.class);
    public ObjectMapper mapper = new ObjectMapper();

    @Override
    public void process(ResortMessage message) {

        //logger.info("Within ResortMessage");
        //logger.info(new ObjectMessage(message));
      //  logger.info("resort");

        //logger.info("{}",mapper.writeValueAsString(message));
        logger.info(message);
       logger.info(new ObjectMessage(message));

    }
    @Override
    public void process(MovieMessage message) {
      //  logger.info("Within MovieMessage");
       // logger.info(new ObjectMessage(message));
       // this works
        // StringMapMessage msg= new StringMapMessage().with("message",mapper.convertValue(message,java.util.Map.class));
        //logger.info(msg);
        logger.info(new ObjectMessage(message));

    }
    @Override
    public void process(EventMessage message) {
       // logger.info("Within EventMessage");
       // logger.info(new ObjectMessage(message));
        /*StringMapMessage msg= new StringMapMessage().with("message",mapper.convertValue(message,java.util.Map.class));
        logger.info(msg);*/
       // logger.info("{}",mapper.valueToTree(message));
        logger.info(message);
      //  logger.info(new ObjectMessage(message));

    }
}
