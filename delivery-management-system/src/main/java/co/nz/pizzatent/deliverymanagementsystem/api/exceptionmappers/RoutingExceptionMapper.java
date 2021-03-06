package co.nz.pizzatent.deliverymanagementsystem.api.exceptionmappers;

import co.nz.pizzatent.deliverymanagementsystem.service.routes.RoutingException;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RoutingExceptionMapper implements ExceptionMapper<RoutingException>{
    @Override
    public Response toResponse(RoutingException exception) {
        return new BadRequestException(exception).getResponse();
    }
}
