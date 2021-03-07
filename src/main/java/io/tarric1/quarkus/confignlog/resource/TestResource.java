package io.tarric1.quarkus.confignlog.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;

import io.tarric1.quarkus.confignlog.model.Message;

@ApplicationScoped
@Path("/test")
public class TestResource {
    @Inject
    Logger logger;

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response read(@PathParam("name") String name) {
        logger.infov("Test!");
        
        String salutation = ConfigProvider.getConfig().getValue("salutation", String.class);
        logger.debugv("salutation = {0}; name = {1}", salutation, name);

        return Response.ok(new Message(String.format("%s, %s!", salutation, name))).build();
    }
}