package org.example;



public interface MultiMessageInterface {

    void process(ResortMessage message);

    void process(MovieMessage message);
    void process(EventMessage message);


}
