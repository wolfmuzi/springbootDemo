package com.nettyBio;

import com.ivg.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: lj
 * @description:
 * @date: 11:10 2018/1/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class BillNumTest {
   /* @Autowired
    RabbitMqSend mqSend;

    @Test
    public void concurrentSendMessage() {


        List<String> strings = new ArrayList<String>();


        Runnable task = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        mqSend.sendMsg(strings.get(i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        ConcurrentTestTools testTools = new ConcurrentTestTools(10, task);
        testTools.start();
    }*/
}
