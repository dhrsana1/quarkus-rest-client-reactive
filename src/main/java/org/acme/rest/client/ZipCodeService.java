package org.acme.rest.client;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.Set;


@Path("/zipcode/by_city")
@RegisterRestClient(configKey = "zipcode-api")
public interface ZipCodeService {
    @GET
    Uni<Set<ZipCode>> getByCityAsUni(@QueryParam("city") String city);


}
