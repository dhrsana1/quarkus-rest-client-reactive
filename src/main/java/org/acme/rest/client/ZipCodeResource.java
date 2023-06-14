package org.acme.rest.client;


import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;


@Path("/zipcode")
public class ZipCodeResource {

    @RestClient
    ZipCodeService extensionsService;



    @GET
    @Path("/id-uni/{city}")
    public Uni<Set<ZipCode>> idUni(String city) {
        return extensionsService.getByCityAsUni(city);
    }


}
