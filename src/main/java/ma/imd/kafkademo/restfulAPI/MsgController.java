package ma.imd.kafkademo.restfulAPI;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/msg") @AllArgsConstructor
public class MsgController {

    private KafkaTemplate<String, String> kafkaTemplate;


    @PostMapping
    public void host(@RequestBody MsgRequest request){
        kafkaTemplate.send("imdet8", request.msg());
    }
}
