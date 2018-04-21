package ml.mlazic.netqueue.examples;

import ml.mlazic.netqueue.queues.QueueBuilder;
import ml.mlazic.netqueue.queues.NetQueue;
import ml.mlazic.netqueue.queues.QueueType;

public class FanoutSender {
    public static void main(String[] args) {
        QueueBuilder builder = new QueueBuilder();
        builder
                .setExchaneName("fanout")
                .setType(QueueType.FANOUT);

        NetQueue queue = new NetQueue(builder);

        queue.send(new String("Hello Fanout 1!"));
        queue.send(new String("Hello Fanout 2!"));
        queue.send(new String("Hello Fanout 3!"));

        queue.close();

    }
}
