package org.kie.remote.services.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/history")
public interface HistoryResource {

    @POST
    @Path("/clear")
    public Response clear();

    @GET
    @Path("/instances")
    public Response instances();

    @GET
    @Path("/instance/{procInstId: [0-9]+}")
    // TODO: docs
    public Response instance_procInstId( long procInstId );

    @GET
    @Path("/instance/{procInstId: [0-9]+}/{oper: [a-zA-Z]+}")
    public Response instance_procInstid_oper( Long procInstId, String operation );

    @GET
    @Path("/instance/{procInstId: [0-9]+}/{oper: [a-zA-Z]+}/{logId: [a-zA-Z0-9-:\\._]+}")
    public Response instance_procInstId_oper_logId( Long procInstId, String operation, String logId );

    @GET
    @Path("/process/{processDefId: [a-zA-Z0-9-:\\._]+}")
    public Response process_procDefId( String processId );

    @GET
    @Path("/variable/{varId: [a-zA-Z0-9-:\\._]+}")
    public Response variable_varId( String variableId );

    @GET
    @Path("/variable/{varId: [a-zA-Z0-9-:\\._]+}/value/{value: [a-zA-Z0-9-:\\._]+}")
    public Response variable_varId_value_valueVal( String variableId, String value );

    @GET
    @Path("/variable/{varId: [a-zA-Z0-9-:\\._]+}/instances")
    // TODO: docs
    public Response variable_varId_instances( String variableId );

    @GET
    @Path("/variable/{varId: [a-zA-Z0-9-:\\.]+}/value/{value: [a-zA-Z0-9-:\\._]+}/instances")
    public Response variable_varId_value_valueVal_instances( String variableId, String value );

}