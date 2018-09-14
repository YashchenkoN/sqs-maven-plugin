package io.github.yashchenkon.sqs;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.elasticmq.NodeAddress;
import org.elasticmq.rest.sqs.SQSRestServer;
import org.elasticmq.rest.sqs.SQSRestServerBuilder;

/**
 * @author Mykola Yashchenko
 */
@Mojo(name = "run")
public class SqsRunMojo extends AbstractMojo {

    @Parameter(property = "port", defaultValue = "8888")
    private Integer port;

    @Override
    @SuppressWarnings("unchecked")
    public void execute() throws MojoExecutionException, MojoFailureException {
        final SQSRestServer server = SQSRestServerBuilder.withPort(port)
                .withServerAddress(new NodeAddress("http", "localhost", port, "")).start();
        getPluginContext().put(Constants.SERVER, server);
    }
}
