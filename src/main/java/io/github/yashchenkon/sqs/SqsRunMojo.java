package io.github.yashchenkon.sqs;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author Mykola Yashchenko
 */
@Mojo(name = "run")
public class SqsRunMojo extends AbstractMojo {

    @Parameter(property = "port", defaultValue = "8888")
    private Integer port;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }
}
