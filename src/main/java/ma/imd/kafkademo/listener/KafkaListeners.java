package ma.imd.kafkademo.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "imdet8", groupId = "grpId")
    void listener(String data){
        System.out.println("Listener received: " + data + " 😉");
    }
}
