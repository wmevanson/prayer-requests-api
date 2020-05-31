package com.thorud.wm.prayer

import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/prayer/request")
class RequestResource {

    @Inject
    lateinit var requestService: RequestService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/for/{name}")
    fun request(@PathParam name: String) = requestService.getRequest(name)
}