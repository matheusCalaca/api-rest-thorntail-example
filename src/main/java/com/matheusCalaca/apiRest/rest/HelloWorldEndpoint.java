package com.matheusCalaca.apiRest.rest;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api("/hello")
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldEndpoint {
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Mostra mensagem", notes = "blbaça blabala mostra mensagem")
    public Response doGet() {
        return Response
                .ok("{\"mensagem\": \"Hello from Thorntail!\"}")
                .build();
    }

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Mostra mensagem", notes = "blbaça blabala mostra mensagem", response = String.class)
    public Response doPost() {
        return Response
                .ok("{\"mensagem\": \"POST - Hello from Thorntail!\"}")
                .build();
    }

}
