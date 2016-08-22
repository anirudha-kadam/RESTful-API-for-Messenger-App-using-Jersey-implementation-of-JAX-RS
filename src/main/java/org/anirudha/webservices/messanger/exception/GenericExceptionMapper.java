package org.anirudha.webservices.messanger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.anirudha.webservices.messanger.model.ErrorMessage;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable ex) {
		// TODO Auto-generated method stub
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500, "https://www.facebook.com/anirudha.kadam");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}

}
