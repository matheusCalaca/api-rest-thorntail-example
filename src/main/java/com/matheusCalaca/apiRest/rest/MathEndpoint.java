package com.matheusCalaca.apiRest.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/math")
@Api("/math")
@Produces(MediaType.APPLICATION_JSON)
public class MathEndpoint {
    /**
     * requisição get passando parametros por pathparam
     *                             soma/num1/num2
     * http://localhost:8080/math/soma/1/5
     *
     * @param num1
     * @param num2
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Faz a soma ", notes = "Exemplo de como passar parametros para a requisição HTTP" +
            "neste exmplo e feito a soma de dois numeros que são passados por path param. que são parametros do caminho da " +
            "requisição")
    @Path("/soma/{num1}/{num2}")
    public Response soma(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2 ) {
        Integer result = num1 + num2;

        return Response
                .ok(result)
                .build();
    }

    /**
     * requisição get passando parametros por QueryParam
     *                           /sub?num1=XX&num2=XX
     * http://localhost:8080/math/sub?num1=12&num2=20
     *
     * @param num1
     * @param num2
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Faz a subtração ", notes = "Exemplo de como passar parametros para a requisição HTTP" +
            "neste exmplo e feito a subtração de dois numeros que são passados por Query param. que são parametros " +
            "passados no final da URL apos o ponto de '?'")
    @Path("/sub")
    public Response sub(@QueryParam("num1") Integer num1, @QueryParam("num2") Integer num2 ) {
        Integer result = num1 - num2;

        return Response
                .ok(result)
                .build();
    }

}
