package io.github.yashchenkon.sqs;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.elasticmq.rest.sqs.SQSRestServer;

/**
 * @author Mykola Yashchenko
 */
@Mojo(name = "stop")
public class SqsStopMojo extends AbstractMojo {

    @Override
    public void execute() {
        final SQSRestServer server = (SQSRestServer) getPluginContext().get(Constants.SERVER);
        if (server != null) {
            server.stopAndWait();
        }
    }
}
