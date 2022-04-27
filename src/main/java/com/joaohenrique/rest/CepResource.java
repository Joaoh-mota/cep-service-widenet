package com.joaohenrique.rest;

import com.joaohenrique.cepservice.CepService;
import com.joaohenrique.model.Endereco;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/endereco")
@RequestScoped
public class CepResource {
    @Inject
    CepService service;

    @GET
    @Path("{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Endereco getEndereco(@PathParam("cep") final String cep) {
        return service.buscaEndereco(cep);
    }
}