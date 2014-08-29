package org.kie.remote.services.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/task")
public interface TaskResource {

    @GET
    @Path("/query")
    public Response query();

    @GET
    @Path("/{taskId: [0-9-]+}")
    public Response taskId( long taskId );

    @POST
    @Path("/{taskId: [0-9-]+}/{oper: [a-zA-Z]+}")
    public Response taskId_oper( long taskId, String operation );

    @GET
    @Path("/{taskId: [0-9-]+}/content")
    public Response taskId_content( long taskId );

    @GET
    @Path("/{taskId: [0-9-]+}/showTaskForm")
    public Response taskId_form( long taskId );

    @GET
    @Path("/content/{contentId: [0-9-]+}")
    public Response content_contentId( long contentId );

    @POST
    @Path("/history/bam/clear")
    public Response bam_clear();

}