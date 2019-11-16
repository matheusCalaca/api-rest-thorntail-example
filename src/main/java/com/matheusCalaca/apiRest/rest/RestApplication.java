package com.matheusCalaca.apiRest.rest;

import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@SwaggerDefinition(
        info = @Info(
                title = "Calaça API REST",
                description = "API REST de teste do thorntail",
                version = "1.0.0",
                contact = @Contact(
                        name = "Matheus Calaça",
                        email = "matheusfcalaca@gmail.com"
                )
        ),
        host = "localhost",
        basePath = "/",
        schemes = {SwaggerDefinition.Scheme.HTTP}
)
public class RestApplication extends Application {
}
